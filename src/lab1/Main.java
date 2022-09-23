package lab1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num ;

        Lukesnum[] elemets;
        int k;

        if (args.length > 0) {
            k = args.length;
            int i=0;
            num = new int[k];
            for (String val : args)
                num[i] = Integer.parseInt(val);
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println(
                    "enter the number of numbers:");
            k = input.nextInt();
            num = new int[k];
            System.out.println(
                    "Enter ordinal numbers for Luke's numbers:");
            for (int i = 0; i< k; i++)
            {
                num[i] = input.nextInt();
            }
        }
        System.out.println(Arrays.stream(num).max().getAsInt());
        Arr_Luke arr = new Arr_Luke(Arrays.stream(num).max().getAsInt());

        printdata(arr, num);
    }
    public static void printdata(Arr_Luke arr, int num[])
    {
        for (int i = 0; i< num.length; i++)
        {
            System.out.println("Number:" + arr.getelemluke(num[i]).getNum() + "\nDefinition:" +
                    arr.getelemluke(num[i]).getDefin() + "\nSquare:");
            for (int j = 0; j  < arr.getLenght_arr(); j++)
            {
                if (arr.getelemluke(j+1).square_check())
                    System.out.println(arr.getelemluke(j+1).getDefin());
            }
            System.out.println("\n\n");
        }
    }
}