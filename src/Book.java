public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public Author getAuthor(){
        return author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return("'"+this.name + "'"+" by " + this.author.toString());
    }
}
