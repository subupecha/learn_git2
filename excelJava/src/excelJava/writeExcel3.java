package excelJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("javaWriteExcel3.xlsx");
		Map<String, Object[]> data=new TreeMap<String,Object[]>();
		data.put("1", new Object[]{"01","sumanta","hirakud"});
		data.put("2", new Object[]{"02","naimish","lapanga"});
		data.put("3", new Object[]{"03","narayana","tabla"});
		data.put("4", new Object[]{"04","arta","laida"});
		data.put("5", new Object[]{"05","byasodev","themra"});
		data.put("6", new Object[]{"06","biswajeet","jharsuguda"});
		
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
			FileOutputStream fout=new FileOutputStream("D:javaWriteExcel3.xlsx");
			wb.write(fout);
			wb.close();
			System.out.println("data is written successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
