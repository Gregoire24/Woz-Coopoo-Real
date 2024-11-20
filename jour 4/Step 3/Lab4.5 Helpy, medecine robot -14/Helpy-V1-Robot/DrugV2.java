public class DrugV2 {
    private String name;
    private String laboratory;
    private String indication;
    private String activePrinciple;
    private String therapeuticClass;
    
    private boolean asthmaticContraIndication;
    private boolean pregnantContraIndication;
    
    private int dosage;
    private int posology;
    private int pillNumber;
    
    private int box;
    private int pillPerBox;
    private int quantity;

    public DrugV2(String name, String laboratory, String indication, String activePrinciple, String therapeuticClass, int posology, int box,boolean asthmaticContraIndication,boolean pregnantContraIndication, int pillPerBox) {
        this.name = name;
        this.laboratory = laboratory;
        this.indication = indication;
        this.activePrinciple = activePrinciple;
        this.therapeuticClass = therapeuticClass;
        this.posology = posology;
        this.pillNumber = box * pillPerBox;
        this.asthmaticContraIndication = asthmaticContraIndication;
        this.pregnantContraIndication = pregnantContraIndication;
        this.pillPerBox = pillPerBox;
        this.box = box;
    }

    public int getPillPerBox(){
        return pillPerBox;
    }
    
    public int getBox(){
        return box;
    }
    
    public void setBox(int newbox){
        this.box = newbox;
    }
    
    public String getName() {
        return name;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public String getActivePrinciple() {
        return activePrinciple;
    }

    public String getIndication() {
        return indication;
    }

    public String getTherapeuticClass() {
        return therapeuticClass;
    }

    public boolean getAsthmaticContraIndication() {
        return asthmaticContraIndication;
    }

    public void setAsthmaticContraIndication(boolean newACI) {
        asthmaticContraIndication = newACI;
    }

    public boolean getPregnantContraIndication() {
        return pregnantContraIndication;
    }

    public void setPregnantContraIndication(boolean newPCI) {
        pregnantContraIndication = newPCI;
    }

    public int getDosage() {
        return dosage;
    }

    public int getPosology() {
        return posology;
    }

    public void setPosology(int newPosology) {
        posology = newPosology;
    }

    public int getPillNumber() {
        return pillNumber;
    }

    public void setPillNumber(int newPillNumber) {
        pillNumber = newPillNumber;
    }
}
