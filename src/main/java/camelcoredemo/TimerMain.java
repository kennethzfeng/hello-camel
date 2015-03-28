package camelcoredemo;


import org.apache.camel.CamelContext;
import org.apache.camel.Main;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kennethfeng on 3/28/15.
 */
public class TimerMain extends Main {
    static Logger LOG = LoggerFactory.getLogger(TimerMain.class);

    public static void main(String []args) throws Exception {
        TimerMain main = new TimerMain();
        main.enableHangupSupport();
        main.addRouteBuilder(createRouteBuilder());
        main.run(args);
    }

    static RouteBuilder createRouteBuilder() {
        return new TimerRouteBuilder();
    }
}
