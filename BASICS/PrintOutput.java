public class PrintOutput {
    public static void main(String[] args) {
        // the difference between print and println method is that println function add extra line break at the end, while print function dosen't
        System.out.print("No Line Break After Me");
        // printing textual data
        System.out.println("One Line Break After Me");
        // printing numerical data
        System.out.println(23); 
        System.out.println(-23); 
        System.out.println(23.4); 
        // printing value of variable
        String name = "Rahul Baraiya";
        int age = 19;
        System.out.println(name);
        // printing mixed data
        System.out.println(name + " is a " + age + " year old software developer");
                            // Rahul Baraiya is a 19 year old software developer
    }
}
