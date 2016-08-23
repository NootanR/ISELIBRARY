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
public class Returntable {
    private String usn;
    private int isbn;
    private String  issuedt;
    private String  returndt;
     public Returntable(String usn,
    int isbn,
     String  issuedt,
    String  returndt){
        this.usn=usn;
        this.isbn=isbn;
        this.issuedt=issuedt;
        this.returndt=returndt;
    }
    public String getUsn(){
        return  usn;
    }
    public int getIsbn(){
    return isbn;
    }
    public String getIssuedt(){
    return issuedt;
    }
    public String getReturndt(){
    return returndt;
    }
}
