
import com.mycompany.account.Account;

public class TestAccount {
    public static void main(String[] args) {  
    Account acc=new Account();  
    acc.setAcc_no(123456);
    acc.setName("Muhammet Hasan Bahar");
    acc.setEmail("mhasanbahar0@gmail.com");  
    acc.setAmount(500000f); 
    System.out.println(acc.getAcc_no()+"\n"+
                       acc.getName()+"\n"+
                       acc.getEmail()+"\n"+
                       acc.getAmount());  
}
}
