package lab2;

/**
 * Class Student with fields: ID, surname, name, bitrhdau, etc.
 */
public class Student {
    private int ID = 0;
    private String surname = "NoName";
    private String name = "NoName";
    private String patronymic = "NoName";
    private int[] birthday = new int[3];
    private String address = "NoName";
    private int phone = 0;
    private String department = "NoName";
    private int course = 0;
    private String group = "NoName";

    /**
     * Constructor
     * @param ID
     * @param surname
     * @param name
     * @param patronymic
     * @param birthday
     * @param adress
     * @param phone
     * @param department
     * @param course
     * @param group
     */
    public Student(int ID, String surname, String name, String patronymic, int[] birthday, String adress, int phone,
                   String department, int course, String  group)
    {
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = adress;
        this.phone = phone;
        this.department = department;
        this.course = course;
        this.group = group;
     }

    /**
     * Getter ID
     * @return
     */
    public int getID() {return ID;}
    /**
     * Getter phone
     * @return
     */
    public int getPhone() {return phone;}
    /**
     * Getter course
     * @return
     */
    public int getCourse(){ return course;}
    /**
     * Getter surname
     * @return
     */
    public String getSurname(){ return surname;}

    /**
     * getter name
     * @return
     */
    public String getName(){return name;}
    /**
     * Getter patr
     * @return
     */
    public String getPatronymic(){return patronymic;}
    /**
     * Getter birthday
     * @return
     */
    public int[] getBirthday(){return birthday;}
    /**
     * Getter address
     * @return
     */
    public String getAddress(){return address;}
    /**
     * Getter department
     * @return
     */
    public String getDepartment(){return department;}
    /**
     * Getter group
     * @return
     */
    public String getGroup(){return group;}

    public void setID(int ID) {this.ID = ID;}
    public void setPhone(int phone) { this.phone = phone;}
    public void setCourse(int course) {this.course = course; }
    public void setSurname(String surname) {this.surname = surname;}
    public void setName(String name){this.name = name;}
    public void setPatronymic(String patronymic){this.patronymic = patronymic;}
    public void setBirthday(int[] birthday){this.birthday =  birthday;}
    public void setAddress(String address){this.address = address;}
    public void setDepartment(String department){this.department =  department;}
    public void setGroup(String group){this.group = group;}


    public String toString()
    {
        String result = "";
        result += "ID: " + ID +"\n";
        result += "SNP: " + surname + " " + name + " " + patronymic + "\n";
        result += "Birthday: " + birthday[0]+"."+birthday[1] + "."+ birthday[2] + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Department: " + department + "\n";
        result += "Course:" + course + "\n" + "Group: " + group + "\n";
        return result;
    }
}
