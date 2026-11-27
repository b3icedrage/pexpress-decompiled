package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull d = new JsonNull();

    @Deprecated
    public JsonNull() {
    }

    public final boolean equals(Object obj) {
        return obj instanceof JsonNull;
    }

    public final int hashCode() {
        return JsonNull.class.hashCode();
    }
}
