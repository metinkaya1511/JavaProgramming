package day56_abstraction_02;

public class Netscape extends Browser {

	@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to " + url);
	}

	@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaing webPage ");
	}

	@Override
	public boolean launch() {
		System.out.println("Netscape is launching");
		System.out.println("1 2 3");
		return true;
	}

	public void close() {
		super.close();
		System.out.println("Exitting the Netscape");
	}

	public Netscape() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating a Netscape");
	}
	public Netscape(String name, int id) {
		super(name, id);
	}

}
