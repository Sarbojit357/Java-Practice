public class car1 {
    
    car1(int cc){
        System.out.println("CC of the car "+cc);
    }

    public static void main (String args[]){
        car1 maruti = new car1(2000);
        car1 hero = new car1(1000);
        System.out.println(maruti);
        System.out.println(hero);
    }
}
