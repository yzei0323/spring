package day2Prac.실습;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @Autowired
    private BMIProgram program;
    
    @RequestMapping(value="/form", method=RequestMethod.GET)
    public String form() {
        return "bmiForm";
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String result(@RequestParam("h") double h,
                         @RequestParam("w") double w,
                         Model model) {

        String result = program.execute(h, w);
        model.addAttribute("result", result);

        return "bmiResult";
    }
}

