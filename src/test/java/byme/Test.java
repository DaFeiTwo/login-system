package byme;

public class Test {
    public static void main(String[] args) {
        User user1 = new User(20,"123");
        User user2 = new User(20,"123");
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
    }
}
