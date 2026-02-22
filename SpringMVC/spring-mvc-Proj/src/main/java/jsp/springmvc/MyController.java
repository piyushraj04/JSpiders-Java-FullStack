package jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@GetMapping("/employee")
	public String getEmployee(ModelMap map) {
		map.put("role", "Developer");
		map.put("salary", "45000");
		
		return "employee.jsp";
	}
	
	@GetMapping("/app")
	public ModelAndView getApp(ModelAndView view) {
		view.addObject("appVersion","12.3");
		view.addObject("appName","WhatsApp");
		view.setViewName("app.jsp");
		return view;
	}
	
	@GetMapping("/form")
	public String trigger() {
		return "form.jsp";
	}
	
	@GetMapping("/loginform")
	public String trigger2() {
		return "emploginform.jsp";
	}
	
	
	@GetMapping("/saveLeave")
	public String trigger3() {
		return "saveLeave.jsp";
	}
	
	@PostMapping("/saveLeave")
	public ModelAndView saveLeave(HttpServletRequest request, ModelAndView view) {

	    String id = request.getParameter("id");
	    String name = request.getParameter("name");
	    String leaveType = request.getParameter("leaveType");
	    String reason = request.getParameter("reason");
	    String startDate = request.getParameter("startDate");
	    String endDate = request.getParameter("endDate");

	    view.addObject("id", id);
	    view.addObject("name", name);
	    view.addObject("leaveType", leaveType);
	    view.addObject("reason", reason);
	    view.addObject("startDate", startDate);
	    view.addObject("endDate", endDate);

	    view.setViewName("leaveDisplay.jsp");

	    return view;
	}

	
	@PostMapping("/save")
	public ModelAndView saveStudent(HttpServletRequest request, ModelAndView view) {

	    String name = request.getParameter("fullname");
	    String email = request.getParameter("email");
	    String phone = request.getParameter("phone");
	    String dob = request.getParameter("dob");
	    String gender = request.getParameter("gender");
	    String course = request.getParameter("course");
	    String address = request.getParameter("address");
	    String password = request.getParameter("password");

	    view.addObject("name", name);
	    view.addObject("email", email);
	    view.addObject("phone", phone);
	    view.addObject("dob", dob);
	    view.addObject("gender", gender);
	    view.addObject("course", course);
	    view.addObject("address", address);

	    view.setViewName("display.jsp");

	    return view;
	}


}
