package org.qingqiao.cintroller;


import org.qingqiao.bean.People;
import org.qingqiao.service.PropleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping
public class PeopleController {

    @Autowired
    public PropleServices propleServices;

    @RequestMapping("/query")
    public ModelAndView query(ModelAndView modelAndView){
        List<People> people=propleServices.query();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",people);
        return modelAndView;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        People people = new People(null, name, age, sex);
        int i=propleServices.insert(people);
        System.out.println(i);
        return "redirect:query";
    }

    @RequestMapping("/insertPagenull")
    public String insertPagenull(){
        return "insertPage";
    }

    @RequestMapping("/updatePageid")
    public String updatePageid(int id, Model model){
        People people=propleServices.queryByid(id);
        model.addAttribute("list",people);
        return "updatePage";
    }


    @PutMapping("/people")
    public String  updatePage(People people){
        int i =propleServices.update(people);
        return "redirect:query";
    }

    @DeleteMapping("/people")
    public String delete(int id) {
        int i = propleServices.delete(id);
        return "redirect:query";
    }
    /*@RequestMapping("/update")
    public String update(People people){
        int i =propleServices.update(people);
        if (i>0){
            return "redirect:query";
        }else {
            return "redirect:query";
        }

    }


    @RequestMapping("/delete")
    public String delete(int id) {
        int i = propleServices.delete(id);
        if (i > 0) {
            return "redirect:query";
        } else {
            return "redirect:query";
        }
    }*/
 }
