package javase.macase.注解;

/**
 * 自定义异常
 * @author Passerby
 *
 */
public class NoIdException extends RuntimeException{

	public NoIdException() {}
	public NoIdException(String s) {
		super(s);
	}
}
