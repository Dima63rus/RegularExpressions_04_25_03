import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//***
//        Измените программу, написанную в уроке №4: вводимая строка с фамилией,
//        именем и отчеством должна разбиваться с использованием регулярного выражения.
//***
        Scanner loScanner = new Scanner(System.in);
        System.out.println("Please enter your full name in the format: Ivanov Ivan Ivanovich");

        //ФИО
        String loFullFio = loScanner.nextLine();

        String[] ltFio = loFullFio.split(" ");
        for (String lvFio : ltFio) {
            System.out.println(lvFio);
        }
    }
}