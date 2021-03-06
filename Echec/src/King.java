import java.util.ArrayList;

public class King extends Piece{

    /**
     * Contructeur du roi
     */

    public King(){
        this.id = 0;
        this.nom = "King";
    }    

    /**
     * Méthode toString
     * @return => Une phrase qui donne la piéce et son identifiant dans l'échiquier
     */

    public String toString(){
        String col = "Black";
        if (this.color){
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
        if (check(ch[x], this.getId()) == false){
            return false;
        }else if(ids.contains(ch[w][z])){
            return false;
        }else if(w > (x+1) || w < (x-1)){
            return false;
        }else if(z < (y-1) || z > (y+1)){
            return false;
        }
        return true;
    }
}
