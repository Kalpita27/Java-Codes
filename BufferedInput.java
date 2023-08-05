import java.io.*;
// IO Exception occur 
class BufferedInput
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name : ");
        String name = bobj.readLine();

        System.out.println("Enter your age : ");
        int Age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your marks : ");
        float marks = Float.parseFloat(bobj.readLine());

        System.out.println("Name : "+name);
        System.out.println("Age : "+Age);
        System.out.println("Marks : "+marks);
    }
}