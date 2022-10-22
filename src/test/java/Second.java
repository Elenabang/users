
import ModelP1.Root;
import api.UsersP1;
import org.testng.annotations.Test;

public class Second {

    UsersP1 user = new UsersP1();

    @Test
    public void ft(){
        Root root = new Root();
        root = user.getUser(6);
        System.out.println(root.toString());

    }
}
