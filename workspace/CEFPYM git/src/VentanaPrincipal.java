import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;

public class VentanaPrincipal extends JFrame {
	
	private JTextPane descripcionTextPane;

	public VentanaPrincipal(){
		
		initComponents();
	}
	
	private void initComponents() {
				
		setVisible (true);
		
		JPanel interfaz_usuarioJPanel = new JPanel();
		interfaz_usuarioJPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		interfaz_usuarioJPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel interfaz_gettersJPanel = new JPanel();
		interfaz_gettersJPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		interfaz_usuarioJPanel.add(interfaz_gettersJPanel);
		interfaz_gettersJPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel interfaz_getters_usuarioJLabel = new JLabel("El usuario getUsuario() est\u00E1 sumido en las tinieblas");
		interfaz_gettersJPanel.add(interfaz_getters_usuarioJLabel);
		interfaz_getters_usuarioJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel interfaz_getters_libroJLabel = new JLabel("Aventura: getLibro()");
		interfaz_getters_libroJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		interfaz_gettersJPanel.add(interfaz_getters_libroJLabel);
		
		JLabel interfaz_getters_paginaJLabel = new JLabel("Contador: getPagina()");
		interfaz_getters_paginaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		interfaz_gettersJPanel.add(interfaz_getters_paginaJLabel);
		
		JPanel interfaz_aventuraJPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(interfaz_usuarioJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(interfaz_aventuraJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(interfaz_usuarioJPanel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(interfaz_aventuraJPanel, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
		);
		
		JPanel interfaz_seleccionJPanel = new JPanel();
		interfaz_seleccionJPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		interfaz_usuarioJPanel.add(interfaz_seleccionJPanel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Libro X, P\u00E1gina n", "Libro Y, P\u00E1gina m", "Libro Z, P\u00E1gina o"}));
		comboBox.setMaximumRowCount(5);
		
		JButton btnNewButton_3 = new JButton("Memorizar...");
		
		JButton btnNewButton_4 = new JButton("Rendirse...");
		GroupLayout gl_interfaz_seleccionJPanel = new GroupLayout(interfaz_seleccionJPanel);
		gl_interfaz_seleccionJPanel.setHorizontalGroup(
			gl_interfaz_seleccionJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_interfaz_seleccionJPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, 0, 234, Short.MAX_VALUE)
					.addGap(30)
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_interfaz_seleccionJPanel.setVerticalGroup(
			gl_interfaz_seleccionJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_interfaz_seleccionJPanel.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_interfaz_seleccionJPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_3)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14))
		);
		interfaz_seleccionJPanel.setLayout(gl_interfaz_seleccionJPanel);
		
		JLabel interfaz_aventura_imagenDeTextoJLabel = new JLabel("Imagen chula FTW");
		interfaz_aventura_imagenDeTextoJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton interfaz_aventura_opcionPagina1JButton = new JButton("Ir a la p\u00E1gina X");
		
		JButton interfaz_aventura_opcionPagina2JButton = new JButton("Ir a la p\u00E1gina Y");
		
		JButton interfaz_aventura_salirJbutton = new JButton("Volver atr\u00E1s...");
		
		JLabel interfaz_aventura_logoJlabel = new JLabel("Loguito");
		interfaz_aventura_logoJlabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		descripcionTextPane = new JTextPane();
		descripcionTextPane.setText("un texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largoun texto muy largo");
		JScrollPane interfaz_aventura_textoJScrollPane = new JScrollPane(descripcionTextPane);
		GroupLayout gl_interfaz_aventuraJPanel = new GroupLayout(interfaz_aventuraJPanel);
		gl_interfaz_aventuraJPanel.setHorizontalGroup(
			gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_interfaz_aventuraJPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(interfaz_aventura_imagenDeTextoJLabel, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
						.addComponent(interfaz_aventura_textoJScrollPane, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(interfaz_aventura_logoJlabel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(interfaz_aventura_salirJbutton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(interfaz_aventura_opcionPagina2JButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(interfaz_aventura_opcionPagina1JButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(13))
		);
		gl_interfaz_aventuraJPanel.setVerticalGroup(
			gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_interfaz_aventuraJPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(interfaz_aventura_logoJlabel, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
						.addComponent(interfaz_aventura_imagenDeTextoJLabel, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
					.addGroup(gl_interfaz_aventuraJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_interfaz_aventuraJPanel.createSequentialGroup()
							.addGap(24)
							.addComponent(interfaz_aventura_opcionPagina1JButton, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addGap(3)
							.addComponent(interfaz_aventura_opcionPagina2JButton, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(interfaz_aventura_salirJbutton, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
						.addGroup(gl_interfaz_aventuraJPanel.createSequentialGroup()
							.addGap(26)
							.addComponent(interfaz_aventura_textoJScrollPane, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
					.addContainerGap())
		);
		interfaz_aventuraJPanel.setLayout(gl_interfaz_aventuraJPanel);
		getContentPane().setLayout(groupLayout);
		
		setSize (520,419);
	}

	public static void main(String[] args) {
		
		new VentanaPrincipal();

	}
}
