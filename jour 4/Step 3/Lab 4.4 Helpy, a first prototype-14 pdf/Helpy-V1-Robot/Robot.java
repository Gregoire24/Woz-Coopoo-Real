public class Robot {
    private Patient patient;
    private Drug drug;
    

    public Robot(Patient patient, Drug drug) {
        this.patient = patient;
        this.drug = drug;
    }

    public boolean checkContraindications() {
        if (patient.isAsthmatic() && drug.getAsthmaticContraIndication()) {
            return true;
        }

        if (patient.isPregnant() && drug.getPregnantContraIndication()) {
            return true;
        }

        return false;
    }

    public void deliverPrescription() {
        if (!checkContraindications()) {
            System.out.println("Prescription delivered for " + patient.getName() + ": " + drug.getName());
            drug.setPillNumber(drug.getPillNumber() - drug.getPosology());
        } else {
            System.out.println("Prescription contraindicated for " + patient.getName() + ": " + drug.getName());
        }
    }
    public void buyNewDrugs(int quantity) {
        drug.setPillNumber(drug.getPillNumber() + quantity);
    }
    // Méthode pour acheter de nouveaux médicaments si nécessaire
    // quand on a plus de comprimé pour le prochain traitement c'est bien donc
    // quand on a moins de comprimé que la posologie
    public void verifstockDrugs() {
     if (drug.getPillNumber() < drug.getPosology()) {
         // Le nombre de comprimés est épuisé, nous devons acheter de nouveaux médicaments
         System.out.println("Acheter de nouveaux comprimés de " + drug.getName() + ".");
     }else {
            System.out.println("Vous avez assez de médicament ");
        }
    }
    
    public void deliverDrugs() {
    if (drug.getPillNumber() >= drug.getPosology()) {
        System.out.println(drug.getPosology() + " comprimés de " 
                            + drug.getName() + " ont été délivrés.");
        
        drug.setPillNumber(drug.getPillNumber() - drug.getPosology());
    } else {
        System.out.println("Vous n'avez pas assez de médicaments.");
    }
}

}




