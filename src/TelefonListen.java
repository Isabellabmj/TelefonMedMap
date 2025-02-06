import java.util.Scanner;

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
            System.out.println("No students found");
        }

        System.out.println("Students in the class");
        for(String name : students.keySet())
        {
            System.out.println("Student name: " + name + "\n"
                    + "Phone number: " + students.get(name) //vi kalder på name fordi den er key og har tilhørende value, som er tlf nummer
                    + "\n");
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
            System.out.println("Student not found");
        }
    }

}
