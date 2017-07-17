package betahouse.controller.query;

import betahouse.controller.base.BaseController;
import betahouse.model.Student;
import betahouse.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Yxm on 2017/7/17.
 */
@Controller
public class query extends BaseController {
    @Autowired
    StudentRepo studentRepo;

    @RequestMapping(value = "/query",method = POST)
    public String result(HttpServletRequest request, HttpServletResponse response, Model model,
                         @RequestParam("IdNum") String IdNum,
                         @RequestParam("ExamNum") String ExamNum){
        Student student = null;
        if(IdNum != null){
            student = studentRepo.findByIdNum(IdNum);
        }else if(ExamNum != null){
            student = studentRepo.findByExamNum(ExamNum);
        }
        model.addAttribute("student", student);
        System.out.println(student.getName());
        return "result";
    }
}
