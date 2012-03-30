import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	private String language;
	private String country;
	private Locale aLocale;
	private ResourceBundle messages;
	public   PrintBalance(String l, String c)
	{
		this.language = l;
		this.country = c;
		aLocale = new Locale(this.language, this.country);
		messages = ResourceBundle.getBundle("MessagesBundle", aLocale);
	}
	public void printMessage(){
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		double amount =  9876543.21;
		DateFormat newDate = DateFormat.getDateInstance(DateFormat.LONG, aLocale);
		NumberFormat newAmount = NumberFormat.getCurrencyInstance(aLocale);
		//Greeting
		System.out.println(messages.getString("Hi"));
		//Get User's Name
		System.out.println(messages.getString("Question"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("Pleased") + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("Start")+ newDate.format(today));
		System.out.println(messages.getString("Balance") + newAmount.format(amount));
		System.out.println(messages.getString("Farewell"));
		
	}
	public ResourceBundle getMessages(){
		return this.messages;
	}
	
	}

