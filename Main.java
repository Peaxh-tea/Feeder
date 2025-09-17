public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("Current Food: " + f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println("Current Food: " + f.getCurrentFood());
        Feeder j = new Feeder(1000);
        System.out.println(j);
        j.simulateOneDay(22);
        System.out.println("Current Food: " + j.getCurrentFood());
        Feeder k = new Feeder(100);
        System.out.println(k);
        k.simulateOneDay(5);
        System.out.println("Current Food: " + k.getCurrentFood());
        Feeder l = new Feeder(2400);
        System.out.println(l);
        System.out.println(l.simulateManyDays(10, 4)+ " days");
        System.out.println("Current Food: " + l.getCurrentFood());
        Feeder y = new Feeder(250);
        System.out.println(y);
        System.out.println(y.simulateManyDays(10, 5)+ " days");
        System.out.println("Current Food: " + y.getCurrentFood());
        Feeder v = new Feeder (0);
        System.out.println(v);
        System.out.println(v.simulateManyDays(5,10) + " days");
        System.out.println("Current Food: " + v.getCurrentFood());
    }
}
