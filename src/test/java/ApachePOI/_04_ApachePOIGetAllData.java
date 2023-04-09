package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {


        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sheet = workbook.getSheetAt(0);


        int rowCount =sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowCount ; i++) {

            Row row = sheet.getRow(i);
            int cellCount =row.getPhysicalNumberOfCells();

            for(int j =0; j<cellCount; j++){

                Cell cell =row.getCell(j);
                System.out.println(cell + "\t");
            }
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // zoo.length

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { // zoo[i].length
                System.out.print(sheet.getRow(i).getCell(j)+"\t"); // zoo[i][j] , get(i).get(j)
            }

            System.out.println();
        }

  }
}
