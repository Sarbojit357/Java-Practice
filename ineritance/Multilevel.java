class Parent{

    int hello = 10;

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

}


class Child1 extends Parent{

    public void hello2(){
        System.out.println("Method hello2 : Value of hello is "+hello);
    }

}

class Child2 extends Child1{

    public void hello3(){
        System.out.println("Method hello3 : Value of hello is "+hello);
    }

}


public class Multilevel {
    public static void main(String args[]){
      Child2 obj=new Child2();
      obj.hello3();
      obj.hello2();
      obj.hello();

      Child1 obj1=new Child1();
      obj1.hello2();
      obj1.hello();

      Parent obj2= new Parent();
      obj2.hello();

      // obj1.hello2(); bcs it's a method in the child class
    }
}
