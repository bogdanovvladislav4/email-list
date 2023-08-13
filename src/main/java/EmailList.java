import java.lang.reflect.Array;
import java.util.*;

public class EmailList {

    TreeSet<String> treeSet = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
        if(email.trim().matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}")){
            treeSet.add(email.toLowerCase());
        } else {
            System.out.println("Error. The entered string does not match the format!");
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        ArrayList<String> emailList = new ArrayList<>();
        if(!treeSet.isEmpty()){
            for(String sortedEmail : treeSet) {
                emailList.add(sortedEmail);
                System.out.println(sortedEmail);
            }
        }
        return emailList;
    }

}
