package defpackage;

import java.util.HashSet;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: Eo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0920Eo1 extends AbstractC5858p5 {
    public AbstractC0998Fo1 h;
    public boolean i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) throws C6487s5 {
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            StringBuilder sbB = C6495s7.b("Missing class name for receiver. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            this.i = true;
            return;
        }
        try {
            n("About to instantiate receiver of type [" + value + "]");
            AbstractC0998Fo1 abstractC0998Fo1 = (AbstractC0998Fo1) C8056za.k(value, AbstractC0998Fo1.class, this.e);
            this.h = abstractC0998Fo1;
            abstractC0998Fo1.j(this.e);
            c3315dC0.t(this.h);
        } catch (Exception e) {
            this.i = true;
            m("Could not create a receiver of type [" + value + "].", e);
            throw new C6487s5(e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.i) {
            return;
        }
        HS0 hs0 = c3315dC0.e;
        ((HashSet) hs0.c().d).add(this.h);
        this.h.start();
        if (c3315dC0.h.peek() != this.h) {
            p("The object at the of the stack is not the remote pushed earlier.");
        } else {
            c3315dC0.s();
        }
    }
}
