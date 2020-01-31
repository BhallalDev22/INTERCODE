/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;
import java.awt.*;   
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.Thread.sleep;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;
import org.fife.ui.autocomplete.*;
/**
 *
 * @author Bhanu Pratap Singh
 */
public class Interviewer_working_Area extends javax.swing.JFrame {
 static Path ppp = new Path();
    static boolean state = true;
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static String  msgin1="";
    public static int port1,port2,port3;
    static String msgin2="",msgin3="",t1,t2,mail;
static RSyntaxTextArea textArea = new RSyntaxTextArea(25, 80);
static DataOutputStream d,d2,d3,d4;
static DataInputStream din,din2,din3,din4;
 
static String path = ppp.p ;

   
 String ssss5;
 public static String mail1;
  
   public static String filepath,port,t3,pp;
//static int port4 = Integer.getInteger(port);
 
/**
     * Creates new form Interviewer_working_Area
     * @param ss
     */
//public  Interviewer_working_Area(String ss){}
    

    public Interviewer_working_Area() {
         
         fontdialog=new FontSelect(this);
      JPanel cp = new JPanel(new BorderLayout());
      textArea.setCodeFoldingEnabled(true);
      RTextScrollPane sp = new RTextScrollPane(textArea);
      cp.add(sp);
        System.out.println("2");
      setContentPane(cp);
      setTitle("Text Editor ");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setLocationRelativeTo(null);
       initComponents();
       
       CompletionProvider provider = createCompletionProvider();

      AutoCompletion ac = new AutoCompletion(provider);
      ac.install(textArea);
     
        
 
    }
    
    private CompletionProvider createCompletionProvider() {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider. This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();

      // Add completions for all Java keywords. A BasicCompletion is just
      // a straightforward word completion.
      provider.addCompletion(new BasicCompletion(provider, "abstract"));
      provider.addCompletion(new BasicCompletion(provider, "assert"));
      provider.addCompletion(new BasicCompletion(provider, "boolean"));
      provider.addCompletion(new BasicCompletion(provider, "byte"));
      provider.addCompletion(new BasicCompletion(provider, "case"));
      provider.addCompletion(new BasicCompletion(provider, "catch"));
      provider.addCompletion(new BasicCompletion(provider, "char"));
      provider.addCompletion(new BasicCompletion(provider, "class"));
      provider.addCompletion(new BasicCompletion(provider, "continue"));
      provider.addCompletion(new BasicCompletion(provider, "default"));
      provider.addCompletion(new BasicCompletion(provider, "do"));
      provider.addCompletion(new BasicCompletion(provider, "double"));
      provider.addCompletion(new BasicCompletion(provider, "else"));
      provider.addCompletion(new BasicCompletion(provider, "enum"));
      provider.addCompletion(new BasicCompletion(provider, "extends"));
      provider.addCompletion(new BasicCompletion(provider, "final"));
      provider.addCompletion(new BasicCompletion(provider, "finally"));
      provider.addCompletion(new BasicCompletion(provider, "float"));
      provider.addCompletion(new BasicCompletion(provider, "for"));
      provider.addCompletion(new BasicCompletion(provider, "if"));
      provider.addCompletion(new BasicCompletion(provider, "implements"));
      provider.addCompletion(new BasicCompletion(provider, "import"));
      provider.addCompletion(new BasicCompletion(provider, "instanceof"));
      provider.addCompletion(new BasicCompletion(provider, "int"));
      provider.addCompletion(new BasicCompletion(provider, "interface"));
      provider.addCompletion(new BasicCompletion(provider, "long"));
      provider.addCompletion(new BasicCompletion(provider, "native"));
      provider.addCompletion(new BasicCompletion(provider, "new"));
      provider.addCompletion(new BasicCompletion(provider, "null"));
      provider.addCompletion(new BasicCompletion(provider, "package"));
      provider.addCompletion(new BasicCompletion(provider, "private"));
      provider.addCompletion(new BasicCompletion(provider, "protected"));
      provider.addCompletion(new BasicCompletion(provider, "public"));
      provider.addCompletion(new BasicCompletion(provider, "return"));
      provider.addCompletion(new BasicCompletion(provider, "short"));
      provider.addCompletion(new BasicCompletion(provider, "static"));
      provider.addCompletion(new BasicCompletion(provider, "strictfp"));
      provider.addCompletion(new BasicCompletion(provider, "super"));
      provider.addCompletion(new BasicCompletion(provider, "switch"));
      provider.addCompletion(new BasicCompletion(provider, "synchronized"));
      provider.addCompletion(new BasicCompletion(provider, "this"));
      provider.addCompletion(new BasicCompletion(provider, "throw"));
      provider.addCompletion(new BasicCompletion(provider, "throws"));
      provider.addCompletion(new BasicCompletion(provider, "transient"));
      provider.addCompletion(new BasicCompletion(provider, "try"));
      provider.addCompletion(new BasicCompletion(provider, "void"));
      provider.addCompletion(new BasicCompletion(provider, "volatile"));
      provider.addCompletion(new BasicCompletion(provider, "while"));
      
      
     provider.addCompletion(new BasicCompletion(provider, "asm"));
      provider.addCompletion(new BasicCompletion(provider, "auto"));
      provider.addCompletion(new BasicCompletion(provider, "bool"));
      provider.addCompletion(new BasicCompletion(provider, "break"));
      provider.addCompletion(new BasicCompletion(provider, "const"));
      provider.addCompletion(new BasicCompletion(provider, "const cast"));
      provider.addCompletion(new BasicCompletion(provider, "delete"));
      provider.addCompletion(new BasicCompletion(provider, "dynamic cast"));
      provider.addCompletion(new BasicCompletion(provider, "explicit"));
      provider.addCompletion(new BasicCompletion(provider, "export"));
      provider.addCompletion(new BasicCompletion(provider, "extern"));
      provider.addCompletion(new BasicCompletion(provider, "false"));
      provider.addCompletion(new BasicCompletion(provider, "for"));
      provider.addCompletion(new BasicCompletion(provider, "friend"));
      provider.addCompletion(new BasicCompletion(provider, "goto"));
      provider.addCompletion(new BasicCompletion(provider, "include"));
      provider.addCompletion(new BasicCompletion(provider, "inline"));
      provider.addCompletion(new BasicCompletion(provider, "mutable"));
      provider.addCompletion(new BasicCompletion(provider, "namespace"));
      provider.addCompletion(new BasicCompletion(provider, "operator"));
      provider.addCompletion(new BasicCompletion(provider, "register"));
      provider.addCompletion(new BasicCompletion(provider, "reinterpret cast"));
      provider.addCompletion(new BasicCompletion(provider, "sizeof"));
      provider.addCompletion(new BasicCompletion(provider, "static cast"));
      provider.addCompletion(new BasicCompletion(provider, "struct"));
      provider.addCompletion(new BasicCompletion(provider, "switch"));
      provider.addCompletion(new BasicCompletion(provider, "template"));
      provider.addCompletion(new BasicCompletion(provider, "true"));
      provider.addCompletion(new BasicCompletion(provider, "typedef"));
      provider.addCompletion(new BasicCompletion(provider, "typeid"));
      provider.addCompletion(new BasicCompletion(provider, "typename"));
      provider.addCompletion(new BasicCompletion(provider, "union"));
      provider.addCompletion(new BasicCompletion(provider, "unsigned"));
      provider.addCompletion(new BasicCompletion(provider, "using"));
      provider.addCompletion(new BasicCompletion(provider, "virtual"));
      provider.addCompletion(new BasicCompletion(provider, "warchar t"));
      
      
      provider.addCompletion(new BasicCompletion(provider, "False"));////////
      provider.addCompletion(new BasicCompletion(provider, "is"));
     
      provider.addCompletion(new BasicCompletion(provider, "None"));
      provider.addCompletion(new BasicCompletion(provider, "lambda"));
      provider.addCompletion(new BasicCompletion(provider, "True"));
      provider.addCompletion(new BasicCompletion(provider, "def"));
      provider.addCompletion(new BasicCompletion(provider, "from"));
      provider.addCompletion(new BasicCompletion(provider, "nonlocal"));
      provider.addCompletion(new BasicCompletion(provider, "and"));
      provider.addCompletion(new BasicCompletion(provider, "del"));
      provider.addCompletion(new BasicCompletion(provider, "global"));
      provider.addCompletion(new BasicCompletion(provider, "not"));
      provider.addCompletion(new BasicCompletion(provider, "with"));
      provider.addCompletion(new BasicCompletion(provider, "as"));
      provider.addCompletion(new BasicCompletion(provider, "elif"));
      provider.addCompletion(new BasicCompletion(provider, "pass"));
      provider.addCompletion(new BasicCompletion(provider, "except"));
      provider.addCompletion(new BasicCompletion(provider, "in"));
      provider.addCompletion(new BasicCompletion(provider, "raise"));
     
      
     
      // Add a couple of "shorthand" completions. These completions don't
      // require the input text to be the same thing as the replacement text.
      provider.addCompletion(new ShorthandCompletion(provider, "sysout",
            "System.out.println(", "System.out.println("));
      provider.addCompletion(new ShorthandCompletion(provider, "syserr",
            "System.err.println(", "System.err.println("));

      return provider;

   }

     private static final String JAVA_FILE_LOCATION1 = "C:\\Users\\Bhanu Pratap Singh\\Desktop\\mainproj\\Intercode\\BHANU.c";    
     private static final String JAVA_FILE_LOCATION2 = "C:\\Users\\Bhanu Pratap Singh\\Desktop\\mainproj\\Intercode\\BHANU.java";
      private static final String JAVA_FILE_LOCATION3 = "C:\\Users\\Bhanu Pratap Singh\\Desktop\\mainproj\\Intercode\\BHANU.cpp";
       private static final String JAVA_FILE_LOCATION4 ="C:\\Users\\Bhanu Pratap Singh\\Desktop\\mainproj\\Intercode\\PYTHONPROGRAM.py";
 public String ssss;



    static void get(){
     try {
            d.writeUTF(textArea.getText());
        } catch (IOException ex) {
            Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
        }
      
}public static void set(String s){
    t2 = s;
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        que = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lang = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mess = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        sendtxt = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        hour = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        que.setColumns(20);
        que.setRows(5);
        que.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                queCaretUpdate(evt);
            }
        });
        que.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                queKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(que);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(660, 80, 520, 360);

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 490, 610, 180);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel1.setText("     Output");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 460, 207, 27);

        input.setColumns(20);
        input.setRows(5);
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(input);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(660, 540, 520, 130);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel2.setText("Custom Input");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(660, 510, 239, 21);

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 460, 130, 40);

        jButton3.setText("Send Question");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(840, 460, 160, 40);

        jButton2.setText("Close Interview");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1050, 460, 130, 40);

        lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Java", "C", "C++", "Python" }));
        lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langActionPerformed(evt);
            }
        });
        jPanel1.add(lang);
        lang.setBounds(380, 442, 240, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(1200, 80, 10, 600);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Chat Area");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1310, 120, 120, 30);

        mess.setEditable(false);
        mess.setColumns(20);
        mess.setRows(5);
        jScrollPane5.setViewportView(mess);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(1220, 160, 310, 320);

        sendtxt.setColumns(20);
        sendtxt.setRows(5);
        jScrollPane6.setViewportView(sendtxt);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(1220, 520, 310, 100);

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1320, 630, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Type Message here");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1280, 490, 190, 30);

        jButton5.setText("Clear Output Screen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(400, 670, 220, 25);

        jPanel2.setLayout(null);

        hour.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hour.setText("0");
        jPanel2.add(hour);
        hour.setBounds(40, 0, 50, 70);

        minute.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minute.setText("0");
        jPanel2.add(minute);
        minute.setBounds(140, 0, 70, 70);

        second.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        second.setText("0");
        jPanel2.add(second);
        second.setBounds(250, 0, 70, 70);

        millisecond.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        millisecond.setText("0");
        jPanel2.add(millisecond);
        millisecond.setBounds(370, 0, 100, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText(":");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(310, 0, 41, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText(":");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(90, 0, 41, 70);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText(":");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(190, 0, 41, 70);

        jButton6.setText("Start");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(460, 0, 80, 70);

        jButton7.setText("Stop");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(540, 0, 90, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(880, 0, 630, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/int1561x725.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1550, 700);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 699));

        jMenu4.setText("Edit");

        jMenuItem1.setText("Find");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Replace");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem4.setText("FindAll");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Font");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a = lang.getSelectedItem().toString();
     if(a.equalsIgnoreCase("C")){
                       try {
          String filename = "BHANU.c";
        FileWriter fileWriter=new FileWriter(filename);
        fileWriter.write(textArea.getText());
        setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"gcc",JAVA_FILE_LOCATION1};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

Process process = null;
    try {
        process = processBuilder.start();
        OutputStream out = process.getOutputStream();
        out.write(input.getText().getBytes());
        out.close();
/**
         * Check if any errors or compilation errors encounter then print on Console.
         */
    } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
        }   } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }
/**
* Check if javac process execute successfully or Not
* 0 - successful
*/

if( process.exitValue() == 0 ){
           try {
               process = new ProcessBuilder(new String[]{"a"}).start();
           } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               /** Check if RuntimeException or Errors encounter during execution then print errors on console
                * Otherwise print Output
                */
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
    else if(a.equalsIgnoreCase("Java")){
        try {
          String filename = "BHANU.java";
        FileWriter fileWriter=new FileWriter(filename);
        fileWriter.write(textArea.getText());
        setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"javac",JAVA_FILE_LOCATION2};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

Process process = null;
    try {
        process = processBuilder.start();
        OutputStream out = process.getOutputStream();
        out.write(input.getText().getBytes());
        out.close();
/**
         * Check if any errors or compilation errors encounter then print on Console.
         */
    } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
        }   } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }
/**
* Check if javac process execute successfully or Not
* 0 - successful
*/
if( process.exitValue() == 0 ){
           try {
               process = new ProcessBuilder(new String[]{"java","-cp","C:\\Users\\Bhanu Pratap Singh\\Desktop\\mainproj\\Intercode","Intercode"}).start();
           } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               /** Check if RuntimeException or Errors encounter during execution then print errors on console
                * Otherwise print Output
                */
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }

}
 
    }
    else if(a.equalsIgnoreCase("C++")){
              try {
          String filename = "BHANU.cpp";
        FileWriter fileWriter=new FileWriter(filename);
        fileWriter.write(textArea.getText());
        setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"g++",JAVA_FILE_LOCATION3};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

Process process = null;
    try {
        process = processBuilder.start();
        OutputStream out = process.getOutputStream();
        out.write(input.getText().getBytes());
        out.close();
/**
         * Check if any errors or compilation errors encounter then print on Console.
         */
    } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
        }   } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }
/**
* Check if javac process execute successfully or Not
* 0 - successful
*/
if( process.exitValue() == 0 ){
           try {
               process = new ProcessBuilder(new String[]{"a"}).start();
           } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               /** Check if RuntimeException or Errors encounter during execution then print errors on console
                * Otherwise print Output
                */
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
    else if(a.equalsIgnoreCase("Python")){
          try {
          String filename = "PYTHONPROGRAM.py";
        FileWriter fileWriter=new FileWriter(filename);
        fileWriter.write(textArea.getText());
        setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"python",JAVA_FILE_LOCATION4};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

Process process = null;
    try {
        process = processBuilder.start();
        OutputStream out = process.getOutputStream();
        out.write(input.getText().getBytes());
        out.close();
/**
         * Check if any errors or compilation errors encounter then print on Console.
         */
    } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
        }   } catch (IOException ex) {
        Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
    }
/**
* Check if javac process execute successfully or Not
* 0 - successful
*/
if( process.exitValue() == 0 ){
    //process = new ProcessBuilder(new String[]{"a"}).start();
    System.out.println("run successfully");
           try {
               /** Check if RuntimeException or Errors encounter during execution then print errors on console
                * Otherwise print Output
                */
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Interviewee_working_area.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    
        try {
            
           d4.writeUTF(que.getText());
           
           // TODO add your handling code here:
       } catch (IOException ex) {
           Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited


        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langActionPerformed
String s = lang.getSelectedItem().toString();
if(s.equalsIgnoreCase("C")){
     textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
}
else if(s.equalsIgnoreCase("Java")){
     textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
}
else if(s.equalsIgnoreCase("C++")){
     textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);
}
else if(s.equalsIgnoreCase("Python")){
     textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_langActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
state=false;
Final_submit s = new Final_submit();
s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        try {
            String msgout="",ssss;
            ssss=mess.getText();
            msgout=sendtxt.getText();
            d2.writeUTF(msgout);
            mess.setText(ssss+"\nYou:"+msgout);
             sendtxt.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKeyPressed

    private void queCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_queCaretUpdate

System.out.println("sdsdsdds");
        // TODO add your handling code here:
    }//GEN-LAST:event_queCaretUpdate

    private void queKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_queKeyReleased
      System.out.println("sdsdsdds");  // TODO add your handling code here:
    }//GEN-LAST:event_queKeyReleased

    private void inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyTyped
    // TODO add your handling code here:
    }//GEN-LAST:event_inputKeyTyped

    private void inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyReleased
       try {
           //for input area
           d3.writeUTF(input.getText());
       } catch (IOException ex) {
           Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_inputKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
find(0,true,false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 replace();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  String txt=JOptionPane.showInputDialog("Find");
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(null,"Enter valid string");
            return;
        }
        highlight(textArea,txt);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
output.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
callFontSelectDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    t.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
state = false;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
   private void find(int startIndex,boolean newWord,boolean caseSensitive) {
        if (newWord)
            findText=JOptionPane.showInputDialog("Find");
        if (findText!=null&&findText.equals("")) {
            JOptionPane.showMessageDialog(null,"Enter something to Find");
            return;
        }
        String find=findText;
        String data=textArea.getText();
        if (!caseSensitive) {
            find=find.toLowerCase();
            data=data.toLowerCase();
        }
        int len=data.length();
        start=startIndex;
        end=start;
        for (int i=start;i<len;i++) {
            char c=data.charAt(i);
            if (c==find.charAt(0)) {
                start=i;
                boolean flag=true;
                for (int j=0;j<find.length();j++,i++) {
                    if (i>=len||data.charAt(i)!=find.charAt(j)) {
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    end=i;
                    break;
                }
            }
        }
        if (start>=end) {
            if (startIndex!=0) {
                find(0,false,caseSensitive);
            }
            else {
                JOptionPane.showMessageDialog(null,findText+" Not Found");
                start=textArea.getCaretPosition();
                end=start;
            }
        }
        textArea.select(start, end);
    }
       public void replace()
       {
           findText=JOptionPane.showInputDialog("Find");
            replaceText=JOptionPane.showInputDialog("Replace");
             String d=textArea.getText();
             d=d.replaceAll(findText, replaceText);
             textArea.setText(d);
       }
        class FixedStack<T> extends Stack<T> {
    private final int maxSize;
    public FixedStack(int size) {
        super();
        this.maxSize=size;
    }
    @Override
    public T push(T object) {
        while (this.size()>=maxSize) {
            this.remove(0);
        }
        return super.push(object);
    }
}
    
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
        System.out.println("main method called");
      
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interviewer_working_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interviewer_working_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interviewer_working_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interviewer_working_Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                new Interviewer_working_Area().setVisible(true);
            }
        });
 
         
         
   
    
    
    
   
    
    
    
    } 
    class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {
        public MyHighlightPainter(Color color) {
            super(color);
        }
    }
      Highlighter.HighlightPainter myHighlightPainter =  new MyHighlightPainter(Color.red);
      public void highlight(JTextComponent textComp,String pattern) {
        removeHighlight(textComp);
        try {
            Highlighter hilite = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text=doc.getText(0,doc.getLength());
            int pos=0;
            while ((pos=text.toUpperCase().indexOf(pattern.toUpperCase(),pos))>=0) {
                hilite.addHighlight(pos,pos+pattern.length(),myHighlightPainter);
                pos+=pattern.length();
            } 
        } catch (Exception e) {
            
        }
    }
       public void removeHighlight(JTextComponent textComp) {
        Highlighter hilite = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = hilite.getHighlights();
        for (int i=0;i<hilites.length;i++) {
            if (hilites[i].getPainter() instanceof MyHighlightPainter) {
                hilite.removeHighlight(hilites[i]);
            }
        }
    }
    int start,end;
public String findText;
public String replaceText;
 private FixedStack<String> prev;
  
 public void start() throws IOException{
      ServerSocket ss = new ServerSocket(2000);
                System.out.println("server socket1 waiting...");
     Socket s = ss.accept();
     System.out.println("connection1 establish..");
            Thread th6 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
    
                System.out.println("thread1 start");
    d= new DataOutputStream(s.getOutputStream());
   
    din = new DataInputStream(s.getInputStream());
                
                System.out.println("waiting for rtext....");
                while(true){
                msgin1 = din.readUTF();
                 textArea.setText(msgin1);}
            } catch (IOException ex) {
                Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
    }); 
         th6.start();  
        
 
      
    
   
    
      ServerSocket ss2 = new ServerSocket(3000);
       Socket s2 = ss2.accept();
       System.out.println("socket2 working...");
        d2 = new DataOutputStream(s2.getOutputStream());
         din2 = new DataInputStream(s2.getInputStream());
        //Thread
          Thread th7 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while(true)
                { 
                    
                    String s2;
                s2=mess.getText();
                    msgin2=din2.readUTF();
                    if(msgin2.equalsIgnoreCase("asdfghj")){
                        JOptionPane.showMessageDialog(null, "Interviewee has submitted the problem.");
                    }
                    else {
                    mess.setText(s2+"\nInterviewee:"+msgin2);}
                     
                }
             
            } catch (IOException ex) {
                Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
    });
    th7.start(); 
     try{ ServerSocket ss3 = new ServerSocket(4000);
       Socket s3 = ss3.accept();
         System.out.println("socket 3 working");
        d3 = new DataOutputStream(s3.getOutputStream());
         din3 = new DataInputStream(s3.getInputStream());
     mail1 = din3.readUTF();
         System.out.println("mail recieved");
      // Final_submit.mail2 = Interviewer_working_Area.mail1;
     }catch(IOException e){
         e.printStackTrace();
     }
     
          ServerSocket ss4 = new ServerSocket(5000);
       Socket s4 = ss4.accept();
         System.out.println("socket4 working..");
         Thread th10 = new Thread(new Runnable() {
              @Override
              public void run() {
                  try {
                      d4 = new DataOutputStream(s4.getOutputStream());
                  } catch (IOException ex) {
                      Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  try {
                      din4 = new DataInputStream(s4.getInputStream());
                  } catch (IOException ex) {
                      Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
                  }
         
         while(true)
         {
                      try {
                          String msgin4=din4.readUTF();
                      } catch (IOException ex) {
                          Logger.getLogger(Interviewer_working_Area.class.getName()).log(Level.SEVERE, null, ex);
                      }
         }
    
              }
          });
         th10.start();
         
   KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher(){
           @Override
           public boolean dispatchKeyEvent(KeyEvent e) {
            
               get();
               return false;
            }
            });
 }

 private void callFontSelectDialog() {
        fontdialog.setVisible(true);
    }  private final FontSelect fontdialog;


        
         public Color textColor;
public void setTextFont(Font font) {
        textArea.setFont(font);
        textArea.setForeground(textColor);
    }
 static  Thread t = new Thread()
        {
          public void run()
          {
              for(;;)
              {
                  if(state==true)
                  {
                      try
                      {
                          sleep(1);
                          
                          if(milliseconds>1000)
                          {
                              milliseconds=0;
                              seconds++;
                          }
                          if(seconds>60)
                          {
                              milliseconds=0;
                              seconds=0;
                              minutes++;
                          }
                          if(minutes>60)
                          {
                              milliseconds=0;
                              seconds=0;
                              minutes=0;
                              hours++;
                          }
                          
                          millisecond.setText(""+milliseconds);
                          milliseconds++;
                          second.setText(""+seconds);
                          minute.setText(""+minutes);
                          hour.setText(""+hours);
                          
                          
                      }
                      catch(Exception e)
                      {
                          
                      }
                  }
                  else
                  {
                      break;
                  }
              }
          }
        };


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel hour;
    private static javax.swing.JTextArea input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> lang;
    private static javax.swing.JTextArea mess;
    private static javax.swing.JLabel millisecond;
    private static javax.swing.JLabel minute;
    private javax.swing.JTextArea output;
    private javax.swing.JTextArea que;
    private static javax.swing.JLabel second;
    private javax.swing.JTextArea sendtxt;
    // End of variables declaration//GEN-END:variables

 private void print(String status,InputStream input) throws IOException{
BufferedReader in = new BufferedReader(new InputStreamReader(input));
System.out.println("************* "+status+"***********************");
//TF.setText("************* "+status+"***********************");
String line = "",k,g;
do{k=output.getText();

 System.out.println(line);

output.setText(k+"\n"+line);
}while((line = in.readLine()) != null );
in.close();
}

}
