package slim3.controller.styleapp;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class LoginController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("login.jsp");
    }
}
