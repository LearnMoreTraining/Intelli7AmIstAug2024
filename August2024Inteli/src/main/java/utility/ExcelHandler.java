package utility;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandler extends BaseCode {

    public static String getExcelData(String sheetName, int row , int column) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/TestDatas.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        return sheet.getRow(row).getCell(column).getStringCellValue();

    }
}
