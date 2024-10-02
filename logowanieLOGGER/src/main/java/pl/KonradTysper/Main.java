package pl.KonradTysper;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
    public  static void main(String[] args) {
        ConsoleHandler consoleHandler= new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setLevel(Level.SEVERE);
        LOGGER.addHandler(consoleHandler);
        LOGGER.setUseParentHandlers(false);

        User user = new User("Konrad", "Tysper");

        LOGGER.info("Przed name");
        user.capitalizeName();

        LOGGER.info("Przed lastName");
        user.capitalizeLastName();

        System.out.println(user.isMale());


    }

}