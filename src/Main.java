import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num = sc.nextInt();
        System.out.println("Введите второе число");
        double num2 = sc.nextInt();

        System.out.println("выберите действие");
        System.out.println("1 - умножение");
        System.out.println("2 - деление");
        System.out.println("3 - сложение");
        System.out.println("4 - вычитание");
        int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("result "+ multiply(num, num2));
                    break;
                case 2:
                    System.out.println("result "+ divide(num, num2));
                    break;
                case 3:
                    System.out.println("result "+sum(num,num2));
                    break;
                case 4:
                    System.out.println("result "+minus(num,num2));
                    break;
                case 5:
                    System.out.println("exiting");
                    return;
                default:
                    System.out.println("error");
            }
        }
    public static double multiply(double num, double num2){
        return num * num2;
    }

    public static double divide(double num, double num2){
        return num / num2;
    }
    public static double sum(double num, double num2){
        return num + num2;
    }
    public static double minus(double num, double num2){
        return num - num2;
    }
}