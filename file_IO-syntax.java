import java.o *

public class examples{
  public static main(String[] args){
      File f = new File("filename.txt");
      f.canRead();
      f.delete();
      f.exists();
      f.getAbsolutePath();
      f.getName();
      f.isDirectory();
      f.isFile();
      f.length();
      f.renameTo("newname.txt");

      throws FileNotFoundException{
        Scanner input = new Scanner(new File("file.txt")); // can have "C:/data/numbers.dat" as a parameter
        int count = 0;
        while (input.hasNext(){
          String word = input.next();
          count++;
        }
        System.out.println("Total words = " + count);
      } 
  }
}
