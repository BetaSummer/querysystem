package betahouse.controller.error;

import betahouse.core.Base.BaseController;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Yxm on 2017/7/20.
 */
@Controller
public class error extends BaseController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        return "/error";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

}