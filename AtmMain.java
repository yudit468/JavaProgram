package Exercise2;

import java.util.Scanner;

public class AtmMain {

    public static void main(String[] args) {
        AtmImplementation op=new AtmImplementation();

        Scanner in=new Scanner(System.in);

        System.out.print("Enter UserId : ");
        String id=in.next();
        System.out.print("Enter Atm pin : ");
        String pin =in.next();

        boolean isLoggedIn = false;

        if(!isLoggedIn){
            if (id.equals("udit12") && pin.equals("****"))
            {
                System.out.println("Welcome to your bank account !!!\n");
                try {
                    while(true)
                    {
                        System.out.println("1.Transfer Money\n2.Withdraw Amount\n3.Deposit Amount\n4.View Transaction\n5.Exit\n");
                        op.viewAccBal();

                        System.out.print("Enter Choice to use Atm : ");
                        int ch=in.nextInt();
                        if(ch==1)
                        {
                            System.out.print("Enter Account Number to Transfer Money : ");
                            long an=in.nextLong();
                            System.out.print("Enter the Amount : ");
                            double transferAmount=in.nextDouble();
                            op.transfer(transferAmount);
                        }
                        else if(ch == 2)
                        {
                            System.out.print("Enter amount to withdraw : ");
                            double withdrawAmount=in.nextDouble();
                            op.withdrawAmt(withdrawAmount);
                        }
                        else if(ch == 3)
                        {
                            System.out.print("Enter Amount to Deposit : ");
                            double depositAmount=in.nextDouble();
                            op.depositAmt(depositAmount);
                        }
                        else if(ch == 4)
                        {
                            System .out.println("Previous Transactions");
                            System.out.println("************************");
                            op.viewTransactions();
                            System.out.println();
                        }
                        else if(ch == 5)
                        {
                            System.out.println("Thank you for using ATM Machine!!");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.print("Please enter valid choice : ");
                        }
                    }
                }catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please enter Correct ID & Pin!!");
            }
        }
    }
}
