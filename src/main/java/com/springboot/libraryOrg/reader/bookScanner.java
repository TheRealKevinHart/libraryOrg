package com.springboot.libraryOrg.reader;

import java.io.File;
import java.io.IOException;

import net.sourceforge.tess4j.*;

public class bookScanner {
	public static void main(String[] args) throws IOException{
		
		File imageFile = new File("C:\\Users\\wsfer\\images\\book2.jpg");
				
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata");
		
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
		}
		catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}
}
