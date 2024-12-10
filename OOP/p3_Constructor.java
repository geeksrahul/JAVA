package OOP;

/*  
    constructor :   it is used to initialise property of object during instantiation
                    it is function that invoke automatically whenever object created
                    it have same name as class name
                    it must have public access modifier
                    it cannot return value, so it dosen't have return type
                    constructor overloading is possible
*/
class Book {
    private int id;
    private String title;
    // default constructor
    public Book() {
        id = 1;
        title = "i don't love you anymore";
    }
    // parameterised constructor
    public Book(int id,String title) {
        this.id = id;
        this.title = title;
    }
    // copy constructor
    public Book(Book b) {
        this.id = b.id;
        this.title = b.title;
    }
    // getter & setter 
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
}
public class p3_Constructor {
    public static void main(String[] args) {

        Book b1 = new Book(2,"Alchemist");
        Book b2 = new Book(b1);
        
        System.out.println(b1.getId());
        System.out.println(b1.getTitle());
        System.out.println(b2.getId());
        System.out.println(b2.getTitle());
        
        b1.setId(8);
        b1.setTitle("Radhe Radhe");
        System.out.println(b1.getId());
        System.out.println(b1.getTitle());
        System.out.println(b2.getId());
        System.out.println(b2.getTitle());


    }
}
