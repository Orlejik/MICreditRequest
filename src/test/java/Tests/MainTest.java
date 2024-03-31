package Tests;

import Core.CoreSeleniumTest;
import Tests.UnitTests.AnonimCreditRequest;
import Tests.UnitTests.CreditRequestFfromCabinet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        AnonimCreditRequest.class,
        CreditRequestFfromCabinet.class,
})
public class MainTest extends CoreSeleniumTest {
}
