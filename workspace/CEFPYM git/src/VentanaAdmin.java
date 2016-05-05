import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class VentanaAdmin extends JFrame {
	public VentanaAdmin() {
		
		setVisible(true);
		setTitle("OPCIONES ADMINISTRADOR");
		
		JLabel admin_imagenLateralIzquierdaJLabel = new JLabel("New label");
		
		JLabel admin_imagenLateralDerechaJLabel = new JLabel("New label");
		
		JLabel admin_imagenHeaderJLabel = new JLabel("BIENVENIDO, AMO DEL CALABAZO");
		admin_imagenHeaderJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel admin_opcionesJPanel = new JPanel();
		
		JButton btnNewButton = new JButton("Crear Usuario");
		
		JButton btnNewButton_1 = new JButton("Editar usuario");
		
		JButton btnNewButton_2 = new JButton("Eliminar usuario");
		
		JButton btnNewButton_3 = new JButton("Abandona tu mazmorra");
		GroupLayout gl_admin_opcionesJPanel = new GroupLayout(admin_opcionesJPanel);
		gl_admin_opcionesJPanel.setHorizontalGroup(
			gl_admin_opcionesJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_admin_opcionesJPanel.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_admin_opcionesJPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(42))
		);
		gl_admin_opcionesJPanel.setVerticalGroup(
			gl_admin_opcionesJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_admin_opcionesJPanel.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addGap(26))
		);
		admin_opcionesJPanel.setLayout(gl_admin_opcionesJPanel);
		
		JPanel admin_footerJPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(admin_imagenLateralIzquierdaJLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(admin_opcionesJPanel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(admin_imagenLateralDerechaJLabel, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
						.addComponent(admin_imagenHeaderJLabel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addComponent(admin_footerJPanel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(admin_imagenHeaderJLabel, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(admin_opcionesJPanel, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(admin_imagenLateralIzquierdaJLabel, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(admin_imagenLateralDerechaJLabel, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(admin_footerJPanel, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
		);
		admin_footerJPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel admin_footer_imagenIzquierdaJLabel = new JLabel("ADMINISTRA A TUS ESBIRROS");
		admin_footerJPanel.add(admin_footer_imagenIzquierdaJLabel);
		
		JLabel admin_footer_imagenDerechaJLabel = new JLabel("CEFPYM 1.0");
		admin_footer_imagenDerechaJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		admin_footerJPanel.add(admin_footer_imagenDerechaJLabel);
		getContentPane().setLayout(groupLayout);
	}

	public static void main(String[] args) {
		new VentanaAdmin();

	}
}
