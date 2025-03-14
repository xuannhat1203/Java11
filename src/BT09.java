abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void displayBalance();

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Tai khoan khong du");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Rut tien thanh cong");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Nap tien thanh cong");
    }

    @Override
    public void displayBalance() {
        System.out.println("So du tai khoan tiet kiem: " + getBalance());
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Rut tien thanh cong");
        if (getBalance() < 0) {
            System.out.println("So du tai khoan dang am: " + getBalance());
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Nap tien thanh cong");
    }

    @Override
    public void displayBalance() {
        if (getBalance() >= 0) {
            System.out.println("So du tai khoan vang lai: " + getBalance());
        } else {
            System.out.println("So du tai khoan dang am: " + getBalance());
        }
    }
}

class Bank {
    private BankAccount[] accounts = new BankAccount[10];

    public void addAccount(BankAccount account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Ngan hang da day, khong the them tai khoan moi.");
    }

    public void displayAccounts() {
        for (BankAccount account : accounts) {
            if (account != null) {
                System.out.println("Tai khoan: " + account.getAccountNumber());
                account.displayBalance();
            }
        }
    }
}

public class BT09 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CheckingAccount checkingAcc = new CheckingAccount("Toyota", 120);
        SavingAccount savingAcc = new SavingAccount("Honda", 100);
        bank.addAccount(checkingAcc);
        bank.addAccount(savingAcc);
        checkingAcc.withdraw(150);
        savingAcc.withdraw(50);
        savingAcc.deposit(30);
        bank.displayAccounts();
    }
}
