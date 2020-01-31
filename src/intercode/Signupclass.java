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
public class Signupclass {
       private Connection conn;
       static DataInputStream din;
       static DataOutputStream dout;
       static Socket s;
       String sss;
    public Signupclass() throws IOException {
        
    }
    
       
       
       public void register(String ss) throws IOException{  
   
           try{
        
       s=new Socket("192.168.43.124",1201);
       // s=new Socket("172.29.33.54",1201);
        dout=new DataOutputStream(s.getOutputStream());
        din = new DataInputStream(s.getInputStream());
        dout.writeUTF(ss);
       System.out.println("Messge sent");
        sss = din.readUTF();
        System.out.println("Message recieved\n"+sss);

        
                 }catch(Exception e){}
    }

public String get(){System.out.println("Method called..");
while(true){
    if(sss.equalsIgnoreCase("abc")){
        System.out.println("returned abc");
        return "abc";
    }
     if(sss.equalsIgnoreCase("def")){  System.out.println("returned aaa");
        return "aaa";
    }
}
}

}