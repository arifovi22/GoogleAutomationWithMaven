package google.util;

import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelFile {

	public void readexcelFile() {
		 XSSFRow row;
	       XSSFCell cell;
	       String[][] value = null;
	       double[][] nums = null;

	       try {
	           FileInputStream inputStream = new FileInputStream("TEST.xlsx");
	           XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

	           // get sheet number
	           int sheetCn = workbook.getNumberOfSheets();

	           for (int cn = 0; cn < sheetCn; cn++) {

	               // get 0th sheet data
	               XSSFSheet sheet = workbook.getSheetAt(cn);

	               // get number of rows from sheet
	               int rows = sheet.getPhysicalNumberOfRows();

	               // get number of cell from row
	               int cells = sheet.getRow(cn).getPhysicalNumberOfCells();

	               value = new String[rows][cells];

	               for (int r = 0; r < rows; r++) {
	                   row = sheet.getRow(r); // bring row
	                   if (row != null) {
	                       for (int c = 0; c < cells; c++) {
	                           cell = row.getCell(c);
	                           nums = new double[rows][cells];

	                           if (cell != null) {

	                               switch (cell.getCellType()) {

	                               case FORMULA:
	                                   value[r][c] = cell.getCellFormula();
	                                   break;

	                               case NUMERIC:
	                                   value[r][c] = ""
	                                        + cell.getNumericCellValue();
	                                   break;

	                               case STRING:
	                                   value[r][c] = ""
	                                        + cell.getStringCellValue();
	                                   break;

	                               case BLANK:
	                                  value[r][c] = "[BLANK]";
	                                  break;

	                               case ERROR:
	                                  value[r][c] = ""+cell.getErrorCellValue();
	                                break;
	                            default:
	                            }
	                            System.out.print(value[r][c]);

	                        } else {
	                            System.out.print("[null]\t");
	                        }
	                    } // for(c)
	                    System.out.print("\n");
	                }
	            } // for(r)
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	  }
	

	

	public static void basic() {
		try {
			FileInputStream file = new FileInputStream(new File(
					"C:\\Users\\Arif\\eclipse project" + "\\google.AutomateWithMaven\\Utility\\TestCases.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					// Check the cell type and format accordingly
					switch (cell.getCellType()) {

					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue() + "t");
						break;
					default:
						break;
					}
				}
				System.out.println("");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
