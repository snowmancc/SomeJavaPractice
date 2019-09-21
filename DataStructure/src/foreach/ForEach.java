package foreach;

import list.List;

public class ForEach {

    public static void forEach(List list, ForEachMethod method) {

        list.reset();
        for (int i = 0; i < list.size(); i++) {
            method.method(list.InOrder());
        }
        
    }
    
}
