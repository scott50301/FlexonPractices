package practices;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class javaExercise1 {
    public static void main(String[] args) throws IOException {
        List<String> names = new ArrayList<>();
        File directory = new File("");
        String courseFile = directory.getCanonicalPath() ;
        String path= courseFile +"\\students.xls";

        FileInputStream fis=new FileInputStream(new File(path));
        HSSFWorkbook wb=new HSSFWorkbook(fis);
        HSSFSheet sheet=wb.getSheetAt(0);
        //FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        Cell cell = null;
        for(Row row: sheet) {
            cell = row.getCell(0);
            String cellValue = cell.getStringCellValue().trim();
            if (cellValue != null && cellValue.length() > 0){
                names.add(cellValue);
            }

        }

        Random rand = new Random();
        int upperbound = names.size();
        int randomNum = rand.nextInt(upperbound);
        JOptionPane.showMessageDialog(null, names.get(randomNum), "Random pick system", JOptionPane.INFORMATION_MESSAGE);
    }
}
