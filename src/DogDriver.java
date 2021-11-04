public class DogDriver
{
    public static void main(String[] args)
    {
        //Prints name & assignment name
        System.out.println("Jesus Ruiz\nAssignment: Dog\n");

        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Sparky", 1, "Chihuahua", 5);

        System.out.println("Fang's Breed: " + dog1.getBreed() + "\nFang's Age: " + dog1.getAge());
        System.out.println("Piper's Weight: " + dog2.getWeight());
        System.out.println("\tMy dog:\n" + dog3.toString());
        System.out.println("Amount of dogs owned: " + Dog.getCount());

        if (dog2.compareTo(dog1) < 0)
        {
            System.out.println(dog2.getName() + " is younger than " + dog1.getName());
        }
        else if (dog2.compareTo(dog1) > 0)
        {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        }
        else
        {
             System.out.println(dog2.getName() + " is the same age as " + dog1.getName());
        }

        if (dog1.compareTo(dog3) < 0)
        {
            System.out.println(dog1.getName() + " is younger than " + dog3.getName());
        }
        else if (dog1.compareTo(dog3) > 0)
        {
            System.out.println(dog1.getName() + " is older than " + dog3.getName());
        }
        else
        {
            System.out.println(dog1.getName() + " is the same age as " + dog3.getName());
        }
    }
}
