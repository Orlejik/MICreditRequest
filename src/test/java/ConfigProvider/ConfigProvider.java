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
    String USERNAME = readConfig().getString("UserData.AnonimUser.CreditData.username");
    String PHONENUMBER = readConfig().getString("UserData.AnonimUser.CreditData.phoneNumber");
    int CREDITAMOUNT = readConfig().getInt("UserData.AnonimUser.CreditData.creditAmount");
    int PAYMENTTERM = readConfig().getInt("UserData.AnonimUser.CreditData.paymentsTerm");
    long IDNOIDNP = readConfig().getLong("UserData.AnonimUser.CreditData.idno_idnp");
    String EMAIL = readConfig().getString("UserData.AnonimUser.CreditData.email");

    String ANONIM_USER = readConfig().getString("UserData.AnonimUser.Credentials.login");
    String ANONIM_PASSWORD = readConfig().getString("UserData.AnonimUser.Credentials.passwd");

    String CABINET_USER = readConfig().getString("UserData.CabinetUser.userLogin.login");
    String CABINET_PASSWORD = readConfig().getString("UserData.CabinetUser.userLogin.passwd");



}
