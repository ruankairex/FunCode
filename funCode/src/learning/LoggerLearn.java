package learning;

import java.util.logging.*;

public class LoggerLearn {
	private static final Logger logger = Logger.getLogger(LoggerLearn.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Exception occurred", e);
        }
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}
