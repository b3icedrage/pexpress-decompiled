package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class C7 implements InterfaceC1764Pj0, Serializable {
    public final Object d;
    public final Class e;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public C7(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.d = obj;
        this.e = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7)) {
            return false;
        }
        C7 c7 = (C7) obj;
        return this.i == c7.i && this.j == c7.j && this.k == c7.k && Intrinsics.a(this.d, c7.d) && this.e.equals(c7.e) && this.g.equals(c7.g) && this.h.equals(c7.h);
    }

    @Override // defpackage.InterfaceC1764Pj0
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        Object obj = this.d;
        return ((((C1039Gc0.b(C1039Gc0.b((this.e.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.g), 31, this.h) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        return C2017Sp1.a.h(this);
    }
}
