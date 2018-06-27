package Animal;

public class Lion extends Animal {
     
    String location;
    static String food = "NUM Nom";
    int hunger;
	
    public static void makeNoise() {
       String roam = "GRRRR";
       System.out.println(roam);
    }
    
    public void eat() {
   	   System.out.println(food);
    }
    
    public void ate() {
    	System.out.println(food);
    }
}
