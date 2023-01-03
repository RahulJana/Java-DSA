class Account{
    public String name;
    protected String email;
    private String password;
    public void displayName(){
        System.out.println(this.name);
    }

    // Accessing private elements using Getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Account acc1 = new Account();
        acc1.name = "Rahul";
//        System.out.println(acc1.name);
        acc1.displayName();
        acc1.email = "i.johndoe@gmail.com";
        acc1.setPassword("johndoe1234");
        System.out.println(acc1.getPassword());
    }
}