


public class Test {
    public static void main(String[] args) {
        try {
            start(args);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }    

    public static void start(String[] args) throws Exception {
        App.main(args);
    }
}
