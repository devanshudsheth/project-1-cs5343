import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFour<T>
{
    List<T> col = new ArrayList<>();               //create new ArrayList
    MyFour(T i1, T i2, T i3, T i4)                 //constructor
    {
        item1=i1;
        item2=i2;
        item3=i3;
        item4=i4;
        col.add(item1);                            //Use add method in collection
        col.add(item2);                            
        col.add(item3);
        col.add(item4);
    }
    
    @Override
    public String toString()                       //Override toString in java.lang.Object
        {
        return "(" + col.get(0) + ", " + col.get(1) + ", "+ col.get(2) +", " + col.get(3) + ")";
        }
    
    public boolean allEqual()                   //boolean method to check if parameters equal
    {
        if(item1.equals(item2))
            {
            if (item2.equals(item3))
                {
                if (item3.equals(item4))
                    {
                    return true;
                    }
                }
            }
        return false;
    }
    
    public void shiftLeft()
        {
        Collections.rotate(col,3);              //use rotate method in collections to rotate col three times
        }
    
    private final T item1;
    private final T item2;
    private final T item3;
    private final T item4;
    
    public static void main(String[] args) 
    {
       
    MyFour<String> str = new MyFour<>("One", "One", "One", "One");    //String example
    System.out.println("String example");
    System.out.println(str.toString());               //print items
    System.out.println("allEqual value for String: "+str.allEqual()); //check if equal and print
   
    System.out.println();
    MyFour<Integer> number = new MyFour<>(1,2,3,4);   //Integer example
    System.out.println("Integer example");
    System.out.println(number.toString());            //print items
    System.out.println("allEqual value for Integer: "+number.allEqual());
    System.out.println("After shift left:");
    number.shiftLeft();                               //shiftleft
    System.out.println(number.toString());            //print shifted items
    }
   
}
