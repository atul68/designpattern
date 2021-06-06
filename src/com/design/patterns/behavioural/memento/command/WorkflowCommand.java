package com.design.patterns.behavioural.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
