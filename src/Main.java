import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TelefonListen telefonlisten = new TelefonListen();

        boolean running = true;

        while(running)
        {
            System.out.println("Welcome, please enter the number corresponding to what you want to do:");
            System.out.println("1: Add a student");
            System.out.println("2: Show all students");
            System.out.println("3: Search for a student:");
            System.out.println("4: Delete student");
            System.out.println("5: Check if student is on the list");
            System.out.println("6: List of student names");
            System.out.println("7: Add students to file");
            System.out.println("8: Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    telefonlisten.addStudent();
                    break;

                case 2:
                    telefonlisten.showAllStudents();
                    break;

                case 3:
                    telefonlisten.searchStudent();
                    break;

                case 4:
                    telefonlisten.deleteStudent();
                    break;

                case 5:
                    telefonlisten.checkIfStudentIsOnList();
                    break;

                case 6:
                    telefonlisten.showNamesOnList();
                    break;

                case 7:
                    telefonlisten.saveToFile();
                    break;

                case 8:
                    running = false;
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
}