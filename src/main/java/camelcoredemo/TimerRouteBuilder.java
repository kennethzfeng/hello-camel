package camelcoredemo;

/**
 * Created by kennethfeng on 3/28/15.
 */
import org.slf4j.*;
import org.apache.camel.*;
import org.apache.camel.builder.*;


public class TimerRouteBuilder extends RouteBuilder {
    static Logger LOG = LoggerFactory.getLogger(TimerRouteBuilder.class);

    public void configure() {
        from("timer://timer1?period=1000")
                .to("bean:processByBean1")
                .to("bean:processAgainByBean2");
    }

}
