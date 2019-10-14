import speech_recognition
r = speech_recognition.Recognizer()
with speech_recognition.Microphone() as source:
    print("Please wait. Calibrating microphone...")
    #listen for 5 seconds and create the ambient noise energy level
    r.adjust_for_ambient_noise(source, duration=5)#調整麥克風的噪音
    print('Say something!')
    audio = r.listen(source)
    
    f = open('A.txt', 'w', encoding = 'UTF-8')
    #紀錄成TXT文字檔也可使用指定路徑等方式，如：C:\A.txt

textZh = r.recognize_google(audio,language='zh-TW')
print(textZh)

#google翻譯
from googletrans import Translator
ts = Translator()
textEn = ts.translate(textZh,dest='en').text
textJa = ts.translate(textZh,dest='ja').text
print(textEn)
print(textJa)

#寫進TXT文字檔
f.write(textZh+'\n')
f.write(textEn+'\n')
f.write(textJa)

#儲存TXT文字檔
f.close()

#讓.exe畫面停留
input()