package AccountPackage;


import java.util.ArrayList;
import java.util.List;
import utilities.FileUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class AccountParser implements Parser {

    @Override
    public List<Account> createList(String fileName, boolean duplicatesAllowed) {
        String[] data = FileUtils.readIntoArray("BankAccounts.csv");
        ArrayList<Account> acc = new ArrayList();
        
        for(int i = 0; i < data.length ; i++){
            String temp = data[i];
            String[] pieces = temp.split(",");
            String name = pieces[0];
            int id = Integer.parseInt(pieces[1]);
            double Balance = Integer.parseInt(pieces[2]);
            Account r = new Account(name,id,Balance);
            boolean b = acc.contains(r);
            
            if(duplicatesAllowed == true){
                acc.add(r);
            }
            else{
                if(b == false){
                    acc.add(r);
                }
            }
        }
        return acc;
    }
}
