class Parent{

    int hello = 10;

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

}


class Child1 extends Parent{

    int hello = 500;

    public void hello(){
        System.out.println("Override in Child : Value of hello is "+hello);
    }

}

class Child2 extends Child1{

    public void hello(){
        System.out.println("Override in Child2 : Value of hello is "+hello);
    }

}


public class MultilevelOverriding {
    public static void main(String args[]){
      Child2 obj=new Child2();
      obj.hello();
      obj.hello();
      obj.hello();

      Child1 obj1=new Child1();
      obj1.hello();
      obj1.hello();

      Parent obj2= new Parent();
      obj2.hello();

      // obj1.hello2(); bcs it's a method in the child class
    }
}
