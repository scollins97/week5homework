package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("hello");
		logger.error("whoops");
		Logger logger2 = new SpacedLogger();
		logger2.log("hello");
		logger2.error("whoops");
	}

}
