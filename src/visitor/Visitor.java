package visitor;

import visitor.Directory;
import visitor.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
