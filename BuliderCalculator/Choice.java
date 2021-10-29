package com.java.BuliderCalculator;

import java.util.Scanner;

class Choice extends Operation
{
    public void Disp()
    {
        Scanner obj=new Scanner(System.in);
        loop: while(true)
        {
            System.out.println("\n\nPlease Chose The operation :\n");
            System.out.println("==================================");
            System.out.println(" 1. Addition");
            System.out.println(" 2. Subtraction");
            System.out.println(" 3. Multiplication");
            System.out.println(" 4. Division");
            System.out.println(" 5. Remainder");
            System.out.println(" 6. Value Of Sin");
            System.out.println(" 7. Value Of Cos");
            System.out.println(" 8. Value Of Tan");
            System.out.println(" 9. Value Of Log");
            System.out.println(" 10. Factorial");
            System.out.println(" 11. Swapping");
            System.out.println(" 12.SquareRoot");
            System.out.println(" 13.Exit\n");
            System.out.println("==================================");
            System.out.print("Enter The choice Number : ");

            int input =obj.nextInt();
            switch(input)
            {     case 1:  Add();
                    break ;
                  case 2:  Sub();
                    break;
                  case 3:  Multi();
                    break;
                  case 4:  Divide();
                    break;
                  case 5:  Remained();
                    break;
                  case 6:  SinValue();
                    break;
                  case 7:  CosValue();
                    break;
                  case 8:  TanValue();
                    break;
                  case 9:  LogValue();
                    break;
                  case 10:  Factorial();
                    break;
                  case 11:  Swap();
                    break;
                  case 12: SquareRoot();
                    break;
                  case 13:
                    break loop;
                  default :
                    System.out.println("!Please Enter  Valid Number !");
            }
        }
    }
}


