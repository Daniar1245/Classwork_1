public class Main {
    public static void main(String[] args) {
        String[] commands = {"jump", "run"};
        Shelter shelter = new Shelter("Lion", "Vostoc 5");
        Dog dog = new Dog("Bulik", "Alabay", commands, Color.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("AF AF");

        Shelter shelter1 = new Shelter("Romashka", "Chui");
        Dog dog1 = new Dog("Rex", "Avcharka", Color.GRAY, shelter1);
        System.out.println(dog1.getInfo());
        dog.makeVoice();
        dog.makeVoice("RRR");
    }
}