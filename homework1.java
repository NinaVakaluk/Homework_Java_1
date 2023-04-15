//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int N = sc.nextInt();
        System.out.printf("Треугольное число:%d\n", GetNumber(N));
        sc.close();
        }
    public static int GetNumber(int n){
        return (n*(n+1))/2;

    
    }    
}
