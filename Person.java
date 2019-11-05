/**
 * @author Yiyang Shi
 */
import java.util.Scanner;

public class Person extends Name
{
    private static Scanner keyboard = new Scanner(System.in);
    private int age;
    private double height, weight;
    private String gender = null, haircolor = null, eyecolor = null;
    private Name name = new Name();
    public Person()
    {

    }
    public Person(String firstname, String middlename, String lastname, int age, String gender, double height, double weight, String haircolor, String eyecolor)
    {
        this.name.changeNameTo(firstname, middlename, lastname);
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
    }
    public Person(Person person)
    {
        name.changeNameTo(person.name);
        age = person.age;
        gender = person.gender;
        height = person.height;
        weight = person.weight;
        haircolor = person.haircolor;
        eyecolor = person.eyecolor;
    }
    public void getPersonFromUser()
    {
        System.out.println("Please enter a complete person information in the folowing format.");
        System.out.println("firstname middlename lastname age gender height weight haircolor eyecolor");
        name.setFirstName(keyboard.next());
        name.setMiddleName(keyboard.next());
        name.setLastName(keyboard.next());
        age = keyboard.nextInt();
        gender = keyboard.next();
        height = keyboard.nextDouble();
        weight = keyboard.nextDouble();
        haircolor = keyboard.next();
        eyecolor = keyboard.next();
        keyboard.nextLine();
    }
    public String toString()
    {
        return (name + "'s age is " + age + ", gender is " + gender + ", height is " +height + ", weight is " + weight + ", haircolor is " + haircolor + ", eyecolor is " + eyecolor);
    }
    public Boolean equals(Person person)
    {
        if (name.equals(person.name) && age==person.age && gender.equals(person.gender) && height==person.height && weight==person.weight && haircolor.equals(person.haircolor) && eyecolor.equals(person.eyecolor))
        return true;
        return false;
    }
    public void setName(String firstname, String middlename, String lastname)
    {
        this.name.changeNameTo(firstname, middlename, lastname);
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setHaircolor(String haircolor)
    {
        this.haircolor = haircolor;
    }
    public void setEyecolor(String eyecolor)
    {
        this.eyecolor = eyecolor;
    }
    public String getName()
    {
        return name.getFullName();
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getHaircolor()
    {
        return haircolor;
    }
    public String getEyecolor()
    {
        return eyecolor;
    }
    public void changePersonto(Person person)
    {
        name.changeNameTo(person.name);
        age = person.age;
        gender = person.gender;
        height = person.height;
        weight = person.weight;
        haircolor = person.haircolor;
        eyecolor = person.eyecolor;
    }
}