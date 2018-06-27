package Animal;

public class Dog extends Animal {

   int hunger;
  
   Dog d = new Dog();
   
   public static void main(String[] args) {
  	 makeNoise();
   }
	
   public static void makeNoise() {
	
  	 int i;
  	 for(i = 0; i < 10; i++) {
  		 System.out.println(Animal.food);
  	 }
   }
   
   public void eat() {
	 System.out.println(food);
   }
}
