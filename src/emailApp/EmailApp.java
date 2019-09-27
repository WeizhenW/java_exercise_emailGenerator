package emailApp;

public class EmailApp {

    public static void main(String[] args) {
        System.out.println("inside email app!");

        //instantiate new object
        Email email = new Email("big", "bear", "zoo");

        //prints
        System.out.println("email address is: " + email.getEmail());
        System.out.println("password is: " + email.getPassword());
    }

}
