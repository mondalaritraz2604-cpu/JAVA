
class Overloading {
    public void login(String username) {
        System.out.println("Username: " + username);
    }

    public void login(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public void login(String username, String password, int otp) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();

        o.login("Aritra");
        o.login("Aritra", "abc123");
        o.login("Aritra", "abc123", 123456);
    }
}
