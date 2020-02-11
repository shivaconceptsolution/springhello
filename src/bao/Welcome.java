package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
@RequestMapping("abc")
public String fun()
{
	return "hello";
}
@RequestMapping("xyz")
public String fun1()
{
	return "welcome";
}
}