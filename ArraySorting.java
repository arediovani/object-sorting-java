
package pkg2d.array.sorting;
import java.util.Scanner;
public class ArraySorting {

   
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         File FL = new File();
         ObjectArray OB= new ObjectArray();
         /*THIS SOFTWARE IS A PROJECT CREATED BY @AREDIO VANI 07/06/2018 AS PART 
         OF THE SYLLABYS OF ALGORITHM AND DATA STRUCTURES WHICH IS HELD BY PROFFESOR MARIN ARANITASI*/
         OB.AddFiles();
         boolean finished = false;
         while (finished==false){
             System.out.println("\nSelect your prefered action"
                     + "\n1.Sort By Name."
                     + "\n2.Sort By Type."
                     + "\n3.Sort By Date Of Creation."
                     + "\n4.Sort By Size."
                     + "\n5.Reverse."
                     + "\n6.Terminate Program");
             int choice=sc.nextInt();
             switch(choice){
                 case 1:
                     OB.SortName();
                     OB.Print();
                     break;
                 case 2:
                     OB.SortType();
                     OB.Print();
                     break;
                 case 3:
                     OB.SortDate();
                     OB.Print();
                     break;
                 case 4:
                     OB.SortSize();
                     OB.Print();
                     break;
                 case 5:
                     OB.Reverse();
                     OB.Print();
                     break;
                 case 6:
                     System.exit(1);
                 default:
                     System.out.println("WRITE A CORRECT CHOICE YOU IMBECILE!!!");
             }
         }


    }
    
}
