package AccountPackage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import utilities.FileUtils;
import AccountPackage.Account;

/**
 *
 * @author Student
 */
public class Bank implements Formatable {

    String Name;
    String Address;
    int PhoneNo;
    List<Account> account;

    public Bank(String Name, String Address, int PhoneNo, List<Account> account) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
        this.account = account;
    }

    public boolean addAccount(Account acc) {
        boolean b = account.contains(acc);
        if (!b) {
            account.add(acc);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAccount(Account acc) {
        boolean b = account.contains(acc);
        if (b) {
            account.remove(acc);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateAccount(Account acc) {
        
        if (account.contains(acc)) {
            int point = account.indexOf(acc);
            account.set(point, acc);
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public List<Account> getAccount() {
        return account;
    }

    @Override
    public String toArchiveFormat() {
        return Name + " , " + Address + " , " + PhoneNo +"\n" + ArchiveFormat(account);
    }

    @Override
    public String toDisplayFormat() {

        return "Company Name: " + Name + " || " + "Address: " + Address + " || " + "Phone Number: " + PhoneNo +"\n\n" + DisplayFormat(account);

    }
        public String ArchiveFormat(List<Account> items) {
        String res = "";
        for (int i = 0; i < items.size(); i++) {
            Account temp = items.get(i);
            res += temp.toArchiveFormat() +"\n";
        }
        return res;
    }

    public String DisplayFormat(List<Account> items) {
        String res = "";
        for (int i = 0; i < items.size(); i++) {
            Account temp = items.get(i);
            res += temp.toDisplayFormat();
        }
        return res;
    }
}
