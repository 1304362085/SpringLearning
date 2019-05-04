package iframe;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping("/displayProducts.do")
    public String display(HttpServletRequest req){
        String reqType = req.getParameter("param");
        System.out.println("reqTyp: " + reqType);
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","1");
        map.put("b","2");
        Gson gson = new Gson();
        String str = gson.toJson(map);

        return str;
    }
}
