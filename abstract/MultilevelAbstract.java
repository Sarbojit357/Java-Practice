

abstract class Parent{

    int hello = 10;

    Parent(){
        System.out.println("Abstract Class");
    }

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

    abstract void method1();
    abstract void method2();

}

abstract class Child1 extends Parent{

    // abstract void method2();

    public void method1(){
        System.out.println("Public abstract method 1 ");
    }
}

class Child2 extends Child1{
    
    public void method2(){
        System.out.println("Public abstract method 1 ");
    }
}

public class MultilevelAbstract {
    
    public static void main(String args[]){
        Child2 obj=new Child2();
        obj.method2();
        obj.method1();
        obj.hello();

        // Cannot instantiate the type Parent (abstract)
        // SParent obj1= new Parent();

      }
  }