public class OrganicTeaShipment extends TeaShipment{

    public OrganicTeaShipment(){

    }

    public OrganicTeaShipment(String grade, int weight, String shipmentCountry, String exporterName){
        super(grade, weight, shipmentCountry, exporterName); //Calling to parent's constructor
    }
}
