package Sep27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFromExcel {

    public static void main(String[] args) throws IOException {

        // read a file from file system

        //FileInputStream fs = new FileInputStream("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\TestData\\TestData.xlsx");

        //create workbook object

        Workbook workbook = new XSSFWorkbook("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\TestData\\TestData.xlsx");
        Sheet sheet = workbook.getSheet("Login");
        Row row =sheet.getRow(1);
        Cell cell = row.getCell(0);
        String username = cell.getStringCellValue();

        String password =sheet.getRow(1).getCell(1).getStringCellValue();

        System.out.println("username:"+username);
        System.out.println("password:"+password);









    }
}
