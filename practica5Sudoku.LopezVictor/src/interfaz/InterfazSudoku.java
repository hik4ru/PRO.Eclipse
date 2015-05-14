package interfaz;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;

import resuelto.Sudoku; 

import java.awt.FlowLayout;

import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JCheckBox;



public class InterfazSudoku extends JFrame {

	final static int RELACION_NINGUNA = 0;
	final static int RELACION_FILA = 1;
	final static int RELACION_COLUMNA = 2;
	final static int RELACION_CUADRANTE = 3;
	
	private Sudoku sudoku;
	private boolean modoValidacion;

	final static Color[] colores = { Color.WHITE, new Color(255, 178, 102),
			new Color(255, 178, 102), new Color(255, 153, 51) };
	ActionListener actionListener = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

		}
	};

	private JPanel contentPane;
	private TextFieldSudoku[][] camposTexto = new TextFieldSudoku[9][9];
	private JButton btnCargar;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnReiniciar;
	private JCheckBox chckbxModoValidacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazSudoku frame = new InterfazSudoku();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazSudoku() {
		setTitle("sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelControles = new JPanel();
		contentPane.add(panelControles, BorderLayout.EAST);

		PanelSudoku panelNumeros = new PanelSudoku();
		contentPane.add(panelNumeros, BorderLayout.CENTER);
		panelNumeros.setLayout(new GridLayout(9, 9, 10, 10));
		
		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				  JFileChooser chooser = new JFileChooser();
				  	chooser.setCurrentDirectory(new File("."));
				    FileNameExtensionFilter filter = new FileNameExtensionFilter(
				        "Sudokus (.sud)", "sud");
				    chooser.setFileFilter(filter);
				    int returnVal = chooser.showOpenDialog(null);

				    if(returnVal == JFileChooser.APPROVE_OPTION) {
				         String nombreFichero = chooser.getSelectedFile().getName();
						sudoku = new Sudoku(nombreFichero);
						mostrarSudoku();
				    }
				    //}				String nombreFichero = "sudoku1.sud";
				
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "Fichero no existe", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		panelControles.setLayout(new GridLayout(0, 1, 0, 0));
		panelControles.add(btnCargar);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_1 = new JButton("Vaciar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sudoku = new Sudoku();
				mostrarSudoku();
			}
		});
		panelControles.add(btnNewButton_1);
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sudoku.reiniciar();
				mostrarSudoku();
			}
		});
		panelControles.add(btnReiniciar);
		
		btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sudoku.resuelto()) 
					JOptionPane.showMessageDialog(null, "Resuelto", "", JOptionPane.INFORMATION_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null, "No resuelto", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panelControles.add(btnNewButton);
		
		chckbxModoValidacion = new JCheckBox("Modo validacion");
		chckbxModoValidacion.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cambiarModoValiacion(chckbxModoValidacion.isSelected());
			}
		});
		panelControles.add(chckbxModoValidacion);
		panelControles.add(textField);
		textField.setColumns(10);

		int cont = 1;
		for (int i = 0; i < camposTexto.length; i++) {
			for (int j = 0; j < camposTexto[0].length; j++) {
				camposTexto[i][j] = new TextFieldSudoku(i, j);
				panelNumeros.add(camposTexto[i][j]);
				cont++;
			}
		}
		
		//Creamos un sudoku vacio
		sudoku = new Sudoku();
		mostrarSudoku();
	}

	/**
	 * Resalta de de distinto modo las celdas relacionadas con la indicada
	 * (misma fila y columna, mismo cuadrante, etc)
	 * 
	 * @param fila
	 *            fila que tiene el foco
	 * @param columna
	 *            columna que tiene el foco.
	 */
	public void resaltarAfectadas(int fila, int columna) {
		for (int i = 0; i < camposTexto.length; i++) {
			for (int j = 0; j < camposTexto[0].length; j++) {
				if (i == fila || j == columna)
					camposTexto[i][j].resaltar(RELACION_FILA);
				else if (fila / 3 == i / 3 && columna / 3 == j / 3)
					camposTexto[i][j].resaltar(RELACION_CUADRANTE);
				else
					camposTexto[i][j].resaltar(RELACION_NINGUNA);
			}
		}
	}

	public void cambioTexto(int fila, int columna) {
		TextFieldSudoku tf = camposTexto[fila][columna];
		String texto = tf.getText();
		if(texto.trim().length() == 0) sudoku.setDato(fila,columna,0);
		else sudoku.setDato(fila,columna,Integer.parseInt(texto));
		mostrarSudoku();
	}

	public void mostrarSudoku(){
		for (int i = 0; i < camposTexto.length; i++) {
			for (int j = 0; j < camposTexto[0].length; j++) {
				int valor = sudoku.getDato(i, j);
				if(valor == 0) camposTexto[i][j].setText("");
				else camposTexto[i][j].setText(String.valueOf(valor));
			}
		}

		if(modoValidacion) {
			for (int i = 0; i < camposTexto.length; i++) {
				for (int j = 0; j < camposTexto[0].length; j++) {
					if(sudoku.validarElemento(i, j)) camposTexto[i][j].setForeground(Color.BLACK);
					else camposTexto[i][j].setForeground(Color.RED);
				}
			}
		}
	}
	public void cambiarModoValiacion (boolean modo){
		modoValidacion = modo;
		if(modoValidacion){
			mostrarSudoku();
		} else {
			for (int i = 0; i < camposTexto.length; i++) {
				for (int j = 0; j < camposTexto[0].length; j++) {
					camposTexto[i][j].setForeground(Color.BLACK);
				}
			}
		}
		
	}
	/**
	 * TextField adaptado a las necesidades del formulario.
	 * 
	 * 
	 */
	private class TextFieldSudoku extends JTextField {
		String texto;
		int fila;
		int columna;
		private Pattern pattern;
		private Border wrongBorder = BorderFactory.createLineBorder(Color.RED);
		private Border defaultBorder;

		public TextFieldSudoku(final int fila, final int columna) {
			super(1);
			
			this.fila = fila;
			this.columna = columna;
			this.defaultBorder = this.getBorder();
			setText(String.valueOf(fila * 9 + columna + 1));
			setText(String.valueOf(fila / 3));
			setHorizontalAlignment(SwingConstants.CENTER);
			setFont(new Font("Tahoma", Font.PLAIN, 22));
			pattern = Pattern.compile("[1-9]");

			// Cada vez que una celda gana el foco se resaltan las celdas que
			// tienen relaci�n con esta
			addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					texto = getText();
					resaltarAfectadas(fila, columna);
				}
				// Cuando pierde el foco se comprueba si contiene un valor adecuado. Si no lo tiene se deja en blanco
				@Override
				public void focusLost(FocusEvent arg0) {
					boolean ok = validarTexto();
					if(!ok) {
						setText("");
						cambiarBorde(true);
					}
					if(!getText().equals(texto)) {
						texto = getText();
						cambioTexto(fila, columna);
					}
				}
			});

			addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyReleased(KeyEvent e) {
					boolean ok = validarTexto();
					cambiarBorde(ok);
				}

				@Override
				public void keyPressed(KeyEvent e) {
				}
			});
		}

		private void resaltar(int tipoResaltar) {
			setBackground(colores[tipoResaltar]);
		}

		private boolean validarTexto() {
			boolean ok;
			if(getText().trim().length() == 0) ok = true;
			else {
				Matcher matcher = pattern.matcher(this.getText());
				ok = matcher.matches();
			}
			
			
			return ok;
		}
		private void cambiarBorde(boolean ok){
			if (!ok) {
				this.setBorder(wrongBorder);
			} else {
				this.setBorder(defaultBorder);
			}
		}
	}

	/**
	 * Panel con dos lineas horizontales y dos verticales que lo atraviesan
	 * 
	 */
	private class PanelSudoku extends JPanel {

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			((Graphics2D) g).setStroke(new BasicStroke(3));

			int separacionH = this.getWidth() / 3;
			int separacionV = this.getHeight() / 3;
			g.drawLine(separacionH, 0, separacionH, getHeight());
			g.drawLine(2 * separacionH, 0, 2 * separacionH, getHeight());
			g.drawLine(0, separacionV, getWidth(), separacionV);
			g.drawLine(0, 2 * separacionV, getWidth(), 2 * separacionV);
		}

	}

}
