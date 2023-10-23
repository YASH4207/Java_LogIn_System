
public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandpasswords = new IDandPasswords();

		idandpasswords.getLoinifo();
		
		LoginPage loginpage = new LoginPage(idandpasswords.getLoinifo());
		
	}

}
