package java20211214;

public class Bus extends Car {

        public void ppangppang() {
            System.out.println("PPANG PPANG !!!");
        }
        public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

    }
}
