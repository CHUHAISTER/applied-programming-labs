package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students_list st_list = input_data();
        printdata(st_list.getFull_list());

        st_list.createlistdepart("ASU");
        printdata(st_list.getDepartment_list());

        st_list.createlistgroup("CS-202");
        printdata(st_list.getGroup_list());

        st_list.createlistyear(2003);
        printdata(st_list.getBirthday_list());

    }

    public static Students_list input_data()
    {
        int k_start_student;

        Scanner input = new Scanner(System.in);
        System.out.println(
                "enter the number of students:");
        k_start_student = input.nextInt();
        List<Student> start_list = new ArrayList<Student>();
        for (int i = 0; i<k_start_student; i++)
        {
            System.out.print("ID: ");
            int ID = input.nextInt();
            System.out.print("Surname: ");
            input.nextLine();
            String surname = input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Patronymic: ");
            String patronymic = input.nextLine();
            System.out.print("Birthday: ");
            String tempbirthday = input.nextLine();
            String[] sbirthday = tempbirthday.split("/");
            int[] birthday = new int[3];
            for(int j=0; j<3; j++)
            {
                birthday[j] = Integer.parseInt(sbirthday[j]);
            }
            System.out.print("Address: ");
            String address = input.nextLine();
            System.out.print("Phone: ");
            int phone = input.nextInt();
            System.out.print("Department: ");
            input.nextLine();
            String department = input.nextLine();
            System.out.print("Course: ");
            int course = input.nextInt();
            System.out.print("Group: ");
            input.nextLine();
            String group = input.nextLine();
            start_list.add(new Student(ID, surname, name, patronymic, birthday, address, phone, department,
                    course, group));
            System.out.println("\n\n");
        }
        Students_list st_list = new Students_list(start_list);
        return st_list;
    }

    public static void printdata(List<Student> list)
    {
        System.out.println("\n\n");
        for (Student s : list)
        {
            System.out.println(s);
        }
    }
}
