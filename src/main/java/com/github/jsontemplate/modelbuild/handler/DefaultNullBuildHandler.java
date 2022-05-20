package com.github.jsontemplate.modelbuild.handler;

import com.github.jsontemplate.jsonbuild.JsonNode;
import com.github.jsontemplate.jsonbuild.JsonNullNode;
import com.github.jsontemplate.jsonbuild.JsonStringNode;

/**
 * default not find type handler with null object
 */
public class DefaultNullBuildHandler implements  DefaultBuildHandler{
    @Override
    public JsonNode handle(String valueTypeName) {
        return JsonStringNode.of(null);
    }
}
