import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    public static class Main {
        public static void main(String[] args) {
            int totalMots = 0;

            try {
                File fichier = new File("TestExercise3.txt");
                Scanner scanner = new Scanner(fichier);

                while (scanner.hasNextLine()) {
                    String ligne = scanner.nextLine().trim();
                    if (!ligne.isEmpty()) {
                        String[] mots = ligne.split("\\s+");
                        totalMots += mots.length;
                    }
                }

                scanner.close();
                System.out.println("Nombre total de mots dans le fichier : " + totalMots);

            } catch (FileNotFoundException e) {
                System.out.println("Fichier interoperable !");

            }
        }
    }

}
