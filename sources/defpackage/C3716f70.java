package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3716f70<Key, Value> implements Map.Entry<Key, Value>, InterfaceC7376wJ0.a {
    public final Key d;
    public Value e;

    public C3716f70(Key key, Value value) {
        this.d = key;
        this.e = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.a(entry.getKey(), this.d) && Intrinsics.a(entry.getValue(), this.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Key key = this.d;
        Intrinsics.checkNotNull(key);
        int iHashCode = key.hashCode() + 527;
        Value value = this.e;
        Intrinsics.checkNotNull(value);
        return value.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value value) {
        this.e = value;
        return value;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append('=');
        sb.append(this.e);
        return sb.toString();
    }
}
