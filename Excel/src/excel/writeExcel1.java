package excel;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel1 {
	public static File src;
	public static FileInputStream fis;
	public static FileOutputStream fout;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String conName;

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		String value=setData(3,3,"hampej" );
		wb.write(fout);
		String value1=setData(4,3, "hkhhj");
		wb.write(fout);
	}
		
		
		public static String setData(int rownum, int colnum, String name) throws IOException
		{
			src=new File("D://data1.xlsx");
			fis=new FileInputStream(src);
			fout=new FileOutputStream(src);
			wb=new XSSFWorkbook(fis);
			sh=wb.getSheet("script");
			 row=sh.getRow(rownum);
			 cell=row.createCell(colnum);
			 cell.setCellValue(name);
			return name;
			 
			
			
		}
		
		

	}


