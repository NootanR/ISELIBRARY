/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;

/**
 *
 * @author rnootan
 */
public class Studenttable {
   private String usn;
   private String name;
   private String phonenumber;
   private String emailid;
   public Studenttable(String usn,String name,String phonenumber,String emailid){
   this.usn=usn;
   this.name=name;
   this.phonenumber = phonenumber;
    this.emailid=emailid;
   }
   public String  getUsn(){
   return usn;   
   }
   public String  getName(){
   return name;   
   }
   public String  getPhonenumber(){
   return phonenumber;   
   }
   public String getemailid(){
       return emailid;
   }
    
}
