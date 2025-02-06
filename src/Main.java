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
                    running = false;
                    break;
            }
        }
    }
}