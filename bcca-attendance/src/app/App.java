package app;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello Java");
//     }
// }

import java.util.Scanner;

class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("name: ");
        String name = input.nextLine();

        System.out.print("date: ");
        String date = input.nextLine();

        System.out.print("time: ");
        String time = input.nextLine();

    }
}