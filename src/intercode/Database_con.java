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

/**
 *
 * @author Bhanu Pratap Singh
 */
public class Database_con {
       private Connection conn;
       static DataInputStream din;
       static DataOutputStream dout;
       static Socket s;

    public Database_con() throws IOException {
        
    }
    
       
       
       public void register(String ss) throws IOException{  
   
           try{
        
       s=new Socket("192.168.43.124",1201);
        dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF(ss);
        
        
        

        
                 }catch(Exception e){}
    }}