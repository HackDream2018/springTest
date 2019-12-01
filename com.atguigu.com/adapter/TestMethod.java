package adapter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2019/8/31
 */
public class TestMethod {
    
    public static void main(String[] args) {
        SpelExpressionParser expParser = new SpelExpressionParser();
        Expression expression = expParser.parseExpression("100*(2+400)*1+66");
        System.out.println(expression.getValue());
    }
    
}
