class Hangar {

	public static void main (String [] args) {

		Car Clio = new Car("Clio", 21);
		System.out.println(Clio.doStuff());
		Boat Titanic = new Boat("Titanic", 22);
		System.out.println(Titanic.doStuff());
	}
}