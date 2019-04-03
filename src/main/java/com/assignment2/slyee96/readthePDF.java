package com.assignment2.slyee96;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class readthePDF extends App {
	 public String text;
	 public String [] line;

	public void run(){	
		try {
		    PDDocument doc = PDDocument.load(new File("A182.pdf"));
		    doc.getClass();
		    if(!doc.isEncrypted()) {
		    	PDFTextStripperByArea TstripperArea = new PDFTextStripperByArea();
		    	TstripperArea.setSortByPosition(true);
		    	PDFTextStripper Tstripper = new PDFTextStripper();
		    	text =  Tstripper.getText(doc);
		    	line = text.split(System.getProperty("line.separator"));
		    }      
		    doc.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
