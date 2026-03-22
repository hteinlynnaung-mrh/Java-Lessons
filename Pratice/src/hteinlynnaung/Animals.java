package hteinlynnaung;

public class Animals {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Bird extends Animals {
	void sound() {
		System.out.println("Bird juju");
	}
}

class Cat extends Animals {
	void sound() {
		System.out.println("Cat meows");
	}
}
