package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        File file = new File("src/SampleData.xlsx");
        //  System.out.println(file.exists());

        // Load the file into java memory using fileinputstream
        FileInputStream fileInputStream = new FileInputStream(file);

        // Load the excel workbook into java class
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // workbook > sheet > row > cell

        // getting the sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // How to get Sandler from the excel sheet?
        // index starts from 0
        sheet.getRow(4).getCell(1);

        System.out.println(sheet.getRow(2).getCell(1));

        // useful methods
        // will count only the used cells, (empty not counted)
        // start counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("Used rows: " + usedRows);

        // will count top to bottom to
        // does not care if there are empty or not used cells
        // this starts from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("Last used row: " + lastUsedRow );

        // TODO: 1 - CREATE THE LOGIC THAT PRINTS THE NEENA'S NAME DYNAMICALLY
        for(int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Neena")) {
                System.out.println("Neena's name: " + sheet.getRow(rowNum).getCell(0));
            }
        }

        // TODO: 2 - CREATE THE LOGIC THAT PRINTS OUT ADAM'S LAST NAME DYNAMICALLY
        for(int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Adam")) {
                System.out.println("Adam's last name: " + sheet.getRow(rowNum).getCell(1));
            }
        }

        // TODO: 3 - CREATE THE LOGIC THAT PRINTS OUT STEVEN'S JOB ID DYNAMICALLY
        for(int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Steven") &&
                    sheet.getRow(rowNum).getCell(1).toString().equals("Jobs") ) {
                System.out.println("Steven Jobs id is: " + sheet.getRow(rowNum).getCell(2));
            }
        }

    }
}
