public class car4 {
 
    car4(){
        System.out.println("Default CC of the car 1000");
    }

    public void milage(){
        System.out.println("Milage is 25km");
    }


    public static void main (String args[]){
        car4 bmw = new car4();
        bmw.milage();
        System.out.println(bmw);
    }
}
