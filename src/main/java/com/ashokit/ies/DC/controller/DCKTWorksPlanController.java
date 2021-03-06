package com.ashokit.ies.DC.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.DC.Domain.KTWorksDtlsDomain;
import com.ashokit.ies.DC.Service.DcService;

@Controller
public class DCKTWorksPlanController {

	@Autowired
	DcService dcService;

	@PostMapping("/ktplan")
	public String handleSelectPlanNextBtn(
			@ModelAttribute("plandata") KTWorksDtlsDomain ktDomain,
			RedirectAttributes attr,Model model) {

		Map<Integer, Boolean> mapCase = dcService.registerKTPlan(ktDomain);

		if (mapCase.isEmpty()) {
			attr.addFlashAttribute("err", "Something Went worong!!, Pls try Again later");
			return "redirect:getktplan";

		} else {
			model.addAttribute("succ", "Data Added to DB for KT-WOKRKS PLAN");
			return "EDlandingPage";
		}
	}

	@GetMapping("/getktplan")
	public String handleSelectPlanDoublePostingNextBtn(Model model) {
		KTWorksDtlsDomain ktDomain = new KTWorksDtlsDomain();
		model.addAttribute("plandata", ktDomain);

		return "DCEdcuationDetails";

	}

}
