package mvc.controller;

import mvc.service.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

@Controller
public class HomeController {
    private static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    private SpitterService spitterService;

    @Inject
    public HomeController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping({"/", "/home"})
    public String homePage(Map<String, Object> model){
        model.put("spittles", spitterService.getSpitter(DEFAULT_SPITTLES_PER_PAGE));

        return "home";
    }
}
