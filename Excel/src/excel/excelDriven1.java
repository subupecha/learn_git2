package excel;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDriven1 {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		String value=getData(2,2);
		System.out.println(value);
		String value1=getData(3,2);
		System.out.println(value1);
	}
		
		
		public static String getData(int rownum, int colnum) throws IOException
		{
			fis=new FileInputStream("D://data.xlsx");
			wb=new XSSFWorkbook(fis);
			sh=wb.getSheet("script");
			 row=sh.getRow(rownum);
			 cell=row.getCell(colnum);
			cell.getStringCellValue();
			return cell.getStringCellValue();
			
			
			
		}
		
		

	}


