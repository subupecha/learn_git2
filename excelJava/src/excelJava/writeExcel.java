package excelJava;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("javaWriteExcel.xlsx");
		//This data need to be written
		Map<String, Object[]> data=new TreeMap<String, Object[]>();
		data.put("1", new Object[]{"ID","NAME","LastName"});
		data.put("2", new Object[]{"1","juli","sahoo"});
		data.put("3", new Object[]{"2","Rashmi","sahoo"});
		data.put("4", new Object[]{"3","sushil","sahoo"});
		data.put("5", new Object[]{"4","prafulla","sahoo"});
		data.put("6", new Object[]{"5","lipsa","sahoo"});
		
		//Iterate Over data and write to sheet
		Set<String> keyset=data.keySet();
		int rownum=0;
		for(String key:keyset)
		{
			Row row=sh.createRow(rownum++);
			Object[] objArr=data.get(key);
			int cellnum=0;
			for(Object obj:objArr)
			{
				Cell cell=row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
				
			}
		try{
			//Write the workbook in file System
			FileOutputStream fout=new FileOutputStream(new File("D://javaWriteExcel.xlsx"));
			wb.write(fout);
			fout.close();
			System.out.println("javaWriteData Excel is written successfully on the disk");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
					
		}
		
		
		

	}

}
