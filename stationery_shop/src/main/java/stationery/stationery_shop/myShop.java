package stationery.stationery_shop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class myShop {
	@RequestMapping("/myshop")
    public String toString(){
        return "My categories : 1.Elephant 2.Faber castell 3.Horse 4.Sakura";
    }
}
