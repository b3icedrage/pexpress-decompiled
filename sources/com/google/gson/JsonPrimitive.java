package com.google.gson;

import defpackage.C3351dO0;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class JsonPrimitive extends JsonElement {
    public final Serializable d;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.d = bool;
    }

    public static boolean i(JsonPrimitive jsonPrimitive) {
        Serializable serializable = jsonPrimitive.d;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.JsonElement
    public final boolean a() {
        Serializable serializable = this.d;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(f());
    }

    @Override // com.google.gson.JsonElement
    public final int b() {
        return this.d instanceof Number ? h().intValue() : Integer.parseInt(f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Serializable serializable = this.d;
        Serializable serializable2 = jsonPrimitive.d;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (i(this) && i(jsonPrimitive)) {
            return h().longValue() == jsonPrimitive.h().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = h().doubleValue();
        double dDoubleValue2 = jsonPrimitive.h().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public final String f() {
        Serializable serializable = this.d;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return h().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final Number h() {
        Serializable serializable = this.d;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C3351dO0((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.d;
        if (serializable == null) {
            return 31;
        }
        if (i(this)) {
            jDoubleToLongBits = h().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.d = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.d = str;
    }
}
