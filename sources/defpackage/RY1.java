package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class RY1 implements InterfaceC3882fv0, Serializable {
    public String d;
    public String e;
    public int g;
    public UO1[] h;
    public RY1 i;
    public InterfaceC3882fv0[] j;

    public static RY1 e(InterfaceC3882fv0 interfaceC3882fv0) {
        if (interfaceC3882fv0 == null) {
            return null;
        }
        RY1 ry1 = new RY1();
        ry1.d = interfaceC3882fv0.b();
        ry1.e = interfaceC3882fv0.getMessage();
        ry1.g = interfaceC3882fv0.a();
        ry1.h = interfaceC3882fv0.d();
        InterfaceC3882fv0 cause = interfaceC3882fv0.getCause();
        if (cause != null) {
            ry1.i = e(cause);
        }
        InterfaceC3882fv0[] interfaceC3882fv0ArrC = interfaceC3882fv0.c();
        if (interfaceC3882fv0ArrC != null) {
            ry1.j = new InterfaceC3882fv0[interfaceC3882fv0ArrC.length];
            for (int i = 0; i < interfaceC3882fv0ArrC.length; i++) {
                ry1.j[i] = e(interfaceC3882fv0ArrC[i]);
            }
        }
        return ry1;
    }

    @Override // defpackage.InterfaceC3882fv0
    public final int a() {
        return this.g;
    }

    @Override // defpackage.InterfaceC3882fv0
    public final String b() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3882fv0
    public final InterfaceC3882fv0[] c() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3882fv0
    public final UO1[] d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RY1.class != obj.getClass()) {
            return false;
        }
        RY1 ry1 = (RY1) obj;
        String str = this.d;
        if (str == null) {
            if (ry1.d != null) {
                return false;
            }
        } else if (!str.equals(ry1.d)) {
            return false;
        }
        if (!Arrays.equals(this.h, ry1.h) || !Arrays.equals(this.j, ry1.j)) {
            return false;
        }
        RY1 ry2 = this.i;
        if (ry2 == null) {
            return ry1.i == null;
        }
        return ry2.equals(ry1.i);
    }

    @Override // defpackage.InterfaceC3882fv0
    public final InterfaceC3882fv0 getCause() {
        return this.i;
    }

    @Override // defpackage.InterfaceC3882fv0
    public final String getMessage() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.d;
        return 31 + (str == null ? 0 : str.hashCode());
    }
}
