package org.talend.tql.model;

import java.util.Arrays;

import org.talend.tql.visitor.IASTVisitor;

/**
 * Logical conjunction of given set of Tql expressions.
 */

public class AndExpression implements Expression {

    private final Expression[] expressions;

    public AndExpression(Expression... expressions) {
        this.expressions = expressions;
    }

    public Expression[] getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        return "AndExpression{" + "expressions=" + Arrays.toString(expressions) + '}';
    }

    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
