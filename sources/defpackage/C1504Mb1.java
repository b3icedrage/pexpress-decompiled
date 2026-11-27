package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: Mb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1504Mb1 extends AbstractC5858p5 {
    public final C6859tr h;

    public C1504Mb1(C6859tr c6859tr) {
        this.h = c6859tr;
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        String value = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String value2 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (value == null) {
            l("No name attribute in <param> element");
            return;
        }
        if (value2 == null) {
            l("No value attribute in <param> element");
            return;
        }
        String strTrim = value2.trim();
        C1528Mj1 c1528Mj1 = new C1528Mj1(this.h, c3315dC0.h.peek());
        c1528Mj1.j(this.e);
        c1528Mj1.y(c3315dC0.u(value), c3315dC0.u(strTrim));
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
