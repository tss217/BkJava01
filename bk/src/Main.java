//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    public  static void client (String name, int age, double balance) {

        String client = """
                =========================================================
                client: %s
                age: %d
                balance: %f
                ==========================================================
                """.formatted(name,age,balance);

        System.out.println(client);

    }

    public static double withDrawMoney(double balance, double amount) {
        double tax = amount * 0.05;      // 5% do saque
        return (balance - amount) - tax;
    }

    public static double deposit(double balance, double amount){
        double tax = amount *0.0156;
        return (balance+amount)-tax;
    }

    public static Double getAmount(){
        System.out.println("Enter the amount: ");
        Scanner amount = new Scanner(System.in);
        return  amount.nextDouble();
    }



    public static void main(String[] args) {

        String name = "Darwin";
        int age = 25;
        double balance = 8500.00;

        client (name,age,balance);

        while (true){
            String options = """
                    1 - widraw money
                    2 - deposit
                    3- exit
                    """;
            System.out.println(options);

            try {
                Scanner choosed = new Scanner(System.in);
                int choice = choosed.nextInt();

                if (choice == 1) {
                    double amount = getAmount();
                    balance = withDrawMoney(balance, amount);
                    client (name,age,balance);

                }

                if (choice == 2) {
                    double amount = getAmount();
                    balance = deposit(balance, amount);
                    client (name,age,balance);
                }

                if (choice == 3) {
                    break;
                }

            }catch (Exception e){
            System.out.println(e.getMessage());
            }
        }

        }

}