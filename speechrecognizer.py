import speech_recognition
r = speech_recognition.Recognizer()

with speech_recognition.Microphone() as source:
    print("Please wait. Calibrating microphone...")
    #listen for 5 seconds and create the ambient noise energy level
    r.adjust_for_ambient_noise(source, duration=5)#調整麥克風的噪音
    print('Say something!')
    audio = r.listen(source)
    
    f = open('A.txt', 'w', encoding = 'UTF-8')    # 也可使用指定路徑等方式，如： C:\A.txt

# recognize speech using Google Speech Recognition
try:
    print("Google Speech Recognition thinks you said:")
    print(r.recognize_google(audio, language="zh-TW"))
    f.write(r.recognize_google(audio, language="zh-TW"))
except speech_recognition.UnknownValueError:
    print("Google Speech Recognition could not understand audio")
except speech_recognition.RequestError as e:
    print("No response from Google Speech Recognition service: {0}".format(e))

#input()

f.close()
