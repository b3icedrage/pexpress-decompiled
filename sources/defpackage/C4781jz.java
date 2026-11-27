package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4781jz<Value> implements Map<String, Value>, InterfaceC7376wJ0 {

    @NotNull
    public final LinkedHashMap d = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.d.containsKey(new C4991kz(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.d.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Value>> entrySet() {
        return new TW(this.d.entrySet(), C3893fz.d, C4103gz.d);
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C4781jz)) {
            return false;
        }
        return Intrinsics.a(((C4781jz) obj).d, this.d);
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return (Value) this.d.get(QO.f(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new TW(this.d.keySet(), C4313hz.d, C4561iz.e);
    }

    @Override // java.util.Map
    public final Object put(String str, Object value) {
        String key = str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.d.put(QO.f(key), value);
    }

    @Override // java.util.Map
    public final void putAll(@NotNull Map<? extends String, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.d.put(QO.f(key), value);
        }
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return (Value) this.d.remove(QO.f(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.d.values();
    }
}
