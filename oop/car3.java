public class car3 {
    car3(int cc){
        System.out.println("CC of the car "+cc);
    }

    car3(String c){
        System.out.println(" CC of the car  in string "+c);
    }

    car3(){
        System.out.println("Default CC of the car is 1000");
    }

    public static void main (String args[]){
        car3 maruti = new car3(2000);
        car3 hero = new car3("1000");
        car3 bmw = new car3();
        System.out.println(maruti);
        System.out.println(hero);
        System.out.println(bmw);
    }
}
