package ConfigProvider;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("TestProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("TestProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
}
