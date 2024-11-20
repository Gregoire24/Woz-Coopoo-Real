public class TortueRapideV2 extends TortueV2 {
       
    public void setVitesse(int v)
    {
         vitesse = v;
         afficherEtat();
    }
    
    public void ralentir()
    {
        if (vitesse>0) vitesse--;
    }
}