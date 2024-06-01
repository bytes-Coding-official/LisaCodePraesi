import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");


        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);


        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        for (Integer integer : set) {
            System.out.println(integer);
        }

        String test = "Dies ist ein Test-String";

        System.out.println(test);

        String[] splitted = test.split(" ");

        //Create a stringbuffer
        StringBuffer sb = new StringBuffer();

        for (String s : splitted) {
            sb.append(s);
        }

        String done = sb.toString();
        System.out.println(done);


        //Create a new Date and time in format dd.MM.yyyy hh.mm.ss
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy hh.mm.ss");

        Date dateobj = new Date();

        System.out.println(df.format(dateobj));

        File file = new File("test.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(file.exists());

        //write all lines
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //append alles geklappt to the file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write("Alles geklappt");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}