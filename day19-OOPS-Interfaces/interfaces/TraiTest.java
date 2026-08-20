package interfaces;

public class TraiTest {
	
	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		airtel.sms();
		airtel.reacharge();
		
		Jio jio = new Jio();
		jio.calling();
		jio.data();
		jio.sms();
		jio.reacharge();
	}

}
