/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myapp;

public class App {
    private String name = "Christy";
    public String getGreeting() {
        return "Hello" + name;
    }
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
