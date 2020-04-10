package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XUtils {
	
	public static FileInputStream fi;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	public static CellStyle style;
	public static FileOutputStream fo;
	
	
	//Create  getRowCount method
	public static int getRowCount(String xlfile,String xlsheet) throws IOException{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int row=ws.getLastRowNum();
		wb.close();
		fi.close();
		return row;
		
	}
	//Create getColumnCount method
  public static short getColomCount(String xlfile,String xlsheet,int rownum) throws IOException{
	  fi=new FileInputStream(xlfile);
	  wb=new XSSFWorkbook(fi);
	  ws=wb.getSheet(xlsheet);
	  ws.getRow(rownum);
	  short colnum=row.getLastCellNum();
	  wb.close();
	  fi.close();
	  return colnum;
	  }
  
  //Create getCellStringCount method
  public static String getStringCellCount(String xlfile,String xsheet,int rownum,int colnum) throws IOException{
	  fi=new FileInputStream(xlfile);
	  wb=new XSSFWorkbook(fi);
	  ws=wb.getSheet(xlfile);
	  row=ws.getRow(rownum);
	  String data;
	  try{
		  cell=row.getCell(colnum);
		  data=cell.getStringCellValue() ;
		  
	  }catch(Exception e){
		  
		  data=" ";
	  }
	  wb.close();
	  fi.close();
	return data;
	  
	  }
  //Create getNumericCellCount method
  
  
  
  }
	  
 
