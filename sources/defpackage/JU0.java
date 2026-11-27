package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class JU0<V> {
    public final V a;
    public final Throwable b;

    public JU0(V v) {
        this.a = v;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JU0)) {
            return false;
        }
        JU0 ju0 = (JU0) obj;
        V v = this.a;
        if (v != null && v.equals(ju0.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || ju0.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public JU0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
