public class Parrot {
    private String s;

    public Parrot() {
        s = "Sqwak!";
    }

    public void teach(String phrase) {
        s = phrase;

    }

    public void speak() {
        System.out.println(s);
    }
}
