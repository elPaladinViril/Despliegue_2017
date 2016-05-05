import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VentanaUsuarios extends JFrame {
	
	public VentanaUsuarios(){
		
		setVisible(true);
		
		JTabbedPane usuariosTPanel = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel usuarios_partidaSalvadaJPanel = new JPanel();
		usuariosTPanel.addTab("Entra si te atreves", null, usuarios_partidaSalvadaJPanel, null);
		
		JLabel usuarios_partidaSalvadaJlabel1 = new JLabel("Aqu\u00ED ir\u00EDa la imagen de la partida 1");
		
		JLabel usuarios_partidaSalvadaJlabel2 = new JLabel("Aqu\u00ED ir\u00EDa la imagen de la partida 2");
		
		JLabel usuarios_partidaSalvadaSalirJlabel = new JLabel("Aqu\u00ED ir\u00EDa la imagen de salir");
		
		JButton usuarios_partidaSalvadaJButton1 = new JButton("Concentrarse en recuerdo 1");
		
		JButton usuarios_partidaSalvadaJButton2 = new JButton("Concentrarse en recuerdo 2");
		
		JButton usuarios_partidaSalvadaSarliJbutton = new JButton("Rendirse...");
		GroupLayout gl_usuarios_partidaSalvadaJPanel = new GroupLayout(usuarios_partidaSalvadaJPanel);
		gl_usuarios_partidaSalvadaJPanel.setHorizontalGroup(
			gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_usuarios_partidaSalvadaJPanel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_usuarios_partidaSalvadaJPanel.createSequentialGroup()
							.addComponent(usuarios_partidaSalvadaJlabel1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(usuarios_partidaSalvadaJButton1))
						.addGroup(gl_usuarios_partidaSalvadaJPanel.createSequentialGroup()
							.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(usuarios_partidaSalvadaJlabel2, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
								.addGroup(gl_usuarios_partidaSalvadaJPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(usuarios_partidaSalvadaSalirJlabel, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(usuarios_partidaSalvadaSarliJbutton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(usuarios_partidaSalvadaJButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(39))
		);
		gl_usuarios_partidaSalvadaJPanel.setVerticalGroup(
			gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_usuarios_partidaSalvadaJPanel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(usuarios_partidaSalvadaJButton1)
						.addComponent(usuarios_partidaSalvadaJlabel1, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(usuarios_partidaSalvadaJButton2)
						.addComponent(usuarios_partidaSalvadaJlabel2, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_usuarios_partidaSalvadaJPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(usuarios_partidaSalvadaSarliJbutton)
						.addComponent(usuarios_partidaSalvadaSalirJlabel, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
					.addGap(31))
		);
		usuarios_partidaSalvadaJPanel.setLayout(gl_usuarios_partidaSalvadaJPanel);
		
		JPanel usuarios_constructorJPanel = new JPanel();
		usuariosTPanel.addTab("Constructor", null, usuarios_constructorJPanel, null);
		
		JButton usuarios_constructor_crearLibroJButton = new JButton("Construir memoria");
		
		JButton usuarios_constructor_crearPaginaJButton = new JButton("Construir sue\u00F1o");
		
		JButton usuarios_constructor_eliminarPaginaJButton = new JButton("Eliminar sue\u00F1o");
		
		JButton usuarios_constructor_eliminarLibroJButton = new JButton("Eliminar memoria");
		
		JButton usuarios_constructor_botonSalirJButton = new JButton("Regresar...");
		
		JLabel usuarios_constructor_imagenLateralJlabel = new JLabel("Imagen guay");
		GroupLayout gl_usuarios_constructorJPanel = new GroupLayout(usuarios_constructorJPanel);
		gl_usuarios_constructorJPanel.setHorizontalGroup(
			gl_usuarios_constructorJPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_usuarios_constructorJPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(usuarios_constructor_imagenLateralJlabel, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_usuarios_constructorJPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(usuarios_constructor_crearLibroJButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_usuarios_constructorJPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(usuarios_constructor_eliminarLibroJButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addComponent(usuarios_constructor_crearPaginaJButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addComponent(usuarios_constructor_eliminarPaginaJButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
					.addGap(109)
					.addComponent(usuarios_constructor_botonSalirJButton)
					.addGap(3))
		);
		gl_usuarios_constructorJPanel.setVerticalGroup(
			gl_usuarios_constructorJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_usuarios_constructorJPanel.createSequentialGroup()
					.addGap(73)
					.addGroup(gl_usuarios_constructorJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_usuarios_constructorJPanel.createSequentialGroup()
							.addComponent(usuarios_constructor_imagenLateralJlabel, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
							.addGap(84))
						.addGroup(Alignment.TRAILING, gl_usuarios_constructorJPanel.createSequentialGroup()
							.addComponent(usuarios_constructor_botonSalirJButton)
							.addGap(6)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_usuarios_constructorJPanel.createSequentialGroup()
					.addContainerGap(44, Short.MAX_VALUE)
					.addComponent(usuarios_constructor_crearLibroJButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_usuarios_constructorJPanel.createSequentialGroup()
						.addComponent(usuarios_constructor_crearPaginaJButton)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(usuarios_constructor_eliminarPaginaJButton)
						.addGap(10)
						.addComponent(usuarios_constructor_eliminarLibroJButton))
					.addGap(28))
		);
		usuarios_constructorJPanel.setLayout(gl_usuarios_constructorJPanel);
		
		JPanel usuarios_footerJPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(usuarios_footerJPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addComponent(usuariosTPanel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 428, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(usuariosTPanel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(usuarios_footerJPanel, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
		);
		usuarios_footerJPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel usuarios_footer_iconoJLabel = new JLabel("ICONITOS VARIOS");
		usuarios_footerJPanel.add(usuarios_footer_iconoJLabel);
		
		JLabel usuarios_version_footerJLabel = new JLabel("CEFPYM V_1.0");
		usuarios_version_footerJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usuarios_footerJPanel.add(usuarios_version_footerJLabel);
		getContentPane().setLayout(groupLayout);
		
		setSize (520,310);
	}
		public static void main(String[] args) {
			
			new VentanaUsuarios();
	
}
}
