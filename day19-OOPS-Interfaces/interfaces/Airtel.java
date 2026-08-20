package interfaces;

public class Airtel implements Trai{

	@Override
	public void calling() {

		System.out.println("calling 1p/1s");
	}

	@Override
	public void data() {

		System.out.println("2G");
	}

	@Override
	public void sms() {

		System.out.println("100 sms");
	}

	@Override
	public void reacharge() {
		System.out.println("1 gb at 100 rs");
		
	}

}
