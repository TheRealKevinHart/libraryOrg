package com.springboot.libraryOrg.reader;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {
	public static void main(String[] args) {
		Tesseract tess = new Tesseract();
		try {
			tess.setDatapath("C:\\Users\\wsfer\\Tess4j\\tessdata");
			
			String text = tess.doOCR(new File("D:\\EclipseWorkspace\\libraryOrg\\libraryOrg\\src\\main\\java\\com.springboot.libraryOrg.reader\\book2.jpg"));
			
			System.out.println(text);
		}
		catch (TesseractException e) {
			e.printStackTrace();
		}
	}
}
