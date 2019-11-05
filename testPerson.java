/**
 * @author Yiyang Shi
 */
import java.util.Scanner;

public class testPerson
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        Person person1 = new Person("yiyang", "yi", "shi", 22, "female", 5.6, 130, "black", "black");
        System.out.println("your record information is that");
        System.out.println(person1);
        person1.getPersonFromUser();
        Person person2 = new Person();
        System.out.println("Please enter person2's full name. (firstname middlename lastname)");
        person2.setName(keyboard.next(), keyboard.next(), keyboard.next());
        keyboard.nextLine();
        System.out.println("Please enter person2's age.");
        person2.setAge(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Please enter person2's gender.");
        person2.setGender(keyboard.nextLine());
        System.out.println("Please enter person2's height.");
        person2.setHeight(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Please enter person2's weight.");
        person2.setWeight(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Please enter person2's haircolor.");
        person2.setHaircolor(keyboard.nextLine());
        System.out.println("Please enter person2's eyecolor.");
        person2.setEyecolor(keyboard.nextLine());
        System.out.println("the person2's information will be: ");
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getGender() + " " + person2.getHeight() + " " + person2.getWeight() + " " + person2.getHaircolor() + " " + person2.getEyecolor());
        System.out.println("Let's set the person1's information as same as person2!");
        person1.changePersonto(person2);
        System.out.println("Let's compare those two person's information.");
        if (person1.equals(person2))
        {
            System.out.println("These two person have same information.");
        }
        else
        {
            System.out.println("These two person don't have same information.");
        }
        if (person1.equals(person2))
        {
            System.out.println("These two person are totally same.");
        }
        else
        {
            System.out.println("These two person are totally different.");
        }
    }
}