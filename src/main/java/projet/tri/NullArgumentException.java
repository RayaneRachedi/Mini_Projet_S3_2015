/**
 * 
 */
package projet.tri;

/**
 * @author Latixel
 * Classe d'exception levée lorsqu'un argument d'une méthode/constructeur est null alors que ce n'est pas supporter.
 * créer uniquement pour pouvoir nommé l'exception que l'on lève dans TriTabl.
 */
public class NullArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4942962449896996826L;

	/**
	 * 
	 */
	public NullArgumentException() {
		this("null argument");
	}

	/**
	 * @param arg0 ...
	 */
	public NullArgumentException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0 ...
	 */
	public NullArgumentException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0 ...
	 * @param arg1 ...
	 */
	public NullArgumentException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0 ...
	 * @param arg1 ...
	 * @param arg2 ...
	 * @param arg3 ...
	 */
	public NullArgumentException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
