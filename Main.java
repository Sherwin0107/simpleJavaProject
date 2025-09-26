import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static InputStreamReader reader = new InputStreamReader(System.in);
    public static BufferedReader input = new BufferedReader(reader);
    public static void main(String[] args) throws Exception{

        String studentName ;
        double grade1;

        System.out.print("enter student 1: ");
        studentName = input.readLine();
        System.out.print("enter grade: ");
        grade1 = Double.parseDouble(input.readLine());

        String studentName2 ;
        double grade2;

        System.out.print("enter student2: ");
        studentName2 = input.readLine();
        System.out.print("enter grade: ");
        grade2 = Double.parseDouble(input.readLine());

        String studentName3 ;
        double grade3;

        System.out.print("enter student3: ");
        studentName3 = input.readLine();
        System.out.print("enter grade: ");
        grade3 = Double.parseDouble(input.readLine());

        double average = (grade1 + grade2 + grade3)/3;
        double max = Math.max(grade1, Math.max(grade2,grade3));
        double min = Math.min(grade1, Math.min(grade2, grade3));

        System.out.printf("average = %.2f%n",average);
        System.out.println("Highest grade = "+ max);
        System.out.println("Lowest grade = "+ min);
    }

}
