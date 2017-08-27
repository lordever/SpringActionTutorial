import mvc.model.Spitter;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class HomeControllerTest {
    @Test
    public void shouldDisplayRecentSpitters(){
        List<Spitter> expectedList = asList(new Spitter(), new Spitter(), new Spitter());

    }
}
