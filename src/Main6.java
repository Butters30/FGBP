public class Main6 {
    public static void main(String[] args){
Cat myCat = new Cat("Валерий","Рыжий", 200, 0);
Dog myDog = new Dog("Пёс-Барбос", "Черный", 500, 10);
Horse myHorse = new Horse("Зефир", "Белый", 10000, 200);
System.out.println(myCat.color + " " + myCat.name);
        myCat.run(150);
        myCat.swim(1);

System.out.println(myDog.color + " " + myDog.name);
        myDog.run(300);
        myDog.swim(7);

System.out.println(myHorse.color + " " + myHorse.name);
        myHorse.run(3690);
        myHorse.swim(99);

System.out.println("Количество животных в зоопарке = " + Animal.count);
    }
}
