public class car2 {
    
    car2(int cc){
        System.out.println("CC of the car "+cc);
    }

    car2(){
        System.out.println("Default CC of the car is 1000");
    }
    
    public static void main (String args[]){
        car2 maruti = new car2(2000);
        car2 hero = new car2();
        System.out.println(maruti);
        System.out.println(hero);
    }
}
