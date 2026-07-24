import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int numberOfStudents = scanner.nextInt();

        int subjects = 3;
        double [][] marks = new double[numberOfStudents][subjects];

        while(true){
            System.out.println("\n\n1. Add Student marks");
            System.out.println("2. Update Student marks");
            System.out.println("3. Average of a subject");
            System.out.println("4. Average of a student");
            System.out.println("5. Total marks of students");
            System.out.println("6. View Data");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice : ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Student ID (1 to " + numberOfStudents + "): ");
                    int studentID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= numberOfStudents) {
                        System.out.print("Enter Mathematics marks: ");
                        marks[studentID - 1][0] = scanner.nextDouble();

                        System.out.print("Enter Chemistry marks: ");
                        marks[studentID - 1][1] = scanner.nextDouble();

                        System.out.print("Enter Physics marks :");
                        marks[studentID - 1][2] = scanner.nextDouble();

                    } else {
                        System.out.println("Invalid Student ID.");
                    }
                    break;

                case 2:

                    System.out.print("Enter Student ID: ");
                    studentID = scanner.nextInt();

                    System.out.println("Mathematics - 1");
                    System.out.println("Chemeistry - 2");
                    System.out.println("Physics - 3");

                    System.out.println("Enter Subject IDs");
                    int subjectID = scanner.nextInt();

                    if (studentID >= 1 && studentID <= numberOfStudents && subjectID >= 1 && subjectID <= 3) {

                        System.out.print("Enter new mark: ");
                        marks[studentID - 1][subjectID - 1] = scanner.nextDouble();

                    } else {
                        System.out.print("Invalid inputs");
                    }
                    break;

                case 3:
                    double mathSum = 0;
                    double chemistrySum = 0;
                    double physicsSum = 0;

                    for (int i = 0; i < numberOfStudents; i++) {
                        mathSum += marks[i][0];
                        chemistrySum += marks[i][1];
                        physicsSum += marks[i][2];
                    }

                    System.out.println("Mathematcs Avarage = " + mathSum / numberOfStudents);
                    System.out.println("Chemisty Avarage = " + chemistrySum / numberOfStudents);
                    System.out.println("Physics Avarage = " + physicsSum / numberOfStudents);

                    break;

                case 4:
                    System.out.print("Enter Student ID :");
                    studentID = scanner.nextInt();

                    if(studentID >= 1 && studentID <= numberOfStudents) {
                        double avarage = (marks[studentID - 1][0] + marks[studentID - 1][1] + marks[studentID - 1][2]) / 3;

                        System.out.println("Avarage = " + avarage);
                    } else {
                        System.out.println("Invalid Student ID");
                    } break;

                case 5:
                    System.out.print("Enter student ID");
                    studentID = scanner.nextInt();


                    if(studentID >= 1 && studentID <= numberOfStudents){
                    double total = marks[studentID - 1][0] + marks[studentID - 1][1] + marks[studentID - 1][2];

                    System.out.print("Total Marks = " + total);

                    } else{
                    System.out.println("Invalid Student ID");
                    } break;

                case 6:
                    System.out.println("\n ID \tMathematics\tChemistry\tPhysics");
                            for(int i = 0; i < numberOfStudents; i++) {
                                System.out.println((i + 1) + "\t" + marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2]);
                            }
                    break;

                case 7:
                    scanner.close();
                    return;

                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
