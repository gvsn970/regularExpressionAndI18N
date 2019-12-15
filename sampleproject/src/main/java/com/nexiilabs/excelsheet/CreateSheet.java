package com.nexiilabs.excelsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		XSSFRow row = null;
		XSSFFont font = null;
		XSSFCellStyle style = null;
		// Creating Workbook instances
		XSSFWorkbook wb = new XSSFWorkbook();

		// An output stream accepts output bytes and sends them to sink.
		String filename = "D:\\file_upload\\excelsheetExport\\MrdDeatiles.xlsx";

		OutputStream fileOut = new FileOutputStream(filename);

		// Creating Sheets using sheet object
		XSSFSheet sheet1 = wb.createSheet("MrdBasicDetailes");
		sheet1.setColumnWidth(0, 3000);
		sheet1.setColumnWidth(1, 4500);
		sheet1.setColumnWidth(2, 10200);
		sheet1.setColumnWidth(3, 8500);
		sheet1.setColumnWidth(4, 8500);
		sheet1.setColumnWidth(5, 8500);
		sheet1.setColumnWidth(6, 6500);

		row = sheet1.createRow(0);

		// Creating Font
		font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontHeightInPoints((short) 14);
		font.setFontName("Constantia");
		font.setItalic(true);

		// Creating Style
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setFont(font);

		// Create a cell with a value and set style to it.
		XSSFCell cell1 = row.createCell(0);
		cell1.setCellValue("S.NO");
		cell1.setCellStyle(style);

		XSSFCell cell2 = row.createCell(1);
		cell2.setCellValue("MRD NAME");
		cell2.setCellStyle(style);

		XSSFCell cell3 = row.createCell(2);
		cell3.setCellValue("PRODUCT FAMILY TYPE");
		cell3.setCellStyle(style);
		
		
		XSSFCell cell4 = row.createCell(3);
		cell4.setCellValue("CUSTOMERSEGMENT");
		cell4.setCellStyle(style);
		
		XSSFCell cell5 = row.createCell(4);
		cell5.setCellValue("EXACT LAUNCHDATE");
		cell5.setCellStyle(style);
		
		XSSFCell cell6 = row.createCell(5);
		cell6.setCellValue("NUMBER OF SKUS");
		cell6.setCellStyle(style);

		// ==========================================================

		XSSFSheet sheet2 = wb.createSheet("PricingTemplete");
		sheet2.setColumnWidth(0, 3000);
		sheet2.setColumnWidth(1, 5500);
		sheet2.setColumnWidth(2, 6500);
		row = sheet2.createRow(0);
		font = wb.createFont();
		font.setColor(HSSFColor.WHITE.index);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontHeightInPoints((short) 14);
		font.setFontName("Constantia");
		font.setItalic(true);
		// Creating Style
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.ROYAL_BLUE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		
		XSSFCell secondSheetCell1 = row.createCell(0);
		secondSheetCell1.setCellValue("S.NO");
		secondSheetCell1.setCellStyle(style);

		XSSFCell secondSheetCell2 = row.createCell(1);
		secondSheetCell2.setCellValue("Templete Id");
		secondSheetCell2.setCellStyle(style);

		XSSFCell secondSheetCell3 = row.createCell(2);
		secondSheetCell3.setCellValue("Templete Name");
		secondSheetCell3.setCellStyle(style);

		// =================================================
		Sheet sheet3 = wb.createSheet("HeadCount");
		Sheet sheet4 = wb.createSheet("UnitPricing");
		Sheet sheet5 = wb.createSheet("Dynamic Programing");
		Sheet sheet6 = wb.createSheet("Puzzles");
		

		System.out.println("Sheets Has been Created successfully");

		wb.write(fileOut);

	}

}
