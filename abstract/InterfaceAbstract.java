interface Parent{ 

    abstract void method1();
    abstract void method2();

}

interface Parent1{ 

    abstract void method3();
    abstract void method4();

}

abstract class Child1 implements Parent, Parent1{

    public void method2(){
        System.out.println("Public abstract method 2 ");
    }

    public void method3(){
        System.out.println("Public abstract method 3 ");
    }

    public void method4(){
        System.out.println("Public abstract method 4 ");
    }

    public void ownMethod(){
        System.out.println("ownMethod of Child");
    }
}

class Child2 extends Child1{
    public void method1(){
        System.out.println("Public abstract method 2 ");
    }
}


public class InterfaceAbstract {
    
    public static void main(String args[]){
        Child2 obj=new Child2();
        obj.method2();
        obj.method1();
        obj.method3();
        obj.method4();
        obj.ownMethod();

        // *********************
        Parent obj1=new Child2();
        obj1.method1();
        obj1.method2();
        //obj1.method3();
       // obj1.ownMethod();

        // *********************
        Parent1 obj2=new Child2();
        obj2.method3();
        obj2.method4();
      }
  }