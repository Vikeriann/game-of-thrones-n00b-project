package pl.akademiakodu.aplikacja2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
    @GetMapping ("/")
//    @ResponseBody
    public String home(ModelMap modelMap)
    {
        modelMap.put("hello", "Gra o Tron 232424");
        return "hello";
    }
}
