public class Animal {
   protected String name;
   protected String color;
   protected int runDistance;
   protected int swimDistance;
   static int count;

   public Animal(String name, String color, int runDistance, int swimDistance) {
      this.name = name;
      this.color = color;
      this.runDistance = runDistance;
      this.swimDistance = swimDistance;
      count++;
   }
      public void run(int Distance){
      if(Distance <= runDistance)
System.out.println(" пробежал(а) " + Distance + " метров");
         else System.out.println("не смог преодолеть отметку в "+ runDistance + " метров");
   }

   public void swim(int Distance){
      if(Distance <= swimDistance)
System.out.println(" проплыл(а) " + Distance + " метров");
      else System.out.println("не смог преодолеть отметку в "+ swimDistance + " метров");
   }





}





