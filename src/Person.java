public class Person {
    private String name;
    private int age;
 //alt+fn+insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
