package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Q82 extends M82<O82, O82> {
    @Override // defpackage.M82
    public final O82 a(Object obj) {
        return ((AbstractC0595Ak0) obj).unknownFields;
    }

    @Override // defpackage.M82
    public final int b(O82 o82) {
        return o82.a();
    }

    @Override // defpackage.M82
    public final int c(O82 o82) {
        O82 o83 = o82;
        int i = o83.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < o83.a; i2++) {
            int i3 = o83.b[i2] >>> 3;
            iW += HE.w(3, (AbstractC1646Nw) o83.c[i2]) + HE.F(2, i3) + (HE.E(1) * 2);
        }
        o83.d = iW;
        return iW;
    }

    @Override // defpackage.M82
    public final void d(Object obj) {
        ((AbstractC0595Ak0) obj).unknownFields.getClass();
    }

    @Override // defpackage.M82
    public final O82 e(Object obj, Object obj2) {
        O82 o82 = (O82) obj;
        O82 o83 = (O82) obj2;
        if (o83.equals(O82.e)) {
            return o82;
        }
        int i = o82.a + o83.a;
        int[] iArrCopyOf = Arrays.copyOf(o82.b, i);
        System.arraycopy(o83.b, 0, iArrCopyOf, o82.a, o83.a);
        Object[] objArrCopyOf = Arrays.copyOf(o82.c, i);
        System.arraycopy(o83.c, 0, objArrCopyOf, o82.a, o83.a);
        return new O82(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // defpackage.M82
    public final void f(AbstractC0595Ak0 abstractC0595Ak0, Object obj) {
        abstractC0595Ak0.unknownFields = (O82) obj;
    }

    @Override // defpackage.M82
    public final void g(O82 o82, InterfaceC5160ll2 interfaceC5160ll2) {
        O82 o83 = o82;
        o83.getClass();
        interfaceC5160ll2.getClass();
        for (int i = 0; i < o83.a; i++) {
            int i2 = o83.b[i] >>> 3;
            Object obj = o83.c[i];
            JE je = (JE) interfaceC5160ll2;
            je.getClass();
            boolean z = obj instanceof AbstractC1646Nw;
            HE.a aVar = je.a;
            if (z) {
                aVar.X(1, 3);
                aVar.Y(2, i2);
                aVar.M(3, (AbstractC1646Nw) obj);
                aVar.X(1, 4);
            } else {
                aVar.X(1, 3);
                aVar.Y(2, i2);
                aVar.X(3, 2);
                aVar.U((GZ0) obj);
                aVar.X(1, 4);
            }
        }
    }

    @Override // defpackage.M82
    public final void h(O82 o82, InterfaceC5160ll2 interfaceC5160ll2) {
        o82.b(interfaceC5160ll2);
    }
}
