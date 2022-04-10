package dev.root101.pineaple.pos.server;

import dev.root101.pineaple.pos.server.rest.a_module.A_PineaplePosRESTModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
/*@ComponentScan(basePackages = {
    A_PineaplePosRESTModule.BASE_PACKAGE,})*/
@RestController
@RequestMapping(value = "/pos")
public class Main extends SpringBootServletInitializer {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(Main.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }

    @GetMapping("/nene")
    public String nene() {
        return "TE AMOOOOOOOO";
    }
}
