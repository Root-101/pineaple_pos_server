package dev.root101.pineaple.pos.server;

import dev.root101.pineaple.pos.server.repo.b_entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
/*@ComponentScan(basePackages = {
    A_PineaplePosRESTModule.BASE_PACKAGE,})*/
@RestController
@RequestMapping(value = "/main")
public class Main extends SpringBootServletInitializer {

    @Autowired
    REPO repo;
    
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(Main.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Area> getAllUsers() {
        return repo.findAll();
    }

}
