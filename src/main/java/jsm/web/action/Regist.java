package jsm.web.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jsm.web.entity.member.Member;

@Controller
@RequestMapping("/member")
public class Regist {
	@RequestMapping("/reg")
	public String regist(@ModelAttribute Member member,Map model) {
		System.out.println(member.getAccount() + " password :" + member.getPassword());
		model.put("m", member);
		return "reg";
	}

}
