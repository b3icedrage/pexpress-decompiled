package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class JS0 extends AbstractC5858p5 {
    public boolean h;
    public IS0 i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        this.h = false;
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            l("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            this.h = true;
            return;
        }
        try {
            IS0 is0 = (IS0) C8056za.k(value, IS0.class, this.e);
            this.i = is0;
            if (is0 instanceof InterfaceC5284mM) {
                ((InterfaceC5284mM) is0).j(this.e);
            }
            c3315dC0.t(this.i);
            n("Adding LoggerContextListener of type [" + value + "] to the object stack");
        } catch (Exception e) {
            this.h = true;
            m("Could not create LoggerContextListener of type " + value + "].", e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.h) {
            return;
        }
        Object objPeek = c3315dC0.h.peek();
        IS0 is0 = this.i;
        if (objPeek != is0) {
            p("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
            return;
        }
        if (is0 instanceof InterfaceC7183vP0) {
            ((InterfaceC7183vP0) is0).start();
            n("Starting LoggerContextListener");
        }
        HS0 hs0 = this.e;
        hs0.q.add(this.i);
        c3315dC0.s();
    }
}
