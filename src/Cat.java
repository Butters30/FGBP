public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eat(Plate plate)
    {
        if(plate.emptyBowl(appetite) && !satiety)
        {
        plate.reductionFood(appetite);
        satiety = true;
            System.out.println(name +" покушал");
        }
        else if(!plate.emptyBowl(appetite))
        {System.out.println("Недостаточно еды в миске для " + name);}
    }
    public void fullness(){
        if (satiety) {System.out.println(name + " сытый");}
        else {System.out.println(name + " остался голодным");}
    }
}
