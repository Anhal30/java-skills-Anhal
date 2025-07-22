public class VisitorCounter {
    private static int visitorCount = 0;

    public VisitorCounter() {
        visitorCount++;
        System.out.println("New visitor! Total visitors: " + visitorCount);
    }

    public static void main(String[] args) {
        VisitorCounter v1 = new VisitorCounter();
        VisitorCounter v2 = new VisitorCounter();
        VisitorCounter v3 = new VisitorCounter();
    }
}
