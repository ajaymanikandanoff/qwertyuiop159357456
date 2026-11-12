import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NotesFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Create a file for writing
            FileWriter writer = new FileWriter("notes.txt");
            System.out.println("===== NOTE WRITING =====");

            System.out.print("Enter your note: ");
            String note = sc.nextLine();

            // Write note into the file
            writer.write(note);

            
            writer.close();
            System.out.println("Note saved successfully.");

            // Read the file
            FileReader reader = new FileReader("notes.txt");
            int ch;
            System.out.println("\n===== SAVED NOTE =====");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            
            reader.close();

        }
        catch (IOException e) {

            System.out.println("Error while handling the file.");
        }
        finally {
            sc.close();
            System.out.println("\n\nFile operation completed.");
        }
    }
}

