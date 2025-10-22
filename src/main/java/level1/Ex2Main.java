package level1;

import level1.exceptiions.NegativeNumberException;
import level1.view.UserView;
import level1.model.*;

import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        UserView userView = new UserView();

        Person example = userView.newPerson(scanner);
        NoGenericMethods noGmTemp = userView.noGenericMethodsUI(scanner);

        GenericMethods gm = new GenericMethods<>(noGmTemp.getWord1(), noGmTemp.getWord2(), example);
        System.out.println(gm.toString());
    }

}
