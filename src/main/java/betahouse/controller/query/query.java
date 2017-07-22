package betahouse.controller.query;

import betahouse.core.Base.BaseController;
import betahouse.model.Student;
import betahouse.repository.CountProvinceRepo;
import betahouse.repository.StudentRepo;
import com.alibaba.fastjson.JSON;
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
    @Autowired
    private CountProvinceRepo countProvinceRepo;

    @RequestMapping(value = "/query",method = POST)
    public String result(HttpServletRequest request, HttpServletResponse response, Model model,
                         @RequestParam("IdNum") String IdNum,
                         @RequestParam("ExamNum") String ExamNum){
        Student student = null;
        if(!IdNum.equals("")&&student==null){
            student = studentRepo.findByIdNum(IdNum);
        }
        if(!ExamNum.equals("")&&student==null){
            student = studentRepo.findByExamNum(ExamNum);
        }
        String str = student.getHometown();

        int sameName = studentRepo.countByName(student.getName());
        int sameProvince = countProvinceRepo.findByProvinceName(str).getCount();
        int sameBirth = studentRepo.countByBirthDate(student.getBirthDate());

        model.addAttribute("student", student);
        model.addAttribute("sameNameNum", sameName);
        model.addAttribute("sameProvinceNum", sameProvince);
        model.addAttribute("sameBirth", sameBirth);
        System.out.println(JSON.toJSONString(model));
        return "result";
    }
}
