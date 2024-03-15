public class car6 {
 
    car6(){
        System.out.println("Default CC of the car 1000");
    }

    public int milage(){
        return 25;
    }

    public int milage(int s){
        return s;
    }

    public static void main (String args[]){
        car6 bmw = new car6();
        int milage = bmw.milage();
        System.out.println("Milage is "+milage);
        milage = bmw.milage(27);
        System.out.println("Milage is "+milage);
        System.out.println(bmw);
    }
}
