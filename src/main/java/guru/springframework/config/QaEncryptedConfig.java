package guru.springframework.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by rfh on 6/29/2019
 */
@Configuration
@EncryptablePropertySource(name = "qaEncryptedProperties", value = "classpath:qa.encrypted.properties")
@Profile("qa")
public class QaEncryptedConfig {
}
