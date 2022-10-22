import Model2.Root;
import api.User2;
import org.testng.annotations.Test;

public class Third {

    User2 user = new User2();

    @Test
    public void ft(){
        Root root = new Root();
        root = user.getUser();
        System.out.println(root.toString());

    }
}
