import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan and iwemamj. Created Mar 27, 2011 and April 9, 2012.
 */
public class PrintBalance {

	private static String result;

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String language = "en";
		String country = "US";

		Locale currentLocale;
		ResourceBundle messages;
		SimpleDateFormat formatter;

		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		if (country == "US") {
			formatter = new SimpleDateFormat("EEEE MMMM dd yyyy hh:mm:ss z",currentLocale);
			Date today = new Date();
			result = formatter.format(today);
		}
		if (country != "US") {
			formatter = new SimpleDateFormat("EEEE dd MMMM yyyy hh:mm:ss z",currentLocale);
			Date today = new Date();
			result = formatter.format(today);
		}
		Scanner scanInput = new Scanner(System.in);

		// Greeting
		System.out.println(messages.getString("greetings"));

		// Get User's Name
		System.out.println(messages.getString("entername"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("meetyou") + name);

		// print today's date, balance and bid goodbye
		if (country == "US") {
			//System.out.println("USA!");
			System.out.println(messages.getString("asof") + result);
			System.out.println(messages.getString("youowe"));
			System.out.println(messages.getString("bye"));
		}
		if (country != "US") {
			//System.out.println("NOT USA!");
			System.out.println(messages.getString("asof") + result);
			System.out.println(messages.getString("youowe"));
			System.out.println(messages.getString("bye"));
		}
	}
}
