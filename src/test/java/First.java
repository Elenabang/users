import Model.Root;
import api.User;
import org.testng.annotations.Test;

public class First {
    User user = new User();
    @Test
    public void ft(){
        Root root = new Root();
        root = user.getUser(1);
        System.out.println(root.toString());
        root = user.getUser(2);
        System.out.println(root.toString());
    }

}
