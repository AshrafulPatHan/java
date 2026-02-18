public class function {
    // first function
    public static void First_function() {
        System.out.println("Hello, welcome to Java!");
    }

    // function parameters
    public static void myName(String name){
        System.out.println("my name is : "+name);
    }

    static void myData(String name, int age){
        System.out.println("my name is "+name+" and I'am "+age+" year old.");
    }

    public static void main(String[] args) {
        First_function(); // Calling the method

        myName("ashraful");
        myData("Ashraful",18);
    }
}
