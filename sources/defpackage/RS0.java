package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RS0 implements InterfaceC6237qt0, Serializable {
    public String d;
    public String e;
    public KS0 g;
    public transient C5714oP0 h;
    public String i;
    public transient String j;
    public transient Object[] k;
    public RY1 l;
    public StackTraceElement[] m;
    public UW0 n;
    public Map<String, String> o;
    public long p;

    @Override // defpackage.InterfaceC6237qt0
    public final StackTraceElement[] a() {
        return this.m;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final long b() {
        return this.p;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String c() {
        return this.e;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String d() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        Object[] objArr = this.k;
        if (objArr != null) {
            this.j = (String) C3043bv.b(this.i, objArr).a;
        } else {
            this.j = this.i;
        }
        return this.j;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final Object[] e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RS0.class != obj.getClass()) {
            return false;
        }
        RS0 rs0 = (RS0) obj;
        String str = this.i;
        if (str == null) {
            if (rs0.i != null) {
                return false;
            }
        } else if (!str.equals(rs0.i)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (rs0.e != null) {
                return false;
            }
        } else if (!str2.equals(rs0.e)) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (rs0.d != null) {
                return false;
            }
        } else if (!str3.equals(rs0.d)) {
            return false;
        }
        if (this.p != rs0.p) {
            return false;
        }
        UW0 uw0 = this.n;
        if (uw0 == null) {
            if (rs0.n != null) {
                return false;
            }
        } else if (!uw0.equals(rs0.n)) {
            return false;
        }
        Map<String, String> map = this.o;
        if (map == null) {
            if (rs0.o != null) {
                return false;
            }
        } else if (!map.equals(rs0.o)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final KS0 f() {
        return this.g;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final UW0 g() {
        return this.n;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final C5714oP0 getLevel() {
        return this.h;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String getMessage() {
        return this.i;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final InterfaceC3882fv0 h() {
        return this.l;
    }

    public final int hashCode() {
        String str = this.i;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.p;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.InterfaceC6237qt0
    public final boolean i() {
        return this.m != null;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final Map<String, String> k() {
        return this.o;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String l() {
        return this.d;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final void j() {
    }
}
