import java.util.*;

interface CalMethod{

    public int addition(int a, int b);

    public int subtract(int a, int b);

    public int multiply(int a, int b);

    public int divide(int a, int b);

    void displayMenu();
}

class CalProcess implements CalMethod{

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

    public void displayMenu(){
        System.out.println("1. Addition : ");
        System.out.println("2. Substraction :");
        System.out.println("3. multiplication :");
        System.out.println("4. division :");
        System.out.println("5. Exit....");
    }
}

class Claculator extends CalProcess{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CalProcess in = new CalProcess();    
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
                    System.out.println("The sum is :"+in.addition(a, b));
                    break;
                case 2:
                    System.out.println("Enter number 1 :");
                    int a1 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b1 = sc.nextInt();
                    System.out.println("The subtraction is :"+in.subtract(a1, b1));
                    break;
                case 3:
                    System.out.println("Enter number 1 :");
                    int a2 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b2 = sc.nextInt();
                    System.out.println("The multiplication is :"+in.multiply(a2, b2));
                    break;
                case 4:
                    System.out.println("Enter number 1 :");
                    int a3 = sc.nextInt();
                    System.out.println("Enter number 2 :");
                    int b3 = sc.nextInt();
                    System.out.println("The division is :"+in.divide(a3, b3));
                    break;
                case 5: 
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice");
                    break;
            }   
    
        }
        while(choice != 5);
        sc.close();
    }
}