import com.opencsv.CSVReader;

import java.awt.datatransfer.DataFlavor;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) throws IOException{
        ArrayList<Person> people = new ArrayList<>();
        String csvFilePath = "foreign_names.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFilePath), ';');
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            people.add(new Person(nextLine[0], nextLine[1], nextLine[2],nextLine[3],new Division(nextLine[4]), nextLine[5]));
        }
        for (Person person : people){
            System.out.println(person.toString());
        }
    }
}
