import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

  
  
// does the animal have feathers
System.out.println("Does your animal have feathers?");
String feathers = input.nextLine();
 if( feathers.equals("yes") ) {
   // animal has feathers
   System.out.println("Does the animal swim?");
   String swim = input.nextLine();
   if(swim.equals("yes")){
  System.out.println("This is a duck");
   }else if (swim.equals("no")){
     System.out.println("This is a hen");
   }
   
   }else{
    if( feathers.equals("no") ) {
   System.out.println("Does the animal legs?");
   String legs = input.nextLine();
   if(legs.equals("yes")){
   System.out.println("This is a lizard");
   }else if (legs.equals("no")){
    System.out.println("This is a snake");
     

    
   }
  }
}
  }
}
