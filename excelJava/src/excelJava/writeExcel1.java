package excelJava;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("writeJavaExcel1.xlsx");
		Map<String, Object[]> data=new TreeMap<String, Object[]>();
		data.put("1", new Object[]{"Id","Technology","Degree"});
		data.put("2", new Object[]{"1","Engg","B-Tech"});
		data.put("3", new Object[]{"2","Commerce","Bsc"});
		data.put("4", new Object[]{"3","Science","Bsc"});
		data.put("5", new Object[]{"4","Arts","Ba"});
		data.put("6", new Object[]{"5","HomeScience","Bsc"});
		
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
		try
		{
			FileOutputStream fout=new FileOutputStream("D://writeJavaExcel1.xlsx");
			wb.write(fout);
			wb.close();
			System.out.println("data is written to output excel successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		




	}

}
