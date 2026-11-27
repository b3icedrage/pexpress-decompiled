package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: cQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3148cQ1 extends AbstractC5858p5 {
    public boolean h;
    public Boolean i;
    public InterfaceC2939bQ1 j;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) throws C6487s5 {
        this.h = false;
        this.i = null;
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            StringBuilder sbB = C6495s7.b("Missing class name for statusListener. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            this.h = true;
            return;
        }
        try {
            InterfaceC2939bQ1 interfaceC2939bQ1 = (InterfaceC2939bQ1) C8056za.k(value, InterfaceC2939bQ1.class, this.e);
            this.j = interfaceC2939bQ1;
            this.i = Boolean.valueOf(c3315dC0.e.g.b(interfaceC2939bQ1));
            InterfaceC2939bQ1 interfaceC2939bQ2 = this.j;
            if (interfaceC2939bQ2 instanceof InterfaceC5284mM) {
                ((InterfaceC5284mM) interfaceC2939bQ2).j(this.e);
            }
            n("Added status listener of type [" + value + "]");
            c3315dC0.t(this.j);
        } catch (Exception e) {
            this.h = true;
            m("Could not create an StatusListener of type [" + value + "].", e);
            throw new C6487s5(e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.h) {
            return;
        }
        Boolean bool = this.i;
        if (bool == null ? false : bool.booleanValue()) {
            InterfaceC2939bQ1 interfaceC2939bQ1 = this.j;
            if (interfaceC2939bQ1 instanceof InterfaceC7183vP0) {
                ((InterfaceC7183vP0) interfaceC2939bQ1).start();
            }
        }
        if (c3315dC0.h.peek() != this.j) {
            p("The object at the of the stack is not the statusListener pushed earlier.");
        } else {
            c3315dC0.s();
        }
    }
}
