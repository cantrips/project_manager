package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Inbox;
import io.ueb.projectlist.model.InboxItem;

import java.util.ArrayList;
import java.util.List;

public class InboxFactory {

    public static Inbox buildInbox(){

        List<InboxItem> inboxItems = new ArrayList<>();
        InboxItem inboxItem = new InboxItem();

        inboxItem.setName("some inbox item");
        inboxItems.add(inboxItem);

        Inbox inbox = new Inbox();
        inbox.setInboxItems(inboxItems);

        return inbox;
    }
}
