package jjfactory.ticketcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TicketCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketCmsApplication.class, args);
    }

}
