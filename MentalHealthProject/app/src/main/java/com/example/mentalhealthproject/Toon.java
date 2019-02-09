package com.example.mentalhealthproject;

class Property
{
    private String Name;

    private String Description;

    private String Category;

    private String Hours;

    private String Location;

    private String PC;

    private String Phone;

    private String Email;

    private String Website;

    private double x;

    private double y;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setCategory(String Category){
        this.Category = Category;
    }
    public String getCategory(){
        return this.Category;
    }
    public void setHours(String Hours){
        this.Hours = Hours;
    }
    public String getHours(){
        return this.Hours;
    }
    public void setLocation(String Location){
        this.Location = Location;
    }
    public String getLocation(){
        return this.Location;
    }
    public void setPC(String PC){
        this.PC = PC;
    }
    public String getPC(){
        return this.PC;
    }
    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    public String getPhone(){
        return this.Phone;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return this.Email;
    }
    public void setWebsite(String Website){
        this.Website = Website;
    }
    public String getWebsite(){
        return this.Website;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}











public class Toon {
    private String type;

    private Property properties;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setProperties(Property properties){ this.properties = properties; }
    public Property getProperties(){ return this.properties; }
}
