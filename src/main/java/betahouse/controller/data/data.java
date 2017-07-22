package betahouse.controller.data;

import betahouse.core.Base.BaseController;
import betahouse.core.office.HSSF;
import betahouse.model.CountProvince;
import betahouse.model.Student;
import betahouse.repository.CountProvinceRepo;
import betahouse.repository.StudentRepo;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yxm on 2017/7/19.
 */
@Controller
public class data extends BaseController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CountProvinceRepo countProvinceRepo;
    @RequestMapping(value = {"/load"})
    public String load(HttpServletRequest request, HttpServletResponse response, Model model){
        HSSF hssf = new HSSF("data","data");
        hssf.open();
        Sheet sheet = hssf.getSheet(0);
        int j,u;
        String str,sf = "";
        List<Student> studentList = new ArrayList<>();
        List<CountProvince> countProvinceList = new ArrayList<>();
        Map<String, CountProvince> provinceMap = new HashMap<>();
        for(int i = 1;i <= sheet.getLastRowNum();i++){
            Student student = new Student();
            j = 0;
            student.setClassId(hssf.get(0,i,j++));
            student.setStuId(hssf.get(0,i,j++));
            student.setExamNum(hssf.get(0,i,j++));
            student.setName(hssf.get(0,i,j++));
            student.setSex(hssf.get(0,i,j++));
            str = hssf.get(0,i,j++);
//            格式处理
            for(u = 0;u < str.length();u++)
                if(str.charAt(u)<'0'||str.charAt(u)>'9')break;
            str = str.substring(u);
//            格式处理
            student.setMajor(str);
            student.setPolitical(hssf.get(0,i,j++));
            student.setBirthDate(hssf.get(0,i,j++));
            student.setIdNum(hssf.get(0,i,j++));
            str = hssf.get(0,i,j++);
//            省份记录
            for(u = 0;u < str.length();u++)
                if(str.charAt(u)=='市')break;
            sf = str.substring(0,u+1);
            if(!provinceMap.containsKey(sf)){
                CountProvince c = new CountProvince();
                c.setProvinceName(sf);
                c.setCount(1);
                provinceMap.put(sf, c);
            }else{
                provinceMap.get(sf).setCount(provinceMap.get(sf).getCount()+1);
            }
//            省份记录
            student.setAdress(str);
            student.setHometown(sf);
            student.setPostCode(hssf.get(0,i,j++));
            student.setPhoneNum(hssf.get(0,i,j++));
            student.setExpressNum(hssf.get(0,i,j++));
            student.setDormitoryId(hssf.get(0,i,j++));
            student.setBedId(hssf.get(0,i,j++));
            studentList.add(student);
            //System.out.println(JSON.toJSONString(student));
        }
        for (CountProvince c : provinceMap.values()) {
            countProvinceList.add(c);
        }
        countProvinceRepo.save(countProvinceList);
        studentRepo.save(studentList);
        return null;
    }
}
