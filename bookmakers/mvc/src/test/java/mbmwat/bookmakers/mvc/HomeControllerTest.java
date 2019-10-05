package mbmwat.bookmakers.mvc;

import mbmwat.bookmakers.mvc.controllers.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {

    public void homeViewTest(){

        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

/*        mockMvc.perform(get())*/

    }

}
