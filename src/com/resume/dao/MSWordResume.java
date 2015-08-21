package com.resume.dao;

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
			run2.setText("test word file");
			run2.addBreak();

			XWPFParagraph para = document.createParagraph();
			XWPFRun run = para.createRun();
			run.setText("Name: ");
			run.setText(resumeData.getName() + " "+resumeData.getInitial());
			run.setTextPosition(10);
			run.setText("                                                                Email: ");
			run.setText(resumeData.getEmail());
			run.addBreak();
			run.setText("Mobile Number: ");
			run.setText(resumeData.getPhoneNumber());
			run.addBreak();

			XWPFRun summaryRun = para.createRun();
			summaryRun.addBreak();
			summaryRun.setBold(true);
			summaryRun.setText("Objective:");
			summaryRun.setFontSize(20);
			summaryRun.addBreak();

			XWPFRun objectiveRun = para.createRun();
			objectiveRun
					.setText("I want to succeed in a stimulating and challenging environment, building the success of the company while I experience advancement opportunities.");
			objectiveRun.addBreak();

			// create table
			XWPFTable table = document.createTable();
			// create first row
			XWPFTableRow tableRowOne = table.getRow(0);
			tableRowOne.getCell(0).setText("College Name");
			tableRowOne.addNewTableCell().setText("University");
			tableRowOne.addNewTableCell().setText("Year of Passing");
			tableRowOne.addNewTableCell().setText(
					"Total or Percentage % of Marks");
			// create second row
			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText("col one, row two");
			tableRowTwo.getCell(1).setText("col two, row two");
			tableRowTwo.getCell(2).setText("col three, row two");
			tableRowTwo.getCell(3).setText("col three, row two");

			// create third row
			XWPFTableRow tableRowThree = table.createRow();
			tableRowThree.getCell(0).setText("col one, row three");
			tableRowThree.getCell(1).setText("col two, row three");
			tableRowThree.getCell(2).setText("col three, row three");
			tableRowThree.getCell(3).setText("col three, row two");

			XWPFRun run3 = document.createParagraph().createRun();
			run3.setText("This is test Text... ");
			run3.addBreak();
			run3.setText("This is 2nd test Text... ");

			document.write(out);
			out.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("create_table.docx written successully");
		return false;
	}
}
