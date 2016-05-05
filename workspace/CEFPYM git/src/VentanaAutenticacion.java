import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VentanaAutenticacion extends JFrame {
	private JPasswordField autenticacion_login_logypass_passJPassword;
	private JTextField autenticacion_login_logypass_usernameJTextArea;
	public VentanaAutenticacion() throws IOException {
		setTitle("CEFPYM");
		
		setVisible(true);
		
		JTabbedPane autenticacion_pestanasTPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel autenticacion_loginJPanel = new JPanel();
		autenticacion_pestanasTPane.addTab("Entra si te atreves", null, autenticacion_loginJPanel, null);
		
		JPanel autenticacion_login_logypassJPanel = new JPanel();
		autenticacion_login_logypassJPanel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel autenticacion_login_logypass_tituloJLabel = new JLabel("\u00BFQui\u00E9n se atreve a adentrarse?");
		autenticacion_login_logypass_tituloJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		autenticacion_login_logypassJPanel.add(autenticacion_login_logypass_tituloJLabel);
		
		autenticacion_login_logypass_usernameJTextArea = new JTextField();
		autenticacion_login_logypass_usernameJTextArea.setHorizontalAlignment(SwingConstants.CENTER);
		autenticacion_login_logypass_usernameJTextArea.setText("Nombre de usuario");
		autenticacion_login_logypassJPanel.add(autenticacion_login_logypass_usernameJTextArea);
		autenticacion_login_logypass_usernameJTextArea.setColumns(10);
		
		autenticacion_login_logypass_passJPassword = new JPasswordField();
		autenticacion_login_logypassJPanel.add(autenticacion_login_logypass_passJPassword);
		
		JLabel autenticacion_login_tituloJLabel = new JLabel("\"COMO ESPADA FORJADA POR YUNQUE Y MARTILLO\"");
		autenticacion_login_tituloJLabel.setFont(new Font("Algerian", Font.PLAIN, 17));
		autenticacion_login_tituloJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel autenticacion_login_imagenJLabel2 = new JLabel("Antorcha evocadora");
		autenticacion_login_imagenJLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		ImagenQueSeEstira antorcha= new ImagenQueSeEstira ("./Imagenes/Antorcha.png");
		autenticacion_login_imagenJLabel2.add(antorcha);
		antorcha.paint(getGraphics());
		
		
		JLabel autenticacion_login_imagenJLabel1 = new JLabel("Antorcha evocadora");
		
		JPanel autenticacion_login_confirmacionesJPanel = new JPanel();
		autenticacion_login_confirmacionesJPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton autenticacion_login_confirmaciones_confirmarJButton = new JButton("\u00BFMe recuerdas, amo del calabozo?");
		autenticacion_login_confirmaciones_confirmarJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		autenticacion_login_confirmacionesJPanel.add(autenticacion_login_confirmaciones_confirmarJButton);
		
		JButton autenticacion_login_confirmaciones_salirButton = new JButton("Me asusta entrar en tu sordidez");
		autenticacion_login_confirmacionesJPanel.add(autenticacion_login_confirmaciones_salirButton);
		GroupLayout gl_autenticacion_loginJPanel = new GroupLayout(autenticacion_loginJPanel);
		gl_autenticacion_loginJPanel.setHorizontalGroup(
			gl_autenticacion_loginJPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(autenticacion_login_tituloJLabel, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
				.addGroup(gl_autenticacion_loginJPanel.createSequentialGroup()
					.addComponent(autenticacion_login_imagenJLabel1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
					.addComponent(autenticacion_login_logypassJPanel, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addComponent(autenticacion_login_imagenJLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(autenticacion_login_confirmacionesJPanel, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
		);
		gl_autenticacion_loginJPanel.setVerticalGroup(
			gl_autenticacion_loginJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_autenticacion_loginJPanel.createSequentialGroup()
					.addComponent(autenticacion_login_tituloJLabel)
					.addGroup(gl_autenticacion_loginJPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(autenticacion_login_imagenJLabel1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
						.addComponent(autenticacion_login_logypassJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(autenticacion_login_imagenJLabel2, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
					.addComponent(autenticacion_login_confirmacionesJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		autenticacion_loginJPanel.setLayout(gl_autenticacion_loginJPanel);
		
		JPanel autenticacion_configuracionJPanel = new JPanel();
		autenticacion_pestanasTPane.addTab("Configuración", null, autenticacion_configuracionJPanel, null);
		
		JSlider autenticacion_configuracion_musicaJSlider = new JSlider();
		
		JCheckBox autenticacion_configuracion_inglesJCheckbox = new JCheckBox("New check box");
		
		JCheckBox autenticacion_configuracion_castellanoJCheckbox = new JCheckBox("New check box");
		
		JToggleButton autenticacion_configuracion_musicaSiNoJButton = new JToggleButton("S\u00ED/No");
		
		JLabel autenticacion_configuracion_musicaJLabel = new JLabel("M\u00FAsica");
		
		JLabel autenticacion_configuracion_languageJLabe = new JLabel("Language");
		
		JLabel autenticacion_configuracion_idiomaJLabel = new JLabel("Idioma");
		
		JLabel autenticacion_configuracionImagenesJLabel = new JLabel("Im\u00E1genes");
		GroupLayout gl_autenticacion_configuracionJPanel = new GroupLayout(autenticacion_configuracionJPanel);
		gl_autenticacion_configuracionJPanel.setHorizontalGroup(
			gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addComponent(autenticacion_configuracion_musicaSiNoJButton, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
							.addGap(150)
							.addComponent(autenticacion_configuracionImagenesJLabel))
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
									.addComponent(autenticacion_configuracion_inglesJCheckbox, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
									.addGap(79))
								.addComponent(autenticacion_configuracion_musicaJSlider, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
								.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
									.addComponent(autenticacion_configuracion_castellanoJCheckbox, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
									.addGap(74)))
							.addGap(150)
							.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(autenticacion_configuracion_idiomaJLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(autenticacion_configuracion_musicaJLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(autenticacion_configuracion_languageJLabe))))
					.addGap(57))
		);
		gl_autenticacion_configuracionJPanel.setVerticalGroup(
			gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(autenticacion_configuracion_musicaJSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(autenticacion_configuracion_musicaJLabel)))
					.addGap(14)
					.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(autenticacion_configuracion_inglesJCheckbox))
						.addComponent(autenticacion_configuracion_languageJLabe))
					.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGap(18)
							.addComponent(autenticacion_configuracion_castellanoJCheckbox))
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(autenticacion_configuracion_idiomaJLabel)))
					.addGap(5)
					.addGroup(gl_autenticacion_configuracionJPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_autenticacion_configuracionJPanel.createSequentialGroup()
							.addGap(13)
							.addComponent(autenticacion_configuracion_musicaSiNoJButton))
						.addComponent(autenticacion_configuracionImagenesJLabel)))
		);
		autenticacion_configuracionJPanel.setLayout(gl_autenticacion_configuracionJPanel);
			
		
		JPanel autenticacion_footerJPanel = new JPanel();
		autenticacion_footerJPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel autenticacion_footer_iconosJLabel = new JLabel("Iconitos diversos");
		autenticacion_footerJPanel.add(autenticacion_footer_iconosJLabel);
		autenticacion_footer_iconosJLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel autenticacion_footer_versionJLabel = new JLabel("CEFPYM v1.0");
		autenticacion_footer_versionJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		autenticacion_footerJPanel.add(autenticacion_footer_versionJLabel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(autenticacion_pestanasTPane, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
						.addComponent(autenticacion_footerJPanel, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(autenticacion_pestanasTPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(autenticacion_footerJPanel, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		setSize(520,310);
	}

	public static void main(String[] args) throws IOException {
		
		new VentanaAutenticacion();
	}
}
