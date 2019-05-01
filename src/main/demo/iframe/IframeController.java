package iframe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IframeController {

    @RequestMapping("/index.do")
    public String startPage(){
        return "index";
    }
}
