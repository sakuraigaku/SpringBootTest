package com.tuyano.spring.boot.myapp;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@Autowired
	PlaceDataRepository repository;

	@PostConstruct
	public void init() {
		// TODO 自動生成されたメソッド・スタブ
		repository.saveAndFlush(new PlaceData("Shinjuku","Tokyo","160-0022"));
		repository.saveAndFlush(new PlaceData("Atami","Shizuoka","413-0033"));
		repository.saveAndFlush(new PlaceData("Sakura","Chiba","285-0055"));
	}

	@RequestMapping("/")
	public ModelAndView sample(ModelAndView mav) {
		List<PlaceData>list=(List<PlaceData>)repository.findAll();
		mav.addObject("list",list);
		mav.setViewName("sample");
		return mav;

	}
}
