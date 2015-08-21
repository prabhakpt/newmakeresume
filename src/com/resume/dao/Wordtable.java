package com.resume.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;

import com.resume.model.UserResume;

public class Wordtable {
	/*public static void main(String aaa[]){*/
		public boolean writeDataToMSWord(UserResume resumeData){
		System.out.println("This is Word To Document Class");
File file = null; 
       FileOutputStream fos = null; 
       XWPFDocument document = null; 
       XWPFParagraph para = null; 
       XWPFRun run = null; 
       //Iterator<String> itr = resumeData.iterator();
       
       try { 
           // Create the first paragraph and set it's text. 
           document = new XWPFDocument(); 
           para = document.createParagraph(); 

           para.setAlignment(ParagraphAlignment.CENTER); 

           para.setSpacingAfter(100); 

           para.setSpacingAfterLines(10);
           run = para.createRun(); 
           run.addBreak();    // similar to new line
           run.addBreak();
           
           
           
           XWPFTable table = document.createTable(4, 3);
           table.setRowBandSize(1);
           table.setWidth(1);
           table.setColBandSize(1);
           table.setCellMargins(1, 1, 100, 30);
           
           table.setStyleID("finest");


           table.getRow(1).getCell(1).setText(resumeData.getName());
           table.getRow(2).getCell(1).setText("fine");
           XWPFParagraph p1 = table.getRow(0).getCell(0).getParagraphs().get(0);
           p1.setAlignment(ParagraphAlignment.CENTER);
                   XWPFRun r1 = p1.createRun();
                   r1.setBold(true);
                   r1.setText(resumeData.getInitial());
                  // r1.setBold(true);
                   r1.setItalic(true);
                   r1.setFontFamily("Courier");
                   //r1.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
                   r1.setTextPosition(100);
                   //int i=-1,j=-1;
       /*            while(itr.hasNext()){*/
          //Locating the cell values
                    table.getRow(0).getCell(0).setText(resumeData.getPhoneNumber());
                    
                    table.getRow(0).getCell(2).setText(resumeData.getEmail()); 
System.out.println("Email:"+resumeData.getEmail());
                   table.getRow(2).getCell(2).setText(resumeData.getAddress());
                   //}
                    table.setWidth(120); // done change from 120 to 200

           file = new File("e:/resume.doc"); 
           if(file.exists())
               file.delete();


           FileOutputStream out = new FileOutputStream(file);
           document.write(out);
           out.close();
           return true;
       } catch(Exception e){e.printStackTrace();}
       return false;
    }
}
