package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: zW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8044zW extends AbstractC5858p5 {
    public C7538x5.a h;
    public String i;
    public InterfaceC0593Aj1 j;
    public boolean k;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) throws C6487s5 {
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = false;
        this.i = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.h = C7538x5.b(attributesImpl.getValue("scope"));
        if (C8056za.m(this.i)) {
            StringBuilder sbB = C6495s7.b("Missing property name for property definer. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            this.k = true;
            return;
        }
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            StringBuilder sbB2 = C6495s7.b("Missing class name for property definer. Near [", str, "] line ");
            sbB2.append(AbstractC5858p5.u(c3315dC0));
            l(sbB2.toString());
            this.k = true;
            return;
        }
        try {
            n("About to instantiate property definer of type [" + value + "]");
            InterfaceC0593Aj1 interfaceC0593Aj1 = (InterfaceC0593Aj1) C8056za.k(value, InterfaceC0593Aj1.class, this.e);
            this.j = interfaceC0593Aj1;
            interfaceC0593Aj1.j(this.e);
            InterfaceC0593Aj1 interfaceC0593Aj2 = this.j;
            if (interfaceC0593Aj2 instanceof InterfaceC7183vP0) {
                ((InterfaceC7183vP0) interfaceC0593Aj2).start();
            }
            c3315dC0.t(this.j);
        } catch (Exception e) {
            this.k = true;
            m("Could not create an PropertyDefiner of type [" + value + "].", e);
            throw new C6487s5(e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.k) {
            return;
        }
        if (c3315dC0.h.peek() != this.j) {
            p("The object at the of the stack is not the property definer for property named [" + this.i + "] pushed earlier.");
            return;
        }
        n("Popping property definer for property named [" + this.i + "] from the object stack");
        c3315dC0.s();
        String strG = this.j.g();
        if (strG != null) {
            C7538x5.a(c3315dC0, this.i, strG, this.h);
        }
    }
}
