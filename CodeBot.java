/**
 * Mark Newbury
 * CIS 315
 * JAVA_12.1 - Codebot
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class CodeBot {
  private String className = "";
  private String code = "";
  
  public CodeBot(){
    this.className = "Hello";
    this.code = 
    ("public class " + this.className + "\n" + "{" + "\n" + "public static void main(String[] args)" + "\n" + "{" + "\n" + "System.out.println(\"hello,world\");" + "\n" + "}" + "\n" + "}" + "\n");
    saveCode();
  }
  
  public CodeBot(String className, String code){
    this.className = className;
    this.code = code;
    saveCode();
  }
  
  private void saveCode(){
    String rootPath = getClass().getResource("/").getFile().toString();
    File f = new File(rootPath + this.className + ".java");
    if (f.exists()){
      System.out.println(this.className + ".java" + " already exists.");
      System.exit(0);
    }
    else{
      try{
        f.createNewFile();
        PrintWriter pw = new PrintWriter(f);
        pw.print(this.code);
        pw.close();
      }
      catch (IOException e){
        e.printStackTrace();
      }
    }
  }
  
  public void compile() throws CompilationException, FileNotFoundException{
    String filePath = getClass().getResource("/").getFile().toString() + this.className + ".java";
    File f = new File(filePath);
    
    Scanner sc = new Scanner(f);
    StringBuilder sb = new StringBuilder();
    while (sc.hasNext()) {
      sb.append(sc.nextLine() + "\n");
    }
    if (!sb.toString().contains(this.className)){
      throw new CompilationException(this.className);
    }
    System.out.println("The program " + this.className + ".java has compiled successfully.");
  }

   
}
