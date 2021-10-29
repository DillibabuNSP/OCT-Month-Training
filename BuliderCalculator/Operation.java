package com.java.BuliderCalculator;

import java.util.Scanner;

class Operation implements Definition
{   public void Add()
{
    Scanner obj = new Scanner(System.in);
    int input,total=0;
    System.out.println("Enter The Range Of Number For Addition : ");
    try{
        input=obj.nextInt();

        int[] range=new int [input];
        for(int i=0;i<input;i++)
        {
            System.out.print("Enter The Number : ");
            range[i]=obj.nextInt();

            total=total+range[i];
        }


        System.out.print("Entered Number Is :");
        for(int i=0;i<input;i++)
        {
            System.out.print(range[i]+" ");
        }
        System.out.println("Sum Of Input Numbers Is : "+total);
    }
    catch(Exception e)
    {
        System.out.println("Please Enter Valid Number !!");
    }

}
    public void Sub()
    {
        Scanner obj = new Scanner(System.in);
        int input,total=0;
        System.out.println("Enter The Range Of Number For Addition : ");
        try{
            input=obj.nextInt();

            int[] range=new int [input];
            for(int i=0;i<input;i++)
            {
                System.out.print("Enter The Number : ");
                range[i]=obj.nextInt();

                total=total-range[i];
            }


            System.out.print("Entered Number Is :");
            for(int i=0;i<input;i++)
            {
                System.out.print(range[i]+" ");
            }
            System.out.println("Sum Of Input Numbers Is : "+total);
        }
        catch(Exception e)
        {
            System.out.println("Please Enter Valid Number !!");
        }

    }
    public void Multi()
    {   int i,Total=1,input;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Range Of Number For Multiplcation : ");
        input=obj.nextInt();
        int[] range=new int [input];
        for(i=0;i<input;i++)
        {   System.out.print("Enter The Number : ");
            range[i]=obj.nextInt();
            Total=Total*range[i];
        }
        System.out.print("Entered Number are :");
        for(i=0;i<input;i++)
        {
            System.out.print(range[i]+" ");
        }
        System.out.println("\nMultiplication Of Input Numbers Is : "+Total);
    }

    public void Divide(){
        int Total,input,input2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Two Number to Divide :");
        System.out.print("Enter The 1st Number : ");
        input=obj.nextInt();
        System.out.print("Enter The 2nd Number : ");
        input2=obj.nextInt();


        Total=input/input2;
        System.out.println("The Division of "+input2+" / "+input+" is : "+Total);
    }

    public void Remained(){
        int Total,input,input2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Two Number to get remainder :");
        System.out.print("Enter The 1st Number : ");
        input=obj.nextInt();
        System.out.print("Enter The 2nd Number : ");
        input2=obj.nextInt();


        Total=input%input2;
        System.out.println("The Division of "+input2+" % "+input+" is : "+Total);
    }


    public void SinValue()
    {    Scanner obj=new Scanner(System.in);
        System.out.print("Find The Value Sine ");
        System.out.println("Enter the Choice :");
        System.out.println("1. Enter the value in Degree.");
        System.out.println("2. Enter the value in Radian.");
        int input =obj.nextInt();
        double output,input2;
        if(input==1)
        {
            System.out.println("Enter The Angle :");
            input2 =obj.nextDouble();
            double degree=Math.toRadians(input2);
            output=Math.sin(degree);
            System.out.println("The Value of Sin("+input2+") is "+output);
        }
        else if(input==2)
        {
            System.out.println("Enter The Angle :");
            input2 =obj.nextInt();
            output=Math.sin(input2);
            System.out.println("The Value of Sin("+input2+") is "+output);
        }
        else
        {
            System.out.println("! Please Enter valid Nubmer !");
        }
    }
    public void CosValue()
    {    Scanner obj=new Scanner(System.in);
        System.out.print("Find The Value Cosine ");
        System.out.println("Enter the Choice :");
        System.out.println("1. Enter the value in Degree.");
        System.out.println("2. Enter the value in Radian.");
        int input =obj.nextInt();
        double output,input2;
        if(input==1)
        {
            System.out.println("Enter The Angle :");
            input2 =obj.nextDouble();
            double degree=Math.toRadians(input2);
            output=Math.cos(degree);
            System.out.println("The Value of Cos("+input2+") is "+output);
        }
        else if(input==2)
        {
            System.out.println("Enter The Angle :");
            input2 =obj.nextInt();
            output=Math.cos(input2);
            System.out.println("The Value of Cos("+input2+") is "+output);
        }
        else
        {
            System.out.println("! Please Enter valid Nubmer !");
        }
    }
    public void TanValue()
    {    Scanner obj=new Scanner(System.in);
        System.out.print("Find The Value Tangent ");
        System.out.println("Enter the Choice :");
        System.out.println("1. Enter the value in degree.");
        System.out.println("2. Enter the value in Radian.");
        double input =obj.nextInt();
        double output,input2;
        if(input==1)
        {  System.out.println("Enter The Angle :");
            input2 =obj.nextDouble();
            double degree=Math.toRadians(input2);
            output=Math.tan(degree);
            System.out.println("The Value of Tan("+input2+") is "+output);
        }
        else if(input==2)
        {  System.out.println("Enter The Angle :");
            input2 =obj.nextInt();
            output=Math.tan(input2);
            System.out.println("The Value of Tan("+input2+") is "+output);
        }
        else
        {
            System.out.println("! Please Enter valid Nubmer !");
        }
    }
    public void LogValue()
    {    double output,input;
        Scanner obj = new Scanner(System.in);
        System.out.println("<---- Find a value oF Log (Base 10) ---->\nEnter The Number : ");
        input =obj.nextDouble();
        output = Math.log10(input);
        System.out.println("The Value of Log10("+input+") is "+output);
    }
    public void Factorial()
    {   System.out.println("Find a Factorial, Enter The Number : ");
        Scanner obj= new Scanner(System.in);
        long  input=obj.nextInt();
        long  factorial=1;
        for(long j=input;j>=1;j--)
        {
            factorial=factorial*j;
        }
        System.out.println("The Factorial OF "+input+" is "+factorial);
    }
    public void Swap()
    {   System.out.println(" Enter The Two Number : ");
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter The Value Of A : ");
        int input=obj.nextInt();
        System.out.print("Enter The Value Of B : ");
        int input2=obj.nextInt();
        input =input+input2;
        input2=input-input2;
        input = input-input2;
        System.out.println("The Value Of A : "+input+"\nThe Value Of B : "+input2);
    }
    public void SquareRoot()
    {     Scanner obj=new Scanner(System.in);
        System.out.print("Enter The Number For SquareRoot Value ");
        double input =obj.nextInt();
        double output = Math.sqrt(input);
        System.out.println("The squareRoot value of "+input+" is "+output);
    }
}
