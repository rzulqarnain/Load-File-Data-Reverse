package AccountPackage;

import java.util.List;
import java.util.Objects;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class Account implements Formatable {

    String Name;
    int AccountID;
    double Balance;

    public Account(String Name, int AccountID, double Balance) {
        this.AccountID = AccountID;
        this.Balance = Balance;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public int getAccountID() {
        return AccountID;
    }

    public double getBalance() {
        return Balance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.AccountID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (this.AccountID != other.AccountID) {
            return false;
        }
        return true;
    }

    @Override
    public String toArchiveFormat() {
        return Name + " , " + AccountID + " , " + Balance;
    }

    @Override
    public String toDisplayFormat() {
        String res = "";
        res += "Name: " + Name + " || " + "ID: " + AccountID + " || " + "Balance: " + Balance + "\n";
        return res;
    }
}
