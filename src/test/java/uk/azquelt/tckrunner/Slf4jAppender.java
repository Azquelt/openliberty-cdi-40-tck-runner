package uk.azquelt.tckrunner;

import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public class Slf4jAppender implements AuxiliaryArchiveAppender {

    public Archive<?> createAuxiliaryArchive() {
        return ShrinkWrap.create(JavaArchive.class, "slf4j.jar")
                         .addPackages(true, "org.slf4j");
    }

}
