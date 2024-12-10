package OOP;

class Student {
    private int id;
    private String name;
    // setter
    public void setId(int id){
        this.id = id;
    }
    // getter
    public int getId() {
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class p2_GetterSetter {
    public static void main(String[] args) {
        Student r = new Student();
        r.setId(7);
        r.setName("Rahul Baraiya");
        System.out.println(r.getId());
        System.out.println(r.getName());
    }
}
