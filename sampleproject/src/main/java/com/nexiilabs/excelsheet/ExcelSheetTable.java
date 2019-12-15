package com.nexiilabs.excelsheet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetTable {

	public static void main(String[] args) throws IOException {

		// Create blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		Sheet sheet1 = workbook.createSheet(" Employee Info ");

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put(CellUtil.BORDER_TOP, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_BOTTOM, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_LEFT, BorderStyle.MEDIUM);
		properties.put(CellUtil.BORDER_RIGHT, BorderStyle.MEDIUM);
		// Set color Black
		properties.put(CellUtil.TOP_BORDER_COLOR, IndexedColors.BLACK.getIndex());
		properties.put(CellUtil.BOTTOM_BORDER_COLOR, IndexedColors.BLACK.getIndex());
		properties.put(CellUtil.LEFT_BORDER_COLOR, IndexedColors.BLACK.getIndex());
		properties.put(CellUtil.RIGHT_BORDER_COLOR, IndexedColors.BLACK.index);

		int rowId = 2;
		int rowIdForData = rowId + 1;

		int cellId = 1;
		int cellIdForData = cellId;

		Row row = sheet1.createRow(rowId);
		Row row1 = null;
		for (int j = 1; j <= 5; j++) {
			row1 = null;
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.YELLOW.index);
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style.setAlignment(CellStyle.ALIGN_CENTER);

			sheet1.setColumnWidth(cellId, 3000);
			sheet1.setColumnWidth(cellId + 1, 3000);
			sheet1.addMergedRegion(new CellRangeAddress(rowId, rowId, cellId, cellId + 1));

			Cell cell = row.createCell(cellId);
			cell.setCellValue("Q4-18");
			cell.setCellStyle(style);
			CellUtil.setCellStyleProperties(cell, properties);

			cell = row.createCell(cellId + 1);
			cell.setCellStyle(style);
			CellUtil.setCellStyleProperties(cell, properties);

			cellId += 3;

			if (j == 1) {
				for (int i = 1; i <= 3; i++) {

					row1 = sheet1.createRow(rowIdForData);

					System.err.println("Second Loop :" + rowIdForData);

					CellStyle styleForCell = workbook.createCellStyle();
					styleForCell.setAlignment(CellStyle.ALIGN_CENTER);

					Cell cellForData = row1.createCell(cellIdForData);
					cellForData.setCellValue("SKU1");
					styleForCell.setWrapText(true);
					cellForData.setCellStyle(styleForCell);

					CellUtil.setCellStyleProperties(cellForData, properties);

					Cell cellForData1 = row1.createCell(cellIdForData + 1);
					cellForData1.setCellValue("64");
					styleForCell.setWrapText(true);
					cellForData1.setCellStyle(styleForCell);
					CellUtil.setCellStyleProperties(cellForData1, properties);

					rowIdForData++;
				}
				rowIdForData = rowId + 1;
				cellIdForData += 3;

			} else {

				for (int i = 1; i <= 3; i++) {

					row1 = sheet1.getRow(rowIdForData);

					System.err.println("Second Loop :" + rowIdForData);

					CellStyle styleForCell = workbook.createCellStyle();
					styleForCell.setAlignment(CellStyle.ALIGN_CENTER);

					Cell cellForData = row1.createCell(cellIdForData);
					cellForData.setCellValue("SKU1");
					styleForCell.setWrapText(true);
					cellForData.setCellStyle(styleForCell);

					CellUtil.setCellStyleProperties(cellForData, properties);

					Cell cellForData1 = row1.createCell(cellIdForData + 1);
					cellForData1.setCellValue("64");
					styleForCell.setWrapText(true);
					cellForData1.setCellStyle(styleForCell);
					CellUtil.setCellStyleProperties(cellForData1, properties);

					rowIdForData++;
				}
				rowIdForData = rowId + 1;
				cellIdForData += 3;
			}
		}

		int cellIDForTatal = 1;
		int rowTotal = rowIdForData + 1 + rowId;
		;
		Row rowForTataol = sheet1.createRow(rowTotal);
		for (int j = 1; j <= 5; j++) {

			Font totalheaderFontForSheet5 = workbook.createFont();
			totalheaderFontForSheet5.setBold(true);
			totalheaderFontForSheet5.setFontHeightInPoints((short) 12);
			totalheaderFontForSheet5.setColor(IndexedColors.GREEN.getIndex());

			CellStyle styleForTotal = workbook.createCellStyle();
			styleForTotal.setAlignment(CellStyle.ALIGN_CENTER);
			styleForTotal.setFont(totalheaderFontForSheet5);

			Cell cellForTotalData = rowForTataol.createCell(cellIDForTatal);
			cellForTotalData.setCellValue("TOTAL");
			styleForTotal.setWrapText(true);
			cellForTotalData.setCellStyle(styleForTotal);

			CellUtil.setCellStyleProperties(cellForTotalData, properties);

			Cell cellForTotalData1 = rowForTataol.createCell(cellIDForTatal + 1);
			cellForTotalData1.setCellValue("300");
			styleForTotal.setWrapText(true);
			cellForTotalData1.setCellStyle(styleForTotal);
			CellUtil.setCellStyleProperties(cellForTotalData1, properties);
			cellIDForTatal += 3;

		}

		// spreadsheet.autoSizeColumn(3,true);

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(
				"D:\\file_upload\\excelsheetExport\\poi-generated-Tablefile.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
	}
}
