public class car5 {
 
    car5(){
        System.out.println("Default CC of the car 1000");
    }

    public int milage(){
        return 25;
    }

    public static void main (String args[]){
        car5 bmw = new car5();
        int milage = bmw.milage();
        System.out.println("Milage is "+milage);
        System.out.println(bmw);
    }
}
