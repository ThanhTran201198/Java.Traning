package fis.java.topic01.practice01;

public class DateValidation implements IValidation{
	
	private String format="\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
	
	
	public DateValidation(String format) {
		super();
		this.format = format;
	}


	@Override
	public boolean validate(String data) {
		// TODO Auto-generated method stub
		return false;
	}

}
