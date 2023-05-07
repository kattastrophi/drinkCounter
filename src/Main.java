import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String location;
        LocalDate dateOfDrinks = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        File newFile;
        System.out.println("Welcome to the beer counter!");
        Thread.sleep(800);
        System.out.println("Let's create a file to keep track of your habits.");
        Thread.sleep(800);
        System.out.println("Choose a location to save your drinking habits:");
        Thread.sleep(500);
        location = FileSaveLocation.Directory();
        try {
            while(true){
            System.out.println("Please enter a name for the file. (Note this is already a 'txt' file. Do not include file extensions in name.)");
            String answer = scanner.nextLine();
            newFile = new File(location,  answer +".txt");
            if (newFile.createNewFile()) {
                System.out.println("Drinking habits text file created @: " + newFile.getAbsolutePath());
                break;
            } else {
                System.out.println("File already exists.");
            }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

