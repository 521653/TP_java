public class ListeDeDocuments {
    private Document[] tableau;

    public ListeDeDocuments() {
        tableau = new Document[1];
    }

    public void ajouter(Document document) {
        if (tableau.length <= document.getNumero()) {
            Document[] tab = new Document[tableau.length * 2];
            for (int i = 0; i < tableau.length; i++) {
                tab[i] = tableau[i];
            }
            tableau = tab;
        }
        tableau[document.getNumero()] = document;
    }

    public Document getDocument(int num) {
        if (num >= tableau.length)
            return null;
        return tableau[num];
    }

    public String toString() {
        String resultat = "";
        for (int i = 0; i < tableau.length; i++) {
            Document d = tableau[i];
            if (d != null)
                resultat += d + "\n";
        }
        return resultat;
    }

    public String tousLesAuteurs(){
        String resultat = "";
        for (Document document : tableau) {
            if(document != null)
                if (document instanceof Livre) {
                    resultat += ((Livre)document).getAuteur()+"\n";
                }
        }
        return resultat;
    }
    
    public ListeDeDocuments tousLesDicos(){
        ListeDeDocuments ldd = new ListeDeDocuments();
        for (Document document : tableau) {
            if (document != null) 
                if (document instanceof Dictionnaire) {
                    ldd.ajouter(document);
                }
        }
        return ldd;
    }

}