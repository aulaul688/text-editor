package Factory;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class SpellCheck extends Dialog{
	private JPanel dialog;
    private JPanel textPanel;
    private JLabel text;
    private JScrollPane scroll;
    private JTextArea textArea1;
    private JPanel buttonBar;
    private JButton okBT;
    
	public SpellCheck (String t) {
		create(t);
	}
	
	public void create(String t) {
		
		dialog = new JPanel();
        textPanel = new JPanel();
        text = new JLabel();
        scroll = new JScrollPane();
        textArea1 = new JTextArea();
        buttonBar = new JPanel();
        okBT = new JButton();
        
        //-------Default-------
        setTitle(t);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/ico.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        //-------dialog-------
        
        dialog.setBorder(new EmptyBorder(12, 12, 12, 12));
        dialog.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
        swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
        . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
        , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialog. getBorder
        () ) ); dialog. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
        . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
        ( ) ;} } );
        dialog.setLayout(new BorderLayout());
        
        //-------textPanel-------
        textPanel.setLayout(new FlowLayout());
        
      //======== scroll ========
        

            //---- textArea1 ----
            textArea1.setColumns(30);
            textArea1.setRows(6);
            textArea1.setFont(textArea1.getFont().deriveFont(textArea1.getFont().getSize() + 5f));
            scroll.setViewportView(textArea1);
        
        textPanel.add(scroll);
    
    dialog.add(textPanel, BorderLayout.CENTER);

    //------buttonBar------
    
        buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
        buttonBar.setLayout(new GridBagLayout());
        ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
        ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

        //---- okButton ----
        okBT.setText("OK");
        okBT.addActionListener(e -> okBTActionPerformed(e));
        buttonBar.add(okBT, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
    
    dialog.add(buttonBar, BorderLayout.SOUTH);

    //---- text----
    text.setFont(text.getFont().deriveFont(text.getFont().getSize() + 3f));
    text.setText("text");
    dialog.add(text, BorderLayout.NORTH);

    contentPane.add(dialog, BorderLayout.CENTER);
	pack();
	setLocationRelativeTo(getOwner());
        
	}
	private void okBTActionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
	
	   @Override
	    public void showMessageDialog() {

	    }

	    @Override
	    public void showMessageDialog(String result, int num) {
	    	text.setText("The misspellings will be in quotes. The number of misspelling: " + num);
	        textArea1.setText(result);
	        this.setVisible(true);
	    }

	    @Override
	    public void showMessageDialog(int letter, int num) {
	    	
	    }
	    
	    
}
