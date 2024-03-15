public class car9 {
    car9(){
        System.out.println("Default CC of the car 1000");
    }

    public int milage(){
        return 25;
    }

    public int milage(int s){
        return s;
    }

    public String milage(String c){
        return c;
    }
    public static void main (String args[]){
        car9 bmw = new car9();
        int milage = bmw.milage();
        System.out.println("Milage is "+milage);
        milage = bmw.milage(27);
        System.out.println("Milage is "+milage);
        String milage1 = bmw.milage("30");
        System.out.println("Milage is "+milage1);
      
    }
}
