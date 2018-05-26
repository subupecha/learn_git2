package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("D://data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("script");
		sh.getRow(0).createCell(3).setCellValue("sujata");
		sh.getRow(1).createCell(3).setCellValue("arpita");
		sh.getRow(2).createCell(3).setCellValue("jashmin");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		

	}


	}


