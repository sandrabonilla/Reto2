package co.com.bancolombia.certificacion.despegar.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelConnector {
	
	//private String[] columns = {"Precio"};
	//private static List<BigDecimal> precios = new ArrayList<>();
	
	public static void createExcelFile(List<String> titulos, List<BigDecimal> values) throws IOException {
		
		/*precios.add(new BigDecimal(520000));
		precios.add(new BigDecimal(125000));
		precios.add(new BigDecimal(785000));
		precios.add(new BigDecimal(4295000));*/
		
		// Creamos el workbook y la hoja
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Precios Tiquetes");
		
		// Definimos la fuente de los títulos
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 16);
		headerFont.setColor(IndexedColors.BLUE_GREY.getIndex());
		
		// Definimos el estilo de los títulos
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		// Ingresamos los títulos
		Row headerRow = sheet.createRow(0);
		
		Cell cell = headerRow.createCell(0);
		cell.setCellValue("Precios");
		cell.setCellStyle(headerCellStyle);
		
		// Ingresamos los valores en la tabla
		int i = 1;
		for (BigDecimal value: values) {
			Row row = sheet.createRow(i++);
			row.createCell(0).setCellValue(value.doubleValue());
		}
		
		// Estilo de fuente y celda para el precio más bajo
		Font bestPriceFont = workbook.createFont();
		bestPriceFont.setBold(true);
		bestPriceFont.setColor(IndexedColors.WHITE.getIndex());
		
		CellStyle bestPriceCellStyle = workbook.createCellStyle();
		bestPriceCellStyle.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		bestPriceCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		bestPriceCellStyle.setFont(bestPriceFont);
		
		// Resaltar el precio más bajo
		Row bestPriceRow = sheet.getRow(1);
		bestPriceRow.getCell(0).setCellStyle(bestPriceCellStyle);
		
		
		
		FileOutputStream fileOut = new FileOutputStream("D:/Dojo ScreenPlay/Reto2Automatizacion/Despegar/data/precios.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
		
		
	
		
		
		
	}
	
	
}
	
