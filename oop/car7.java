public class car7{
 
  
    car7(){
        System.out.println("Default CC of the car 1000");
    }

    public int milage(){
        return 25;
    }

    public int milage(int s){
        return s;
    }
    public int milage(int c , int a){
        return a;
    }
    public static void main (String args[]){
        car7 bmw = new car7();
        int milage = bmw.milage();
        System.out.println("Milage is "+milage);
        milage = bmw.milage(27);
        milage = bmw.milage(27,90);
        System.out.println("Milage is "+milage);
        System.out.println(bmw);
    }

}
