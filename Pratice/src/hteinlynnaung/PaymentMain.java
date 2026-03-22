package hteinlynnaung;

public class PaymentMain {
	
	public static void main(String[] args) {
		
		Payment p1 = new KBZPay();
		p1.pay();
		
		Payment p2 = new WavePay();
		p2.pay();
	}

}
