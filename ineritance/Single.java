class Parent{

    int hello = 10;

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

}


class Child extends Parent{

    public void hello2(){
        System.out.println("Method hello2 : Value of hello is "+hello);
    }

}


public class Single {
    public static void main(String args[]){
      Child obj=new Child();
      obj.hello();
      obj.hello2();

      Parent obj1=new Parent();
      obj1.hello();
      // obj1.hello2(); bcs it's a method in the child class
    }
}
