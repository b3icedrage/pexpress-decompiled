package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class UA1 extends AbstractC5858p5 {
    public BS0 h;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        this.h = this.e.d("ROOT");
        String strU = c3315dC0.u(attributesImpl.getValue("level"));
        if (!C8056za.m(strU)) {
            C5714oP0 c5714oP0A = C5714oP0.a(strU);
            n("Setting level of ROOT logger to " + c5714oP0A);
            this.h.h(c5714oP0A);
        }
        c3315dC0.t(this.h);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        Object objPeek = c3315dC0.h.peek();
        if (objPeek == this.h) {
            c3315dC0.s();
            return;
        }
        p("The object on the top the of the stack is not the root logger");
        p("It is: " + objPeek);
    }
}
