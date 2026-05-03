public class TeaShipment {
     private String grade;
     private int weight;
     private String shipmentCountry;
     private String exporterName;

    public  TeaShipment(){
        this("Ceylon Tea Export");
        System.out.println("Default Constructor executed");
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

    public void printShipment(){
        System.out.println("Shipment Grade - " + this.grade + "\n"
                + "Shipment Weight - " + this.weight + "\n"
                + "Shipment Country - " + this.shipmentCountry + "\n"
                + "Shipment Exporter - " + this.exporterName);
    }



}


/*
 * ================== CONSTRUCTOR CHAINING EXPLANATION ==================
 *
 * This class uses constructor chaining to initialize TeaShipment objects
 * with different levels of provided data.
 *
 * Idea:
 * -----
 * Instead of repeating field assignments in every constructor,
 * each constructor calls another constructor using this(...),
 * until the final constructor initializes all variables.
 *
 * Flow of Constructors:
 * ---------------------
 * TeaShipment()
 *      → TeaShipment(String exporterName)
 *          → TeaShipment(String shipmentCountry, String exporterName)
 *              → TeaShipment(int weight, String shipmentCountry, String exporterName)
 *                  → TeaShipment(String grade, int weight, String shipmentCountry, String exporterName)
 *
 * The LAST constructor does the actual assignment:
 *      this.grade = grade;
 *      this.weight = weight;
 *      this.shipmentCountry = shipmentCountry;
 *      this.exporterName = exporterName;
 *
 * Default Values Used:
 * --------------------
 * grade = "BOPF"
 * weight = 20
 * shipmentCountry = "UK"
 * exporterName = "Ceylon Tea Export"
 *
 * Behavior:
 * ---------
 * - If user gives partial data → remaining values are filled automatically
 * - If user gives full data → values are used directly
 *
 * Examples:
 * ---------
 * new TeaShipment();
 *      → uses all default values
 *
 * new TeaShipment("Dilmah");
 *      → exporter = Dilmah, others default
 *
 * new TeaShipment("Japan", "Dilmah");
 *      → country + exporter set, others default
 *
 * new TeaShipment(50, "Germany", "Dilmah");
 *      → weight + country + exporter set, grade default
 *
 * new TeaShipment("OP", 100, "USA", "Dilmah");
 *      → all values provided, no defaults used
 *
 * Important Rules:
 * ----------------
 * - this(...) must be the FIRST statement in a constructor
 * - Only ONE this(...) call is allowed per constructor
 * - Constructor chaining avoids code duplication
 *
 * Simple Idea to Remember:
 * ------------------------
 * "User provides what they know → system fills the rest"
 *
 * =====================================================================
 */