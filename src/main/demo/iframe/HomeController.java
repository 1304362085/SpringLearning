package iframe;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping("/displayProducts.do")
    public String display(HttpServletRequest req){
        String reqType = req.getParameter("param");
        System.out.println("reqTyp: " + reqType);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map.put("moka",28);
        map.put("Latte",26);
        map.put("Capucino", 123);
        map2.put("Tilamisu", 20);
        map2.put("Cheese", 22);
        List list = new ArrayList();
        list.add(map);
        list.add(map2);
        Gson gson = new Gson();
        String str = gson.toJson(list);
        return str;
    }
}
