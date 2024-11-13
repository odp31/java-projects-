public class Animal
  {
    private String name;
    private int age;

    public Animal(String name, int age)
    {
      this.name = name;
      this.age = age;
    }
    public void eat()
    {
      System.out.println(name + "is eating.");
    }
    public void sleep()
    {
      System.out.println(name + "is sleeping.");
    }
    public String getName()
    {
      return name;
    }
    public int getAge()
    {
      return age;
    }
  }

// 2 subclasses dog and cat that inherit from animal class 

public class Dog extends Animal
  {
    public Dog(String name, int age)
    {
      super(name, age);
    }
    public void bark()
    {
      System.out.println(getName() + "is barking.");
    }
  }

public class Cat extends Animal
  {
    public Cat(String name, int age)
    {
      super(name, age);
    }
    public void meow()
    {
      System.out.println(getName() + "is meowing.");
    }
  }

