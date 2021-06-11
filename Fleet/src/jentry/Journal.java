/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentry;

/**
 *
 * @author mp18000797
 */
public class Journal {
   public String id;
    public String date;
    public String title;
    public String contents;
    
    public Journal()
    {
        this.id="";
        this.title="";
        this.date="";
        this.contents="";
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
    public Journal(String id, String date, String title, String contents)
    {
        this.id = id;
        this.date = date;
        this.title = title;
        this.contents = contents;
    }
    
    
    
    
}
