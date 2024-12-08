import java.util.Scanner;
public class Java_Program {
public static void main(String[] args) {

  
  try {

    System.out.println("Stack Algoritm :");
    System.out.println();
    Stack stack = new Stack();

    Scanner input = new Scanner(System.in);
    System.out.println("Enter The Number Of Elements That You Want :");
    System.out.println("Remember Stack Space Availablity Is Only 5 ");
    int answer1 = input.nextInt();

    if (answer1 > 0) {
    System.out.println("Enter Elements :");
    Object Elements [] = new Object[answer1];
    for (int i = 0; i < Elements.length; i++) {
      Elements[i] = input.next();
      stack.push(Elements[i]);
    } 
  }
   else if (answer1 == 0) {
    System.out.println("Remember You Didn't Enter Any Number Of Elements");
    System.out.println();
  }
  
   else if (answer1 < 0) {
    System.out.println("Cannot Number Of Elements Be Negative Values");
    System.out.println();
   }

    System.out.println("---------------------------------");

    int answer2;
    do {
    
    System.out.println("Choose Any Operation That You Want :");
    System.out.println("1) Printing Stack Elements");
    System.out.println("2) Pushing An Element");
    System.out.println("3) Poping An Element From The Top Of Stack");
    System.out.println("4) Inserting An Element At Specific Index ");
    System.out.println("5) Reversing Stack Elements");
    System.out.println("6) Check Number Of Elements");
    System.out.println("7) Check Stack If Full");
    System.out.println("8) Checking Stack Is Empty Or Not");
    System.out.println("9) Clearing Stack");
    System.out.println("0) To Exit");
    answer2 = input.nextInt();
    System.out.println();

    switch (answer2) {

        case 1:
        System.out.println("Stack Elements :");
        System.out.println(stack.toString());
        System.out.println("----------------------------------------------");
        System.out.println();
          break;
      
        case 2:
          try {
            System.out.println("Enter Element To Push :");
            Object Element = input.next();
            stack.push(Element);
            System.out.println("Element is Pushed Successfully");
            System.out.println("----------------------------------------------");
            System.out.println();
         } catch (Exception e) {
          System.out.println("Error Cannot Push This Element ");
          System.out.println("OverFlow Error Occured");
          System.out.println("----------------------------------------------");
          System.out.println();
         }
          break;

        case 3:
              stack.pop();
            break;

        case 4:
          try {
            System.out.println("Enter Element To Insert :");
            Object answer3 = input.next();
            System.out.println("Enter It's Index In Stack");
            int answer4 = input.nextInt();
            stack.insert(answer4, answer3);
            System.out.println("Element Is Inserted Successfully At Stack With Your Needed Index");
            System.out.println("----------------------------------------------");
            System.out.println();
          
          } catch (Exception e) {
            System.out.println("Error : " + e);
            System.out.println("Invalied Index Or Index Is Not Found At Stack ");
            System.out.println("----------------------------------------------");
            System.out.println();
          }
          break;

        case 5:
            System.out.println("Original Stack Elements :");
            System.out.println(stack.toString());
            System.out.println();
            System.out.println("Reversed Stack Elements :");
            stack.reversed_toString();
            System.out.println(stack.toString());
            System.out.println("----------------------------------------------");
            System.out.println();
          break;

        case 6:
           stack.stackElement();
          break;
        
        case 7:
           stack.isFull();
          break;

        case 8:
           System.out.println("Stack List Empty : " + stack.isEmpty());
           System.out.println("----------------------------------------------");
           System.out.println();
          break;
        
        case 9: 
           stack.clearStack();
          break;
          
      default:
        break;
    }
    
  } while (answer2 != 0);
  input.close();
  }
   catch (Exception e) {
    System.out.println("Invalied Input");
  }
  }
}