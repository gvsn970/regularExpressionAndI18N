package com.nexiilabs.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BulkUpload {

	public static void main(String[] args) {
		 try
	        {
	            FileInputStream file = new FileInputStream(new File("question Bank Dev.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            rowIterator.next();
	            while (rowIterator.hasNext())
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                 
	           
	                   /* Cell cell = cellIterator.next();
	                    //Check the cell type and format accordingly
	                    switch (cell.getCellType())
	                    {
	                        case Cell.CELL_TYPE_NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "t");
	                            break;
	                        case Cell.CELL_TYPE_STRING:
	                            System.out.print(cell.getStringCellValue() + "t");
	                            break;
	                    }*/
	                	
	                	if(row.getCell(0).getCellType() == Cell.CELL_TYPE_STRING) {
	                		
	                	}if(row.getCell(1).getCellType() == Cell.CELL_TYPE_STRING){
	                		
	                	}
	                
	                System.out.println("");
	            }
	            file.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}
}
