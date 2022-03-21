package fis.java.topic01.practice01;

public class StringMaxLengthValidation implements IValidation{
	private int length;
	
	public StringMaxLengthValidation(int length) {
		super();
		this.length = length;
	}

	@Override
	public boolean validate(String data) {
		return false;
	}
	
}
