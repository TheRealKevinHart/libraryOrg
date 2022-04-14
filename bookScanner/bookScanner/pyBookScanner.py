# import cv2
# import pytesseract
# pytesseract.pytesseract.tesseract_cmd = r'C:\\Program Files\\Tesseract-OCR\\tesseract.exe'
#
# img = cv2.imread('files\\book2.jpg')
#
# text = pytesseract.image_to_string(img)
# print(text)

# import cgi,os
#
# print('content-type:text/html\r\n\r\n')
#
# form=cgi.FieldStorage()
# fle=form['filename']
#
# fn=os.path.basename('fle.filename')
# open("D:/EclipseWorkspace/libraryOrg/libraryOrg/temp/"+fn,"wb").write(fle.file.read())
#
# print('<html>')
# print('<body><center>')
# print('<img src=temp/%s>'%fn)
# print('</center></body></html>')