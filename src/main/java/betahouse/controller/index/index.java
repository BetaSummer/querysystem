package betahouse.controller.index;

import betahouse.core.Base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/7/17.
 */
@Controller
public class index extends BaseController {
    @RequestMapping(value = {"/","/index",""})
    public String home(HttpServletRequest request, HttpServletResponse response, Model model){
        return "index";
    }
}
