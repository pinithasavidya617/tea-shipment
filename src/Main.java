public class Main {
    public static void main(String[] args) {

//        TeaShipment teaShipment1 = new TeaShipment("BOPF", 20, "UK", "Watawala");
//        TeaShipment teaShipment2 = new TeaShipment(20, "UK", "Watawala");
//        TeaShipment teaShipment3 = new TeaShipment("UK", "Watawala");

        TeaShipment teaShipment4 = new TeaShipment();

        teaShipment4.printShipment();

        OrganicTeaShipment organicTeaShipment = new OrganicTeaShipment();
        organicTeaShipment.printShipment();

        OrganicTeaShipment organicTeaShipment1 = new OrganicTeaShipment("OP1", 25, "USA", "DHL");
        organicTeaShipment1.printShipment();
    }
}
