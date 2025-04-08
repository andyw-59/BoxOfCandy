public class BoxOfCandy
{
 
    private Candy[][] box;

    public boolean moveCandyToFirstRow(int col) { 
        if (box[0][col] != null) return true;

        if (box[0][col] == null) {
            for (int i = 1; i < box.length; i++) {
                if (box[i][col] != null) {
                    box[0][col] = box[i][col];
                    box[i][col] = null;
                    return true;
                }
            }
        }

        return false;
        
     }


    public Candy removeNextByFlavor(String flavor)
    { /* to be implemented in part (b) */ }

    
}