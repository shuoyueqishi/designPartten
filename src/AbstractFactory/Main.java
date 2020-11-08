package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("AbstractFactory.listfactory.ListFactory");

        Link people = factory.createLink("Chinese People","http://people.com.cn");
        Link gmw = factory.createLink("China Daily","http://gwm.com.cn");
        Link us_yahoo = factory.createLink("Yahoo!","http://yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo! JAPAN","http://yahoo@jp.com");
        Link excite = factory.createLink("EXCITE","http://excite.com.cn");
        Link baidu = factory.createLink("BaiDu","http://baidu.com.cn");
        Link google = factory.createLink("GOOGLE","http://google.com");

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray trayChina = factory.createTray("China Today");
        trayChina.add(people);
        trayChina.add(gmw);

        Tray traySearch = factory.createTray("Search");
        traySearch.add(excite);
        traySearch.add(baidu);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage","Alexon");
        page.add(trayChina);
        page.add(trayYahoo);
        page.add(traySearch);
        page.output();
    }
}
