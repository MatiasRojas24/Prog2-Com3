package Ejercicio4;

public class Exceptions {
    public static class InvalidAge extends Exception {
        public InvalidAge(String message){
            super(message);
        }
    }
    public static class InvalidGrade extends Exception {
        public InvalidGrade(String message){
            super(message);
        }
    }
    public static class InvalidOption extends Exception {
        public InvalidOption(String message){
            super(message);
        }
    }
}
