class DoWhileLoop {
    public static void main(String[] args) {
        int i =0;
        while(i!=0 && i<3) {
            System.out.println("while loop");
            i++;
        }
        do { 
            System.out.println("do while loop");
            i++;
        } while (i!=0 && i<3);
    }
}
