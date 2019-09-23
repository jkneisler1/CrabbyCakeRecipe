package crabbycakerecipe.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String CrabbyRecipe() {
        return "CrabbyRecipe";
    }

    /*
    @RequestMapping("/CrabbyRecipe")
    public String CrabbyRecipe() {
        return "CrabbyRecipe";
    }

     */

}
