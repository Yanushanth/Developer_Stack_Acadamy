import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple student management class.
 */
public class sms {
    static String[][] studentList = new String[50][6];

    /**
     * Displays a dashboard message.
     */
    public static void dashboard() {
        Scanner c = new Scanner(System.in);

        System.out.println("*-----------------------------------------------------------*");
        System.out.println("   | Welcome to Developer Stack Student Management System |");
        System.out.println("*-----------------------------------------------------------*");
        System.out.println("1 Save New Student");
        System.out.println("2 Edit Student");
        System.out.println("3 View All Student");
        System.out.println("4 view Student");
        System.out.println("5 Remove Student");
        System.out.println("6 Log Out \n");

        System.out.print("Enter Your Choice: ");
        int choice = c.nextInt();
        System.err.println(choice);

        switch (choice) {
            case 1:
                SaveStudent();
                break;
            case 2:
                // EditStudent();
                break;
            case 3:
                // ViewAllStudent();
                break;
            case 4:
                // ViewStudent();
                break;
            case 5:
                // RemoveStudent();
                break;
            case 6:
                // LogOut();
                break;
            default:
                System.out.println("\033[H\033[2J");
                System.out.println("Invalid Choice, Try Again...!!!");
                dashboard();
        }
    }

    /**
     * Save a new student to the student list.
     */
    public static void SaveStudent() {
        System.out.println("\033[H\033[2J");

        System.out.println("*-----------------------------------------------------------*");
        System.out.println("   | Welcome to Developer Stack Student Management System |");
        System.out.println("*-----------------------------------------------------------*");
        System.out.println("*-----------------------------------------------------------*");
        System.out.println("                      | Save Student |");
        System.out.println("*-----------------------------------------------------------*");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Student NIC:");
        String nic = scanner.nextLine();
        System.out.println("Enter Student Age:");
        String age = scanner.nextLine();
        System.out.println("Enter Student Contact Number:");
        String contactNumber = scanner.nextLine();
        System.out.println("Enter Student Gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Student DOB:");
        String dob = scanner.nextLine();

        System.out.println(name + " " + nic + " " + age + " " + contactNumber + " " + gender + " " + dob);

        int index = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i][0] == null) {
                index = i;
                break;
            }
        }

        studentList[index][0] = name;
        studentList[index][1] = nic;
        studentList[index][2] = age;
        studentList[index][3] = contactNumber;
        studentList[index][4] = gender;
        studentList[index][5] = dob;

        System.out.println("Successfully Done\n" + Arrays.toString(studentList[index]));
        System.out.println("\nDo You Want to save Another Student? Press \"Y\" or Press any other letter to return to the dashboard.");
        String selection = scanner.nextLine();
        if (selection.equalsIgnoreCase("Y")) {
            SaveStudent();
        } else {
            System.out.println("\033[H\033[2J");
            dashboard();
        }
    }

    public static void main(String[] args) {
        dashboard();
    }
}
