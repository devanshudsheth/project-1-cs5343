class Square 
   {
    int side;
    
    Square(int s)                         //constructor with 1 parameter
      {
      side=s;
      }
    Square()                              //constructor with no parameter
      {
      side=1;   
      }
    public int getSide()                  //getSide method for Square
      {
      return side;         
      }
    public int getArea()                  // getArea method for Square
      {
      return side*side; 
      }
    
   }

public class TestSquare
   {
    public static void main(String[] args) 
      {
      Square s1 = new Square();
      Square s2 = new Square(4);
      int area = s1.getArea();                                    //call getArea for constructor without parameter
      System.out.println("Square 1 side: "+s1.getSide()+" and Area: "+area);
      area = s2.getArea();                                        //call getArea for constructor with one parameter
      System.out.println("Square 2 side: "+s2.getSide()+" and Area: "+area);
      }
   }
 