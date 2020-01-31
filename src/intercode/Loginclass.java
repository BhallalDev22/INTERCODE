/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhanu Pratap Singh
 */
public class Loginclass {
     private Connection conn;
       static DataInputStream din;
       static DataOutputStream dout;
       static Socket s;
       String sss = null;
       Thread th;


       public void Login(String ss) throws IOException{  
   
           try{
       // System.out.println("Method called....");
        s=new Socket("192.168.43.124",1202);
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());
        String msgin="";
              
        
        String msgout="";
        msgout=ss;
        dout.writeUTF(ss);
     
                sss=din.readUTF();
               
    
        
                 }catch(Exception e){}
      
    }
     
 public String Get(){
    
     while(true){
         
         if(sss!=null){
     return sss;
        
         }
       
 }   
       
}}
