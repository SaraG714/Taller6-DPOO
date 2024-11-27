package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // :)TODO completar
    	setLayout(new BorderLayout());
    	
    	JPanel panelIzq = new JPanel();
    	JPanel panelDer = new JPanel();

    	
    	
    	panelIzq.setLayout(new GridLayout(3,2));
    	
        JLabel lblNombre = new JLabel("	Nombre");
        txtNombre = new JTextField();
	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar    	
        JLabel lblCalificacion = new JLabel(" Calificación");
    	cbbCalificacion = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});


        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
        JLabel lblVisitado = new JLabel(" Visitado");
        cbbVisitado = new JComboBox<>(new String[]{"Sí", "No"}); 

    

    	
    	
        // Agregar todos los elementos al panel
        // TODO completar
        panelIzq.add(lblNombre);
        panelIzq.add(txtNombre);
        panelIzq.add(lblCalificacion);
        panelIzq.add(cbbCalificacion);
        panelIzq.add(lblVisitado);
        panelIzq.add(cbbVisitado);
        
        
        add(panelIzq, BorderLayout.WEST);
        add(panelDer, BorderLayout.EAST);

       
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // :)TODO completar
        String visitado = ( String )cbbVisitado.getSelectedItem( );
        if (visitado == "Sí") {
        	return true;
        }
        else {
        	return false;
        }
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // :)TODO completar
    	String nom = txtNombre.getText();
        return nom;
    }
}
