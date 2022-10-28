package Form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import AbstractFactory.*;
import Bridge.Abstraction;
import Bridge.ColorConcreteImp;
import Bridge.FontConcreteImp;
import Bridge.GuiAbstraction;
import ChainOfResponsibility.exitHandler;
import ChainOfResponsibility.fileHandler;
import ChainOfResponsibility.openHandler;
import ChainOfResponsibility.saveHandler;
import ChainOfResponsibility.unsaveHandler;
import Factory.DialogFactory;
import Factory.MessageDialog;
import Factory.WCSCFactory;
import IteratorCounter.ConcreteList;
import IteratorCounter.CounterList;
import IteratorCounter.Iterator;
import Observer.ConcreteObserver;
import Observer.ConcreteSubject;
import Strategy.*;
import Visitor.CheckList;
import Visitor.ConcreteCheckList;
import Visitor.Dict;
import Visitor.DictionaryObjectStruct;
import Visitor.spellingChecker;
import Command.*;
import Decorator.*;
import Decorator.General;
import Template.*;

public class GUIfacade extends JFrame{
	Menu menu;
	JTextArea textArea1;
	EditorFactory factory = new defaultFactory(); 
	EditorFactory factory2 =new specialFactory();
	private MenuItem selectAllMenuItem;
	private MenuItem cleanUpMenuItem;
	private MenuItem newMenuItem;
	private MenuItem openMenuItem ;
	private MenuItem saveMenuItem;
    private MenuItem exitMenuItem;
    private MenuItem arialMenuItem;
    private MenuItem impactMenuItem;
    private MenuItem caveatMenuItem;
    private MenuItem blackMenuItem;
    private MenuItem redMenuItem;
    private MenuItem choiceFontColor;
    private MenuItem colorBG;
    private MenuItem wordCountMenuItem;
    private MenuItem spellCheckMenuItem;
    private MenuItem nightmode;
    private MenuItem lightmode;
    private MenuItem FontStyle_IB;
    private MenuItem unFontStyle;
    private DialogFactory dialogfactory = new WCSCFactory();   
	static public JTextArea textArea;
    private JScrollPane scrollPane1;
    private MenuBar menuBar;  							
    private Menu fileMenu;     
    private Menu editMenu;   
    private Menu fontMenu;    
    private Menu colorMenu;   
    private Menu modeMenu;   
    private Menu toolMenu;  
    public JLabel stateBar = new JLabel("請輸入文字");
    static ConcreteSubject s1=new ConcreteSubject();
    static ConcreteObserver o1=new ConcreteObserver();
    public String state="yes";
    public Menu FontStyleMenu;
    public Menu SaveStyleMenu;
    public MenuItem stylea,styleb,stylec; 
    //Decorator   
    public Componet c;
	private MenuItem font1;
	private MenuItem font2;
	private MenuItem font3;	
	private MenuItem bold;
	private MenuItem italic;
	public fileHandler open=new unsaveHandler(new saveHandler(new openHandler(null)));
	public fileHandler exit=new unsaveHandler(new saveHandler(new exitHandler(null)));
	openFile openf ;
	exitApplication exitf;
	italicFont itf;
	boldFont bof;
    
    
    GUIfacade(){
    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
    }    
    
    public void initComponents() {

    	factory = new defaultFactory(); 
        menuBar = factory.createJMenuBar();       
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        openf =new openFile(this,open,state);
        exitf =new exitApplication(this,exit,state);

        //======== this ========
        setTitle("OOTextEditor");
        setIconImage(new ImageIcon(getClass().getResource("/ico.png")).getImage());
        setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        setResizable(false);
        var contentPane = getContentPane();
       
        //======== menuBar ========
        {

            //======== fileMenu ========
            
            fileMenu = factory.createJMenu(); //new
            fileMenu = setFileMenu(fileMenu); //new
              
            menuBar.add(fileMenu);

            //======== editMenu ========
            
            editMenu = factory.createJMenu();
            editMenu = setEditMenu(editMenu); //new
            
            menuBar.add(editMenu);
            //======== fontStyleMenu ========
            FontStyleMenu = factory.createJMenu();
            FontStyleMenu  = setFontStyleMenu(FontStyleMenu );

            menuBar.add(FontStyleMenu );
            
            //======== fontMenu ========
            
            fontMenu = factory.createJMenu();
            fontMenu = setFontMenu(fontMenu);

            menuBar.add(fontMenu);

            //======== colorMenu ========
            
            colorMenu = factory.createJMenu();
            colorMenu = setColorMenu(colorMenu);
            
            menuBar.add(colorMenu);
            //======== modeMenu ========
            
            modeMenu= factory2.createJMenu();
            modeMenu =setModeMenu(modeMenu);
            
            menuBar.add(modeMenu);

            //======== toolMenu ========
            
            toolMenu = factory2.createJMenu();
            toolMenu = setToolMenu(toolMenu) ; 
            
            menuBar.add(toolMenu);

            // menuBar.add(helpMenu);

            //======== SaveStyleMenu ========
            
            SaveStyleMenu = factory.createJMenu();
            SaveStyleMenu= setStyleMenu(SaveStyleMenu) ; 
            
            menuBar.add(SaveStyleMenu);
        }
        setJMenuBar(menuBar);


        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setRows(20);
            textArea1.setColumns(60);
            textArea1.setFont(textArea1.getFont().deriveFont(textArea1.getFont().getSize() + 8f));
            textArea1.setAutoscrolls(false);
            scrollPane1.setViewportView(textArea1);
        }
        
        contentPane.add(scrollPane1);
        
     // 狀態列
        stateBar.setHorizontalAlignment(SwingConstants.LEFT);//將狀態列置左
        stateBar.setBorder(//設定邊界外觀
       	BorderFactory.createEtchedBorder());
        contentPane.add(stateBar,BorderLayout.SOUTH);//將狀態列將入版面的南方

       s1.add(o1);	//observer
     //observer要加編輯區鍵盤事件
		textArea1.addKeyListener(
			new KeyAdapter(){
			public void keyTyped(KeyEvent e){//當有變化時通知
				processTextArea();
				state="no";
				openf.changeState(state);
				exitf.changeState(state);
			}
		}				
		);	
        
  
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    
    public JTextArea getTextArea() {
    	return this.textArea1;
    }
    
    public ArrayList<Menu> getAllMenu(){
    	
    	ArrayList<Menu> MenuVar = new ArrayList<Menu>();
    	MenuVar.add(fileMenu);
    	MenuVar.add(editMenu);
    	MenuVar.add(fontMenu);
    	MenuVar.add(colorMenu);
    	MenuVar.add(toolMenu);
    	
    	return MenuVar;
    }

    
  public Menu setFileMenu (Menu m ) {
	  menu = m;	  
	  this.textArea1 = getTextArea();
	  menu.setContent("File");
	  
      //---- newMenuItem ----
	  newMenuItem = factory.creatJMenuItem(); 
	  newMenuItem.setContent("New");
	  newMenuItem.setActionListener(new newFile(textArea1));     
      menu.add(newMenuItem);
      
      //---- openMenuItem ----
      openMenuItem = factory.creatJMenuItem();
      openMenuItem .setContent("Open");
      
      openMenuItem .setActionListener(openf);
      menu.add(openMenuItem );
      
      //---- saveMenuItem ----
      saveMenuItem = factory.creatJMenuItem();
      saveMenuItem.setContent("Save");
      saveMenuItem.setActionListener(new saveFile(this));
      menu.add(saveMenuItem);

      //---- exitMenuItem ----
      exitMenuItem = factory.creatJMenuItem();
      exitMenuItem.setContent("Exit");
      exitMenuItem.setActionListener(exitf);
      menu.add(exitMenuItem);
	  
	  return menu;		  
  }
  
  public Menu setEditMenu (Menu m ) {
	  menu = m;
	  menu.setContent("Edit");
	  
	  //---- selectAllMenuItem ----
      selectAllMenuItem = factory.creatJMenuItem();
      selectAllMenuItem.setContent("Select All");
      selectAllMenuItem.setActionListener(new selectAllText(textArea1));
      menu.add(selectAllMenuItem);

      //---- cleanUpMenuItem ----
      cleanUpMenuItem = factory.creatJMenuItem();
      cleanUpMenuItem.setContent("Clean Up");
      cleanUpMenuItem.setActionListener(new cleanUpText(textArea1));
      menu.add(cleanUpMenuItem);     
	  
	  return menu;	
  }
  
  public Menu setFontStyleMenu (Menu m ) {
	  menu = m;
	  menu.setContent("FontStyle");
	  c = new General();	 
	  itf = new italicFont(textArea1 , c, bof);
	  bof = new boldFont(textArea1, c ,itf);
	  itf.bof=bof;
      //---- cleanUpMenuItem ----
      italic = factory.creatJMenuItem();
      italic.setContent("Italic");
      italic.setActionListener(itf);
      menu.add(italic);
           
      //---- BoldItalicMenuItem ----
      bold = factory.creatJMenuItem();
      bold.setContent("Bold");
      bold.setActionListener(bof);
      menu.add(bold);
      
    //---- BoldItalicMenuItem ----
      FontStyle_IB = factory.creatJMenuItem();
      FontStyle_IB.setContent("Bold&Italic");
      FontStyle_IB.setActionListener(new Control(this));
      menu.add(FontStyle_IB);    
	  
	  return menu;	
  }
  
  
  
  
  public Menu setFontMenu (Menu m ) {
	  menu = m;
	  menu.setContent("Font");
	  
	  //---- arialMenuItem ----
      arialMenuItem = factory.creatJMenuItem();
      arialMenuItem.setContent("Arial");
      arialMenuItem.setActionListener(new arialFont(textArea1));
      menu.add(arialMenuItem);

      //---- impactMenuItem ----
      impactMenuItem = factory.creatJMenuItem();
      impactMenuItem.setContent("Impact");              
      impactMenuItem.setActionListener(new impactFont(textArea1));
      menu.add(impactMenuItem);

      //---- caveatMenuItem ----
      caveatMenuItem = factory.creatJMenuItem();
      caveatMenuItem.setContent("Caveat");               
      caveatMenuItem.setActionListener(new caveatFont(textArea1));
      menu.add(caveatMenuItem);
      
      //---- caveatMenuItem ----
      font1 = factory.creatJMenuItem();
      font1.setContent("新細明體");               
      font1.setActionListener(new ChineseFont1(textArea1,c));
      menu.add(font1);
      
      //---- caveatMenuItem ----
      font2 = factory.creatJMenuItem();
      font2.setContent("微軟正黑體");               
      font2.setActionListener(new ChineseFont2(textArea1,c));
      menu.add(font2);
      
      //---- caveatMenuItem ----
      font3 = factory.creatJMenuItem();
      font3.setContent("標楷體");               
      font3.setActionListener(new ChineseFont3(textArea1,c));
      menu.add(font3);
	  
	  return menu;	
  }
  
  public Menu setColorMenu (Menu m ) {
	  menu = m;
	  menu.setContent("FontColor");

      //---- blackMenuItem ----
      blackMenuItem = factory.creatJMenuItem();
      blackMenuItem.setContent("Black");             
      blackMenuItem.setActionListener(new blackFont(textArea1));
      menu.add(blackMenuItem);

      //---- redMenuItem ----
      redMenuItem = factory.creatJMenuItem();
      redMenuItem.setContent("Red");
      redMenuItem.setActionListener(new redFont(textArea1));
      menu.add(redMenuItem);
      //---- choiceFontColor ----
      choiceFontColor = factory.creatJMenuItem();
      choiceFontColor.setContent("FontColorChooser");
      choiceFontColor.setActionListener(new fontColorChooser(this));
      menu.add(choiceFontColor);
      //------colorBG-------
	  colorBG = factory.creatJMenuItem();
      colorBG.setContent("BackGround");
      colorBG.setActionListener(new BGcolorChooser(this));
      menu.add(colorBG);           
      
	  return menu;
  }
  public Menu setModeMenu (Menu m ) {
	  menu = m;
	  menu.setContent("Mode");
	  
	  //---- lightmodeMenuItem ----
      lightmode = factory2.creatJMenuItem();
      lightmode.setContent("BrightMode");
      lightmode.setActionListener(new lightModeAct(this));
      menu.add(lightmode);

      //---- NightModeMenuItem ----
      nightmode = factory2.creatJMenuItem();
      nightmode.setContent("NightMode");
      nightmode.setActionListener(new nightModeAct(this));
      menu.add(nightmode);

	  
	  return menu;	
  }
  
  public Menu setToolMenu (Menu m ) {
	  menu = m;
	  
	  menu.setContent("Tool");

      //---- wordCountMenuItem ----
      wordCountMenuItem = factory2.creatJMenuItem();
      wordCountMenuItem.setContent("Word Count");        
      wordCountMenuItem.setActionListener(new wordCounter(textArea1,dialogfactory));
      menu.add(wordCountMenuItem);

      //---- spellCheckMenuItem ----
      spellCheckMenuItem = factory2.creatJMenuItem();
      spellCheckMenuItem.setText("Spell Check"); 
      spellCheckMenuItem.setActionListener(e -> {
          try {
              spellCheckActionPerformed(e);
          } catch (Exception ex) {
              ex.printStackTrace();
          }
      });
      menu.add(spellCheckMenuItem);
      
	  return menu; 
  }
  
  public Menu setStyleMenu(Menu m){
	  menu = m;
	  menu.setContent("Style");
	  
	  stylea=factory.creatJMenuItem();
	  stylea.setText("Style_a");
	  stylea.setFont(new Font("標楷體",Font.PLAIN, 20));
	  stylea.setForeground(new Color(128,42,42));
	  stylea.addActionListener(new StyleA(textArea1));
	  
	  styleb=factory.creatJMenuItem();
	  styleb.setText("Style_b");
	  styleb.setFont(new Font("Times New Roman",Font.ITALIC, 20));
	  styleb.setForeground(new Color(178,34,34));
	  styleb.addActionListener(new StyleB(textArea1));
	  
	  stylec=factory.creatJMenuItem();
	  stylec.setText("Style_c");
	  stylec.setFont(new Font("宋體",Font.BOLD+Font.ITALIC, 36));
	  stylec.setForeground(new Color(25,25,112));
	  stylec.addActionListener(new StyleC(textArea1));
	  
	  menu.add(stylea);
	  menu.add(styleb);
	  menu.add(stylec);
	  return menu;
  }
  
  
  //---------GetAllMenu----------- 
  public ArrayList<MenuItem> getAllMenuItems(){
	  ArrayList<MenuItem> MenuItemVar = new  ArrayList<MenuItem>();
		MenuItemVar.add(selectAllMenuItem);
		MenuItemVar.add(cleanUpMenuItem);
		MenuItemVar.add(newMenuItem);  
		MenuItemVar.add(openMenuItem );  
		MenuItemVar.add(saveMenuItem);  
		MenuItemVar.add(exitMenuItem);  
		MenuItemVar.add(arialMenuItem);  
		MenuItemVar.add(impactMenuItem);  
		MenuItemVar.add(caveatMenuItem);
		MenuItemVar.add(blackMenuItem);  
		MenuItemVar.add(redMenuItem);  
		MenuItemVar.add(choiceFontColor);  
		MenuItemVar.add(colorBG);  
		MenuItemVar.add(wordCountMenuItem);
		MenuItemVar.add(spellCheckMenuItem);  
		MenuItemVar.add(lightmode);
		MenuItemVar.add(nightmode);
		MenuItemVar.add(FontStyle_IB);
		
	return MenuItemVar;
	
	
  }
  
  
  //---------ActionPerformed----------- 


   private void spellCheckActionPerformed(ActionEvent e) throws Exception {
       // TODO add your code here
       CheckList checkList = new ConcreteCheckList(textArea1.getText());
       Visitor.Iterator iterator = checkList.getIterator();
       String afterSpellCheck = "";//
       int misspellingCount = 0;
       List<Dict> list = DictionaryObjectStruct.getList();

       while (iterator.hasNext()) {
           String val = iterator.next();

           for (Visitor.Dict data : list) {
               boolean sendWord = data.accept(new spellingChecker(val));
               if (sendWord) {
                   afterSpellCheck = afterSpellCheck + val + " ";
               } else {
                   if ((!data.accept(new spellingChecker(val))) && (val.length() < 1)) { //
                       afterSpellCheck = afterSpellCheck + val + " ";
                   } else if (val.matches("^[0-9]*$")) {//
                       afterSpellCheck = afterSpellCheck + val + " ";
                   } else {
                       System.out.println(val + " false");
                       afterSpellCheck = afterSpellCheck + " [" + val + "] ";
                       misspellingCount++;
                   }
               }
           }
       }
       
       /* origin
       Creator factoryMethod = new CreateSpellCheckResult();
       MessageDialog messageDialog = factoryMethod.factoryMethod();
       */
       
       //new
       MessageDialog sc = dialogfactory .createDialog("Spell Cheeck","test");
       sc.showMessageDialog(afterSpellCheck, misspellingCount);

   }
   public void processTextArea(){//當有變化時通知這裡//算字數
		s1.notifying(textArea1,stateBar);
	}
   public void closeDialog(){
	   
   }   
}
