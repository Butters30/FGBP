public class Main {
    public static void main(String[] args){
        Cat myCat1 = new Cat("Рыжик(а)",40);
        Cat myCat2 = new Cat("Батон(а)",50);
        Cat myCat3 = new Cat("Пухляш(а)",100);

        Plate myPlate = new Plate(140);
        myPlate.info();
        myCat1.eat(myPlate);myCat2.eat(myPlate);myCat3.eat(myPlate);myPlate.info();
        myCat1.fullness();myCat2.fullness();myCat3.fullness();
        myPlate.addF();myPlate.info();
        myCat2.eat(myPlate);myCat2.fullness();
        myCat3.eat(myPlate);myCat3.fullness();myPlate.info();
    }
}

