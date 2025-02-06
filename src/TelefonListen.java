import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


import java.util.HashMap;

public class TelefonListen
{
    private HashMap<String, Integer> students = new HashMap<>();

    public TelefonListen(){}

    public TelefonListen(HashMap<String, Integer> students)
    {
        this.students = students;
    }

    public void addStudent()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Indput name: ");
        String name = input.nextLine();

        System.out.println("Input telephone number: ");
        int telephone = input.nextInt();
        input.nextLine();

        students.put(name, telephone);

    }

    public void showAllStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("No students found \n");
            return;
        }

        System.out.println("Students in the class");
        for(String name : students.keySet())
        {
            System.out.println("Student name: " + name + "\n"
                    + "Phone number: " + students.get(name) //Note: vi kalder på students.get(name) fordi name er key og har tilhørende value, som er tlf nummer
                    + "\n"); //spørgsmål, hvorfor kalder vi ikke på telefon? er det fordi vi kun kan kalde på key i HashMap?
        }
    }

    /*@Override
    public String toString()
    {
        if(students.isEmpty())
        {
            return "No students found";
        }

        String result = "Students in the class: \n";
        for(String name : students.keySet())
        {
            result += "Student name: " + name + " \n Phone number: " + students.get(name) + "\n";
        }
        return result;
    }*/

    //man kan også bruge StringBuilder:
    /*
    @Override
    public String toString()
     { if(students.isEmpty())
           return "No students in the class";

           StringBuilder result = new StringBuilder("Students and their phone numbers \n")
           for(String name : students.keySet()
               {result.append(name).append(": ").append(student.get(name).append("\n");
               return result.toString();
     */

    public void searchStudent()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the name of the student that you want to find:");
        String name = input.nextLine();

        if(students.containsKey(name))
        {
            System.out.println("Student name: " + name + ", phone number: " + students.get(name) + "\n");
        }
        else
        {
            System.out.println("Student not found + \n");
        }
    }

    public void deleteStudent()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student that you want to delete:");
        String name = input.nextLine();

        if(students.containsKey(name))
        {
            students.remove(name);
            System.out.println("Student has been deleted");
        }
        else
        {
            System.out.println("Student not found + \n");
        }
    }

    public void checkIfStudentIsOnList()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = input.nextLine();

        if(students.containsKey(name))
        {
            System.out.println("Student is on the list + \n");
        }
        else
        {
            System.out.println("Student is not on the list + \n");
        }
    }

    public void showNamesOnList()
    {

        if(students.isEmpty())
        {
            System.out.println("No students found + \n");
            return;
        }

        System.out.println("List of students, name only:");
        for(String name : students.keySet())
        {
            System.out.println(name);
        }
    }

    public void saveToFile()
    {
        try
        {
            FileWriter writer = new FileWriter("telephonelist.txt");

                    for(String name : students.keySet())
                    {
                        writer.write("Student name: " + name + ", phone number: " + students.get(name) + "\n");
                    }

                    writer.close();

            System.out.println("Added to file");
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }


}
