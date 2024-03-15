interface Parent{ 

    abstract void method1();
    abstract void method2();

}

class Child1 implements Parent{

    public void method2(){
        System.out.println("Public abstract method 2 ");
    }

    public void method1(){
        System.out.println("Public abstract method 1 ");
    }

    public void ownMethod(){
        System.out.println("ownMethod of Child");
    }
}


public class InterfaceSingle {
    
    public static void main(String args[]){
        Child1 obj=new Child1();
        obj.method2();
        obj.method1();
        obj.ownMethod();

        // *********************
        Parent obj1=new Child1();
        obj1.method2();
        obj1.method1();
       // obj1.ownMethod();
      }
  }