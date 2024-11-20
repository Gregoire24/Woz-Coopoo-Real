public class Patient {
    public String name;
    private int stock;
    private boolean pharmacy;
    private boolean woman;
    private boolean asthmatic;
    private boolean pregnant;

    public Patient(String name, boolean woman,boolean asthmatic,boolean pregnant) {
        this.name = name;
        this.woman = woman;
        this.asthmatic = asthmatic;
        this.pregnant = pregnant;// Correction : attribuer la valeur du paramètre 'woman'
    }

    public String getName() {
        return name;
    }

    public boolean isWoman() {
        return woman;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public boolean isAsthmatic() {
        return asthmatic;
    }

    public void setAsthmatic(boolean newasthmatic) {
        asthmatic = newasthmatic;
    }

    public void setPregnant(boolean pregnant) {
    if (woman == true) {
        this.pregnant = pregnant;
    } else {
        this.pregnant = false;
    }
}
}
