package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    String firstName;
    String lastName;
    String password;
    String email;
    String Department;
    int mailBoxCapacity;
    int defaultPasswordLength = 10;
    String alternateMail;
    String companySuffix = "company.com";

    //constructor to receive the first name and last name;
    //ask for the department
    //generate a random password
    // set the mailbox capacity
    //change the password
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.firstName + " " + this.lastName);

        // call a method to ask for the department, then return the department
        this.Department = setDepartment();
        //System.out.println("Department:" + this.Department);

        // call a method to return random password
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your Password: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + Department + "." + companySuffix;



    }

    private String setDepartment() {
        System.out.print("Department Codes :\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEnter the Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales";}
        else if (depChoice == 2){
            return "dev";}
        else if (depChoice == 3){
            return "acct";
        } else {return "";}
    }
    // Generate random password

    private String generateRandomPassword(int length){
        String passwordSet = "ASDFGHJKLZXCVBNMQWERTYUIOP1234567890!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);

    }
    //set Mailbox Capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // set alternative Mail
    public void setAlternateMail(String alternateMail){
        this.alternateMail = alternateMail;
    }
    // change password
    public void changePassword(String password){
        this.password = password;
    }

    public String getAlternateMail() {
        return alternateMail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public String PersonInfo(){
        return "Name: " + firstName + " " + lastName +
                " | Company Email: " + email +
                " | Department: " + Department+
                " | Mailbox Capacity " + mailBoxCapacity + " mb";


    }
}
