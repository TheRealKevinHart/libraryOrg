package com.springboot.libraryOrg.reader;

import java.io.File;

import net.sourceforge.tess4j.*;

public class bookScanner {
	
	public String booksScanner() {
		File imageFile = new File("C:\\Users\\wsfer\\images\\book2.jpg");


		//Change Datapath based off of computer
		//PC: "D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata"
		//LAPTOP: "C:\\Users\\wsfer\\git\\libraryOrg\\tessdata"
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata");
		
		try {
			String result = instance.doOCR(imageFile);
			return result;
		}
		
		catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "";
		}
	}
}
