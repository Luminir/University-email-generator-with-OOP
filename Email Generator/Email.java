import java.util.Scanner;

public class Email extends emailGenerator{
    private String firstName; // Vietnamese: tên (Ví dụ: Sơn)
    private String middleName;
    private String lastName; // VietNamese: họ (Ví dụ: Trần)
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String email;
    private String schoolSuffix = "hanu.edu.vn";
    private String alternativeEmail;

    // input firstname & lastname
    public Email(String lastName,String middleName, String firstName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        // Which department of that person in?
        this.department = setDepartment();

        // Generate random password using default
        this.password = setPassword(defaultPasswordLength);
        System.out.println("The password is: " + this.password);

        // Forming an email
        email = lastName.toLowerCase() + middleName.toLowerCase() + firstName.toLowerCase() + "@" + department + "." + schoolSuffix;
        // System.out.println(email);
    }
    

    // ask for department function
    private String setDepartment(){
        System.out.print("New Student:" + firstName + ". DEPARTMENT CODES:\n1 for Human Resources\n2 for Finance\n3 for Sales & Marketing\n4 for Information Technology\n0 for staff\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int department = sc.nextInt();
        sc.close();
        switch (department) {
            case 1:
                return "HR";
            case 2:
                return "Finance";
            case 3:
                return "S&M";
            case 4:
                return "IT";
            case 0:
                return "Staff";
            default:
                throw new IllegalArgumentException("Wrong input! Please enter a valid department code.");
        }
    }


    private String setPassword(int length){
        String passwordDict = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!#$%^&*";
        char[] password = new char[length];
        for(int i = 0; i < length; i++)
        {
            int value = (int) (Math.random() * passwordDict.length()); // the number of the char in arr
            password[i] = passwordDict.charAt(value); // set password to that char of an arr
        }
        return new String(password);
    }

    // Set the mailbox capacity - global API
    public void setMailBoxCapacity(int capacity) { this.mailBoxCapacity = capacity; }
    public int getMailBoxCapacity() { return mailBoxCapacity; }

    // Set an alternative email
    public void setAlternativeEmail(String alternativeEmail) { this.alternativeEmail = alternativeEmail; }
    public String getAlternativeEmail() { return alternativeEmail; }

    // Change password
    public void changePassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    // Show full info
    public String showFullInfo() {
        return "NAME: " + lastName + " " + middleName + " " + firstName +
               "\nSCHOOL EMAIL:" + email +
               "\nMAILBOX CAPACITY: " + mailBoxCapacity + "MB";
    }
}
