package g.g.g;

<<<<<<< Updated upstream
import g.g.g.DsadadadApp;
=======
import g.g.g.DasasdadsApp;
>>>>>>> Stashed changes
import g.g.g.config.AsyncSyncConfiguration;
import g.g.g.config.EmbeddedMongo;
import g.g.g.config.TestSecurityConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
<<<<<<< Updated upstream
@SpringBootTest(classes = {DsadadadApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class})
=======
@SpringBootTest(classes = {DasasdadsApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class})
>>>>>>> Stashed changes
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
