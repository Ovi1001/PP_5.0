import java.text.DecimalFormat;

public class Dog implements Comparable
{
    //Initializing Variables
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int count;

    //Constructors
    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        count++;
    }
    public Dog()
    {
        this.name = "Unnamed";
        this.age = 0;
        this.breed = "Unknown";
        this.weight = 0;
        count++;
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    public static int getCount()
    {
        return count;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //Brain Methods
    public String weightToKilo()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        final double KILO_TO_POUND = 2.205;
        return fmt.format(weight / KILO_TO_POUND);
    }
    @Override
    public int compareTo(Object obj)
    {
        int value = 0;
        if (this.getAge() > ((Dog)obj).getAge())
        {
            value = 1;
        }
        else if (this.getAge() < ((Dog)obj).getAge())
        {
            value = -1;
        }
        return value;
    }

    //toString method
    public String toString()
    {
        return "Name: " + name +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nWeight: " + weight;
    }
}
