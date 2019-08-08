package com.alipay.sofa.tracermdclog4j2demo;

import com.alipay.common.tracer.core.utils.TracerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TracerMdcLog4j2DemoApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(TracerMdcLog4j2DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TracerMdcLog4j2DemoApplication.class, args);
    }
    @RequestMapping("tracer")
    public String testTracerMdc(){
        LOGGER.info("this is test");
        String traceId = TracerUtils.getTraceId();
        LOGGER.info("this is tracerId : " +traceId);
        return "test mdc";
    }

}
