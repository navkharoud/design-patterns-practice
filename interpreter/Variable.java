import java.util.Map;

class Variable implements Expression {
    private String name;
    public Variable(String name) { 
        this.name = name; 
    }
    public int interpret(Map<String,Expression> context)  { 
        return context.get(name).interpret(context); 
    }
}