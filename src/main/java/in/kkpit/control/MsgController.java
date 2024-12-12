package in.kkpit.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("How")
	public String HowAre(Model model) {
		model.addAttribute("msg","Jeevan ki saanti");
		return "index";
	}

}
