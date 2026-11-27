package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class DL1 extends AbstractC5858p5 {
    public EL1 h;
    public boolean i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) throws C6487s5 {
        this.h = null;
        this.i = false;
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            StringBuilder sbB = C6495s7.b("Missing class name for shutdown hook. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            this.i = true;
            return;
        }
        try {
            n("About to instantiate shutdown hook of type [" + value + "]");
            EL1 el1 = (EL1) C8056za.k(value, EL1.class, this.e);
            this.h = el1;
            el1.j(this.e);
            c3315dC0.t(this.h);
        } catch (Exception e) {
            this.i = true;
            m("Could not create a shutdown hook of type [" + value + "].", e);
            throw new C6487s5(e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.i) {
            return;
        }
        if (c3315dC0.h.peek() != this.h) {
            p("The object at the of the stack is not the hook pushed earlier.");
            return;
        }
        c3315dC0.s();
        Thread thread = new Thread(this.h, C5807oq.b(new StringBuilder("Logback shutdown hook ["), this.e.e, "]"));
        this.e.i(thread, "SHUTDOWN_HOOK");
        Runtime.getRuntime().addShutdownHook(thread);
    }
}
