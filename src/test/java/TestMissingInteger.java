import org.example.MissingInteger;
import org.example.PermCheck;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestMissingInteger {
    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(new int[]{1,3,6,4,1,2}, 4),
                arguments(new int[]{1,2,3}, 4),
                arguments(new int[]{-1,-3}, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected) {
        MissingInteger s = new MissingInteger();
        assertTrue((s.solution(A)==expected));
    }
}
