import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.mindtree.test.GetLeadById;
import com.mindtree.test.TestGetAllMinds;
import com.mindtree.test.TestGetById;
import com.mindtree.test.TestRetrieve;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GetLeadById.class,
	TestGetAllMinds.class,
	TestGetById.class,
	TestRetrieve.class,
	
})
public class TestSuitClass {

	
	
	
}
