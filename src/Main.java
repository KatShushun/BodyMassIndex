public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate (65, (float) 1.71);
        System.out.println(index);
    }
}
