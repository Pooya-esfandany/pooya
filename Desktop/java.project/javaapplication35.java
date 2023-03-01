
import java.util.Scanner;

enum noe {
    Savingacc, SalaryAcc, NRI
}

class Account {

    Scanner scan = new Scanner(System.in);
    String name;
    String familyName;
    int ID;
    String city;
    int bankID;
    double money;
    String account;
    noe type;

    void Checkaccountbalance() {
        {

            {

                int mojodi = 2;

                switch (type) {
                    case NRI:
                        mojodi = 2;
                        break;
                    case Savingacc:
                        mojodi = 1;
                        break;
                    case SalaryAcc:
                        mojodi = 2;
                        break;
                }
                if (money > mojodi) {
                    money = money - mojodi;
                    System.out.println(money);
                } else {
                    System.out.println("you are very poor ");
                }

            }
        }
    }

    double withdraw(int x) {
       
        if (x < this.money) {
            if (x > 10000) {
                System.out.println("error out of range");return 0;
            } else {
                this.money = this.money - x;

                System.out.println("done");
                return (money-x);
            }
        } else {
            System.out.println("no enough cash stranger");return -1;
        }
       
    }

    double deposit(double x) {
    

        if (x > 1000) {
            this.money = money * 0.99;
            System.out.println("error money is out of range");
        } else {
            money = money + x;
            System.out.println("mission complete");
        }
        System.out.println("you have " + money + "$");
        return money;

    }

    void profitCalculation(int sood) {
        double darcad = 1.1;

        switch (this.type) {
            case NRI:
                darcad = 1.1;
                break;
            case Savingacc:
                darcad = 1.5;
                break;
            case SalaryAcc:
                darcad = 1.1;
                break;
        }

        System.out.println("your money sood is " + (darcad * this.money * sood / 100));

    }

    void profitCalculation() {
        double darcad = 2;

        switch (this.type) {
            case NRI:
                darcad = 2;
                break;
            case Savingacc:
                darcad = 10;
                break;
            case SalaryAcc:
                darcad = 2;
                break;
        }

        System.out.println("your money sood is " + darcad * this.money / 100);

    }

    void loanRequest() {
        int maxLoan = 500;

        switch (type) {
            case NRI:
                maxLoan = 1000000000;
                break;
            case Savingacc:
                maxLoan = 500;
                break;
            case SalaryAcc:
                maxLoan = 500;
                break;
        }
        int definer;
        System.out.println("please give me your id");
        int userid = scan.nextInt();
        if (userid == (ID)) {
            System.out.println("and how much is the loan you want");
            int loan = scan.nextInt();
            if (loan / 2 <= this.money) {
                definer = 1;
            } else {
                definer = -1;
            }

            if (loan > maxLoan) {
                definer = -1;
            }

            if (definer == -1) {
                System.out.println("you cant get loan");
            } else {
                System.out.println("you can get loan");
            }
        } else {
            System.out.println("your id is wrong");
        }
    }

}

public class javaapplication35 {

    public static void main(String[] args) {
        System.out.println("     hi welcome to our city's bank");
        String a;
        int Definer;
        Account user0 = new Account();
        user0.name = "pooya";
        user0.ID = 401;
        user0.city = "arak";
        user0.familyName = "esf";
        user0.money = 3000;
        user0.account = "Savingacc";
        user0.type = noe.Savingacc;
        Account user2 = new Account();
        user2.name = "hello";
        user2.ID = 312;
        user2.city = "kekecity";
        user2.familyName = "hi";
        user2.money = 10000;
        user2.type = noe.NRI;
        Account user1;
        user1 = new Account();

        Scanner scan = new Scanner(System.in);
        while (1 == 1) {
            while (1 == 1) {
                Definer = 0;
                System.out.println("if you want to want add bank account enter Account");
                System.out.println("if you want to enter to your account print enter");

                a = scan.nextLine();
                if (a.equals("Account")) {
                    Definer = 1;
                }
                if (a.equals("enter")) {
                    Definer = 2;
                }
                if (Definer != 0) {
                    break;
                }
                if (Definer== 2) {

                }
            }
            if (Definer== 1) {
                System.out.println("what is your name");
                String name1 = scan.nextLine();
                user1.name = name1;

                System.out.println("what is your family name");
                String familyName = scan.nextLine();
                System.out.println("which city you live inside");
                String city = "earth";
                if (scan.hasNext()) {

                    city = scan.nextLine();

                }

                System.out.println("what is your ID code");
                int IDcode = scan.nextInt();
                user1.ID = IDcode;
                int currentMoney = 2000;
                System.out.println("how much is your money ");
                if (scan.hasNextInt()) {

                    currentMoney = scan.nextInt();

                }
                user1.money = currentMoney;
                while (1 == 1) {
                    System.out.println("which kind of account you want ");
                    System.out.println("Savingacc ,NRI, SalaryAcc");
                    String type = scan.next();
                    int value = 0;
                    if (type.equals("Savingacc")) {
                        value = 1;
                    }
                    if (type.equals("SalaryAcc")) {
                        value = 1;
                    }
                    if (type.equals("NRI")) {
                        value = 1;
                    }
                    if (value == 1) {
                        user1.name = name1;
                        user1.account = type;
                        user1.money = currentMoney;
                        user1.ID = IDcode;
                        user1.city = city;
                        switch (type) {
                            case "NRI":
                                user1.type = noe.NRI;
                                break;
                            case "Savingacc":
                                user1.type = noe.Savingacc;
                                break;
                            case "SalaryAcc":
                                user1.type = noe.SalaryAcc;
                                break;

                        }
                        user1.familyName = familyName;
                        switch (user1.account) {
                            case "NRI":
                        }
                        break;

                    } else {
                        System.out.println("error");
                        break;
                    }
                }

            }
            if (Definer == 2) {
                while (1 == 1) {
                    System.out.println("if you want to see how much is your money print info");
                    System.out.println("if you want to buy something print perchese");
                    System.out.println("if you get some money print add");
                    System.out.println("if you want to see your profit print profit");
                    System.out.println("if you want to get loan print loan");
                    System.out.println("if you want to exit print exit");

                    String value;
                    value = scan.nextLine();
                    if (value.equals("exit")) {
                        break;
                    }
                    if (value.equals("info")) {
                        System.out.println("what is your name");
                        String unknownuser = scan.nextLine();
                        if (unknownuser.equals(user0.name)) {
                            user0.Checkaccountbalance();
                        }
                        if (unknownuser.equals(user1.name)) {
                            user1.Checkaccountbalance();
                        }
                        if (unknownuser.equals(user2.name)) {
                            user2.Checkaccountbalance();
                        }
                    }
                    if (value.equals("perchese")) {
                        System.out.println("what is your name");
                        String unknownuser = scan.nextLine();
                        System.out.println("how much is the cost of the thing you want to buy");
        int x = scan.nextInt();
                        if (unknownuser.equals(user0.name)) {
                            user0.withdraw(x);
                        }
                        if (unknownuser.equals(user1.name)) {
                            user1.withdraw(x);
                        }
                        if (unknownuser.equals(user2.name)) {
        
                            user2.withdraw(x);
                        }

                    }
                    if (value.equals("add")) {
                        System.out.println("what is your name");
                        String unknownuser = scan.nextLine();
                            System.out.println("how much is the money you want to add");
        double x = scan.nextDouble();
                        if (unknownuser.equals(user0.name)) {
                            user0.deposit(x);
                        }
                        if (unknownuser.equals(user1.name)) {
                            user1.deposit(x);
                        }
                        if (unknownuser.equals(user2.name)) {
                            user2.deposit(x);
                        }

                    }
                    if (value.equals("profit")) {

                        System.out.println("what is your name");
                        String unknownuser = scan.nextLine();
                        if (unknownuser.equals(user0.name)) {
                            System.out.println("do you want to add profit persent? Yes or NO");
                            String bool;
                            bool = scan.nextLine();
                            if (bool.equals("Yes")) {
                                int profitpercent;
                                profitpercent = scan.nextInt();
                                user0.profitCalculation(profitpercent);

                            }
                            if (bool.equals("No")) {
                                user0.profitCalculation();
                            }
                        }
                        if (unknownuser.equals(user1.name)) {
                            System.out.println("do you want to add profit persent? Yes or NO");
                            String bool;
                            bool = scan.nextLine();
                            if (bool.equals("Yes")) {
                                int profitpercent;
                                profitpercent = scan.nextInt();
                                user1.profitCalculation(profitpercent);

                            }
                            if (bool.equals("No")) {
                                user1.profitCalculation();
                            }
                        }
                        if (unknownuser.equals(user2.name)) {
                            System.out.println("do you want to add profit persent? Yes or NO");
                            String bool;
                            bool = scan.nextLine();
                            if (bool.equals("Yes")) {
                                int profitpercent;
                                profitpercent = scan.nextInt();
                                user2.profitCalculation(profitpercent);

                            }
                            if (bool.equals("No")) {
                                user2.profitCalculation();
                            }
                        }

                    }
                    if (value.equals("loan")) {
                        System.out.println("what is your name");
                        String unknownuser = scan.nextLine();
                        if (unknownuser.equals(user0.name)) {
                            user0.loanRequest();
                        }
                        if (unknownuser.equals(user1.name)) {
                            user1.loanRequest();
                        }
                        if (unknownuser.equals(user2.name)) {
                            user2.loanRequest();
                        }
                    }
                }
            }
        }
    }

}

