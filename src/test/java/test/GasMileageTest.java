package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import pages.gasMilageCalculator_pages.GasMileageCalculator_page;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class GasMileageTest {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    GasMileageCalculator_page gasMileageCalculator_page = new GasMileageCalculator_page();


    @Test
    public void gasMileageCalculatorTest() throws Exception {
        Driver.getDriver().get(Config.getProperty("gasCalculatorUrl"));
        // loading the file class
        fileInputStream = new FileInputStream("src/test/resources/testData/gasMileageTestData.xlsx");
        //loading the workbook
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("sheet1");
        XSSFRow currentRow = sheet.getRow(1);

        // clear content on web
      //  double current = 123000;
        double current = currentRow.getCell(1).getNumericCellValue();
        gasMileageCalculator_page.currentOdometer.clear();
        gasMileageCalculator_page.currentOdometer.sendKeys(String.valueOf(current));

       // double previous = 122000;
        double previous = currentRow.getCell(2).getNumericCellValue();
        gasMileageCalculator_page.previousOdometer.clear();
        gasMileageCalculator_page.previousOdometer.sendKeys(String.valueOf(previous));

       // double gas = 70;
        double gas = currentRow.getCell(3).getNumericCellValue();
        gasMileageCalculator_page.gasAdded.clear();
        gasMileageCalculator_page.gasAdded.sendKeys(String.valueOf(gas));

        gasMileageCalculator_page.calculateButton.click();

        double expectedResult = (current - previous) / gas;
        System.out.println("Expected result: " + expectedResult);

        // "14.29 mpg"
        String [] actualResult = gasMileageCalculator_page.resultInGas.getText().split(" ");
        System.out.println("Actual result: " + actualResult[0]);

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("Formated version: " + decimalFormat.format(expectedResult));

        if(String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {
            System.out.println("PASS!");
        }
        else {
            System.out.println("FAIL!");
        }

    }
}
