package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class RZ1 extends AbstractC5858p5 {
    public boolean h;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        long jCurrentTimeMillis;
        String value = attributesImpl.getValue("key");
        if (C8056za.m(value)) {
            l("Attribute named [key] cannot be empty");
            this.h = true;
        }
        String value2 = attributesImpl.getValue("datePattern");
        if (C8056za.m(value2)) {
            l("Attribute named [datePattern] cannot be empty");
            this.h = true;
        }
        if ("contextBirth".equalsIgnoreCase(attributesImpl.getValue("timeReference"))) {
            n("Using context birth as time reference.");
            jCurrentTimeMillis = this.e.d;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            n("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.h) {
            return;
        }
        C7538x5.a aVarB = C7538x5.b(attributesImpl.getValue("scope"));
        String str2 = jCurrentTimeMillis != -1 ? new SimpleDateFormat(value2).format(new Date(jCurrentTimeMillis)) : null;
        StringBuilder sbA = C5896pG.a("Adding property to the context with key=\"", value, "\" and value=\"", str2, "\" to the ");
        sbA.append(aVarB);
        sbA.append(" scope");
        n(sbA.toString());
        C7538x5.a(c3315dC0, value, str2, aVarB);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
