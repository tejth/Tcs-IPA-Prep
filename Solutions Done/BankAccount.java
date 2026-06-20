import java.util.*;

public class BankAccount {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        BankAcccount[] accounts = new BankAcccount[n];

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double balance = sc.nextDouble();

            accounts[i] = new BankAcccount(
                    id,
                    name,
                    balance,
                    new double[0]);
        }

        while (true) {

            String type = sc.next();

            if (type.equalsIgnoreCase("END")) {
                break;
            }

            int id = sc.nextInt();
            double amount = sc.nextDouble();

            for (BankAcccount acc : accounts) {

                if (acc.getId() == id) {

                    if (type.equals("D")) {
                        acc.deposit(amount);
                    } else if (type.equals("W")) {
                        acc.withdraw(amount);
                    }

                    break;
                }
            }
        }
        System.out.println(getHighestBalanceAccount(accounts));

    }

    public static String getHighestBalanceAccount(BankAcccount[] arr) {

        double maxBalance = Double.MIN_VALUE;
        String holderName = "";

        for (BankAcccount acc : arr) {
            if (acc.getBalance() > maxBalance) {
                maxBalance = acc.getBalance();
                holderName = acc.getName();
            }
        }

        return holderName;
    }
}

class BankAcccount {
    private int accountId;
    private String holderName;
    private double balance;
    private double transactions[];

    public BankAcccount(int accId, String name, double balance, double transactions[]) {
        this.accountId = accId;
        this.holderName = name;
        this.balance = balance;
        this.transactions = transactions;
    }

    // setters
    public void setId(int id) {
        this.accountId = id;
    }

    public void setName(String name) {
        this.holderName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransaction(double transactions[]) {
        this.transactions = transactions;
    }

    // getters
    public int getId() {
        return this.accountId;
    }

    public String getName() {
        return this.holderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public double[] getTransaction() {
        return this.transactions;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            double[] temp = new double[transactions.length + 1];

            for (int i = 0; i < transactions.length; i++) {
                temp[i] = transactions[i];
            }

            temp[transactions.length] = amount;
            transactions = temp;
        }

    }

    public void withdraw(double amount) {
        if (amount <= balance) {

            balance -= amount;

            double[] temp = new double[transactions.length + 1];

            for (int i = 0; i < transactions.length; i++) {
                temp[i] = transactions[i];
            }

            temp[transactions.length] = -amount;
            transactions = temp;
        } else {
            System.out.println("Insufficient balance");
        }
    }

}