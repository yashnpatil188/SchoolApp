import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class ResultPdf1 {
	
	public static void main(String[] args) {
		try {
			File file = new File("D:\\yash\\ResultPdf1.pdf");
			FileOutputStream fileout = new FileOutputStream(file);
			Document document = new Document();
			PdfWriter.getInstance(document, fileout);
//			document.addAuthor("MAAULI EDUCATION SOCIETY");
			document.addTitle("Result");
			document.open();
			
			Chunk chunkHeader = new Chunk("MAAULI EDUCATION SOCIETY");
			Font font = new Font(Font.TIMES_ROMAN);
			font.setStyle(Font.BOLD);
			font.setSize(24);
			font.setColor(Color.RED);
			chunkHeader.setFont(font);
			Paragraph paragraph = new Paragraph();
			paragraph.add(chunkHeader);
			paragraph.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraph);
			
			Chunk chunkSchoolName = new Chunk("ENGLISH MEDIUM HIGH SCHOOL, DUNGE");
			Font fontSchoolName = new Font(Font.TIMES_ROMAN);
			fontSchoolName.setStyle(Font.BOLD);
			fontSchoolName.setSize(18);
			fontSchoolName.setColor(Color.BLACK);
			chunkSchoolName.setFont(fontSchoolName);
			Paragraph paraSchoolName = new Paragraph();
			paraSchoolName.setSpacingBefore(20);
			paraSchoolName.add(chunkSchoolName);
			paraSchoolName.setAlignment(Element.ALIGN_CENTER);
			document.add(paraSchoolName);
			
			/*
			LineSeparator sep = new LineSeparator();
			sep.setOffset(5);
			Paragraph paraSep = new Paragraph();
			paraSep.setSpacingAfter(7);
			paraSep.add(sep);
			document.add(paraSep);
	        */
			
			Chunk chunkAddress = new Chunk("Haridhara Complex, Anjurphata, Bhiwandi");
			Font fontAddress = new Font(Font.TIMES_ROMAN);
			//fontAddress.setStyle(Font.BOLD);
			fontAddress.setSize(12);
			fontAddress.setColor(Color.BLACK);
			chunkAddress.setFont(fontAddress);
			Paragraph paragraphAddress = new Paragraph();
			paragraphAddress.add(chunkAddress);
			paragraphAddress.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraphAddress);
			
			/*
			LineSeparator sep1 = new LineSeparator();
			sep1.setOffset(5);
			Paragraph paraSep1 = new Paragraph();
			paraSep1.setSpacingBefore(-3);
			paraSep1.add(sep);
			document.add(paraSep1);
            */
			
			Chunk chunkSubject = new Chunk("Result");
			Font fontSubject = new Font(Font.TIMES_ROMAN);
			fontSubject.setStyle(Font.BOLD);
			fontSubject.setSize(18);
			fontSubject.setColor(Color.BLACK);
			chunkSubject.setFont(fontSubject);
			Paragraph paragraphSubject = new Paragraph();
			paragraphSubject.setSpacingBefore(10);
			paragraphSubject.add(chunkSubject);
			paragraphSubject.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraphSubject);
			
			Chunk chunkStdDiv = new Chunk("               VIII-A");
			Font fontStdDiv = new Font(Font.TIMES_ROMAN);
			fontStdDiv.setStyle(Font.NORMAL);
			fontStdDiv.setSize(12);
			fontStdDiv.setColor(Color.BLACK);
			chunkStdDiv.setFont(fontStdDiv);
			Paragraph paraStdDiv = new Paragraph();
			paraStdDiv.setSpacingBefore(43);
			paraStdDiv.add(chunkStdDiv);
			paraStdDiv.setAlignment(Element.ALIGN_LEFT);
			document.add(paraStdDiv);
			
			Chunk chunkRNo = new Chunk("                                      35");
			Font fontRNo = new Font(Font.TIMES_ROMAN);
			fontRNo.setStyle(Font.NORMAL);
			fontRNo.setSize(12);
			fontRNo.setColor(Color.BLACK);
			chunkRNo.setFont(fontRNo);
			Paragraph paraRNo = new Paragraph();			
			paraRNo.setSpacingBefore(-16);
			paraRNo.add(chunkRNo);
			paraRNo.setAlignment(Element.ALIGN_LEFT);
			document.add(paraRNo);
			
			Chunk chunkGrNo = new Chunk("                                                     123456");
			Font fontGrNo = new Font(Font.TIMES_ROMAN);
			fontGrNo.setStyle(Font.NORMAL);
			fontGrNo.setSize(12);
			fontGrNo.setColor(Color.BLACK);
			chunkGrNo.setFont(fontGrNo);
			Paragraph paraGrNo = new Paragraph();
			paraGrNo.setSpacingBefore(-16);
			paraGrNo.add(chunkGrNo);
			paraGrNo.setAlignment(Element.ALIGN_LEFT);
			document.add(paraGrNo);
			
			Chunk chunkName = new Chunk("                                                                           Yogesh Jagannnath Patil");
			Font fontName = new Font(Font.TIMES_ROMAN);
			fontName.setStyle(Font.NORMAL);
			fontName.setSize(12);
			fontName.setColor(Color.BLACK);
			chunkName.setFont(fontName);
			Paragraph paraName = new Paragraph();
			paraName.setSpacingBefore(-16);
			paraName.add(chunkName);
			paraName.setAlignment(Element.ALIGN_LEFT);
			document.add(paraName);
			
			Chunk chunkBirthDate = new Chunk("                                                                                       " + "    " +
					"                                                       18/09/1985");
			Font fontBirthDate = new Font(Font.TIMES_ROMAN);
			fontBirthDate.setStyle(Font.NORMAL);
			fontBirthDate.setSize(12);
			fontBirthDate.setColor(Color.BLACK);
			chunkBirthDate.setFont(fontBirthDate);
			Paragraph paraBirthDate = new Paragraph();
			paraBirthDate.setSpacingBefore(-16);
			paraBirthDate.add(chunkBirthDate);
			paraBirthDate.setAlignment(Element.ALIGN_LEFT);
			document.add(paraBirthDate);
						
			Chunk chunkEnglish = new Chunk("            ENGLISH ");
			Font fontEnglish = new Font(Font.TIMES_ROMAN);
			fontEnglish.setStyle(Font.NORMAL);
			fontEnglish.setSize(12);
			fontEnglish.setColor(Color.BLACK);
			chunkEnglish.setFont(fontRNo);
			Paragraph paraTitleEnglish = new Paragraph();	
			paraTitleEnglish.setSpacingBefore(55);
			paraTitleEnglish.add(chunkEnglish);
			paraTitleEnglish.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleEnglish);
			
			Chunk chunkMaxEng = new Chunk("                                                                                     100 ");
			Font fontMaxEng = new Font(Font.TIMES_ROMAN);
			fontMaxEng.setStyle(Font.NORMAL);
			fontMaxEng.setSize(12);
			fontMaxEng.setColor(Color.BLACK);
			chunkMaxEng.setFont(fontRNo);
			Paragraph paraTitleMaxEng = new Paragraph();	
			paraTitleMaxEng.setSpacingBefore(-16);
			paraTitleMaxEng.add(chunkMaxEng);
			paraTitleMaxEng.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxEng);
			
			Chunk chunkMinEng = new Chunk("                                                                                                                        35 ");
			Font fontMinEng = new Font(Font.TIMES_ROMAN);
			fontMinEng.setStyle(Font.NORMAL);
			fontMinEng.setSize(12);
			fontMinEng.setColor(Color.BLACK);
			chunkMinEng.setFont(fontRNo);
			Paragraph paraTitleMinEng = new Paragraph();	
			paraTitleMinEng.setSpacingBefore(-16);
			paraTitleMinEng.add(chunkMinEng);
			paraTitleMinEng.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinEng);
			
			Chunk chunkObtEng = new Chunk("                                                                                                                                                     55 ");
			Font fontObtEng = new Font(Font.TIMES_ROMAN);
			fontObtEng.setStyle(Font.NORMAL);
			fontObtEng.setSize(12);
			fontObtEng.setColor(Color.BLACK);
			chunkObtEng.setFont(fontRNo);
			Paragraph paraTitleObtEng = new Paragraph();	
			paraTitleObtEng.setSpacingBefore(-16);
			paraTitleObtEng.add(chunkObtEng);
			paraTitleObtEng.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtEng);
			
			Chunk chunkHindi = new Chunk("            HINDI ");
			Font fontHindi = new Font(Font.TIMES_ROMAN);
			fontHindi.setStyle(Font.NORMAL);
			fontHindi.setSize(12);
			fontHindi.setColor(Color.BLACK);
			chunkHindi.setFont(fontRNo);
			Paragraph paraTitleHindi = new Paragraph();	
			paraTitleHindi.setSpacingBefore(5);
			paraTitleHindi.add(chunkHindi);
			paraTitleHindi.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleHindi);
			
			Chunk chunkMaxHin = new Chunk("                                                                                     100 ");
			Font fontMaxHin = new Font(Font.TIMES_ROMAN);
			fontMaxHin.setStyle(Font.NORMAL);
			fontMaxHin.setSize(12);
			fontMaxHin.setColor(Color.BLACK);
			chunkMaxHin.setFont(fontRNo);
			Paragraph paraTitleMaxHin = new Paragraph();	
			paraTitleMaxHin.setSpacingBefore(-16);
			paraTitleMaxHin.add(chunkMaxHin);
			paraTitleMaxHin.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxHin);
			
			Chunk chunkMinHin = new Chunk("                                                                                                                        35 ");
			Font fontMinHin = new Font(Font.TIMES_ROMAN);
			fontMinHin.setStyle(Font.NORMAL);
			fontMinHin.setSize(12);
			fontMinHin.setColor(Color.BLACK);
			chunkMinHin.setFont(fontRNo);
			Paragraph paraTitleMinHin = new Paragraph();	
			paraTitleMinHin.setSpacingBefore(-16);
			paraTitleMinHin.add(chunkMinHin);
			paraTitleMinHin.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinHin);
			
			Chunk chunkObtHin = new Chunk("                                                                                                                                                     55 ");
			Font fontObtHin = new Font(Font.TIMES_ROMAN);
			fontObtHin.setStyle(Font.NORMAL);
			fontObtHin.setSize(12);
			fontObtHin.setColor(Color.BLACK);
			chunkObtHin.setFont(fontRNo);
			Paragraph paraTitleObtHin = new Paragraph();	
			paraTitleObtHin.setSpacingBefore(-16);
			paraTitleObtHin.add(chunkObtHin);
			paraTitleMinHin.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtHin);
			
			Chunk chunkMarathi = new Chunk("            MARATHI ");
			Font fontMarathi = new Font(Font.TIMES_ROMAN);
			fontMarathi.setStyle(Font.NORMAL);
			fontMarathi.setSize(12);
			fontMarathi.setColor(Color.BLACK);
			chunkMarathi.setFont(fontRNo);
			Paragraph paraTitleMarathi = new Paragraph();	
			paraTitleMarathi.setSpacingBefore(5);
			paraTitleMarathi.add(chunkMarathi);
			paraTitleMarathi.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMarathi);
			
			Chunk chunkMaxMar = new Chunk("                                                                                     100 ");
			Font fontMaxMar = new Font(Font.TIMES_ROMAN);
			fontMaxMar.setStyle(Font.NORMAL);
			fontMaxMar.setSize(12);
			fontMaxMar.setColor(Color.BLACK);
			chunkMaxMar.setFont(fontRNo);
			Paragraph paraTitleMaxMar = new Paragraph();	
			paraTitleMaxMar.setSpacingBefore(-16);
			paraTitleMaxMar.add(chunkMaxMar);
			paraTitleMaxMar.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxMar);
			
			Chunk chunkMinMar = new Chunk("                                                                                                                        35 ");
			Font fontMinMar = new Font(Font.TIMES_ROMAN);
			fontMinMar.setStyle(Font.NORMAL);
			fontMinMar.setSize(12);
			fontMinMar.setColor(Color.BLACK);
			chunkMinMar.setFont(fontRNo);
			Paragraph paraTitleMinMar = new Paragraph();	
			paraTitleMinMar.setSpacingBefore(-16);
			paraTitleMinMar.add(chunkMinMar);
			paraTitleMinMar.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinMar);
			
			Chunk chunkObtMar = new Chunk("                                                                                                                                                     55 ");
			Font fontObtMar = new Font(Font.TIMES_ROMAN);
			fontObtMar.setStyle(Font.NORMAL);
			fontObtMar.setSize(12);
			fontObtMar.setColor(Color.BLACK);
			chunkObtMar.setFont(fontRNo);
			Paragraph paraTitleObtMar = new Paragraph();	
			paraTitleObtMar.setSpacingBefore(-16);
			paraTitleObtMar.add(chunkObtMar);
			paraTitleObtMar.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtMar);
			
			Chunk chunkSocialStudies = new Chunk("            SOCIAL STUDIES ");
			Font fontSocialStudies = new Font(Font.TIMES_ROMAN);
			fontSocialStudies.setStyle(Font.NORMAL);
			fontSocialStudies.setSize(12);
			fontSocialStudies.setColor(Color.BLACK);
			chunkSocialStudies.setFont(fontRNo);
			Paragraph paraTitleSocialStudies = new Paragraph();	
			paraTitleSocialStudies.setSpacingBefore(5);
			paraTitleSocialStudies.add(chunkSocialStudies);
			paraTitleSocialStudies.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleSocialStudies);
			
			Chunk chunkMaxSS = new Chunk("                                                                                     100 ");
			Font fontMaxSS = new Font(Font.TIMES_ROMAN);
			fontMaxSS.setStyle(Font.NORMAL);
			fontMaxSS.setSize(12);
			fontMaxSS.setColor(Color.BLACK);
			chunkMaxSS.setFont(fontRNo);
			Paragraph paraTitleMaxSS = new Paragraph();	
			paraTitleMaxSS.setSpacingBefore(-16);
			paraTitleMaxSS.add(chunkMaxSS);
			paraTitleMaxSS.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxSS);
			
			Chunk chunkMinSS = new Chunk("                                                                                                                        35 ");
			Font fontMinSS = new Font(Font.TIMES_ROMAN);
			fontMinSS.setStyle(Font.NORMAL);
			fontMinSS.setSize(12);
			fontMinSS.setColor(Color.BLACK);
			chunkMinSS.setFont(fontRNo);
			Paragraph paraTitleMinSS = new Paragraph();	
			paraTitleMinSS.setSpacingBefore(-16);
			paraTitleMinSS.add(chunkMinSS);
			paraTitleMinSS.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinSS);
			
			Chunk chunkObtSS = new Chunk("                                                                                                                                                     55 ");
			Font fontObtSS = new Font(Font.TIMES_ROMAN);
			fontObtSS.setStyle(Font.NORMAL);
			fontObtSS.setSize(12);
			fontObtSS.setColor(Color.BLACK);
			chunkObtSS.setFont(fontRNo);
			Paragraph paraTitleObtSS = new Paragraph();	
			paraTitleObtSS.setSpacingBefore(-16);
			paraTitleObtSS.add(chunkObtSS);
			paraTitleObtSS.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtSS);
			
			Chunk chunkMathematics = new Chunk("            MATHEMATICS ");
			Font fontMathematics = new Font(Font.TIMES_ROMAN);
			fontMathematics.setStyle(Font.NORMAL);
			fontMathematics.setSize(12);
			fontMathematics.setColor(Color.BLACK);
			chunkMathematics.setFont(fontRNo);
			Paragraph paraTitleMathematics = new Paragraph();	
			paraTitleMathematics.setSpacingBefore(5);
			paraTitleMathematics.add(chunkMathematics);
			paraTitleMathematics.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMathematics);
			
			Chunk chunkMaxMat = new Chunk("                                                                                     100 ");
			Font fontMaxMat = new Font(Font.TIMES_ROMAN);
			fontMaxMat.setStyle(Font.NORMAL);
			fontMaxMat.setSize(12);
			fontMaxMat.setColor(Color.BLACK);
			chunkMaxMat.setFont(fontRNo);
			Paragraph paraTitleMaxMat = new Paragraph();	
			paraTitleMaxMat.setSpacingBefore(-16);
			paraTitleMaxMat.add(chunkMaxMat);
			paraTitleMaxMat.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxMat);
			
			Chunk chunkMinMat = new Chunk("                                                                                                                        35 ");
			Font fontMinMat = new Font(Font.TIMES_ROMAN);
			fontMinMat.setStyle(Font.NORMAL);
			fontMinMat.setSize(12);
			fontMinMat.setColor(Color.BLACK);
			chunkMinMat.setFont(fontRNo);
			Paragraph paraTitleMinMat = new Paragraph();	
			paraTitleMinMat.setSpacingBefore(-16);
			paraTitleMinMat.add(chunkMinMat);
			paraTitleMinMat.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinMat);
			
			Chunk chunkObtMat = new Chunk("                                                                                                                                                     55 ");
			Font fontObtMat = new Font(Font.TIMES_ROMAN);
			fontObtMat.setStyle(Font.NORMAL);
			fontObtMat.setSize(12);
			fontObtMat.setColor(Color.BLACK);
			chunkObtMat.setFont(fontRNo);
			Paragraph paraTitleObtMat = new Paragraph();	
			paraTitleObtMat.setSpacingBefore(-16);
			paraTitleObtMat.add(chunkObtMat);
			paraTitleObtMat.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtMat);
			
			Chunk chunkScience = new Chunk("            SCIENCE ");
			Font fontScience = new Font(Font.TIMES_ROMAN);
			fontScience.setStyle(Font.NORMAL);
			fontScience.setSize(12);
			fontScience.setColor(Color.BLACK);
			chunkScience.setFont(fontRNo);
			Paragraph paraTitleScience = new Paragraph();	
			paraTitleScience.setSpacingBefore(5);
			paraTitleScience.add(chunkScience);
			paraTitleScience.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleScience);
			
			Chunk chunkMaxSci = new Chunk("                                                                                     100 ");
			Font fontMaxSci = new Font(Font.TIMES_ROMAN);
			fontMaxSci.setStyle(Font.NORMAL);
			fontMaxSci.setSize(12);
			fontMaxSci.setColor(Color.BLACK);
			chunkMaxSci.setFont(fontRNo);
			Paragraph paraTitleMaxSci = new Paragraph();	
			paraTitleMaxSci.setSpacingBefore(-16);
			paraTitleMaxSci.add(chunkMaxSci);
			paraTitleMaxSci.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxSci);
			
			Chunk chunkMinSci = new Chunk("                                                                                                                        35 ");
			Font fontMinSci = new Font(Font.TIMES_ROMAN);
			fontMinSci.setStyle(Font.NORMAL);
			fontMinSci.setSize(12);
			fontMinSci.setColor(Color.BLACK);
			chunkMinSci.setFont(fontRNo);
			Paragraph paraTitleMinSci = new Paragraph();	
			paraTitleMinSci.setSpacingBefore(-16);
			paraTitleMinSci.add(chunkMinSci);
			paraTitleMinSci.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinSci);
			
			Chunk chunkObtSci = new Chunk("                                                                                                                                                     55 ");
			Font fontObtSci = new Font(Font.TIMES_ROMAN);
			fontObtSci.setStyle(Font.NORMAL);
			fontObtSci.setSize(12);
			fontObtSci.setColor(Color.BLACK);
			chunkObtSci.setFont(fontRNo);
			Paragraph paraTitleObtSci = new Paragraph();	
			paraTitleObtSci.setSpacingBefore(-16);
			paraTitleObtSci.add(chunkObtSci);
			paraTitleObtSci.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtSci);
			
			Chunk chunkIct = new Chunk("            I.C.T. ");
			Font fontIct = new Font(Font.TIMES_ROMAN);
			fontIct.setStyle(Font.NORMAL);
			fontIct.setSize(12);
			fontIct.setColor(Color.BLACK);
			chunkIct.setFont(fontRNo);
			Paragraph paraTitleIct = new Paragraph();	
			paraTitleIct.setSpacingBefore(5);
			paraTitleIct.add(chunkIct);
			paraTitleIct.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleIct);
			
			Chunk chunkMaxIct = new Chunk("                                                                                      50 ");
			Font fontMaxIct = new Font(Font.TIMES_ROMAN);
			fontMaxIct.setStyle(Font.NORMAL);
			fontMaxIct.setSize(12);
			fontMaxIct.setColor(Color.BLACK);
			chunkMaxIct.setFont(fontRNo);
			Paragraph paraTitleMaxIct = new Paragraph();	
			paraTitleMaxIct.setSpacingBefore(-16);
			paraTitleMaxIct.add(chunkMaxIct);
			paraTitleMaxIct.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxIct);
			
			Chunk chunkMinIct = new Chunk("                                                                                                                        18 ");
			Font fontMinIct = new Font(Font.TIMES_ROMAN);
			fontMinIct.setStyle(Font.NORMAL);
			fontMinIct.setSize(12);
			fontMinIct.setColor(Color.BLACK);
			chunkMinIct.setFont(fontRNo);
			Paragraph paraTitleMinIct = new Paragraph();	
			paraTitleMinIct.setSpacingBefore(-16);
			paraTitleMinIct.add(chunkMinIct);
			paraTitleMinIct.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinIct);
			
			Chunk chunkObtIct = new Chunk("                                                                                                                                                     25 ");
			Font fontObtIct = new Font(Font.TIMES_ROMAN);
			fontObtIct.setStyle(Font.NORMAL);
			fontObtIct.setSize(12);
			fontObtIct.setColor(Color.BLACK);
			chunkObtIct.setFont(fontRNo);
			Paragraph paraTitleObtIct = new Paragraph();	
			paraTitleObtIct.setSpacingBefore(-16);
			paraTitleObtIct.add(chunkObtIct);
			paraTitleObtIct.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtIct);
			
			Chunk chunkPhysical = new Chunk("            PHYSICAL EDUCATION ");
			Font fontPhysical = new Font(Font.TIMES_ROMAN);
			fontPhysical.setStyle(Font.NORMAL);
			fontPhysical.setSize(12);
			fontPhysical.setColor(Color.BLACK);
			chunkPhysical.setFont(fontRNo);
			Paragraph paraTitlePhysical = new Paragraph();	
			paraTitlePhysical.setSpacingBefore(5);
			paraTitlePhysical.add(chunkPhysical);
			paraTitlePhysical.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitlePhysical);
			
			Chunk chunkMaxPhy = new Chunk("                                                                                      50 ");
			Font fontMaxPhy = new Font(Font.TIMES_ROMAN);
			fontMaxPhy.setStyle(Font.NORMAL);
			fontMaxPhy.setSize(12);
			fontMaxPhy.setColor(Color.BLACK);
			chunkMaxPhy.setFont(fontRNo);
			Paragraph paraTitleMaxPhy = new Paragraph();	
			paraTitleMaxPhy.setSpacingBefore(-16);
			paraTitleMaxPhy.add(chunkMaxPhy);
			paraTitleMaxPhy.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxPhy);
			
			Chunk chunkMinPhy = new Chunk("                                                                                                                        18 ");
			Font fontMinPhy = new Font(Font.TIMES_ROMAN);
			fontMinPhy.setStyle(Font.NORMAL);
			fontMinPhy.setSize(12);
			fontMinPhy.setColor(Color.BLACK);
			chunkMinPhy.setFont(fontRNo);
			Paragraph paraTitleMinPhy = new Paragraph();	
			paraTitleMinPhy.setSpacingBefore(-16);
			paraTitleMinPhy.add(chunkMinPhy);
			paraTitleMinPhy.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinPhy);
			
			Chunk chunkObtPhy = new Chunk("                                                                                                                                                     25 ");
			Font fontObtPhy = new Font(Font.TIMES_ROMAN);
			fontObtPhy.setStyle(Font.NORMAL);
			fontObtPhy.setSize(12);
			fontObtPhy.setColor(Color.BLACK);
			chunkObtPhy.setFont(fontRNo);
			Paragraph paraTitleObtPhy = new Paragraph();	
			paraTitleObtPhy.setSpacingBefore(-16);
			paraTitleObtPhy.add(chunkObtPhy);
			paraTitleObtPhy.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtPhy);
			
			Chunk chunkPD = new Chunk("            P. D. ");
			Font fontPD = new Font(Font.TIMES_ROMAN);
			fontPD.setStyle(Font.NORMAL);
			fontPD.setSize(12);
			fontPD.setColor(Color.BLACK);
			chunkPD.setFont(fontRNo);
			Paragraph paraTitlePD = new Paragraph();	
			paraTitlePD.setSpacingBefore(5);
			paraTitlePD.add(chunkPD);
			paraTitlePD.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitlePD);
			
			Chunk chunkMaxPD = new Chunk("                                                                                      50 ");
			Font fontMaxPD = new Font(Font.TIMES_ROMAN);
			fontMaxPD.setStyle(Font.NORMAL);
			fontMaxPD.setSize(12);
			fontMaxPD.setColor(Color.BLACK);
			chunkMaxPD.setFont(fontRNo);
			Paragraph paraTitleMaxPD = new Paragraph();	
			paraTitleMaxPD.setSpacingBefore(-16);
			paraTitleMaxPD.add(chunkMaxPD);
			paraTitleMaxPD.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxPD);
			
			Chunk chunkMinPD = new Chunk("                                                                                                                        18 ");
			Font fontMinPD = new Font(Font.TIMES_ROMAN);
			fontMinPD.setStyle(Font.NORMAL);
			fontMinPD.setSize(12);
			fontMinPD.setColor(Color.BLACK);
			chunkMinPD.setFont(fontRNo);
			Paragraph paraTitleMinPD = new Paragraph();	
			paraTitleMinPD.setSpacingBefore(-16);
			paraTitleMinPD.add(chunkMinPD);
			paraTitleMinPD.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinPD);
			
			Chunk chunkObtPD = new Chunk("                                                                                                                                                     25 ");
			Font fontObtPD = new Font(Font.TIMES_ROMAN);
			fontObtPD.setStyle(Font.NORMAL);
			fontObtPD.setSize(12);
			fontObtPD.setColor(Color.BLACK);
			chunkObtPD.setFont(fontRNo);
			Paragraph paraTitleObtPD = new Paragraph();	
			paraTitleObtPD.setSpacingBefore(-16);
			paraTitleObtPD.add(chunkObtPD);
			paraTitleObtPD.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtPD);
			
			Chunk chunkOptional = new Chunk("            OPTIONAL SUBJECT ");
			Font fontOptional = new Font(Font.TIMES_ROMAN);
			fontOptional.setStyle(Font.BOLD);
			fontOptional.setSize(12);
			fontOptional.setColor(Color.BLACK);
			chunkOptional.setFont(fontOptional);
			Paragraph paraTitleOptional = new Paragraph();
			paraTitleOptional.setSpacingBefore(5);
			paraTitleOptional.add(chunkOptional);
			paraTitleOptional.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleOptional);
			
			
			Chunk chunkComputer = new Chunk("            Vocational Guidance ");
			Font fontComputer = new Font(Font.TIMES_ROMAN);
			fontComputer.setStyle(Font.NORMAL);
			fontComputer.setSize(12);
			fontComputer.setColor(Color.BLACK);
			chunkComputer.setFont(fontRNo);
			Paragraph paraTitleComputer = new Paragraph();	
			paraTitleComputer.setSpacingBefore(5);
			paraTitleComputer.add(chunkComputer);
			paraTitleComputer.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleComputer);
		
			Chunk chunkMaxComputer = new Chunk("                                                                                      50 ");
			Font fontMaxComputer = new Font(Font.TIMES_ROMAN);
			fontMaxComputer.setStyle(Font.NORMAL);
			fontMaxComputer.setSize(12);
			fontMaxComputer.setColor(Color.BLACK);
			chunkMaxComputer.setFont(fontRNo);
			Paragraph paraTitleMaxComputer = new Paragraph();	
			paraTitleMaxComputer.setSpacingBefore(-16);
			paraTitleMaxComputer.add(chunkMaxComputer);
			paraTitleMaxComputer.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxComputer);
			
			Chunk chunkMinComputer = new Chunk("                                                                                                                        18 ");
			Font fontMinComputer = new Font(Font.TIMES_ROMAN);
			fontMinComputer.setStyle(Font.NORMAL);
			fontMinComputer.setSize(12);
			fontMinComputer.setColor(Color.BLACK);
			chunkMinComputer.setFont(fontRNo);
			Paragraph paraTitleMinComputer = new Paragraph();	
			paraTitleMinComputer.setSpacingBefore(-16);
			paraTitleMinComputer.add(chunkMinComputer);
			paraTitleMinComputer.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinComputer);
			
			Chunk chunkObtComputer = new Chunk("                                                                                                                                                     25 ");
			Font fontObtComputer = new Font(Font.TIMES_ROMAN);
			fontObtComputer.setStyle(Font.NORMAL);
			fontObtComputer.setSize(12);
			fontObtComputer.setColor(Color.BLACK);
			chunkObtComputer.setFont(fontRNo);
			Paragraph paraTitleObtComputer = new Paragraph();	
			paraTitleObtComputer.setSpacingBefore(-16);
			paraTitleObtComputer.add(chunkObtComputer);
			paraTitleObtComputer.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtComputer);
			
			Chunk chunkMaxTotal = new Chunk("                                                                                     100 ");
			Font fontMaxTotal = new Font(Font.TIMES_ROMAN);
			fontMaxTotal.setStyle(Font.NORMAL);
			fontMaxTotal.setSize(12);
			fontMaxTotal.setColor(Color.BLACK);
			chunkMaxTotal.setFont(fontRNo);
			Paragraph paraTitleMaxTotal = new Paragraph();	
			paraTitleMaxTotal.setSpacingBefore(33);
			paraTitleMaxTotal.add(chunkMaxTotal);
			paraTitleMaxTotal.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMaxTotal);
			
			Chunk chunkMinTotal = new Chunk("                                                                                                                        35 ");
			Font fontMinTotal = new Font(Font.TIMES_ROMAN);
			fontMinTotal.setStyle(Font.NORMAL);
			fontMinTotal.setSize(12);
			fontMinTotal.setColor(Color.BLACK);
			chunkMinTotal.setFont(fontRNo);
			Paragraph paraTitleMinTotal = new Paragraph();	
			paraTitleMinTotal.setSpacingBefore(-16);
			paraTitleMinTotal.add(chunkMinTotal);
			paraTitleMinTotal.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleMinTotal);
			
			Chunk chunkObtTotal = new Chunk("                                                                                                                                                     55 ");
			Font fontObtTotal = new Font(Font.TIMES_ROMAN);
			fontObtTotal.setStyle(Font.NORMAL);
			fontObtTotal.setSize(12);
			fontObtTotal.setColor(Color.BLACK);
			chunkObtTotal.setFont(fontRNo);
			Paragraph paraTitleObtTotal = new Paragraph();	
			paraTitleObtTotal.setSpacingBefore(-16);
			paraTitleObtTotal.add(chunkObtTotal);
			paraTitleObtTotal.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleObtTotal);
			
			Chunk chunkAttendance = new Chunk("                                     97/100 ");
			Font fontAttendance = new Font(Font.TIMES_ROMAN);
			fontAttendance.setStyle(Font.NORMAL);
			fontAttendance.setSize(12);
			fontAttendance.setColor(Color.BLACK);
			chunkAttendance.setFont(fontRNo);
			Paragraph paraTitleAttendance = new Paragraph();	
			paraTitleAttendance.setSpacingBefore(11);
			paraTitleAttendance.add(chunkAttendance);
			paraTitleAttendance.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleAttendance);
			
			Chunk chunkPercentage = new Chunk("                                                                                                                                        99% ");
			Font fontPercentage = new Font(Font.TIMES_ROMAN);
			fontPercentage.setStyle(Font.NORMAL);
			fontPercentage.setSize(12);
			fontPercentage.setColor(Color.BLACK);
			chunkPercentage.setFont(fontRNo);
			Paragraph paraTitlePercentage = new Paragraph();	
			paraTitlePercentage.setSpacingBefore(-16);
			paraTitlePercentage.add(chunkPercentage);
			paraTitlePercentage.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitlePercentage);
			
			Chunk chunkConduct = new Chunk("                                   Good ");
			Font fontConduct = new Font(Font.TIMES_ROMAN);
			fontConduct.setStyle(Font.NORMAL);
			fontConduct.setSize(12);
			fontConduct.setColor(Color.BLACK);
			chunkConduct.setFont(fontRNo);
			Paragraph paraTitleConduct = new Paragraph();	
			paraTitleConduct.setSpacingBefore(7);
			paraTitleConduct.add(chunkConduct);
			paraTitleConduct.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleConduct);
			
			Chunk chunkRemark = new Chunk("                                                                                   Fair");
			Font fontRemark = new Font(Font.TIMES_ROMAN);
			fontRemark.setStyle(Font.NORMAL);
			fontRemark.setSize(12);
			fontRemark.setColor(Color.BLACK);
			chunkRemark.setFont(fontRNo);
			Paragraph paraTitleRemark = new Paragraph();	
			paraTitleRemark.setSpacingBefore(-16);
			paraTitleRemark.add(chunkRemark);
			paraTitleRemark.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleRemark);
			
			Chunk chunkResult = new Chunk("                                                                                                                                  Passed and Promoted to std");
			Font fontResult = new Font(Font.TIMES_ROMAN);
			fontResult.setStyle(Font.NORMAL);
			fontResult.setSize(12);
			fontResult.setColor(Color.BLACK);
			chunkResult.setFont(fontRNo);
			Paragraph paraTitleResult = new Paragraph();	
			paraTitleResult.setSpacingBefore(-16);
			paraTitleResult.add(chunkResult);
			paraTitleResult.setAlignment(Element.ALIGN_LEFT);
			document.add(paraTitleResult);

			
			
			document.close();
			
			// open pdf 

				String fileAddress= "D:\\yash\\ResultPdf1.pdf";    //"D:\\java\\resume.pdf";
					try {
						if ((new File(fileAddress)).exists()) {
							if((System.getProperty("os.name").toLowerCase().indexOf("mac") >= 0)) {
								Runtime.getRuntime().exec(new String[]{"/usr/bin/open", fileAddress});
							}
							else {
								Process process = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+fileAddress);
								process.waitFor();
							}
						} else {
							System.out.println("File not found");
						}
						System.out.println("Done");
					} catch (Exception e) {
						System.out.println(":: -----Exception---- ::\n"+e);
					}
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}

