package com.resume.playarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.resume.model.UserResume;

public class MSWordResume {
	public boolean writeDataToMSWord(UserResume resumeData)
			throws FileNotFoundException {
		// Blank Document
		try {
			XWPFDocument document = new XWPFDocument();

			// Write the Document in file system
			FileOutputStream out = new FileOutputStream(new File(
					"e:/fresher-resume.docx"));
			XWPFParagraph paragraph = document.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.CENTER);
			XWPFRun run2 = paragraph.createRun();
			run2.setBold(true);
			run2.setFontSize(20);
			run2.setText("Resume");
			run2.addBreak();

			XWPFParagraph para = document.createParagraph();
			XWPFRun run = para.createRun();
			run.setText("Name: ");
			run.setText(resumeData.getName() + " "+resumeData.getInitial());
			run.setTextPosition(10);
			run.setText("                                                           Email: ");
			run.setText(resumeData.getEmail());
			run.addBreak();
			run.setText("Mobile Number: ");
			run.setText(resumeData.getPhoneNumber());
			run.addBreak();

			XWPFRun summaryRun = para.createRun();
			summaryRun.setBold(true);
			summaryRun.setText("Carrier Objective:");
			summaryRun.setFontSize(15);
			summaryRun.addBreak();

			XWPFRun objectiveRun = para.createRun();
			objectiveRun
					.setText("I want to succeed in a stimulating and challenging environment, building the success of the company while I experience advancement opportunities.");
			//objectiveRun.addBreak();
			
			XWPFRun educationRun = para.createRun();
			educationRun.addBreak();
			educationRun.setBold(true);
			educationRun.setText("Education Details: ");
			educationRun.setFontSize(15);
			
			// create table
			XWPFTable table = document.createTable();
			// create first row
			XWPFTableRow tableRowOne = table.getRow(0);
			tableRowOne.getCell(0).setText("Degree Course");
			tableRowOne.addNewTableCell().setText("Board OR University");
			tableRowOne.addNewTableCell().setText("Year of Passing");
			tableRowOne.addNewTableCell().setText(
					"Agregate %");
			// create second row
			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText(resumeData.getCourse1());
			tableRowTwo.getCell(1).setText(resumeData.getBoard1());
			tableRowTwo.getCell(2).setText(resumeData.getYear1());
			tableRowTwo.getCell(3).setText(resumeData.getAgregate1());

			// create third row
			XWPFTableRow tableRowThree = table.createRow();
			tableRowThree.getCell(0).setText(resumeData.getCourse2());
			tableRowThree.getCell(1).setText(resumeData.getBoard2());
			tableRowThree.getCell(2).setText(resumeData.getYear2());
			tableRowThree.getCell(3).setText(resumeData.getAgregate2());

			XWPFTableRow tableRowFour = table.createRow();
			tableRowFour.getCell(0).setText(resumeData.getCourse3());
			tableRowFour.getCell(1).setText(resumeData.getBoard3());
			tableRowFour.getCell(2).setText(resumeData.getYear3());
			tableRowFour.getCell(3).setText(resumeData.getAgregate3());
			
			XWPFTableRow tableRowFive = table.createRow();
			tableRowFive.getCell(0).setText(resumeData.getCourse4());
			tableRowFive.getCell(1).setText(resumeData.getBoard4());
			tableRowFive.getCell(2).setText(resumeData.getYear4());
			tableRowFive.getCell(3).setText(resumeData.getAgregate4());
			XWPFParagraph paragraph4 = document.createParagraph();
			
			XWPFRun run3 = paragraph4.createRun();
			run3.setText("Technical Skills");
			run3.setBold(true);
			run3.setFontSize(20);
			run3.addBreak();
			XWPFRun run4 = paragraph4.createRun();
			run4.setText("Programming Languages     :       ");
			run4.setText(resumeData.getProgrammingLang());
			run4.addBreak();
			run4.setText("Operating Systems     :      ");
			run4.setText(resumeData.getOs());
			run4.addBreak();
			run4.setText("Web Developing Tools     :       ");
			run4.setText(resumeData.getWebdevlang());
			run4.addBreak();
			run4.setText("DataBases     :   ");
			run4.setText(resumeData.getDb());
			run4.addBreak();
			
			XWPFRun run5 = paragraph4.createRun();
			run5.setText("Personal Information");
			run5.setBold(true);
			run5.setFontSize(20);
			run5.addBreak();
			
			XWPFRun run6 = paragraph4.createRun();
			run6.setText("Name     :     ");
			run6.setText(resumeData.getName());
			run6.addBreak();
			run6.setText("Father Name     :     ");
			run6.setText(resumeData.getFather());
			run6.addBreak();
			run6.setText("Mother Name     :     ");
			run6.setText(resumeData.getMother());
			run6.addBreak();
			run6.setText("Gender     :     ");
			run6.setText(resumeData.getGender());
			run6.addBreak();
			run6.setText("Date Of Birth     :     ");
			run6.setText(resumeData.getDateOfBirth());
			run6.addBreak();
			run6.setText("Marital Status     :     ");
			run6.setText(resumeData.getMaritalstatus());
			run6.addBreak();
			run6.setText("Nationality     :     ");
			run6.setText(resumeData.getNationality());
			run6.addBreak();
			run6.setText("Emergency Contact Number     :       ");
			run6.setText(resumeData.getEmergencyNumb());
			run6.addBreak();
			run6.setText("Languages Known     :     ");
			run6.setText(resumeData.getLanguesKnown());
			run6.addBreak();
			
			XWPFRun run7 = paragraph4.createRun();
			run7.setBold(true);
			run7.setText("Declaration:");
			run7.setFontSize(15);
			XWPFRun run8 = paragraph4.createRun();
			run8.addBreak();
			run8.setText("I here by declare that all the details furnished above are true to the best of my knowledge and belief.");
			run8.addBreak();
			run8.addBreak();
			run8.setText("Place :   "+resumeData.getPlace()+"                                                                                                                        "+"Signature");
			run8.addBreak();
			run8.setText("Date  :   ");
			
			document.write(out);
			out.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("fresher resume written successully");
		return false;
	}
}
