//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW07 - Page 155 - #4.18)
//Class:                   CO SCI 290
//Date:                    04/20/2018
//Description:        Student major and status
import java.util.Scanner;

public class MajorStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter two characters and displays the major and status represented in the characters");

        System.out.print("Enter two characters: ");
        String code = input.next();

        // Characters for the Major and Status of student
        char major = Character.toUpperCase(code.charAt(0));
        char status = code.charAt(1);

        // Return strings
        String majorName = "";
        String yearName = "";

        // Switch statements to identify major and status
        switch(major) {
            case 'M':
                majorName = "Mathematics";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'I':
                majorName = "Information Technology";
                break;
            default:
                majorName = "Invalid input";
                status = '0';
        }

        switch(status) {
            case '1':
                yearName = "Freshman";
                break;
            case '2':
                yearName = "Sophmore";
                break;
            case '3':
                yearName = "Junior";
                break;
            case '4':
                yearName = "Senior";
                break;
            default:
                yearName = (majorName.equals("Invalid input") ? "" : "Invalid input");
                majorName = "";
        }
        System.out.println(majorName + " " + yearName);
    }
}
