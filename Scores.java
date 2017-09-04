import java.util.Arrays;
import java.util.Scanner;

public class Scores 
{
    public static void main(String[] args) 
    
    {
    String[] student = new String[10];                 
    double[][] scores = new double[10][5];            //2D array for 5 scores of 10 students
    double[] averages = new double[10];               //1D array for averages
    String[] names = new String[10];                  //1D array for 10 students  
    Scanner s=new Scanner(System.in);
    int i,j,k,m;
    for(i=0,k=1; i<scores.length; i++,k++)
        {
        System.out.println("Enter the name of Student " +k);         //get name of student
        student[i]=s.nextLine();
        names[i]=student[i];
        int sum=0;                                                   //initialize sum of all subjects (divided by 5 later for average)
        for (j=0,m=1; j<scores[i].length; j++,m++)                   //get student's scores in 5 tests
            {
            System.out.println("Enter Student "+k+" marks in quiz "+m);       
            scores[i][j]=s.nextDouble();
            s.nextLine();
            sum+=scores[i][j];
            }
        double average=sum/scores[i].length;                         //find average by dividing sum of all tests by 5
        averages[i]=average;                                         //put each individual average in averages array
        }
    for(i=0; i<averages.length; i++)
        {
        System.out.print(names[i]+"\t has average \t"+averages[i]); //display all student's names and averages together
        System.out.println();
        }
             
    }
}
    