package jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/custForm")
	public String trigger4() {
		return "custForm.jsp";
	}
	
	@PostMapping("/saveCustomer")
	public ModelAndView saveCustomer(@ModelAttribute Customer customer, ModelAndView view ) {
		view.addObject("Customer",customer);
		view.setViewName("displayCust.jsp");
		return view;
		
	}
	
	@GetMapping("/login")
	public String triggerLoginForm() {
		return "login.jsp";
	}
	
	
	@PostMapping("/login")
	public String empLoginApp(@ModelAttribute Employee employee) {

	    if(employee.getId() == 101 &&
	       employee.getPassword().equals("admin")) {

	        return "redirect:/leaveForm";

	    } else {

	        return "redirect:/login";
	    }
	}

	
	@GetMapping("/leaveForm")
	public String triggerLeaveForm() {
		return "empLeaveApp.jsp";
	}
	
	@PostMapping("/empLeaveApp")
	public String submitLeave(@ModelAttribute EmpLeave empLeave, Model model) {

	    model.addAttribute("empLeave", empLeave);

	    return "leaveDisplay.jsp";
	}
	
	@GetMapping("/leaveMsg")
	public String triggerLeaveMsg() {
		return "leaveDisplay.jsp";
	}
	


	
	/*
	 * @PostMapping("empLeaveApp") public String leaveDispalyMsg(@ModelAttribute
	 * EmpLeave empLeave, ModelAndView view) { view.addObject("EmpLeave", empLeave);
	 * view.setViewName("empLeaveApp.jsp"); return "leaveDisplay.jsp"; }
	 */
	
	
	
	

	
	@GetMapping("/form")
	public String trigger() {
		return "form.jsp";
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
