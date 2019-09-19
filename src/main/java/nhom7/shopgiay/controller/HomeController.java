package nhom7.shopgiay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String homePage() {
		return "home";
	}

	@GetMapping(value = "/test")
	public String testPage(RedirectAttributes re) {
		re.addFlashAttribute("msg", "ok");
		return "redirect:/";
	}
}
