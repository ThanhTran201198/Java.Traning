package fis.java.topic01.practice01;

import java.util.List;

public class Form {
	public List<Component> components;
	public void addComponent (Component component) {
		components.add(component);
	}
	public boolean validateForm() {
		return true;
	}


}
