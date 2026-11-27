package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class GS0 extends AbstractC5858p5 {
    public boolean h;
    public BS0 i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        this.h = false;
        this.i = null;
        HS0 hs0 = this.e;
        String strU = c3315dC0.u(attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (C8056za.m(strU)) {
            this.h = true;
            l("No 'name' attribute in element " + str + ", around " + AbstractC5858p5.t(c3315dC0));
            return;
        }
        this.i = hs0.d(strU);
        String strU2 = c3315dC0.u(attributesImpl.getValue("level"));
        if (!C8056za.m(strU2)) {
            if ("INHERITED".equalsIgnoreCase(strU2) || "NULL".equalsIgnoreCase(strU2)) {
                n("Setting level of logger [" + strU + "] to null, i.e. INHERITED");
                this.i.h(null);
            } else {
                C5714oP0 c5714oP0A = C5714oP0.a(strU2);
                n("Setting level of logger [" + strU + "] to " + c5714oP0A);
                this.i.h(c5714oP0A);
            }
        }
        String strU3 = c3315dC0.u(attributesImpl.getValue("additivity"));
        if (!C8056za.m(strU3)) {
            boolean zW = C8056za.w(strU3, true);
            n("Setting additivity of logger [" + strU + "] to " + zW);
            this.i.k = zW;
        }
        c3315dC0.t(this.i);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.h) {
            return;
        }
        Object objPeek = c3315dC0.h.peek();
        if (objPeek == this.i) {
            c3315dC0.s();
            return;
        }
        p("The object on the top the of the stack is not " + this.i + " pushed earlier");
        StringBuilder sb = new StringBuilder("It is: ");
        sb.append(objPeek);
        p(sb.toString());
    }
}
