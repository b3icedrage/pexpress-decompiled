package defpackage;

import java.lang.reflect.Method;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: c31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3072c31 extends AbstractC1333Jw0 {
    public final Stack<C1866Qr0> h = new Stack<>();
    public final C6859tr i;

    public C3072c31(C6859tr c6859tr) {
        this.i = c6859tr;
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        C1866Qr0 c1866Qr0Peek = this.h.peek();
        String strU = c3315dC0.u(attributesImpl.getValue("class"));
        try {
            Class<?> clsLoadClass = !C8056za.m(strU) ? C6559sR0.a(this.e).loadClass(strU) : c1866Qr0Peek.a.u(c1866Qr0Peek.c, c1866Qr0Peek.b, c3315dC0.m);
            if (clsLoadClass == null) {
                c1866Qr0Peek.e = true;
                l("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (C8056za.m(strU)) {
                n("Assuming default type [" + clsLoadClass.getName() + "] for [" + str + "] property");
            }
            Object objNewInstance = clsLoadClass.newInstance();
            c1866Qr0Peek.d = objNewInstance;
            if (objNewInstance instanceof InterfaceC5284mM) {
                ((InterfaceC5284mM) objNewInstance).j(this.e);
            }
            c3315dC0.t(c1866Qr0Peek.d);
        } catch (Exception e) {
            c1866Qr0Peek.e = true;
            m(C4694ja0.a("Could not create component [", str, "] of type [", strU, "]"), e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        C1866Qr0 c1866Qr0Pop = this.h.pop();
        if (c1866Qr0Pop.e) {
            return;
        }
        C1528Mj1 c1528Mj1 = new C1528Mj1(this.i, c1866Qr0Pop.d);
        c1528Mj1.j(this.e);
        EnumC5874p9 enumC5874p9Q = c1528Mj1.q("parent");
        EnumC5874p9 enumC5874p9 = EnumC5874p9.g;
        C1528Mj1 c1528Mj2 = c1866Qr0Pop.a;
        if (enumC5874p9Q == enumC5874p9) {
            c1528Mj1.x(c1528Mj2.h, "parent");
        }
        Object obj = c1866Qr0Pop.d;
        if ((obj instanceof InterfaceC7183vP0) && obj != null && ((O41) obj.getClass().getAnnotation(O41.class)) == null) {
            ((InterfaceC7183vP0) obj).start();
        }
        if (c3315dC0.h.peek() != c1866Qr0Pop.d) {
            l("The object on the top the of the stack is not the component pushed earlier.");
            return;
        }
        c3315dC0.s();
        EnumC5874p9 enumC5874p10 = c1866Qr0Pop.b;
        int iOrdinal = enumC5874p10.ordinal();
        if (iOrdinal == 2) {
            c1528Mj2.x(c1866Qr0Pop.d, str);
            return;
        }
        if (iOrdinal != 4) {
            l("Unexpected aggregationType " + enumC5874p10);
            return;
        }
        Object obj2 = c1866Qr0Pop.d;
        Method methodS = c1528Mj2.s(str);
        if (methodS != null) {
            if (c1528Mj2.w(str, methodS.getParameterTypes(), obj2)) {
                c1528Mj2.v(methodS, obj2);
            }
        } else {
            StringBuilder sbB = C6495s7.b("Could not find method [add", str, "] in class [");
            sbB.append(c1528Mj2.i.getName());
            sbB.append("].");
            c1528Mj2.l(sbB.toString());
        }
    }

    @Override // defpackage.AbstractC1333Jw0
    public final boolean v(C5229m50 c5229m50, C3315dC0 c3315dC0) {
        String strB = c5229m50.b();
        if (!c3315dC0.h.isEmpty()) {
            C1528Mj1 c1528Mj1 = new C1528Mj1(this.i, c3315dC0.h.peek());
            c1528Mj1.j(this.e);
            EnumC5874p9 enumC5874p9Q = c1528Mj1.q(strB);
            int iOrdinal = enumC5874p9Q.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            l("PropertySetter.computeAggregationType returned " + enumC5874p9Q);
                            return false;
                        }
                    }
                }
                this.h.push(new C1866Qr0(c1528Mj1, enumC5874p9Q, strB));
                return true;
            }
        }
        return false;
    }
}
