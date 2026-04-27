public class OrganicTeaShipment extends TeaShipment{

    private String organicCertifierName;

    public OrganicTeaShipment(){

    }

    public OrganicTeaShipment(String grade, int weight, String shipmentCountry, String exporterName, String organicCertifier){
        super(grade, weight, shipmentCountry, exporterName); //Calling to parent's constructor
        this.organicCertifierName = organicCertifier;
    }

    @Override
    public void printShipment(){
        super.printShipment();
        System.out.println("Organic Certifier Name - " + this.organicCertifierName);
    }
}
