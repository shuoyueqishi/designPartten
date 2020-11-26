package command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack commandStack = new Stack();

    @Override
    public void execute() {
        Iterator it = commandStack.iterator();
        while (it.hasNext()) {
            Command command =(Command)it.next();
            command.execute();
        }
    }

    public void append(Command command) {
        if (command!=this) {
            commandStack.push(command);
        }
    }

    public void undo() {
        if(!commandStack.empty()) {
            commandStack.pop();
        }
    }

    public void clear() {
        commandStack.clear();
    }
}
