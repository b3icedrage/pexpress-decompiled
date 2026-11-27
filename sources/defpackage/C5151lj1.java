package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: lj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5151lj1<T> {
    public final String a;

    public C5151lj1(@NonNull String str) {
        this.a = str;
    }

    @NonNull
    public final T a(@NonNull C4047gi c4047gi) {
        T t = (T) ((HashMap) c4047gi.d).get(this);
        if (t != null) {
            return t;
        }
        throw new NullPointerException(this.a);
    }

    public final void b(@NonNull C4047gi c4047gi, T t) {
        HashMap map = (HashMap) c4047gi.d;
        if (t == null) {
            map.remove(this);
        } else {
            map.put(this, t);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5151lj1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C5151lj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return C5807oq.b(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
