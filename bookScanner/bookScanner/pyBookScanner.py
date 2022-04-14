import cv2
import pytesseract
pytesseract.pytesseract.tesseract_cmd = r'C:\\Program Files\\Tesseract-OCR\\tesseract.exe'

img4 = cv2.imread('files\\book2.jpg')

text4 = pytesseract.image_to_string(img4)
print(text4)