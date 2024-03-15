class Parent{

    int hello = 10;

    public void hello(){
        System.out.println("Method hello : Value of hello is "+hello);
    }

}


class OverrideChild extends Parent{
    int hello = 100;
    public void hello(){
        super.hello();
        System.out.println("Override : Value of hello is "+hello);
    }

}


public class SingleOverridingSuper {
    public static void main(String args[]){
    OverrideChild obj=new OverrideChild();
    obj.hello();

    }
}
