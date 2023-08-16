import java.util.*;

interface Test{

    public int addition(int a, int b);

    public int subtract(int a, int b);

    public int multiply(int a, int b);

    public int divide(int a, int b);

    public int min(int a, int b);

    public int crossSum(int a);

    void displayMenu();
}

class Process implements Test{

    public int addition(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int min(int a, int b){
        return a < b? a : b;
    }

    public int crossSum(int a){
        return a * (a + 1) / 2;
    }

    public void displayMenu(){
        System.out.println("1. Addition : ");
        System.out.println("2. Substraction :");
        System.out.println("3. multiplication :");
        System.out.println("4. division :");
        System.out.println("5. minimum :");
        System.out.println("6. cross sum :");
        System.out.println("7. Exit....");
    }
}

class Claculator extends Process{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Process in = new Process();    
        int choice;
            do{
            in.displayMenu();
            
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter number 1 :");
                    int a = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b = sc.nextInt();
                    System.out.println(in.addition(a, b));
                    break;
                case 2:
                    System.out.println("Enter number 1 :");
                    int a1 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b1 = sc.nextInt();
                    System.out.println(in.subtract(a1, b1));
                    break;
                case 3:
                    System.out.println("Enter number 1 :");
                    int a2 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b2 = sc.nextInt();
                    System.out.println(in.multiply(a2, b2));
                    break;
                case 4:
                    System.out.println("Enter number 1 :");
                    int a3 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b3 = sc.nextInt();
                    System.out.println(in.divide(a3, b3));
                    break;
                case 5:              
                    System.out.println("Enter number 1 :");
                    int a4 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b4 = sc.nextInt();                    
                    System.out.println(in.min(a4, b4));
                    break;
                case 6:
                    System.out.println("Enter number 1 :");
                    int a5 = sc.nextInt();
                    System.out.println(in.crossSum(a5));
                    break;
                case 7: 
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice");
                    break;
            }   
    
        }
        while(choice != 7);
        sc.close();
    }
}