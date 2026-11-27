package defpackage;

import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: Ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744Ci<E> extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        Object objPeek = c3315dC0.h.peek();
        if (!(objPeek instanceof InterfaceC8088zi)) {
            StringBuilder sbB = C6495s7.b("Could not find an AppenderAttachable at the top of execution stack. Near [", str, "] line ");
            sbB.append(AbstractC5858p5.u(c3315dC0));
            l(sbB.toString());
            return;
        }
        InterfaceC8088zi interfaceC8088zi = (InterfaceC8088zi) objPeek;
        String strU = c3315dC0.u(attributesImpl.getValue("ref"));
        if (C8056za.m(strU)) {
            l("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        InterfaceC7668xi<E> interfaceC7668xi = (InterfaceC7668xi) ((HashMap) c3315dC0.i.get("APPENDER_BAG")).get(strU);
        if (interfaceC7668xi == null) {
            l("Could not find an appender named [" + strU + "]. Did you define it below instead of above in the configuration file?");
            l("See http://logback.qos.ch/codes.html#appender_order for more details.");
            return;
        }
        n("Attaching appender named [" + strU + "] to " + interfaceC8088zi);
        interfaceC8088zi.b(interfaceC7668xi);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
