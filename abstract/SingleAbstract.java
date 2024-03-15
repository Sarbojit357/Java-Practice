

abstract class Parent{

    int hello = 10;

    Parent(){
        System.out.println("Abstract Class");
    }

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

    abstract void method();

}

class Child extends Parent{

    // The type Child must implement the inherited abstract method Parent.method()

    public void method(){
        System.out.println("Public abstract method ");
    }
}

public class SingleAbstract {
    
    public static void main(String args[]){
        Child obj=new Child();
        obj.hello();
        obj.method();

        // Cannot instantiate the type Parent (abstract)
        // SParent obj1= new Parent();

      }
  }