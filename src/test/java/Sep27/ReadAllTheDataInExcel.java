package Sep27;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAllTheDataInExcel {

    public static void main(String[] args) throws IOException {

        // read a file from file system

        FileInputStream fs = new FileInputStream("C:\\Users\\Mohan Dev\\OneDrive\\Desktop\\TestData\\TestData.xlsx");

        Workbook wb = WorkbookFactory.create(fs);
        Sheet sheet = wb.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for(int i=0; i <rowCount ; i++){
            for( int j=0 ; j < sheet.getRow(i).getLastCellNum();j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
            }
            System.out.println();


        }


        fs.close();
        wb.close();






    }
}
