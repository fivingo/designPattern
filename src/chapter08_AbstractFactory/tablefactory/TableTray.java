package chapter08_AbstractFactory.tablefactory;

import chapter08_AbstractFactory.factory.Item;
import chapter08_AbstractFactory.factory.Tray;

import java.util.Iterator;

/** 구체적인 부품: TableLink나 TableTray를 모은 클래스 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""
                + tray.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");

        Iterator it = tray.iterator();

        while (it.hasNext()) {
            Item item = (Item) it.next();

            buffer.append(item.makeHTML());
        }

        buffer.append("</tr></table>");
        buffer.append("</td>");

        return buffer.toString();
    }
}
