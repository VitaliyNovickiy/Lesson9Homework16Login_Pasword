public class User {

    private final String login;
    private final Account account;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

    public void displayAccount() {
        account.displayAccount();
    }

    public class Account {
        private final String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {


            System.out.println("Account Login successful! Login: "
                               + login + ", Password: " + password);
        }
    }
}