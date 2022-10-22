import Model3.Root;
import api.User3;
import org.testng.annotations.Test;

public class Fourth {

    User3 user = new User3();

    @Test
    public void ft(){
        Root root = new Root();
        root = user.getUser();
        System.out.println(root.toString());

    }
}
