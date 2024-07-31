import java.util.Scanner;

class InputKeyboard {
  public static void main(String[] args) {
    System.out.print("Enter some num : ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Entered Value : " + sc.next());
    System.out.println("Is Entered Value Integer : " + sc.hasNextInt());
    sc.close();
  }
}