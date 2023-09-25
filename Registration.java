package GroupProject2;
/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
 */

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration() {
        this.email = " ";
        this.userName = " ";
        this.password = " ";
    }

    public void setEmail(String email) {
        if (isValidYahooEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid. Use Yahoo email address");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username must have at least 7 characters.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Password must have at least 7 characters and cannot contain the username.");
        }
    }

    private boolean isValidYahooEmail(String email) {
        return email.endsWith("@yahoo.com");
    }

    public void displayRegistration() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("user@yahoo.com");
        user.setUserName("myusername");
        user.setPassword("mypassword");

        user.displayRegistration();
    }
}

