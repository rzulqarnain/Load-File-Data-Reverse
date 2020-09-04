package AccountPackage;


import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public interface Parser {

    public List<Account> createList(String fileName, boolean duplicatesAllowed);
}
