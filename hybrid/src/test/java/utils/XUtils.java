package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
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
    public static double getNumericCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException{
     fi=new FileInputStream(xlfile);
     wb=new XSSFWorkbook(fi);
     ws=wb.getSheet(xlsheet);
     row=ws.getRow(rownum);
     double data;
    
     try{
    	 cell=row.getCell(colnum);
    	 data=cell.getNumericCellValue();
     }catch(Exception e){
    	 data=0;
     }
     wb.close();
     fi.close();
	return data;
      }
   //Create getbooleanCellData method
    public static boolean getBooleanCellData(String xlfile,String xlsheet, int rownum,int colnum) throws IOException{
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	row=ws.getRow(rownum);
    	
    	try{
    		cell=row.getCell(colnum);
    		boolean data = cell.getBooleanCellValue();
    		
    	}catch(Exception e){
    		
    		
    	}
		return false;
    	 }
  //Create setCellData method
     public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException{
    	 fi=new FileInputStream(xlfile);
    	 wb=new XSSFWorkbook(fi);
    	 ws=wb.getSheet(xlfile);
    	 row=ws.getRow(rownum);
    	 cell=row.createCell(colnum);
    	 cell.setCellValue(data);
    	 fo=new FileOutputStream(xlfile);
    	 wb.write(fo);
    	 wb.close();
    	 fi.close();
    	 
  }
     //Create fillGreenColor method
     public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
    	 fi=new FileInputStream(xlfile);
    	 wb=new XSSFWorkbook(fi);
    	 ws=wb.getSheet(xlsheet);
    	 row=ws.getRow(rownum);
    	 row.getCell(colnum);
    	 style=wb.createCellStyle();
    	 style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	 style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	 cell.setCellStyle(style);
    	 fo=new FileOutputStream(xlfile);
    	 wb.write(fo);
    	 wb.close();
    	 fi.close();
    	 
   }
     //Create fillRedColor method
     public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
    	 fi=new FileInputStream(xlfile);
    	 wb=new XSSFWorkbook(fi);
    	 ws=wb.getSheet(xlfile);
    	 ws.getRow(rownum);
    	 
    	 
    	 
    	 
     }
     
     
  
  }
	  
 
