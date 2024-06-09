package net.englab.common.search.json;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.google.common.collect.Range;
import net.englab.common.search.json.deserializers.RangeKeyDeserializer;

/**
 * This class provides custom key deserializers required by the project.
 */
public class CustomKeyDeserializers implements KeyDeserializers {
    @Override
    public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) {
        if (Range.class.isAssignableFrom(type.getRawClass())) {
            JavaType containedType = type.containedType(0);
            return new RangeKeyDeserializer(containedType);
        }
        return null;
    }
}
