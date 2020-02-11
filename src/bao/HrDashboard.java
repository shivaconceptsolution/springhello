package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HrDashboard {
@RequestMapping("hrdashboard")
public ModelAndView Index()
{
   return new ModelAndView("hrdashboard");
}
}
