package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTeste;
	@FXML
	private Button btTeste2;

	@FXML
	public void onBtTestAction() {
		
		System.out.println("Voce Clicou !!");

	}
	
	@FXML
	public void  onBtTestSction2(){
		
		System.out.println(" Contando de 1 a 10 ");
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(i);
		}
		
		
		
	}
}
