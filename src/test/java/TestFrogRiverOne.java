import org.example.FrogRiverOne;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestFrogRiverOne {

    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(5,new int[]{1, 3,1,4,2,3,5,4}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int X, int[] A, int expected) {
        FrogRiverOne s = new FrogRiverOne();
        System.out.println("What I expect: "+expected+"  What I got: "+s.solution(X,A));
        assertTrue((s.solution(X,A)==expected));
    }
}
