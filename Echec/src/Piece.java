import java.util.ArrayList;
import java.io.Serializable;

public abstract class Piece implements Serializable{

    /**
     * Méthode pour savoir si un nombre passé en paramétre est dans un tableau de nombre passé en paramétre
     * @param tab => Tableau de nombre
     * @param val => Nombre à vérifier
     * @return => true si le tableau contient le nombre false sinon
     */

    protected boolean check(int[] tab, int val) {
        boolean b = false;    
        for(int i : tab){
            if(i == val){
                b = true;
                break;
            }
        }
        return b;
    }

    /**
     * Méthode pour savoir si l'arraylist passée en paramétre contient que des zéros
     * @param t => Une arralist de nombre
     * @return => true si l'arraylist contient que des zéros false sinon
     */

    protected boolean contientZ(ArrayList<Integer> t){
        int i = 0;
        while (i < t.size()){
            if(t.get(i) != 0){
                return false;
            }
            i++;
        }
        return true;
    }

    // Attributs
    
    protected boolean color;
    protected int id;
    protected String nom;
    protected int nb_tour;

    /**
     * Constructeur d'une piece
     */

    public Piece(){
        this.id = 0;
        this.nom = "";
    }

    /**
     * Constructeur d'une piece
     * @param p => Une autre piece
     */
    public Piece(Piece p){
        this.color = p.getColor();
        this.id = p.getId();
        this.nom = p.getNom();
    }

    //getters

    /**
     * Méthode pour récuperer la couleur 
     * @return => true si blanc, false si noir
     */

    protected boolean getColor(){
        return this.color;
    }

    /**
     * Méthode pour récuperer l' identifiant 
     * @return => l'indentifiant
     */

    protected int getId(){
        return this.id;
    }

    /**
     * Méthode pour récuperer le nom 
     * @return => le nom
     */

    protected String getNom(){
        return this.nom;
    }

    /**
     * Méthode pour récuperer le nombre de tour "utile que pour les pions" 
     * @return => le nombre de tour
     */

    public int getNb_tour(){
        return this.nb_tour;
    }

    //setters

    /**
     * Pour affecter une couleur
     * @param c
     */

    protected void setColor(boolean c){
        this.color = c;
    }

    /**
     * Pour affecter un identifiant
     * @param c
     */
    
    protected void setId(int p){
        this.id = p;
    }

    /**
     * Pour affecter un nom
     * @param c
     */

    protected void setNom(String n){
        this.nom = n;
    }

    /**
     * Pour affecter un nombre de tour "utile que pour les pions"
     * @param c
     */

    public void setNb_tour(int i){
        this.nb_tour = i;
    }

    /**
     * Méthode pour les réglements
     * @param ch => Le tableau d'échec
     * @param x => La ligne de départ
     * @param y => La colonne de départ
     * @param w => La ligne d'arrivée
     * @param z => La colonne d'arrivée
     * @param ids => Les piéces du joueur
     * @return => false
     */

    public boolean rule(int[][] ch, int x, int y, int w, int z, ArrayList<Integer> ids){
        return false;
    }
    
}
