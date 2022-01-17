package week5CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append("***Error: " + error + "***");
		errorMessage.toString();
		for(int i  = 0; i < errorMessage.length(); i ++) {
			System.out.print("*");
		}
		System.out.println("\n" + errorMessage);
		for(int i  = 0; i < errorMessage.length(); i ++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
