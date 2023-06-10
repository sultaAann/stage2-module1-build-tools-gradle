import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream()
                .filter(Predicate.not(StringUtils::isPositiveNumber))
                .findFirst()
                .isEmpty();
    }