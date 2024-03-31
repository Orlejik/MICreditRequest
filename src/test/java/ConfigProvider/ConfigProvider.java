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
    String TEMP_URL = readConfig().getString("tempUrl");

//    --------------------- ANONYMOUS USER -------------------------------------
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

    //    --------------------- CABINET USER -------------------------------------
    String C_USER_LOGIN = readConfig().getString("UserData.CabinetUser.userLogin.login");
    String C_USER_PASSWD = readConfig().getString("UserData.CabinetUser.userLogin.passwd");

    int C_CREDIT_AMOUNT = readConfig().getInt("UserData.CabinetUser.creditData.creditAmount");
    int C_PAYMENT_TERM = readConfig().getInt("UserData.CabinetUser.creditData.paymentsTerm");
    String C_USER_FIRST_NAME = readConfig().getString("UserData.CabinetUser.creditData.userFirstName");
    String C_USER_SURNAME = readConfig().getString("UserData.CabinetUser.creditData.userSurename");
    String C_USER_PHONE_NUMBER = readConfig().getString("UserData.CabinetUser.creditData.userPhoneNumber");
    String C_IMAGE_PATH= readConfig().getString("UserData.CabinetUser.creditData.imagePath");

    String CAR_DESCRIPTION = readConfig().getString("UserData.CabinetUser.CarProcure.someCarDescr");
    String CAR_TEHN_PASSPT = readConfig().getString("UserData.CabinetUser.CarProcure.passTehnPath");




}
