package excelJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D://writeJavaExcel1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		Iterator<Row> rowIterator=sh.iterator();
		while(rowIterator.hasNext())
		{
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell=cellIterator.next();
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				}
			}
			fis.close();
		}
		
		
		

	}

}
