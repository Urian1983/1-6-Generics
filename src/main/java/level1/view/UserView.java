package level1.view;

import java.util.Scanner;

import level1.exceptiions.NegativeNumberException;
import level1.model.*;

public class UserView {

    Scanner scanner = new Scanner(System.in);

    public Person newPerson(Scanner scanner) throws NegativeNumberException {

        System.out.println("Type the name of the person");
        String name = scanner.nextLine();
        System.out.println("Type the surname of the person");
        String surname = scanner.nextLine();
        System.out.println("Type the age of the person");
        int age = scanner.nextInt();
        scanner.nextLine();
        Person newPerson = new Person(name,surname,age);
        return newPerson;
    }

    public NoGenericMethods noGenericMethodsUI(Scanner scanner){
        System.out.println("Type any sentence (1)");
        String word1= scanner.nextLine();
        System.out.println("Type any sentence (2)");
        String word2= scanner.nextLine();
        System.out.println("Type any sentence (3)");
        String word3 = scanner.nextLine();

        NoGenericMethods ngm = new NoGenericMethods(word1, word2, word3);
        return ngm;
    }
}
