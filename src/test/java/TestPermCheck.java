import org.example.FrogRiverOne;
import org.example.PermCheck;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestPermCheck {

    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(new int[]{4,1,3,2}, 1),
                arguments(new int[]{4,1,3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected) {
        PermCheck s = new PermCheck();
        assertTrue((s.solution(A)==expected));
    }
}
