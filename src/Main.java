public class Main {
    public static void main (String[] args ){

Employee[] Emp = new Employee[5];
Emp[0] = new Employee("Peter","Griffin","Conveyor worker","pg.mail.com","666",3000,43);
Emp[1] = new Employee("Lois","Griffin","Housewife","lg.mail.com","555",1000,42);
Emp[2] = new Employee("Stewie","Griffin","Antihero","sg.mail.com","444",200,1);
Emp[3] = new Employee("Chris","Griffin","Newsboy","cg.mail.com","333",100,14);
Emp[4] = new Employee("Brian","Griffin","Writer","bg.mail.com","222",0,8);
Emp[0].info();Emp[1].info();Emp[2].info();Emp[3].info();Emp[4].info();

for (int i = 0; i < Emp.length; i++)
   if (Emp[i].age > 40)
       Emp[i].info();

    }
}