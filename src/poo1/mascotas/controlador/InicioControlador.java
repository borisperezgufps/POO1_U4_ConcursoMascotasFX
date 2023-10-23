package poo1.mascotas.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import poo1.mascotas.util.Utilidades;

public class InicioControlador implements Initializable {

	@FXML private Label lblTotalMascotas;
	
	@FXML public void registrarMascota(ActionEvent e) {
		Stage stage = Utilidades.obtenerStage(e);
		stage.close();
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/poo1/mascotas/vista/RegistroVista.fxml"));
			Pane root = loader.load();			
			
			Scene scene = new Scene(root);
		    stage.setScene(scene);
		    
		    stage.show();		    		    

		} catch (IOException eio) {
			eio.printStackTrace();
		}
	}
	
	@FXML public void asignarPuntaje(ActionEvent e) {
			
		}
	
	@FXML public void generarReportes(ActionEvent e) {
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Acá se obtiene el total de mascotas
		
	}
	
}
