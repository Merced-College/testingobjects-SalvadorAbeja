public class DogTest {

  public static void main(String[] args) {
    // A1: Create a Dog with no constructors defined.
    Dog dog1 = new Dog();

    // A2: Print the object directly.
    System.out.println("Printing dog1 directly:");
    System.out.println(dog1);
    
    Dog d1 = new Dog();
  
    System.out.println("\nDefaults for d1 fields (before any assignment):");
    System.out.println("name = " + d1.getName());   // expected: null
    System.out.println("age = " + d1.getAge());     // expected: 0
    System.out.println("breed = " + d1.getBreed()); // expected: null

    Dog d2 = new Dog(); // uses default constructor values
    System.out.println("\nd2 after default constructor:");
    System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

    Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
    System.out.println("\nd3 after parameterized constructor:");
    System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("d2 = " + d2);
    System.out.println("d3 = " + d3);

    System.out.println("\nMutating public fields directly:");
    //d3.age() = 5;      // direct write
    d3.setAge(5);
    //d3.name = "Max"; // direct write
    d3.setName("Max");
    System.out.println("After mutation, d3 = " + d3); // uses toString()
    
    System.out.println("--------------------------------------------------------------------");
    // A1: Create a Dog with no constructors defined.
    cat cat1 = new cat();

    // A2: Print the object directly.
    System.out.println("Printing cat1 directly:");
    System.out.println(cat1);
    
    cat c1 = new cat();
  
    System.out.println("\nDefaults for c1 fields (before any assignment):");
    System.out.println("name = " + c1.getName());   // expected: null
    System.out.println("color = " + c1.getColor());     // expected: 0
    System.out.println("energetic = " + c1.getEnergetic()); // expected: null

    cat c2 = new cat(); // uses default constructor values
    System.out.println("\nc2 after default constructor:");
    System.out.println("name = " + c2.getName() + ", color = " + c2.getColor() + ", energetic = " + c2.getEnergetic());

    cat c3 = new cat("Simba", "Orange", true); // uses parameterized constructor
    System.out.println("\nc3 after parameterized constructor:");
    System.out.println("name = " + c3.getName() + ", color = " + c3.getColor() + ", energetic = " + c3.getEnergetic());

    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("c2 = " + c2);
    System.out.println("c3 = " + c3);

    System.out.println("\nMutating public fields directly:");
    //d3.age() = 5;      // direct write
    c3.setColor("Orange");
    //d3.name = "Max"; // direct write
    c3.setName("Simba");
    System.out.println("After mutation, c3 = " + c3); // uses toString()
} //ends class
}
