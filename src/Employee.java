public class Employee{
    String firstname;
    String lastname;
    String position;
    String email;
    String phone;
    int salary;
    int age;

   Employee(String firstname, String lastname,String position, String email, String  phone, int salary, int age ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void info(){
        System.out.println("Firstname- "+ firstname);
        System.out.println("Lastname- "+ lastname);
        System.out.println("Position- "+ position);
        System.out.println("E-mail- "+ email);
        System.out.println("Phone number- "+ phone);
        System.out.println("Salary- "+ salary);
        System.out.println("Age- "+ age);
        System.out.println(" ");
    }

}

