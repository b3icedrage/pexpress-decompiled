package com.google.gson;

import defpackage.EK;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList<JsonElement> d = new ArrayList<>();

    @Override // com.google.gson.JsonElement
    public final boolean a() {
        return i().a();
    }

    @Override // com.google.gson.JsonElement
    public final int b() {
        return i().b();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).d.equals(this.d);
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public final String f() {
        return i().f();
    }

    public final JsonElement h(int i) {
        return this.d.get(i);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final JsonElement i() {
        ArrayList<JsonElement> arrayList = this.d;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        throw new IllegalStateException(EK.e(size, "Array must have size 1, but has size "));
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.d.iterator();
    }
}
