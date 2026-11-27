package defpackage;

import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class FD0 extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        n("begin");
        String str2 = this.e.e;
        String value = attributesImpl.getValue("contextName");
        if (!C8056za.m(value)) {
            str2 = value;
        }
        String value2 = attributesImpl.getValue("objectName");
        if (C8056za.m(value2)) {
            StringBuilder sbB = C6495s7.b("ch.qos.logback.classic:Name=", str2, ",Type=");
            sbB.append(ED0.class.getName());
            value2 = sbB.toString();
        }
        ObjectName objectNameB = ZU0.b(this.e, this, value2);
        if (objectNameB == null) {
            l("Failed construct ObjectName for [" + value2 + "]");
            return;
        }
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        if (ZU0.a(platformMBeanServer, objectNameB)) {
            return;
        }
        try {
            platformMBeanServer.registerMBean(new ED0(this.e, platformMBeanServer, objectNameB), objectNameB);
        } catch (Exception e) {
            m("Failed to create mbean", e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
