package com.design.patterns.behavioural.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
