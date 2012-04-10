import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * A simple class that needs to be localized
 * 
 * @author mohan and iwemamj. Created Mar 27, 2011 and April 9, 2012.
 */
public class PrintBalance {



	private static String result;
	

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 * @return 
	 */
	public static ArrayList<String> PrintBalance(String language, String country) {
		ArrayList<String> resultlist = new ArrayList<String>();
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
		String greet = messages.getString("greetings");
		System.out.println(greet);
		resultlist.add(greet);
		

		// Get User's Name
		String entername = messages.getString("entername");
		System.out.println(entername);
		resultlist.add(entername);
		String name = "Matt";
		String meetyou = messages.getString("meetyou") + name;
		System.out.println(meetyou);
		resultlist.add(meetyou);

		// print today's date, balance and bid goodbye
			String asof = messages.getString("asof") + result;
			System.out.println(asof);
			resultlist.add(asof);
			String youowe = messages.getString("youowe");
			System.out.println(youowe);
			resultlist.add(youowe);
			String bye = messages.getString("bye");
			System.out.println(bye);
			resultlist.add(bye);
			
			return resultlist;
	}
}
