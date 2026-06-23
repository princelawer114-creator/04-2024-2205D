import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Gender (M/F): ");
        char gender = input.nextLine().charAt(0);

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Level: ");
        int level = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        // Output student's profilepy

        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Adult Status: " + (age >= 18 ? "YES" : "NO"));

        // GPA Classification
        String classification;
        if (gpa >= 3.5) classification = "First Class";
        else if (gpa >= 3.0) classification = "Second Class Upper";
        else if (gpa >= 2.5) classification = "Second Class Lower";
        else classification = "Pass";

        System.out.println("Academic Class: " + classification);
        System.out.println("==========================");

        input.close();
    }
}
