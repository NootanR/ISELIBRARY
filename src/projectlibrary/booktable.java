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
public class booktable {
    private int id;
    private String bookname;
    private String pubname;
    private String authorname;
    private int price;
    
    public booktable(int id,String bookname,String pubname,String authorname,int price){
        this.id=id;
        this.bookname=bookname;
        this.pubname=pubname;
        this.authorname=authorname;
        this.price=price;
    }
    public int getID(){
        return  id;
    }
    public String getBookname(){
    return bookname;
    }
    public String getPubname(){
    return pubname;
    }
    public String getAuthname(){
    return authorname;
    }public int getprice(){
    return price;
    }
    
}
    

