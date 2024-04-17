import java.util.Scanner;
public class Q2{

    public static void studentMenu(Scanner sc){
        Student student = null;
        while(true){
            System.out.println("Enter 1 for creation a student");
            System.out.println("Enter 2 for setting name of the student");
            System.out.println("Enter 3 for setting phone number of the student");
            System.out.println("Enter 4 for setting email of the student");
            System.out.println("Enter 5 for setting address of the student");
            System.out.println("Enter 6 for setting roll number of the student");
            System.out.println("Enter 7 for setting course of the student");
            System.out.println("Enter 8 for display the student");
            System.out.println("Enter 9 for exit");
            System.out.println("Enter the options");
            int options = sc.nextInt();sc.nextLine();
            switch (options) {
                case 1:
                    System.out.println("Enter the name of the student");
                    String name = sc.nextLine();
                    System.out.println("Enter the phone number of the student");
                    int phNo = sc.nextInt();sc.nextLine();
                    System.out.println("Enter the email of the student");
                    String email = sc.nextLine();
                    System.out.println("Enter the house number of the student");
                    int houseNumber = sc.nextInt();sc.nextLine();
                    System.out.println("Enter the street of the student");
                    String street = sc.nextLine();
                    System.out.println("Enter the city of the student");
                    String city = sc.nextLine();
                    System.out.println("Enter the state of the student");
                    String state = sc.nextLine();
                    System.out.println("Enter the pin of the student");
                    String pin = sc.nextLine();
                    System.out.println("Enter the roll number of the student");
                    int rollNo = sc.nextInt();sc.nextLine();
                    System.out.println("Enter the course of the student");
                    String course = sc.nextLine();
                    Address address = new Address(houseNumber, street, city, state, pin);
                    student = new Student(name, phNo, email, address, rollNo, course);
                    break;
                case 2:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }
                    
                        System.out.println("Enter the name of the student");
                        name = sc.nextLine();
                        student.setName(name);
                    
                    break;

                case 3:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }

                    System.out.println("Enter the phone number of the student");
                    phNo = sc.nextInt();sc.nextLine();
                    student.setPhNo(phNo);
                    break;
                
                case 4:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }

                    System.out.println("Enter the email of the student");
                    email = sc.nextLine();
                    student.setEmail(email);
                    break;

                case 5:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }

                    student.setAddress(sc);
                
                case 6:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }

                    System.out.println("Enter the roll number of the student");
                    rollNo = sc.nextInt();sc.nextLine();
                    student.setRollNo(rollNo);
                    break;
                
                case 7:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }

                    System.out.println("Enter the course of the student");
                    course = sc.nextLine();
                    student.setCourse(course);
                    break;
                case 8:
                    if(student == null){
                        System.out.println("Student not created");
                        break;
                    }
                    student.display();
                    break;
                case 9:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }

    public static void facultyMenu(Scanner sc){
        while(true){
            System.out.println("Enter 1 for creation a faculty");
            System.out.println("Enter 2 for setting name of the faculty");
            System.out.println("Enter 3 for setting phone number of the faculty");
            System.out.println("Enter 4 for setting email of the faculty");
            System.out.println("Enter 5 for setting address of the faculty");
            System.out.println("Enter 6 for setting Employee id of the faculty");
            System.out.println("Enter 7 for setting department of the faculty");
            System.out.println("Enter 8 for specialization the faculty");
            System.out.println("Enter 9 for display the student");
            System.out.println("Enter 10 for exit");
            System.out.println("Enter the options");
            int options = sc.nextInt();sc.nextLine();
            Faculty faculty = null;
            switch (options) {
                case 1:
                    System.out.println("Enter the name of the faculty");
                    String name = sc.nextLine();
                    System.out.println("Enter the phone number of the faculty");
                    int phNo = sc.nextInt();sc.nextLine();
                    System.out.println("Enter the email of the faculty");
                    String email = sc.nextLine();
                    System.out.println("Enter the house number of the faculty");
                    int houseNumber = sc.nextInt();sc.nextLine();
                    System.out.println("Enter the street of the faculty");
                    String street = sc.nextLine();
                    System.out.println("Enter the city of the faculty");
                    String city = sc.nextLine();
                    System.out.println("Enter the state of the faculty");
                    String state = sc.nextLine();
                    System.out.println("Enter the pin of the faculty");
                    String pin = sc.nextLine();
                    System.out.println("Enter the employee id of the faculty");
                    String employeeId = sc.nextLine();
                    System.out.println("Enter the specialization of the faculty");
                    String specialization = sc.nextLine();
                    System.out.println("Enter the department of the faculty");
                    String department = sc.nextLine();
                    Address address = new Address(houseNumber, street, city, state, pin);
                    faculty = new Faculty(name, phNo, email, address, employeeId, department, specialization);
                    break;
                case 2:
                    if(faculty == null){
                        System.out.println("Student not created");
                        break;
                    }
                    
                        System.out.println("Enter the name of the faculty");
                        name = sc.nextLine();
                        faculty.setName(name);
                    
                    break;

                case 3:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }

                    System.out.println("Enter the phone number of the faculty");
                    phNo = sc.nextInt();sc.nextLine();
                    faculty.setPhNo(phNo);
                    break;
                
                case 4:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }

                    System.out.println("Enter the email of the faculty");
                    email = sc.nextLine();
                    faculty.setEmail(email);
                    break;

                case 5:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }

                    faculty.setAddress(sc);
                
                case 6:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }

                    System.out.println("Enter the employee id of the faculty");
                    employeeId = sc.nextLine();
                    faculty.setEmployeeId(employeeId);
                    break;
                
                case 7:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }

                    System.out.println("Enter the department of the faculty");
                    department = sc.nextLine();
                    faculty.setDepartment(department);
                    break;
                case 8:
                    if(faculty==null){
                        System.out.println("Faculty not created");
                        break;
                    }
                    System.out.println("Enter the specialization of the faculty");
                    specialization = sc.nextLine();
                    faculty.setSpecialization(specialization);
                    break;

                case 9:
                    if(faculty == null){
                        System.out.println("Faculty not created");
                        break;
                    }
                    faculty.display();
                    break;
                case 10:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Student and 2 for Faculty");
        int choice = sc.nextInt();;
        sc.nextLine();
        if(choice == 1){
            Q2.studentMenu(sc);
        }else if(choice == 2){
            Q2.facultyMenu(sc);
            System.out.println("Enter the name of the faculty");
        }else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }
        
        sc.close();
    }
}

class Address{
    private int houseNumber;
    private String street;
    private String city;
    private String state;
    private String pin;

    public Address(int houseNumber, String street, String city, String state, String pin){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String returnAddress(){
        return houseNumber + " " + street + ", " + city + ", " + state + ", " + pin;
    }

    public void sethouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }
    public void setstreet(String street){
        this.street = street;
    }
    public void setcity(String city){
        this.city = city;
    }
    public void setstate(String state){
        this.state = state;
    }
    public void setpin(String pin){
        this.pin = pin;
    }
    public void inputAddress(Scanner sc){
        System.out.println("Enter the house number");
        houseNumber = sc.nextInt();sc.nextLine();
        System.out.println("Enter the street");
        street = sc.nextLine();
        System.out.println("Enter the city");
        city = sc.nextLine();
        System.out.println("Enter the state");
        state = sc.nextLine();
        System.out.println("Enter the pin");
        pin = sc.nextLine();
        this.sethouseNumber(houseNumber);
        this.setstreet(street);
        this.setcity(city);
        this.setstate(state);
        this.setpin(pin);;
    }
}


class Person{
    protected String name;
    protected int phNo;
    protected String email;
    protected Address address;

    public Person(String name, int phNo, String email, Address address){
        this.name = name;
        this.phNo = phNo;
        this.email = email;
        this.address = address;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phNo);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address.returnAddress());
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhNo(int phNo){
        this.phNo = phNo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(Scanner sc){
        this.address.inputAddress(sc);;
    }
}

class Student extends Person{
    private int rollNo;
    private String course;

    public Student(String name, int phNo, String email, Address address, int rollNo, String course){
        super(name, phNo, email, address);
        this.rollNo = rollNo;
        this.course = course;
    }

    public void display(){
        super.display();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setCourse(String course){
        this.course = course;
    }
}

class Faculty extends Person{
    private String employeeId;
    private String department;
    private String specialization;

    public Faculty(String name, int phNo, String email, Address address, String employeeId, String department, String specialization){
        super(name, phNo, email, address);
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
    }

    public void display(){
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}