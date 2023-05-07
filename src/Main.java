import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\solow\\OneDrive\\Documents\\beercount.txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException ioe){
            System.out.println("An error occurred.");
            ioe.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        String date = String.valueOf(java.time.LocalDate.now());
        System.out.println(date);
        System.out.println("How many beers did you drink today?");
        int beerCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println(beerCount);

        try{
            FileWriter writer = new FileWriter("C:\\Users\\solow\\OneDrive\\Documents\\beercount.txt", true);
            writer.write(date + " " + beerCount + " beers drank." + "\n");
            writer.flush();
            writer.close();
            System.out.println("Added beer drinking entries to the file.");
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}