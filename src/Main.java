import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	public static void main(String[] args) {
		createExcel();
	}
	
	private static void createExcel() {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("MiniCoding Sheet");
		
		Row row = sheet.createRow(0);
		Cell c0 = row.createCell(0);
		Cell c1 = row.createCell(1);
		Cell c2 = row.createCell(2);
		c0.setCellValue("Hey");
		c1.setCellValue("there");
		c2.setCellValue("coders");
		
		row = sheet.createRow(1);
		c0 = row.createCell(0);
		c1 = row.createCell(1);
		c2 = row.createCell(2);
		c0.setCellValue("We");
		c1.setCellValue("are");
		c2.setCellValue("MiniCoding");
		
		try {
			FileOutputStream out = new FileOutputStream("/path/to/your/file/MiniCoding.xlsx");
			workbook.write(out);
			workbook.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
