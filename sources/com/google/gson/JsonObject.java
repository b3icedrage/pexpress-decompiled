package com.google.gson;

import defpackage.C7817yQ0;

/* JADX INFO: loaded from: classes.dex */
public final class JsonObject extends JsonElement {
    public final C7817yQ0<String, JsonElement> d = new C7817yQ0<>(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).d.equals(this.d);
        }
        return true;
    }

    public final JsonElement h(String str) {
        return this.d.get(str);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
