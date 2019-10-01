package utilities;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> readCSV(String fileName) throws FileNotFoundException {
        List<String[]> fileData = new LinkedList<>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((dataRow = br.readLine()) != null) {
                String[] dataRecord = dataRow.split(",");
                fileData.add(dataRecord);
            }
        } catch(FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("could not read file");
            e.printStackTrace();
        }
        return fileData;
    }
}
