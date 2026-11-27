package defpackage;

import java.lang.reflect.Method;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: b31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2863b31 extends AbstractC1333Jw0 {
    public final Stack<C1788Pr0> h = new Stack<>();
    public final C6859tr i;

    public C2863b31(C6859tr c6859tr) {
        this.i = c6859tr;
    }

    @Override // defpackage.AbstractC5858p5
    public final void r(C3315dC0 c3315dC0, String str) {
        String strU = c3315dC0.u(str);
        C1788Pr0 c1788Pr0Peek = this.h.peek();
        int iOrdinal = c1788Pr0Peek.b.ordinal();
        String str2 = c1788Pr0Peek.c;
        C1528Mj1 c1528Mj1 = c1788Pr0Peek.a;
        if (iOrdinal == 1) {
            c1528Mj1.y(str2, strU);
            return;
        }
        if (iOrdinal != 3) {
            l("Unexpected aggregationType " + c1788Pr0Peek.b);
            return;
        }
        if (strU == null) {
            return;
        }
        String str3 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        Method methodS = c1528Mj1.s(str3);
        if (methodS == null) {
            c1528Mj1.l("No adder for property [" + str3 + "].");
            return;
        }
        Class<?>[] parameterTypes = methodS.getParameterTypes();
        c1528Mj1.w(str3, parameterTypes, strU);
        try {
            if (C8056za.c(c1528Mj1, strU, parameterTypes[0]) != null) {
                c1528Mj1.v(methodS, strU);
            }
        } catch (Throwable th) {
            c1528Mj1.m("Conversion to type [" + parameterTypes[0] + "] failed. ", th);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        this.h.pop();
    }

    @Override // defpackage.AbstractC1333Jw0
    public final boolean v(C5229m50 c5229m50, C3315dC0 c3315dC0) {
        String strB = c5229m50.b();
        if (!c3315dC0.h.isEmpty()) {
            C1528Mj1 c1528Mj1 = new C1528Mj1(this.i, c3315dC0.h.peek());
            c1528Mj1.j(this.e);
            EnumC5874p9 enumC5874p9Q = c1528Mj1.q(strB);
            int iOrdinal = enumC5874p9Q.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                l("PropertySetter.canContainComponent returned " + enumC5874p9Q);
                                return false;
                            }
                        }
                    }
                }
                this.h.push(new C1788Pr0(c1528Mj1, enumC5874p9Q, strB));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
    }
}
