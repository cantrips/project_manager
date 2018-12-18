package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Resource;

import java.util.ArrayList;
import java.util.List;

public class ResourcesFactory {

    public static List<Resource> buildResourceList(){

        Resource resource = new Resource();
        List<Resource> resources = new ArrayList<>();

        resource.setName("some resource");

        resources.add(resource);

        return resources;
    }
}
