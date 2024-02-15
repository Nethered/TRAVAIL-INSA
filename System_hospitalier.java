package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {
        
        return "requête analysée";
    }

    private String comparerDonnes() {
        
        return "Cluster trouvé";
    }
//analyser requete est appelee indiquant que la requete a ete analysee et la methode comaprerdonnes 
//est appelee en idiquant qu'un cluster a ete trouver 
//comparerdonne est egalement appelee a partir de recevoitrequete qui envoie une chaine de characteres indiquant que la requette est analysee
}
