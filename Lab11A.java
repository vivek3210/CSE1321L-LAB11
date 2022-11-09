import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        String rerun = "";

        do {
            System.out.print("Menu\n" +
                    "0) Hello World\n" +
                    "1) Goodbye Moon\n" +
                    "2) Walking on Sunshine\n" +
                    "\nWhat would you like to do: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("\nHello!\n" +
                            "\nType YES to rerun. ");
                    rerun = input.next();
                    System.out.println("\n");
                    if (!rerun.equalsIgnoreCase("yes")){
                        System.out.print("Program Ends");
                        return;
                    }
                    break;
                case 1:
                    System.out.print("\nOk, bye.\n" +
                            "\nType YES to rerun. ");
                    rerun = input.next();
                    System.out.println("\n");
                    if (!rerun.equalsIgnoreCase("yes")){
                        System.out.print("Program Ends");
                        return;
                    }
                    break;
                case 2:
                    System.out.print("\nWHOA!\n" +
                            "\nType YES to rerun. ");
                    rerun = input.next();
                    System.out.println("\n");
                    if (!rerun.equalsIgnoreCase("yes")){
                        System.out.print("Program Ends");
                        return;
                    }
                    break;
                default:
                    System.out.print("\nInvalid Input\n" +
                            "\nType YES to rerun. ");
                    rerun = input.next();
                    if (!rerun.equalsIgnoreCase("yes")){
                        System.out.print("Program Ends");
                        return;
                    }
                    System.out.println("\n");
                    break;
            }
        }while(rerun.equalsIgnoreCase("yes"));

    }
}