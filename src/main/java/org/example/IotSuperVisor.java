package org.example;

import akka.actor.AbstractActor;
import akka.actor.Props;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IotSuperVisor extends AbstractActor {

    private Logger logger = LoggerFactory.getLogger(IotSuperVisor.class);

    public static Props props() {
        return Props.create(IotSuperVisor.class);
    }

    @Override
    public void preStart() throws Exception {
        logger.info("preStart ...");
        super.preStart();
    }

    @Override
    public void postStop() throws Exception {
        logger.info("postStop ...");
        super.postStop();
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }
}
