public class Main {
    public static void main(String[] args) {
        String nome = "Target";
        
            for (int i = nome.length() - 1; i >= 0; i--) {
            char c = nome.charAt(i); 
            System.out.print(c);    
        }
    }
}
