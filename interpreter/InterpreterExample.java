import java.util.Map;
import java.util.HashMap;

public class InterpreterExample {
    public static void main(String[] args) {
        Map<String,Expression> context = new HashMap<String,Expression>();
        context.put("w", new Number(5));
        context.put("x", new Number(10));
        context.put("z", new Number(42));
        int result = (new Plus(new Variable("w"), new Minus(new Variable("x"), new Variable("z")))).interpret(context);
        int result1 = (new Plus(new Number(5), new Minus(new Number(10), new Number(42)))).interpret(context);
        Expression tree = (new Plus(new Number(5), new Minus(new Number(10), new Number(42))));
        System.out.println(tree.interpret(context));
        System.out.println(result);
        System.out.println(result1);
    }
}

