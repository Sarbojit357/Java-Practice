public class car8 {
    
    car8(){
        System.out.println("Default CC of the car 1000");
    }

    car8(int a){
        System.out.println("Default CC of the car 1000");
    }

   
    public static void main (String args[]){
        car8 bmw = new car8();
        car8 bmwq = new car8(111);
    }
}
