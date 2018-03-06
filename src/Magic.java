import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Magic {

	ArrayList<Superiors> superiors = new ArrayList<Superiors>();
	Superiors spfaffe = Superiors.SIR_THOMAS_III;
	Superiors snickerdoodle = Superiors.CHEESE;
	Superiors sjack = Superiors.JACK;
	Superiors scharlie = Superiors.EMPEROR_FOLZ;
	Superiors sdave = Superiors.KING_DAVID;
	Superiors slarry = Superiors.LAROLD;
	Superiors stim = Superiors.LORD_TIMOTHY;
	Superiors sandy = Superiors.OVERLORD_ANDREW;
	Superiors sscott = Superiors.SCOOT;

	public void input() {
		superiors.add(spfaffe);
		superiors.add(snickerdoodle);
		superiors.add(sjack);
		superiors.add(scharlie);
		superiors.add(sdave);
		superiors.add(slarry);
		superiors.add(stim);
		superiors.add(sandy);
		superiors.add(sscott);
		
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < superiors.size(); ++i) {
			System.out.println("Did " + superiors.get(i).name + " give consent?");
			String consent = input.nextLine();
		}
	}
	public boolean pfaffeConsent(String consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
/*	public void test(boolean pfaffeConsent) {
		System.out.println(pfaffeConsent);
		
	}*/
	
	public boolean nickConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	public boolean jackConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	public boolean charlieConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	public boolean daveConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	public boolean larryConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	public boolean timConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	public boolean andyConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}public boolean scottConsent(consent) {
		if(consent == "yes") {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}