/**
 * Mark Newbury
 * CIS 315
 * JAVA_12.1 - Codebot
 */
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodeBotTest {

    public static void main(String[] args) {
        CodeBot code1 = new CodeBot();
    try{
      code1.compile();
    }
    catch (CompilationException e){
      e.printStackTrace();
    }   catch (FileNotFoundException ex){
            Logger.getLogger(CodeBotTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    CodeBot code2 = new CodeBot("Hello2", 
      "public class { public static void main(String[] args) { System.out.println(\"hello, world\");}}");
    try{
      code2.compile();
    }
    catch (CompilationException e){
      e.printStackTrace();
    }   catch (FileNotFoundException ex){
            Logger.getLogger(CodeBotTest.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
}
