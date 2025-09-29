package Sep27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoExcel2 {


    public static void main(String[] args) throws IOException {

        //FileInputStream fs = new FileInputStream("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\TestData\\TestData2.xlsx");

       Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("TestData");
        Row row = sheet.createRow(0);
        Cell cell =  row.createCell(0);
        cell.setCellValue("Mohan");

        //sheet.createRow(0).createCell(0).setCellValue("Mohan");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\TestData\\TestData3.xlsx");
        wb.write(fos);
        fos.close();
        wb.close();









    }


}
