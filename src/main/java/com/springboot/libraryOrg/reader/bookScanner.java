package com.springboot.libraryOrg.reader;

import java.io.File;

import net.sourceforge.tess4j.*;

public class bookScanner {
	
	public String booksScanner() {
		File folder = new File("C:\\Users\\wsfer\\images\\");
		File[] listOfFiles = folder.listFiles();
		long lastModifiedTime = Long.MIN_VALUE;
	    File chosenFile = null;
	    
	    if (listOfFiles != null) {
			for (File file: listOfFiles) {	
				if (file.lastModified() > lastModifiedTime) {
					chosenFile = file;
	                lastModifiedTime = file.lastModified();
	                if (chosenFile.isFile()) {
		                chosenFile = new File("C:\\Users\\wsfer\\images\\" + file.getName());
		                System.out.println(chosenFile);
	                }
				}
			}
	    }


		//Change Datapath based off of computer
		//PC: "D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata"
		//LAPTOP: "C:\\Users\\wsfer\\git\\libraryOrg\\tessdata"
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\tessdata");
		
		try {
			String result = instance.doOCR(chosenFile);
			return result;
		}
		
		catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "";
		}
	}
}
