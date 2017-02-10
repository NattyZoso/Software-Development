/**
 * Mark Newbury
 * CIS 315
 * JAVA_12.1 - Codebot
 */
public class CompilationException extends Exception{
  String className;
  
  public CompilationException() {}
  
  public CompilationException(String className){
    this.className = className;
  }
  
  public String toString(){
    return "Class name " + this.className + " must be found in code.";
  }
}
