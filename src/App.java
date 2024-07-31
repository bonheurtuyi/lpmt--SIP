import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Life Prognosis Management Tool");
        Scanner mainChoice = new Scanner(System.in);

        System.out.println("1. Patient");
        System.out.println("2. Admin");
        System.out.println("3. Help");
        System.out.println("4. Exit");

        System.out.print("Choose an option:");
        int choice = mainChoice.nextInt();
//        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 1:
                Scanner patientChoice = new Scanner(System.in);
                System.out.println("1. Complete registration");
                System.out.println("2. View profile");
                System.out.println("3. Update profile");

                System.out.print("Choose an option:");
                int pChoice = patientChoice.nextInt();
                System.out.println("Your choice is: " + pChoice);
                break;

            case 2:
                Scanner adminChoice = new Scanner(System.in);
                System.out.println("1. Initiate Registration");
                System.out.println("2. View profile");
                System.out.println("3. Export users list");
                System.out.println("4. Download analytics");

                System.out.print("Choose an option:");
                int aChoice = adminChoice.nextInt();
                System.out.println("Your choice is: " + aChoice);
                break;

            case 3:
                System.out.println("Help information");
                break;

            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please try again");
        }
    }
}
