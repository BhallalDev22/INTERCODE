/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import static intercode.Loginclass.s;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;

/**
 *
 * @author Bhanu Pratap Singh
 */
public class Datafetcher1 {
    
    void Dataclass () throws IOException{
     
    }
    
    private Connection conn;
       static DataInputStream din;
       static DataOutputStream dout;
       static Socket s;
       String sss=null ;
       public int port=0;
     
       
       public void fetch(String ss) throws IOException{  
  
           try{
       
        s=new Socket("192.168.43.124",port);
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());
        String msgin="";
          
        
        String msgout="";
        msgout=ss;
        dout.writeUTF(ss);
        sss=din.readUTF();
        System.out.println(sss);
 
           }catch(Exception e){}
      
    }
    
public String get(){
     while(true){
           
         if(sss!=null){
              
             return sss;
          
         }
       }
   } 
  
}
