package visitor;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String curDir = "";
    public ListVisitor(String curDir) {
        this.curDir=curDir;
    }

    @Override
    public void visit(File file) {
        System.out.println(curDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(curDir+"/"+directory);
        String saveDir = curDir;
        curDir = curDir+"/"+directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        curDir=saveDir;
    }
}
