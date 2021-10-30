package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void reductionFood(int appetite){
        if(!emptyBowl(appetite)){System.out.println();}
        else {food = food - appetite;}
    }
    public void info() {
        System.out.println(food + " грамм корма в миске");
    }
    public boolean emptyBowl(int appetite){
        {
            return appetite <= food;
        }
    }
     public void addF() {
        this.food += 250;
        System.out.println("Котикам в миску добавили 250 грамм корма");
    }
}