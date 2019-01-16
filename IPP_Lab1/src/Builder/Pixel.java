package Builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pixel {

    public List<String> PhoneItems = new ArrayList<String>();

    public void ShowData() {
        for(Iterator<String> it = PhoneItems.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
