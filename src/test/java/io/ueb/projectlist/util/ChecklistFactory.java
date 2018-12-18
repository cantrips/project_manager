package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Checklist;
import io.ueb.projectlist.model.ListItem;

public class ChecklistFactory {

    public static Checklist buildChecklist(){
        Checklist checklist = new Checklist();

        ListItem checklistItem1 = new ListItem();
        checklistItem1.setName("some checklist item");
        ListItem checklistItem2 = new ListItem();
        checklistItem2.setName("another checklist item");

        checklist.getChecklistItems().add(checklistItem1);
        checklist.getChecklistItems().add(checklistItem2);

        return checklist;
    }
}
