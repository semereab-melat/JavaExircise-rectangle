//add required imports statements
import java.text.DecimalFormat;

/***************************************************************
 Filename: Rectangle1
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment:  calculate the perimeter and area of a rectangle from a given lenght and breadth
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
      DecimalFormat df = new DecimalFormat("00.00");
      double Length =  24.70; // declare and initialise a variable to hold our value
      double Breadth = 25.90;
      double area, Perimeter; // declare a variable

      //calculating area and perimeter of a rectangle
      area = Length * Breadth;
      Perimeter = 2 * Length + (2 * Breadth);

      System.out.println("Rectangle length = " + df.format(Length));
      System.out.println("Rectangle breadth = " + df.format(Breadth));
      System.out.println("Rectangle area = " + df.format(area));
      System.out.println("Rectangle perimeter = " + df.format(Perimeter));
    
  }//main
}//class