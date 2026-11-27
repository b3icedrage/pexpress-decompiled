package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: qc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6175qc0 {
    public final String a;
    public final Map<Class<?>, Object> b;

    public C6175qc0(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    @NonNull
    public static C6175qc0 a(@NonNull String str) {
        return new C6175qc0(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6175qc0)) {
            return false;
        }
        C6175qc0 c6175qc0 = (C6175qc0) obj;
        return this.a.equals(c6175qc0.a) && this.b.equals(c6175qc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
