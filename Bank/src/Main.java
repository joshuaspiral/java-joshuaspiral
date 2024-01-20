import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("Bank/names.txt"));
        BankAccount[] accounts = new BankAccount[25];
        int i = 0;
        while (f.hasNext()) {
            String name = f.next();
            accounts[i] = new BankAccount(name);
            System.out.println("Creating account for " + name);
            i++;
        }

        Scanner f2 = new Scanner(new File("Bank/bank-transactions.txt"));
        while (f2.hasNext()) {
            String[] parts = f2.nextLine().split(" ");
            String accName = parts[0];
            String instr = parts[1];
            long amount = Long.parseLong(parts[2]);
            for (int j = 0; j < 25; j++) {
                if (accounts[j].getName().equals(accName)) {
                    if (instr.equals("deposit")) {
                        accounts[j].deposit(amount);
                    } else if (instr.equals("withdraw")) {
                        if (!accounts[j].withdraw(amount)) {
                            System.out.println("You are poor");
                        }
                    } else if (instr.equals("transfer")) {
                        for (int k = 0; k < 25; k++) {
                            if (accounts[k].getName().equals(parts[3])) {
                                accounts[j].transfer(amount, accounts[k]);
                            }
                        }
                    }
                }
            }

        }

        for (i = 0; i < 25; i++) {
            System.out.println(accounts[i]);
        }
    }
}

