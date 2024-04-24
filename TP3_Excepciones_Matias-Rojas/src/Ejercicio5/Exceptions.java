package Ejercicio5;

public class Exceptions {
    public static class InvalidOption extends Exception {
        public InvalidOption(String message){
            super(message);
        }
    }
    public static class InvalidPriority extends Exception {
        public InvalidPriority(String message){
            super(message);
        }
    }
}
