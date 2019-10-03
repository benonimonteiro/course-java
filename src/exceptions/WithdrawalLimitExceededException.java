package exceptions;

public class WithdrawalLimitExceededException extends Exception {

	private static final long serialVersionUID = 1L;

	public WithdrawalLimitExceededException(String msg) {
		super(msg);
	}
}
