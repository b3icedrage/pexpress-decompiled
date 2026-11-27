package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class G11 {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public G11() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G11.class != obj.getClass()) {
            return false;
        }
        G11 g11 = (G11) obj;
        return this.a.equals(g11.a) && this.b.equals(g11.b) && C6177qc2.b(this.c, g11.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public G11(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }
}
