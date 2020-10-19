
import java.util.List;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestAssert {
    @Test
    public void givenImmutableList_whenRun_ThenSuccess() {


        List<String> someStrings = ImmutableList.of("Baeldung", "is", "cool");

        assertThat(someStrings.size(), is(3));
    }
}
