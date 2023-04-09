package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WritelnTheExel {
    public static void main(String[] args) throws IOException {

        // once exeli ac, sheete ulas, yazma islemini ekle (hafizada),
        //yazma modunu acip, hafizadaki islemi kaydet


        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Hafizada Islemeler .... devam


        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Merhaba Evren");

        inputStream.close();// okuma modu kapatilir

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream); //Save islemi yapildi

        workbook.close();//hafiza bosaldi







    }
}
