//Реализовать простой калькулятор


import java.util.Scanner;

public class homework3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: " );
        int number1=sc.nextInt();
    
    
        System.out.println("Выберите операцию калькулятора (+, -, *, /): ");
        String operation = sc.next();
        

        System.out.println("Введите второе число: " );
        int number2=sc.nextInt();
        sc.close();
        
        switch(operation){
            case "+":
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
                case "-":
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
                default:
                System.err.println("Invalid Operator Specified.");
                break;
}
        }


}

