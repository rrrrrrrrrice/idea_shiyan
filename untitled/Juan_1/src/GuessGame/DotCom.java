package GuessGame;
import java.util.ArrayList;
public class DotCom {
    private ArrayList<String> locotionCells;
    public void setLocotionCells(ArrayList<String> loc)
    {
        locotionCells=loc;
    }
    public String checkhit(String userput)
    {
        int index = locotionCells.indexOf(userput);
        if(index>=0)
        {
            locotionCells.remove(index);
        }
        if(locotionCells.isEmpty())
        {
            return "kill";

        }
        else
        {
            return "hit";
        }
    }
}
