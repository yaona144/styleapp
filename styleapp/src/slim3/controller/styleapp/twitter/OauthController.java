package slim3.controller.styleapp.twitter;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class OauthController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("oauth.jsp");
    }
}
