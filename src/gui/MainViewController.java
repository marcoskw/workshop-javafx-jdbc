package gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.scene.web.Printable;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("onMenuItemVendedorAction");
	}
	
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("onMenuItemDepartamentoAction");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("onMenuItemSobreAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		
	}

}
