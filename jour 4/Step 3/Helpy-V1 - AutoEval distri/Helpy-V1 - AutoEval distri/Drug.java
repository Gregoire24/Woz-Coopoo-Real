 public class Drug {
    // Class attributes
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
    
    public Drug(String name, String laboratory,String indication, 
                String activePrinciple, String therapeuticClass, 
                int dosage, int posology) {
        this.name = name;
        this.laboratory = laboratory;
        this.indication = indication;
        this.activePrinciple = activePrinciple;
        this.therapeuticClass = therapeuticClass;
        this.dosage = dosage;
        this.posology = posology;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setlaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    // Getter for contraindication
    public String getIndication() {
        return indication;
    }

    // Setter for contraindication
    public void setIndication(String indication){
        this.indication = indication;
    }
    
    public String getActivePrinciple() {
        return activePrinciple;
    }

    public void setActivePrinciple(String activePrinciple) {
        this.activePrinciple = activePrinciple;
    }
    
    public String getTherapeuticClass() {
        return therapeuticClass;
    }

    public void setTherapeuticClass(String therapeuticClass) {
        this.therapeuticClass = therapeuticClass;
    }
    
    public boolean getAsthmaticContraIndication() {
        return asthmaticContraIndication;
    }

    public void setAsthmaticContraIndication(boolean asthmaticContraIndication) {
        this.asthmaticContraIndication = asthmaticContraIndication;
    }

    // Methods to handle 'pregnantContraIndication'
    public boolean getPregnantContraIndication() {
        return pregnantContraIndication;
    }

    public void setPregnantContraIndication(boolean pregnantContraIndication) {
        this.pregnantContraIndication = pregnantContraIndication;
    }

    // Methods to handle 'dosage'
    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    // Methods to handle 'posology'
    public int getPosology() {
        return posology;
    }

    public void setPosology(int posology) {
        this.posology = posology;
    }

    // Methods to handle 'pillNumber'
    public int getPillNumber() {
        return pillNumber;
    }

    public void setPillNumber(int pillNumber) {
        this.pillNumber = pillNumber;
    }
    
}
