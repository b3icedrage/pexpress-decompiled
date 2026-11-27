package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: pP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5924pP0 extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        Object objPeek = c3315dC0.h.peek();
        if (!(objPeek instanceof BS0)) {
            l("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        BS0 bs0 = (BS0) objPeek;
        String str2 = bs0.d;
        String strU = c3315dC0.u(attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if ("INHERITED".equalsIgnoreCase(strU) || "NULL".equalsIgnoreCase(strU)) {
            bs0.h(null);
        } else {
            bs0.h(C5714oP0.a(strU));
        }
        StringBuilder sbB = K1.b(str2, " level set to ");
        sbB.append(bs0.e);
        n(sbB.toString());
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
