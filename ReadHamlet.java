

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class ReadHamlet{
    
  public static void main(String[] args) throws FileNotFoundException {
      
    FileReader file = new FileReader("src/hamlet.txt");
    
    Scanner in = new Scanner(file);
    ArrayList<String> lines = new ArrayList<String>();
    while (in.hasNext()) {
      lines.add(in.nextLine());
    }
            
    in.close();
            
    for (int i = lines.size() - 1; i >= 0; i--) {
      System.out.println(lines.get(i));
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
