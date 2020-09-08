import org.mozilla.jss.CryptoManager;
import org.mozilla.jss.NotInitializedException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CryptoManager cryptoManager = CryptoManager.getInstance();
		} catch (NotInitializedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
