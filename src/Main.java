import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\beercount.txt");
        Scanner scanner = new Scanner(System.in);
        String date = String.valueOf(java.time.LocalDate.now());
        System.out.println(date);
        System.out.println("How many beers did you drink today?");
        int beerCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println(beerCount);
        if(file.exists()){
            try{
                FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\beercount.txt", true);
                writer.write(date + " " + beerCount + " beers drank." + "\n");
                writer.flush();
                writer.close();
                System.out.println("Added beer drinking entries to the file.");
            }
            catch(IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                Scanner readFile = new Scanner(file);
                while (readFile.hasNextLine()) {
                    String output = readFile.nextLine();
                    System.out.println(output);
                }
                readFile.close();
            }
            catch(FileNotFoundException e){
                System.out.println("File not found.");
                e.printStackTrace();
            }
        }
        else {
          try{
              file.createNewFile();
              System.out.println("Filed created: " + file.getName());
              FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\beercount.txt", true);
              writer.write(date + " " + beerCount + " beers drank." + "\n");
              writer.flush();
              writer.close();
              System.out.println("Added beer drinking entries to the file.");
          }
          catch(IOException ioe){
              System.out.println("An error occurred.");
              ioe.printStackTrace();
            }
        }

    }
}