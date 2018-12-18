package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Checklist;
import io.ueb.projectlist.model.ListItem;
import io.ueb.projectlist.model.Looplist;

public class LooplistFactory {

    public static Looplist buildLooplist(){
        Looplist looplist = new Looplist();

        ListItem looplistItem1 = new ListItem();
        looplistItem1.setName("some looplist item");
        ListItem looplistItem2 = new ListItem();
        looplistItem2.setName("another looplist item");

        looplist.getLooplistItems().add(looplistItem1);
        looplist.getLooplistItems().add(looplistItem2);

        return looplist;
    }
}