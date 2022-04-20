import Enums.Commands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu {

    private static LoginMenu instance = null;

    private LoginMenu() {
    }


    public static LoginMenu getInstance() {
        if (instance == null)
            instance = new LoginMenu();
        return instance;
    }

    void run() {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Matcher matcher;
            Messages messages;
            if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER1)) != null) {

                //TODO
                //
                //register user functions....
                //
            }
        }


    }
}
