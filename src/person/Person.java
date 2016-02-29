/*
Create a Person class with the following attributes: name, weight, height.
The constructor initializes all of the mentioned attributes. (in kg and meter)
The class has a method that calculates the bmi metric.
bmi = weight / (height * height))
Name it to getBMI.
The class has a method to get the shape of the Person.
Bmi < 20 = „Slim”
Bmi > 30 = „Overweight”
otherwise „Normal”
Its name should be getShape.
The class has a method to get all information from the class in the following way:
Name/Weight/Height/Bmi
Its name should be getPersonInfo.
 */

package person;

public class Person {

    String name;
    int weight;
    double height;
    int bmi;
    String shape;

    public Person(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public int getBMI() {
        bmi = (int) (weight / (height * height));
        return bmi; }

    public String getShape(int bmi) {
        if (bmi < 20) shape = "Slim";
        else if (bmi > 30) shape = "Overweight";
        else shape = "Normal";
        return shape; }

    public String getPersonInfo() {
        return "Name: " + name + ", Weight: " + weight + ", Height: " + height +
               ", Bmi: " + this.getBMI() + ", Shape: " + this.getShape(bmi); }

    public static void main(String[] args) {
        Person jani = new Person("Jani", 75, 1.8);
        System.out.println(jani.getPersonInfo()); }
}
