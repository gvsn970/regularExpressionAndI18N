package com.nexiilabs.excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("question Bank Dev.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
		
			int rows = sheet.getPhysicalNumberOfRows();
			//int noOfColumns = sheet.getRow(7).getPhysicalNumberOfCells();
			
			int noOfColumns = sheet.getRow(1).getPhysicalNumberOfCells();
			System.out.println("rows:" + rows + "  noOfColumns:" + noOfColumns);

			/*
			 * Row header = sheet.getRow(0); String question =
			 * header.getCell(0).getStringCellValue(); String programCode =
			 * header.getCell(1).getStringCellValue(); String section =
			 * header.getCell(2).getStringCellValue(); String questionType =
			 * header.getCell(3).getStringCellValue(); String isMandate =
			 * header.getCell(4).getStringCellValue(); String questionComplexity =
			 * header.getCell(5).getStringCellValue(); String answer =
			 * header.getCell(6).getStringCellValue();
			 */
			Iterator<Row> rowIterator = sheet.iterator();
			rowIterator.next();
		
			while (rowIterator.hasNext()) {
			
			
					Row row = rowIterator.next();
					if (row.getCell(0)==null) {
						System.out.println("Shoudl not be empty");
					}
				
				
			}
			

			for (int i = 1; i < rows; i++) {
				for (int j = 0; j < noOfColumns; j++) {
					if (rows != 0 && noOfColumns != 0) {
						
						System.out.print(sheet.getRow(i).getCell(j) + "\t");
						if ( j == 8 ) {
							
						}
					}

				}
				System.out.println();
			}

			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSheetNotEmpty(XSSFSheet xssfSheet) {
		Iterator rows = xssfSheet.rowIterator();
		while (rows.hasNext()) {
			Row row = (Row) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext()) {
				Cell cell = (Cell) cells.next();
				if (!cell.getStringCellValue().isEmpty()) {
					return true;
				}
			}
		}
		return false;
	}
}
