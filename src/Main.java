import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ____________________________________");
        System.out.println("| 1-proverka balanca                 |");
        System.out.println("| 2-summa deposita                   |");
        System.out.println("| 3-snyat s balansa                  |");
        System.out.println("| 4-perehod na drugi akkaunt         |");
        System.out.println(" ------------------------------------");
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account();
        account1.balance = 1000;
        account1.userName = "Tilek uulu Ernazar";
        System.out.println(account1.userName);
        while (true) {

            int s = scanner.nextInt();
            if (s == 1) {
                System.out.println("Na vashem balanse" + account1.balance);
            } else if (s == 2) {
                System.out.print("Summa deposita  ");
                account1.deposit(scanner.nextInt());
            } else if (s == 3) {
                System.out.print("Skolko hptite snayt s balanca  ");
                account1.whithDrawal(scanner.nextInt());
            } else if (s == 4) {
                break;
            }}
            Account account2 = new Account();
            account1.balance = 1000;
            account2.userName = "Nuridinov Kairat";
            System.out.println(account2.userName);
            while (true) {
                int  d= scanner.nextInt();
                if (d == 1) {
                    System.out.println("Na vashem balanse" + account1.balance);
                } else if (d == 2) {
                    System.out.print("Summa deposita  ");
                    account1.deposit(scanner.nextInt());
                } else if (d == 3) {
                    System.out.print("Skolko hptite snayt s balanca  ");
                    account1.whithDrawal(scanner.nextInt());
                } else if (d == 4) {
                    break;
                }}
                Account account3 = new Account();
                account1.balance = 1000;
                account3.userName = "Duisheeva Aizat";
                System.out.println(account3.userName);
                while (true) {

                    int c = scanner.nextInt();
                    if (c == 5) {
                        System.out.println("Na vashem balanse" + account1.balance);
                    } else if (c == 2) {
                        System.out.print("Summa deposita  ");
                        account1.deposit(scanner.nextInt());
                    } else if (c == 3) {
                        System.out.print("Skolko hptite snayt s balanca  ");
                        account1.whithDrawal(scanner.nextInt());
                    } else if (c == 4) {
                        break;

                    }
                }

    }
}


