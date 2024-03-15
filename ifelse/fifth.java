public class fifth {
    public static void main(String[] args){
        int a = 10;
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

        
    }
}
