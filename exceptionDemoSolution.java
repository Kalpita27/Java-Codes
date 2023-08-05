import java.util.*;

class ExceptionDemoSolution
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        System.out.println("Enter first number");
        iNo1 = sobj.nextInt();
        System.out.println("Enter second number");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;
            System.out.println("Division is : "+iAns);
        }
        
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        }

        catch(NullPointerException obj)
        {
            System.out.println("Inside catch 2");
            System.out.println(obj);
        }

        catch(Exception obj)
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        }

        finally
        {
            System.out.println("Inside finally block");
            sobj.close();
        }
    }
}


/* catch block immediately defined next to try block 
  -two types of catch block - specific and generic 
  -for one try we can write single catch or multiple but powerfun catch must write at the end 
  -if try didnt have exception then it direct goes to finally
  -and if try have exception then it goes to catch which is matching catch and if there is no match then it goes to last catch 
  -writing finally block is optional
  -finally block gets executed irrespective of execution 
    i.e execution asel tri run hoto ani nasel tri run hoto
  -generally finally block write to free the resorces 
*/