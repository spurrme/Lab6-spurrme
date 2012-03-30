
import org.junit.Test;

import junit.framework.TestCase;


public class TestPrintBalance extends TestCase {
	@Test
	public void testComplier(){
		assertTrue("Does this work?", true);
	}
	@Test
	public void testEnglish(){
		PrintBalance l = new PrintBalance("en", "US");
		assertEquals("Hello World", l.getMessages().getString("Hi"));
		assertEquals("Please enter your name", l.getMessages().getString("Question"));
		assertEquals("As of : ", l.getMessages().getString("Start"));
	}
	@Test
	public void testFrench(){
		PrintBalance l = new PrintBalance("fr", "FR");
		assertEquals("Bonjour tout le monde", l.getMessages().getString("Hi"));
		assertEquals("S'il vous plaît entrer votre nom", l.getMessages().getString("Question"));
		assertEquals("En date du: ", l.getMessages().getString("Start"));
	}
	@Test
	public void testGerman(){
		PrintBalance l = new PrintBalance("gr", "GR");
		assertEquals("Hallo Welt", l.getMessages().getString("Hi"));
		assertEquals("Bitte geben Sie Ihren Namen", l.getMessages().getString("Question"));
		assertEquals("Stand: ", l.getMessages().getString("Start"));
	}

}
