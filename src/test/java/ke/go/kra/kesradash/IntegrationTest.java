package ke.go.kra.kesradash;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ke.go.kra.kesradash.KesradashApp;
import ke.go.kra.kesradash.RedisTestContainerExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = KesradashApp.class)
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
