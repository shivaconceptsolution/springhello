package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dao.Reg;
@Controller
public class RegisterController {
	@RequestMapping("reg")	
	public ModelAndView add()
	{
		return new ModelAndView("register");
	}
	@RequestMapping("regcode")	
	public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse response)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		Reg r = new Reg();
		Transaction tx = session.beginTransaction();
		r.setUsername(request.getParameter("txtuserid"));
		r.setPassword(request.getParameter("txtpass"));
		r.setEmail(request.getParameter("txtemail"));
		r.setMobile(request.getParameter("txtmobile"));
		
		session.save(r);
		tx.commit();
		session.close();
		return new ModelAndView("register","msg","data inserted successfully");
	}
}
