package utilitypackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {
	public static String getvalues(String x1,String sheet,int r,int c)
	{
		try
		{
			FileInputStream file=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	public static int getrowcount(String x1,String sheet)
	{
		try
		{
			FileInputStream file=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}
}
