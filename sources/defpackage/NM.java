package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class NM extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        String value = attributesImpl.getValue("conversionWord");
        String value2 = attributesImpl.getValue("converterClass");
        if (C8056za.m(value)) {
            l("No 'conversionWord' attribute in <conversionRule>");
            return;
        }
        if (C8056za.m(value2)) {
            c3315dC0.l("No 'converterClass' attribute in <conversionRule>");
            return;
        }
        try {
            Map map = (Map) this.e.i.get("PATTERN_RULE_REGISTRY");
            if (map == null) {
                map = new HashMap();
                this.e.i(map, "PATTERN_RULE_REGISTRY");
            }
            n("registering conversion word " + value + " with class [" + value2 + "]");
            map.put(value, value2);
        } catch (Exception unused) {
            l("Could not add conversion rule to PatternLayout.");
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
