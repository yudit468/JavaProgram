package Exercise2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class AtmImplementation implements AtmFunctions{

    AtmPojo atm=new AtmPojo();
    Hashtable<Double, String> hash = new Hashtable<>();
    @Override
    public void viewAccBal() {
        System.out.println("Current Bank Balance is : "+atm.getBal());
        System.out.println();
    }

    @Override
    public void withdrawAmt(double withdraw) {

        if (withdraw <= atm.getBal())
        {
            hash.put(withdraw, " Rs Withdrawn");
            System.out.println("Collect the Cash " + withdraw);
            atm.setBal(atm.getBal() - withdraw);
            viewAccBal();

        } else {
            System.out.println("Insufficient Balance !!");
        }
    }

    @Override
    public void depositAmt(double deposit)
    {
        hash.put(deposit," Rs Deposited");
        System.out.println(deposit+" Deposited Successfully !!");
        atm.setBal(atm.getBal()+deposit);
        viewAccBal();
    }

    public void viewTransactions() {
        for(Map.Entry<Double,String> m:hash.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }

    @Override
    public void transfer(double transfer)
    {
        if (transfer <= atm.getBal())
        {
            hash.put(transfer, " Rs Transferred ");
            System.out.println("Amount Transferred successfully");
            atm.setBal(atm.getBal() - transfer);
            viewAccBal();

        } else {
            System.out.println("Insufficient Balance !!");


        }
    }
}
