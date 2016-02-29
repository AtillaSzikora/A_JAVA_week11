package human;

import java.util.HashSet;

public class HumanHandler {

    public static void main(String[] args) {

        Human jani = new Human(22, "Jani", 1.8);
        Human jozsi = new Human(33, "Jozsi", 1.9);
        Human julcsi = new Human(44, "Julcsi", 1.7);
        Human jani2 = new Human(11, "Jani", 2.0);
        Human jozsi2 = new Human(55, "Jozsi", 1.6);

        HashSet<Human> humans = new HashSet<Human>();
        humans.add(jani);
        humans.add(jozsi);
        humans.add(julcsi);
        humans.add(jani2);
        humans.add(jozsi2);

        System.out.println(humans.size());
    }
}
