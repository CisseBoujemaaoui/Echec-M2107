
import java.util.ArrayList;

public class Pawn extends Piece{
    
    /**
     * Constructeur du pion
     */

    public Pawn(){
        this.id = 0;
        this.nom = "Pawn";
        this.nb_tour = 0;
    }

    /**
     * Méthode toString
     * @return => Une phrase qui donne la piéce et son identifiant dans l'échiquier
     */    

    public String toString(){
        String col = "Black";
        if (this.color) {
            col = "White";
        }
        return  col+" "+this.nom+": "+this.id;
    }

    /**
     * Méthode pour les réglements
     * @param ch => Le tableau d'échec
     * @param x => La ligne de départ
     * @param y => La colonne de départ
     * @param w => La ligne d'arrivée
     * @param z => La colonne d'arrivée
     * @param ids => Les piéces du joueur
     * @return => true si les régles sont respectées false sinon
     */
    
    public boolean rule(int[][] ch, int x, int y, int w, int z, ArrayList<Integer> ids){
        ArrayList<Integer> pionb = new ArrayList<Integer>();
        ArrayList<Integer> pionn = new ArrayList<Integer>();
        int i = 17;int j = 9;
        while (i <= 24){
            pionb.add(i);
            i++;
        }
        while (j <= 16){
            pionn.add(j);
            j++;
        }
        if (this.nb_tour == 0){
            if (check(ch[x], this.getId()) == false){
                return false;
            }else if ((pionb.contains(this.id) && x <= w) || (x >= w && pionn.contains(this.id))){
                return false;
            }else if(check(ch[w],ch[w][z]) == false){
                return false;
            }else if(w > x+2 || w < x-2){
                return false;
            }else if( ((w >= x-2) && (w <= x+2)) && z == y ){
                return (ch[w][z] == 0);
            }else if ((w == x+1 || w == x-1) && (z == y+1 || z == y-1)){
                return (ch[w][z] != 0);
            }
        }else{
            if (check(ch[x], this.getId()) == false){
                return false;
            }else if ((pionb.contains(this.id) && x <= w) || (x >= w && pionn.contains(this.id))){
                return false;
            }else if(check(ch[w],ch[w][z]) == false){
                return false;
            }else if(w > x+1 || w < x-1){
                return false;
            }else if( ((w >= x-1) && (w <= x+1)) && z == y ){
                return (ch[w][z] == 0);
            }else if ((w == x+1 || w == x-1) && (z == y+1 || z == y-1)){
                return (ch[w][z] != 0);
            }
        }        
        return false;              
    }
}
