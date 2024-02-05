public class emailGenerator{
    public static void main(String[] args) throws Exception{
        // NO SPACES are allowed in String
        Email p1 = new Email("Tran", "Nam", "Son");

        // CHANGE MAILBOX CAPACITY: p1.setMailBoxCapacity(new int capacity)

        // CHANGE PASSWORD: p1.changePassword(new String password)

        // CHANGE EMAIL: p1.setAlternativeEmail(new String alternativeEmail)
    
        // SHOW FULL INFO: 
        System.out.println(p1.showFullInfo());
    }
}