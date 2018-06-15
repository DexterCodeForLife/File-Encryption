/*This program is a student project designed by _______*/
package encryptionsystem;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
/**
 *
 * @author Peter
 */
public class ListModelObject implements ListModel<String> 
{
    private final ArrayList<String> arrayList;
    private final ArrayList<String> filePath;
    
    ListModelObject(){
        arrayList = new ArrayList<>();
        filePath = new ArrayList<>();
    }
   
    @Override
     public int getSize()
     {
        return this.arrayList.size();
     }

    @Override
    public String getElementAt(int index) {
        return arrayList.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }
    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void setElement(String data){
        arrayList.add(data);
    }
    public void setFilePath(String f_path){
        filePath.add(f_path);
    }
    public String getFilePath(int index){
        return filePath.get(index);
    }
}
