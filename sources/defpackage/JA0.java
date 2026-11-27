package defpackage;

import javax.naming.NamingException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class JA0 extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        int i;
        String strU = c3315dC0.u(attributesImpl.getValue("env-entry-name"));
        String strU2 = c3315dC0.u(attributesImpl.getValue("as"));
        C7538x5.a aVarB = C7538x5.b(attributesImpl.getValue("scope"));
        if (C8056za.m(strU)) {
            l("[env-entry-name] missing, around " + AbstractC5858p5.t(c3315dC0));
            i = 1;
        } else {
            i = 0;
        }
        if (C8056za.m(strU2)) {
            l("[as] missing, around " + AbstractC5858p5.t(c3315dC0));
            i++;
        }
        if (i != 0) {
            return;
        }
        try {
            String strB = GD0.b(GD0.a(), strU);
            if (C8056za.m(strB)) {
                l("[" + strU + "] has null or empty value");
                return;
            }
            n("Setting variable [" + strU2 + "] to [" + strB + "] in [" + aVarB + "] scope");
            C7538x5.a(c3315dC0, strU2, strB, aVarB);
        } catch (NamingException unused) {
            l("Failed to lookup JNDI env-entry [" + strU + "]");
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
