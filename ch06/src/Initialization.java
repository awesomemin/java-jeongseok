public class Initialization {
    public static void main(String[] args) {
        System.out.printf("Current population is %d.%n", Person.population);
        Person p1 = new Person();
        System.out.printf("Current population is %d.%n", Person.population);
        Person p2 = new Person("Seongmin", 25, true);
        System.out.printf("Current population is %d.%n", Person.population);
    }
}

class Person {
    static int population = 0;
    String name;
    int age;
    boolean isMale;

    static {
        System.out.println("Person class has been loaded onto memory.");
    }

    {
        population++;
    }

    Person() {
        this("sam", 20, true);
    }

    Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
}