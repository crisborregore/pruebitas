package f.f.f;

import f.f.f.Pruebacris11FebreroApp;
import f.f.f.config.AsyncSyncConfiguration;
import f.f.f.config.EmbeddedMongo;
import f.f.f.config.TestSecurityConfiguration;
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
@SpringBootTest(classes = {Pruebacris11FebreroApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class})
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
