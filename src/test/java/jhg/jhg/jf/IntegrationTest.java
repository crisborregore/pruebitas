package jhg.jhg.jf;
import jhg.jhg.jf.config.EmbeddedKafka;

import jhg.jhg.jf.RepogitpruebaApp;
import jhg.jhg.jf.config.AsyncSyncConfiguration;
import jhg.jhg.jf.config.EmbeddedMongo;
import jhg.jhg.jf.config.TestSecurityConfiguration;
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
@SpringBootTest(classes = {RepogitpruebaApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class})
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
