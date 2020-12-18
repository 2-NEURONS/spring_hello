package spring_fundamentals.spring_hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController
{

    @Value("${spring.application.name}")
    String appName;

    //@RequestMapping("/")
 /*   public Model homePage(Model model)
    {
        model.addAttribute("appName", appName);
        return ;
    }*/
    @RequestMapping("/")
    public ModelAndView passParametersWithModelAndView()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("appName", appName);
        return modelAndView;
    }

}
