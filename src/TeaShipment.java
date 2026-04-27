public class TeaShipment {
     private String grade;
     private int weight;
     private String shipmentCountry;
     private String exporterName;

    public  TeaShipment(){
        this("Ceylon Tea Export");
    }

    public TeaShipment(String exporterName){
        this("UK", exporterName);
    }

    public TeaShipment(String shipmentCountry, String exporterName){
        this(20, shipmentCountry, exporterName);
    }

    public TeaShipment(int weight, String shipmentCountry, String exporterName){
        this("BOPF", weight, shipmentCountry, exporterName);

//        System.out.println("executing constructor taking 3 arguments");
    }

    public TeaShipment(String grade, int weight, String shipmentCountry, String exporterName){
        this.grade = grade;
        this.weight = weight;
        this.shipmentCountry = shipmentCountry;
        this.exporterName = exporterName;

//        System.out.println("executing constructor taking 4 arguments");
    }

    public void printGrade(){
        System.out.println(this.grade);
    }

    public void printWeight(){
        System.out.println(this.weight);
    }

    public void printCountry(){
        System.out.println(this.shipmentCountry);

    }public void printExporter(){
        System.out.println(this.exporterName);
    }


}
