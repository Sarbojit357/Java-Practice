class Parent{

    Parent(){
        System.out.println("This is a constructor of Parent");
    }

    Parent(int i){
        this();
        System.out.println("This is a constructor of Parent with param "+i);
    }

}


class Child extends Parent{

    Child(){
        super(100);
        System.out.println("This is a constructor of Child");
    }

}


public class ConstructorSuper {
    public static void main(String args[]){
      Child obj=new Child();
    
    }
}
