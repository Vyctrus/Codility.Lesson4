import org.example.MaxCounters;
import org.example.PermCheck;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestMaxCounters {
    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(5,new int[]{3,4,4,6,1,4,4}, new int[]{3,2,2,4,2})
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int N,int[] A, int[] expected) {
        MaxCounters s = new MaxCounters();
        System.out.println("Array i want: "+ Arrays.toString(expected) + "  Array i have: "+Arrays.toString(s.solution(N,A)));
        assertTrue(Arrays.equals(s.solution(N,A),expected));
    }

}
