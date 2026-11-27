package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: y41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7746y41 extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        AbstractC5858p5 abstractC5858p5;
        String value = attributesImpl.getValue("pattern");
        String value2 = attributesImpl.getValue("actionClass");
        if (C8056za.m(value)) {
            l("No 'pattern' attribute in <newRule>");
            return;
        }
        if (C8056za.m(value2)) {
            l("No 'actionClass' attribute in <newRule>");
            return;
        }
        try {
            n("About to add new Joran parsing rule [" + value + "," + value2 + "].");
            C5286mM1 c5286mM1 = c3315dC0.k.a;
            C5439n50 c5439n50 = new C5439n50(value);
            try {
                abstractC5858p5 = (AbstractC5858p5) C8056za.k(value2, AbstractC5858p5.class, c5286mM1.e);
            } catch (Exception e) {
                c5286mM1.m("Could not instantiate class [" + value2 + "]", e);
                abstractC5858p5 = null;
            }
            if (abstractC5858p5 != null) {
                c5286mM1.q(c5439n50, abstractC5858p5);
            }
        } catch (Exception unused) {
            l(C4694ja0.a("Could not add new Joran parsing rule [", value, ",", value2, "]"));
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
