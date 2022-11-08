public class Hangar {


    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", 10200);
        Boat petitBateau = new Boat("petit bateau", 1123000);

        System.out.println(ferrari.doStuff());
        System.out.println(petitBateau.doStuff());
    }
}