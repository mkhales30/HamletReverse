/**
 * class name: ReadHamlet
 * author: Monauver Rahman
 * course: ITEC 2150
 * date: November 4, 2022
 * version 1.0
 * description: This program will read the text file "hamlet.txt" and then 
 * will create an array list of all the lines from the text file 
 * and lastly will print out line by line in reverse order.
 */
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class ReadHamlet{
    
  public static void main(String[] args) throws FileNotFoundException {
      
    FileReader file = new FileReader("src/hamlet.txt");
    
    Scanner in = new Scanner(file);
    ArrayList<String> ln = new ArrayList<String>();
    while (in.hasNext()) {
      ln.add(in.nextLine());
    }
            
    for (int i = ln.size() - 1; i >= 0; i--) {
      System.out.println(ln.get(i));
    } 
  }
//    public static void main(String[] args) {
//        try {
//            File file = new File("src/hamlet/hamlet.txt");
//
//            try (Scanner scanner = new Scanner(file);) {
//                while (scanner.hasNextLine()) {
//                    String line = scanner.nextLine();
//                    System.out.println(line);
//                }
//            }
//        }catch(FileNotFoundException e){
//            System.out.println("Error. ");
//            e.printStackTrace();
//        }
//    }
}
