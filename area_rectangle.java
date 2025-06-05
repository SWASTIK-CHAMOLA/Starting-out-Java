// JAVA code to calculate the area of the rectangle 
public class main{
  public static void main (String[] args){
    double width = 0;
    double height = 0;
    double area = 0;
    Scanner scanner = new scanner(System.in);
    System.out.print("Enter the width");
    width = scanner.nextDouble();
    System.out.print("Enter the height");
    height = scanner.nextDouble();

    area = width * height;
    System.out.print("The area is: "+ area+ "cm2");


    scanner.close()
   }
}
  
