package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7878yi<E> extends AbstractC5858p5 {
    public InterfaceC7668xi<E> h;
    public boolean i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) throws C6487s5 {
        this.h = null;
        this.i = false;
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            StringBuilder sbB = C6495s7.b("Missing class name for appender. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            this.i = true;
            return;
        }
        try {
            n("About to instantiate appender of type [" + value + "]");
            InterfaceC7668xi<E> interfaceC7668xi = (InterfaceC7668xi) C8056za.k(value, InterfaceC7668xi.class, this.e);
            this.h = interfaceC7668xi;
            interfaceC7668xi.j(this.e);
            String strU = c3315dC0.u(attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME));
            if (C8056za.m(strU)) {
                p("No appender name given for appender of type " + value + "].");
            } else {
                this.h.b(strU);
                n("Naming appender as [" + strU + "]");
            }
            ((HashMap) c3315dC0.i.get("APPENDER_BAG")).put(strU, this.h);
            c3315dC0.t(this.h);
        } catch (Exception e) {
            this.i = true;
            m("Could not create an Appender of type [" + value + "].", e);
            throw new C6487s5(e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.i) {
            return;
        }
        InterfaceC7668xi<E> interfaceC7668xi = this.h;
        if (interfaceC7668xi != null) {
            interfaceC7668xi.start();
        }
        if (c3315dC0.h.peek() == this.h) {
            c3315dC0.s();
            return;
        }
        p("The object at the of the stack is not the appender named [" + this.h.getName() + "] pushed earlier.");
    }
}
