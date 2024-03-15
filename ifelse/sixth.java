public class sixth {
    
    public static void main(String[] args){
        int a = 100;
        int b = 50;
        int c = 20;

        int greatest = a;
        if (b > greatest){
            greatest = b;
        }

        if (c > greatest){
            greatest = c;
        }

        System.out.println("The greatest number is: " + greatest);

        int smallest = a;
        if (b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;

    System.out.println("The smallest number is: " + smallest);

     int middle;

    if ((a >= b && a <= c) || (a <= b && a >= c))
        middle = a;
    else if ((b >= a && b <= c) || (b <= a && b >= c))
        middle = b;
    else
        middle = c;

    
    System.out.println("The middle number is: " + middle);


}
}