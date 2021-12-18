package model.exception;

public class BalanceErrorException  extends Exception {

	private static final long serialVersionUID = 1L;
	public BalanceErrorException( String msg) {
		super(msg);
	}
}
