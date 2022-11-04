package lab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Students_list {
    private int lenght_full_list;
    private List<Student> full_list = new ArrayList<Student>();
    private List<Student> department_list = new ArrayList<Student>();
    private List<Student> birthday_list = new ArrayList<Student>();
    private List<Student> group_list = new ArrayList<Student>();


    /**
     * Empty constructor
     */
    public  Students_list (){}

    /**
     * Constructor with parametr
     * @param list
     */
    public Students_list(List<Student> list){this.full_list = list; lenght_full_list = full_list.size();}

    /**
     * add elem
     * @param one
     */
    public void Add(Student one){full_list.add(one); lenght_full_list++;}

    /**
     * remove elem
     * @param one
     */
    public void Remove(Student one){full_list.remove(one); lenght_full_list--;}

    /**
     * get lenght base list
     * @return
     */
    public int getLenght_full_list() {return lenght_full_list;}

    /**
     * getter for list
     * @return
     */
    public List<Student> getFull_list()
    {
        return full_list;
    }

    /**
     * get student for list
     * @param i
     * @return
     */
    public Student getstudentfromlist(int i){return full_list.get(i);}

    /**
     * get dep list
     * @return
     */
    public List<Student> getDepartment_list()
    {
        return department_list;
    }

    /**
     * get stud for dep list
     * @param i
     * @return
     */
    public Student getstudentfromdlist(int i){return department_list.get(i);}

    /**
     * get bithday list
     * @return
     */
    public List<Student> getBirthday_list()
    {
        return birthday_list;
    }

    /**
     * get student for birthday list
     * @param i
     * @return
     */
    public Student getstudentfromblist(int i){return birthday_list.get(i);}

    /**
     * get group list
     * @return
     */
    public List<Student> getGroup_list()
    {
        return group_list;
    }

    /**
     * get student for group list
      * @param i
     * @return
     */
    public Student getstudentfromglist(int i){return group_list.get(i);}


    /**
     * Create list about department
     * @param dep
     * @return
     */
    public List<Student> createlistdepart(String dep)
    {
        department_list.clear();
        for (int i =0; i< lenght_full_list; i++)
        {
            if (Objects.equals(full_list.get(i).getDepartment(), dep))
            {
                department_list.add(full_list.get(i));
            }
        }
        return  department_list;
    }

    /**
     * Create list needed group
     * @param group
     * @return
     */
    public List<Student> createlistgroup(String group)
    {
        group_list.clear();
        for (int i =0; i< lenght_full_list; i++)
        {
            if (Objects.equals(full_list.get(i).getGroup(), group))
            {
                group_list.add(full_list.get(i));
            }
        }
        return  group_list;
    }

    /**
     * Create list for year
     * @param year
     * @return
     */
    public List<Student> createlistyear(int year)
    {
        birthday_list.clear();
        for (int i =0; i< lenght_full_list; i++)
        {
            if (full_list.get(i).getBirthday()[2] >= year)
            {
                birthday_list.add(full_list.get(i));
            }
        }
        return  birthday_list;
    }
}
