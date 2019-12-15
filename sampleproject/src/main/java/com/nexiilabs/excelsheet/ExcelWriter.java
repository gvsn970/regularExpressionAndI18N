package com.nexiilabs.excelsheet;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	private static List<Employee> employees = new ArrayList<Employee>();

	// Initializing employees data to insert into the excel file
	static {
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1992, 7, 21);
		employees.add(new Employee("Rajeev Singh", "rajeev@example.com", dateOfBirth.getTime(), 1200000.0));

	}

	public static void main(String[] args) throws IOException, InvalidFormatException {
		// Create a Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

		/*
		 * CreationHelper helps us create instances of various things like DataFormat,
		 * Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way
		 */
		CreationHelper createHelper = workbook.getCreationHelper();

		// ********************************** Sheet 1 Start **************************
		// Create a Sheet
		String[] columnsForSheet1 = { "MRD NAME", "CUSTOMERSEGMENT", "EXACT LAUNCH DATE", "PRODUCT LIFECYCLE QUARTERS",
				"NUMBER OF SKUS" };
		Sheet sheet1 = workbook.createSheet("MrdBasicDetailes");

		// Set the tab color
		((XSSFSheet) sheet1).setTabColor(new XSSFColor(Color.RED));

		// Create a Font for styling header cells
		Font headerFontForSheet1 = workbook.createFont();

		headerFontForSheet1.setBold(true);
		headerFontForSheet1.setFontHeightInPoints((short) 14);
		headerFontForSheet1.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font
		CellStyle headerCellStyleForSheet1 = workbook.createCellStyle();
		headerCellStyleForSheet1.setFont(headerFontForSheet1);

		// Create a Row
		Row headerRowForSheet1 = sheet1.createRow(0);

		// Create cells
		for (int i = 0; i < columnsForSheet1.length; i++) {
			Cell cell = headerRowForSheet1.createCell(i);
			cell.setCellValue(columnsForSheet1[i]);
			cell.setCellStyle(headerCellStyleForSheet1);
		}

		// Create Cell Style for formatting Date
		CellStyle dateCellStyleForSheet1 = workbook.createCellStyle();
		dateCellStyleForSheet1.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data
		int rowNum = 1;
		for (Employee employee : employees) {
			Row row = sheet1.createRow(rowNum++);

			row.createCell(0).setCellValue(employee.getName());

			row.createCell(1).setCellValue(employee.getEmail());

			Cell dateOfBirthCell = row.createCell(2);
			dateOfBirthCell.setCellValue(employee.getDateOfBirth());
			dateOfBirthCell.setCellStyle(dateCellStyleForSheet1);

			row.createCell(3).setCellValue(employee.getSalary());
		}

		// Resize all columns to fit the content size
		for (int i = 0; i < columnsForSheet1.length; i++) {
			sheet1.autoSizeColumn(i);
		}
		// ********************************** Sheet 1 End **************************

		// ********************************** Sheet 2 Start **************************

		Sheet sheet2 = workbook.createSheet("PricingTemplete");
		String[] columnsForSheet2 = { "NAME", "Email ID", "Date Of Birth", "Year" };
		// Create a Font for styling header cells
		Font headerFontForSheet2 = workbook.createFont();
		headerFontForSheet2.setBold(true);
		headerFontForSheet2.setFontHeightInPoints((short) 14);
		headerFontForSheet2.setColor(IndexedColors.RED.getIndex());

		// Create a Row
		Row headerRowForSheet2 = sheet2.createRow(0);
		((XSSFSheet) sheet2).setTabColor(new XSSFColor(Color.BLUE));

		// Create a CellStyle with the font
		CellStyle headerCellStyleForSheet2 = workbook.createCellStyle();
		headerCellStyleForSheet2.setFont(headerFontForSheet2);
		// Create cells
		for (int i = 0; i < columnsForSheet2.length; i++) {
			Cell cell = headerRowForSheet2.createCell(i);
			cell.setCellValue(columnsForSheet2[i]);
			cell.setCellStyle(headerCellStyleForSheet2);
		}

		// Inside Sheet Start

		String[] columns1ForSheet2 = { "YEAR", "MATERIAL COST", "NET REVENUE AMOUNT", "OTHER COST", "WARRANTY" };
		// Create a Font for styling header cells
		Font header1FontForSheet2 = workbook.createFont();
		header1FontForSheet2.setBold(true);
		header1FontForSheet2.setFontHeightInPoints((short) 14);
		header1FontForSheet2.setColor(IndexedColors.MAROON.getIndex());

		// Create a CellStyle with the font
		CellStyle header1CellStyleForSheet2 = workbook.createCellStyle();
		header1CellStyleForSheet2.setFont(header1FontForSheet2);

		Row header1RowForSheet2 = sheet2.createRow(4);

		int countCell = 2;
		for (int i = 0; i < columns1ForSheet2.length; i++) {
			Cell cell1 = header1RowForSheet2.createCell(countCell + i);
			cell1.setCellValue(columns1ForSheet2[i]);
			cell1.setCellStyle(header1CellStyleForSheet2);
		}

		// YEAR START

		/*
		 * Row yearRow1 = sheet2.createRow(5);
		 * 
		 * Cell yearCell1 = yearRow1.createCell(1); yearCell1.setCellValue("YEAR1");
		 * yearCell1.setCellStyle(header1CellStyleForSheet2);
		 * 
		 * Row yearRow2 = sheet2.createRow(6); Cell yearCell2 = yearRow2.createCell(1);
		 * yearCell2.setCellValue("YEAR2");
		 * yearCell2.setCellStyle(header1CellStyleForSheet2);
		 * 
		 * Row yearRow3 = sheet2.createRow(7); Cell yearCell3 = yearRow3.createCell(1);
		 * yearCell3.setCellValue("YEAR3");
		 * yearCell3.setCellStyle(header1CellStyleForSheet2);
		 * 
		 * Row yearRow4 = sheet2.createRow(8); Cell yearCell4 = yearRow4.createCell(1);
		 * yearCell4.setCellValue("YEAR4");
		 * yearCell4.setCellStyle(header1CellStyleForSheet2);
		 */

		// YEAR END

		// INside Sheet End

		CellStyle dateCellStyleForSheet2 = workbook.createCellStyle();
		dateCellStyleForSheet2.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		int rowNum1 = 1;
		for (Employee employee : employees) {
			Row row = sheet2.createRow(rowNum1++);

			row.createCell(0).setCellValue(employee.getName());

			row.createCell(1).setCellValue(employee.getEmail());

			Cell dateOfBirthCell = row.createCell(2);
			dateOfBirthCell.setCellValue(employee.getDateOfBirth());
			dateOfBirthCell.setCellStyle(dateCellStyleForSheet2);

			row.createCell(3).setCellValue(employee.getSalary());
		}

		for (int i = 0; i < columnsForSheet2.length + columns1ForSheet2.length + columnsForSheet2.length; i++) {
			sheet2.autoSizeColumn(i);
		}

		// ********************************** Sheet 2 End **************************

		// ********************************** Sheet 3 Start **************************
		Sheet sheet3 = workbook.createSheet("Unit ForeCast");
		

		Font ce = workbook.createFont();
		ce.setBold(true);
		ce.setFontHeightInPoints((short) 11);
		ce.setColor(IndexedColors.RED.getIndex());
		CellStyle styleCell = workbook.createCellStyle();
		styleCell.setFont(ce);

		((XSSFSheet) sheet3).setTabColor(new XSSFColor(Color.CYAN));

		Row row = sheet3.createRow(3);

		Cell cell = row.createCell(4);
		cell.setCellValue("Q4-18");
		cell.setCellStyle(styleCell);
		sheet3.addMergedRegion(new CellRangeAddress(3, 3, 4, 5));
		HashMap<String, Object> properties = new HashMap<String, Object>();
		// Set border around the cell
		properties.put(CellUtil.BORDER_TOP, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_BOTTOM, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_LEFT, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_RIGHT, BorderStyle.MEDIUM);
		// Set color Red
		properties.put(CellUtil.TOP_BORDER_COLOR, IndexedColors.BLACK.index);
		properties.put(CellUtil.BOTTOM_BORDER_COLOR, IndexedColors.BLACK.index);
		properties.put(CellUtil.LEFT_BORDER_COLOR, IndexedColors.BLACK.index);
		properties.put(CellUtil.RIGHT_BORDER_COLOR, IndexedColors.BLACK.index);
		// Apply the borders to the cell

		CellUtil.setCellStyleProperties(cell, properties);

		CellUtil.setCellStyleProperties(cell, properties);
		// Apply the borders to a 3x3 region starting at D4
		for (int i = 4; i <= 7; i++) {
			row = sheet3.createRow(i);
			for (int j = 4; j <= 7; j++) {
				cell = row.createCell(j);
				CellUtil.setCellStyleProperties(cell, properties);
			}
		}

		sheet3.autoSizeColumn(4, true);
		// ********************************** Sheet 3 End **************************

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("D:\\file_upload\\excelsheetExport\\poi-generated-file.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
	}
}