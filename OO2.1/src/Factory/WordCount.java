package Factory;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.*;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class WordCount extends Dialog  {
	
	private JPanel dialog;
    private JPanel textPanel;
    private JLabel text;
    private JLabel text2;
    private JPanel buttonBar;
    private JButton okBT;
    
	public WordCount (String t) {
		create(t);
	}
	
	public void create(String t) {
		
		dialog = new JPanel();
        textPanel = new JPanel();
        text = new JLabel();
        text2 = new JLabel();
        buttonBar = new JPanel();
        okBT = new JButton();
        
        //-------Default-------
        setTitle(t);
        setIconImage(new ImageIcon(getClass().getResource("/note.png")).getImage());
        setMinimumSize(new Dimension(200, 100));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //-------dialog-------
        dialog.setBorder(new EmptyBorder(12, 12, 12, 12));
        dialog.setBorder (new javax. swing. border. CompoundBorder( 
        		new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0, 0, 0, 0) ,
        				"JF\u006frmDes\u0069gner \u0045valua\u0074ion", 
        				javax. swing. border. TitledBorder. CENTER,
        				javax. swing. border. TitledBorder. BOTTOM, 
        				new java .awt .Font ("D\u0069alog" ,java .awt .Font.BOLD ,12 ), java. awt. Color. red) ,dialog. getBorder( )) ); 
        dialog. addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {
        	if ("\u0062order".equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        dialog.setLayout(new BorderLayout());
        
        //-------textPanel-------
        textPanel.setLayout(new BorderLayout());
        
        //-------text------
        text.setText("text");
        text.setFont(text.getFont().deriveFont(text.getFont().getSize() + 5f));
        textPanel.add(text, BorderLayout.NORTH);
        
        //-------text2------
        text2.setText("text");
        text2.setFont(text2.getFont().deriveFont(text2.getFont().getSize() + 5f));
        textPanel.add(text2, BorderLayout.SOUTH);
        
        dialog.add(textPanel, BorderLayout.CENTER);
        
        //------buttonBar -----
        
            buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
            buttonBar.setLayout(new GridBagLayout());
            ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
            ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

            //---- okBT ----
            okBT.setText("OK");
            okBT.addActionListener(e -> okBTActionPerformed(e));
            buttonBar.add(okBT, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        
        dialog.add(buttonBar, BorderLayout.SOUTH);
    
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

	    }

	    @Override
	    public void showMessageDialog(int letter, int num) {
	        text.setText("English Letter:" + letter);
	        text2.setText("Number: " + num);
	        this.setVisible(true);
	    }

}
