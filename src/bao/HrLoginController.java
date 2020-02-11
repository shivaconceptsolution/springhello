package bao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Reg;

@Controller
public class HrLoginController {
	@RequestMapping("hrlogin")	
	public ModelAndView add()
	{
		return new ModelAndView("hrlogin");
	}
	@RequestMapping("hrlogincode")	
	public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse response)
	{
		String msg="";
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		Query r = session.createQuery("from Reg r where r.username=:a and r.password=:b");
		r.setString("a",request.getParameter("txtuserid"));
		r.setString("b",request.getParameter("txtpass"));
		List lst = r.list();
		if(lst.size()>0)
		{
			return new ModelAndView("redirect:dashboard.do");
			//msg= "Login Successfully";
			//response.sendRedirect("add.do");
		}
		else
		{
			msg= "Invalid Login";
		}
		
	    
		session.close();
		return new ModelAndView("login","msg",msg);
	}
}
