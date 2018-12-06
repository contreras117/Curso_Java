package com.contreras.daniel.interfazgrafica;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		Label label = new Label();
		OnClickListenner oncl = (Element element) -> {
			
		};
		oncl.click(button);
		oncl.click(label);
	}

}
