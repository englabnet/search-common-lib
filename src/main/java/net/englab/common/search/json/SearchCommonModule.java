package net.englab.common.search.json;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

/**
 * A custom module that provides JSON serializers and deserializers required by the project.
 * Currently, it supports only Guava RangeMap with an Integer as the key.
 */
public class SearchCommonModule extends Module {
    private static final String NAME = "SearchCommonModule";

    @Override
    public String getModuleName() {
        return NAME;
    }

    @Override
    public Version version() {
        return new Version(1, 0, 0, null, null, null);
    }

    @Override
    public void setupModule(Module.SetupContext context) {
        context.addSerializers(new CustomSerializers());
        context.addDeserializers(new CustomDeserializers());
        context.addKeyDeserializers(new CustomKeyDeserializers());
    }
}
