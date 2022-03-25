package uk.azquelt.tckrunner;

import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.arquillian.core.spi.LoadableExtension;

public class Extension implements LoadableExtension {

    public void register(ExtensionBuilder builder) {
        builder.service(AuxiliaryArchiveAppender.class, Slf4jAppender.class);
    }

}
