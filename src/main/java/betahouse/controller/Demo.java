package betahouse.controller;

import betahouse.core.Base.BaseController;
import betahouse.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/7/19.
 */
@Controller
public class Demo extends BaseController {
    @Autowired
    private StudentRepo studentRepo;
    @RequestMapping("demo")
    public String demo(HttpServletRequest request, HttpServletResponse response, Model model){
        return "/error";
//        return null;
    }
}
