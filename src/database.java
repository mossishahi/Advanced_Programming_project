import com.company.user;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Mostafa shahhosseini on 15-Jun-16.
 */

public class database {

    public ArrayList<user> usersDataBase=new ArrayList<user>();
//    public ArrayList<user> airplaneDataBase=new ArrayList<user>();

    public static void writeUseronFile(ArrayList list) throws IOException {
        FileOutputStream fos = new FileOutputStream("c:/New folder/1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    }

}
