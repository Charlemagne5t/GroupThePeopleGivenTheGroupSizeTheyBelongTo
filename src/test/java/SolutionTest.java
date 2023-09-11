import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void groupThePeopleTest1() {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(5)));
        expected.add(new ArrayList<>(List.of(0, 1, 2)));
        expected.add(new ArrayList<>(List.of(3, 4, 6)));
        List<List<Integer>> actual = new Solution().groupThePeople(groupSizes);

        Assert.assertEquals(expected, actual);

    }
}
