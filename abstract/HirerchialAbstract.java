

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

class Child1 extends Parent{

    public void method2(){
        System.out.println("Public abstract method 2 ");
    }

    public void method1(){
        System.out.println("Public abstract method 1 ");
    }
}

class Child2 extends Parent{

    public void method1(){
        System.out.println("Public abstract method 1 ");
    }
    public void method2(){
        System.out.println("Public abstract method 2 ");
    }
}

public class HirerchialAbstract {
    
    public static void main(String args[]){
        Child2 obj=new Child2();
        obj.method2();
        obj.method1();
        obj.hello();


        Child1 obj1=new Child1();
        obj1.method2();
        obj1.method1();
        obj1.hello();
      }
  }