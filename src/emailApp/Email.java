package emailApp;

public class Email {
    //declare class level variables
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int passwordLength = 10;

    //create constructor
    public Email(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        //set email
        this.email = generateEmail();
        //set password
        this.password = generatePassword(this.passwordLength);
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //method to generate email
    public String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".com";
    }
    //method to generate random password
    public String generatePassword(int passwordLength) {
        String passwordString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] initialPassword = new char[passwordLength];
        for(int i = 0; i < passwordLength; i ++) {
//            System.out.println("inside generate password");

            //convert double to int
            initialPassword[i] = passwordString.charAt((int)(Math.random()*passwordString.length()));
//            System.out.println(initialPassword[i]);
        }
        //convert char[] to String
        return String.valueOf(initialPassword);
    }

    //method to update password
    public void updatePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("new password is: " + this.password);
    }



    @Override
    public String toString() {
        return "first name: " + firstName
                + "\nlast name: " + lastName
                + "\ndepartment: " + department
                + "\nemail: " + email
                + "\npassword: " + password;
    }

}
