/*
Write a class, called Human. It has the following properties: age (int), name (String),
height (double, means the height of the human in meters). Two humans are equal if they have the same names.
Create a class, called HumanHandler, create a main method and instantiate some Human objects in the main method
and set some of them the same names. Add the objects to a HashSet. Print out the size of the HashSet you created.
 */

package human;

public class Human {

    int age;
    String name;
    double height;

    public Human(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height; }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Human)) {return false;}
        Human human = (Human) o;
        return this.name.equals(human.getName()); }

    public int hashCode() {
        return name.hashCode(); }
}
