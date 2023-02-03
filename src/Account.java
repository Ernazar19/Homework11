public class Account {
    double balance;
    String userName;
    double money;
    public void deposit(int summa){
        money+=balance+summa;
        System.out.println("Vash balance : "+money);
    }
    public void  whithDrawal (int j){

        System.out.println("ostavsheesya summa "+(money-j+"\n"));
    }
   }




