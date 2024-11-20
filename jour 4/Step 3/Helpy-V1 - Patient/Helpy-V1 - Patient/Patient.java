public class Patient {
    private String name;
    private boolean woman;
    private boolean asthmatic;
    private boolean pregnant;

    public Patient(String name, boolean woman) {
        this.name = name;
        // true = femme, et inversement
        this.woman = woman;
    }

    public String getName() {
        return name;
    }

    public boolean isWoman() {
        return woman;
    }

    public boolean isAsthmatic() {
        return asthmatic;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setAsthmatic(boolean asthmatic) {
        this.asthmatic = asthmatic;
    }

    public void setPregnant(boolean pregnant) {
    if (woman == true) {
        this.pregnant = pregnant;
    } else {
        this.pregnant = false;
    }
}

}