// PartsOfClass //
// Class Declaration
/**
 * public → access modifier (who can use it; default is package-private if
 * omitted).
 * 
 * class → keyword to define a class.
 * 
 * MyClass → name of the class (must match the file name if public).
 * 
 * { ... } → everything inside is the body of the class.
 * 
 * Default: If you don’t write public, it’s accessible only inside its own
 * package.
 */
public class Person {
    // 1. Fields
    /**
     * Store state or data for each object.
     * 
     * Default values if you don’t initialize:
     * Numbers (int, double) → 0 or 0.0
     * Booleans → false
     * Objects (e.g., String) → null
     * 
     * Use: To hold information about the object.
     */
    private String name;
    private int age;

    // 2. Constructor
    /**
     * Special method called when an object is created.
     * 
     * Name matches the class, no return type.
     * 
     * If you don’t write one, Java gives you a default constructor
     * 
     * Use: To set initial values when creating objects.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Method
    /**
     * Define behavior of the object.
     * 
     * Can be instance methods (need an object) or static methods (called without an
     * object).
     * 
     * Use: To perform actions related to your class.
     */
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    // 4. Static method
    public static void sayHello() {
        System.out.println("Hello from Person class!");
    }

    // 5. Entry point (optional)
    /**
     * Entry point of the program.
     * 
     * static → called without creating an object.
     * 
     * String[] args → command-line arguments.
     * 
     * Default: Only needed if you want this class to run directly.
     */
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        p.introduce();
        Person.sayHello();
    }
}
