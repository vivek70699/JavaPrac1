package SampleApp;

public class addition {
    public static void main(String[] args) {
        System.out.println("Enter numbers to add");
        add(4,5);
        int result = add (10,20);
        System.out.println("The new result is: " +result);
    }
        public static int add(int a, int b){
            //Scanner sc = new Scanner(System.in);
            //int a = sc.nextInt();
            //int b = sc.nextInt();
            int res = a+ b;
            System.out.println("addition is: " + res);
            return res;
        }
    }

