import java.util.Scanner;

class No{
    public void gradeInfo(int grade){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a grade value and see the letter value: ");
        grade = scanner.nextInt();

        if (grade >= 90){
            System.out.println("The letter grade value of " + grade + " is A+");
        } else if ( grade >= 80){
            System.out.println("The letter grade value of " + grade + " is A");
        } else if (grade >= 70){
            System.out.println("The letter grade value of " + grade + " is B");
        } else {
            System.out.println("The letter grade value of " + grade + " is C");
        }

    }
}