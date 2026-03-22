package hteinlynnaung;

interface Payment {
	void pay();
}

class KBZPay implements Payment {
	public void  pay () {
		System.out.println("Paying with KBZPay");
	}
}

class WavePay implements Payment {
	public void pay () {
		System.out.println("Paying with WavePay");
	}
}