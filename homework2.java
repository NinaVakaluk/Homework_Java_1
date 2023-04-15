//Вывести все простые числа от 1 до 1000



import java.util.Scanner;

public class homework2{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 1000; i++)
        {
            int number = 0;
            int j = 1;

            while(j <= i)
            {
                if(i % j == 0)
                {
                    number++;
                }
                j++;
            }
            if (number == 2)
            {
                System.out.println(i);
            }
        }
    }
}