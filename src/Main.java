import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File file = null;
        LocalDate now =  LocalDate.now();
        Scanner newScan = new Scanner(System.in);
        System.out.println("Welcome to beer counter!");
        String filePathLT = "C:\\Users\\solow\\OneDrive\\Desktop";
        Sleep.Wait(1);
        System.out.println("Making text file to track drinking habits.");
        Sleep.Wait(1);
        System.out.println("Please select a location to save your file.");
        Sleep.Wait(1);
        System.out.println("1.Desktop\n2.Laptop");
        int reply = newScan.nextInt();
        newScan.nextLine();
        if(reply == 1){
            try {
                file = new File("C:\\Users\\User\\Desktop\\DrinkingHabits.txt");
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred. File system not found.");
                e.printStackTrace();
            }

        } else if (reply == 2){
            try {
                file = new File("C:\\Users\\solow\\OneDrive\\Desktop\\DrinkingHabits.txt");
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred. File system not found.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File creation cancelled.");
            System.exit(69);
        }
        if(file.exists()){
            System.out.println("Did you drink today?");
            String answer = newScan.nextLine();
            if(answer.equalsIgnoreCase("yes")) {
                System.out.println("How many drinks did you have?");
                int amount = newScan.nextInt();
                if (reply == 1) {
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Users\\User\\Desktop\\DrinkingHabits.txt", true);
                        myWriter.write("On " + now + " you drank " + amount + " beers." + "\n");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Users\\solow\\OneDrive\\Desktop\\DrinkingHabits.txt", true);
                        myWriter.write("On " + now + " you drank " + amount + " beers." + "\n");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


