class Danger {
    // Instance variables with default values
    int see;
    byte display;
    char run;
    long drink;
    double read;

    public static void main(String[] args) {
        // Create an instance of the Define class
        Define define = new Define();

        // Call the edit method
        define.edit();

        // Print the default values of the instance variables
        System.out.print("see: " + define.see + "\n");
        System.out.print("display: " + define.display + "\n");
        System.out.print("run: " + (int)define.run + "\n"); // cast to int to see default value
        System.out.print("drink: " + define.drink + "\n");
        System.out.print("read: " + define.read + "\n");
    }

    // Instance method, does not do anything in this example
    public void edit() {
        // Local variables, not used here
        int see;
        byte display;
        char run;
        long drink;
        double read;
    }
}
