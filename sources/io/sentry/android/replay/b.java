package io.sentry.android.replay;

import defpackage.C0702Bu;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends LinkedHashMap<C0702Bu, io.sentry.util.network.d> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof C0702Bu) {
            return super.containsKey((C0702Bu) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof io.sentry.util.network.d) {
            return super.containsValue((io.sentry.util.network.d) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof C0702Bu) {
            return (io.sentry.util.network.d) super.get((C0702Bu) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof C0702Bu) ? obj2 : (io.sentry.util.network.d) super.getOrDefault((C0702Bu) obj, (io.sentry.util.network.d) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof C0702Bu) {
            return (io.sentry.util.network.d) super.remove((C0702Bu) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<C0702Bu, io.sentry.util.network.d> entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof C0702Bu) && (obj2 instanceof io.sentry.util.network.d)) {
            return super.remove((C0702Bu) obj, (io.sentry.util.network.d) obj2);
        }
        return false;
    }
}
