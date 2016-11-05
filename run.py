import os
import fileinput
#删除存在的Log文件或者报告文件，避免以前构建产生的数据对当前构建造成影响
if os.path.exists("log.txt"):
	os.remove("log.txt")
if os.path.exists("log.xml"):
	os.remove("log.xml")
#编译生成jar	
os.system("ant build")

#push jar设备
os.system("adb push bin/news.jar /data/local/tmp/")
#遍历读取testsuites.txt文件的每一行信息
for line in fileinput.input("testsuites.txt"):
	#如果这一行文本不为空
	if len(line.strip()) != 0:
	#拼接执行语句，并把log输出到外部文件log.txt
		exeStr = "adb shell uiautomator runtest news.jar -c " + line.strip() + " >>log.txt"
		#执行拼接完的语句
		os.system(exeStr)
#转化log文件为JUint报告		
os.system("java -jar automator-log-converter-1.5.0.jar log.txt")