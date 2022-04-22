package com.springboot.libraryOrg.reader;

import java.io.File;

import net.sourceforge.tess4j.*;

public class bookScanner {
	
	public String booksScanner() {
		//File imageFile = new File("C:\\Users\\wsfer\\images\\book4.pdf");
		
		File folder = new File("C:\\Users\\wsfer\\images\\");
		File[] listOfFiles = folder.listFiles();
		
		for (File file: listOfFiles) {
			if (file.isFile()) {
				//File newFile = new File(file.getName());
				folder = new File("C:\\Users\\wsfer\\images\\" + file.getName());
				System.out.println(folder);
			}
		}

		//Change Datapath based off of computer
		//PC: "D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata"
		//LAPTOP: "C:\\Users\\wsfer\\git\\libraryOrg\\tessdata"
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata");
		
		try {
			//String result = instance.doOCR(imageFile);
			String result = instance.doOCR(folder);
			return result;
		}
		
		catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "";
		}
	}
}
