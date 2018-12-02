package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Checklist;
import io.ueb.projectlist.model.ChecklistItem;

public class ChecklistFactory {

    public static Checklist buildChecklist(){
        Checklist checklist = new Checklist();

        ChecklistItem checklistItem1 = new ChecklistItem();
        checklistItem1.setName("some checklist item");
        ChecklistItem checklistItem2 = new ChecklistItem();
        checklistItem2.setName("another checklist item");

        checklist.getChecklistItems().add(checklistItem1);
        checklist.getChecklistItems().add(checklistItem2);

        return checklist;
    }
}
