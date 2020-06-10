package org.example;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@RestController
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);

    @RequestMapping("/")
    public String house() {
        return "Hi! Spring is coming!";
    }

    @RequestMapping("/abc")
    public String abc() {
        return "Hi! abc is coming!";
    }

    public static void main( String[] args )
    {
        ActorSystem system = ActorSystem.create("Iot-system");
        // ActorRef ref = system.actorOf((Props.create()))

        TestBean tb = new TestBean();

        Date date = new Date();
        Date nulldate = null;
        date.setTime(0);
//        System.out.println(null == nulldate.toString() ? 1 : 2);
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
        logger.info("Constructor ...");

        setValue(getAmount() == null ? 0 : getAmount());

        //ActorRef superVisor = system.actorOf(IotSuperVisor.props(), "iot-superVisor");

        //superVisor.tell("String", IotSuperVisor.class)

    }

    static Long getAmount() {
        return null;
    }
    static void setValue(double k) {
        logger.info("k===> {}",k);
    }


}
