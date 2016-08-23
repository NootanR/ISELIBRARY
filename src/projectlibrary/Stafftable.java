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
public class Stafftable {
   private String id;
   private String name;
   private String phonenumber;
   private String emailid;
   public Stafftable(String id,String name,String phonenumber,String emailid){
   this.id=id;
   this.name=name;
   this.phonenumber = phonenumber;
    this.emailid=emailid;
   }
   public String  getId(){
   return id;   
   }
   public String  getName(){
   return name;   
   }
   public String  getPhonenumber(){
   return phonenumber;   
   }
   public String getEmailid(){
       return emailid;
   }
    
}
