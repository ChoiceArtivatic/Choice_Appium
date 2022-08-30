package Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Artivatic
 *This class contains some methods to Read and Write in Excel file
 */
public class ExcelUtility 
{
	/**
	 * This method is used to read data from Excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
    public String getDatafromExcel(String sheet,int row,int cell) throws Throwable
    {
    	  FileInputStream fis=new FileInputStream(IConstants.EXCEL_PATH);
          Workbook book = WorkbookFactory.create(fis);
          Sheet sh = book.getSheet(sheet);
          Row r = sh.getRow(row);
          String data = r.getCell(cell).getStringCellValue();
          book.close();
         return data;
    }
    
    /**
     * This method is used to set data in excel file
     * @param sheet
     * @param row
     * @param cell
     * @param data
     * @throws Throwable 
     */
    public void setData(String sheet,int row,int cell,String data) throws Throwable
    {
    	FileInputStream fis=new FileInputStream("");
        Workbook book = WorkbookFactory.create(fis);
        Sheet sh = book.getSheet(sheet);
        Row r = sh.getRow(row);
        r.getCell(cell).setCellValue(data);
        FileOutputStream fout=new FileOutputStream("");
        book.write(fout);
        book.close();

    }
}
