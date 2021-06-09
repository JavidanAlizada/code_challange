package main.behavioral.command.impl;

import main.behavioral.command.Validator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntityValidator implements Validator<Object> {
    private List<Boolean> booleans;

    public EntityValidator() {
        this.booleans = new ArrayList<>();
    }

    @Override
    public boolean isValid(Object... types) {
        for (Object type : types) {
            Field[] fields = type.getClass().getDeclaredFields();
            Arrays.stream(fields).forEach(field -> isNotNull(field, type));
        }
        return booleans.stream().allMatch(b -> b);
    }

    private void isNotNull(Field f, Object t) {
        f.setAccessible(true);
        try {
            Object currentField = f.get(t);
            boolean isCurrentFieldNotNull = currentField != null;
            if (f.getType() == String.class && isCurrentFieldNotNull)
                booleans.add(!currentField.toString().isEmpty());
            else
                booleans.add(isCurrentFieldNotNull);
        } catch (IllegalAccessException e) {
            booleans.add(false);
        } finally {
            f.setAccessible(false);
        }
    }
}
