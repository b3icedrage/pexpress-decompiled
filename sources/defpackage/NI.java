package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class NI extends AbstractC5858p5 {
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        String strU;
        O40 o40A;
        System.currentTimeMillis();
        try {
            strU = System.getProperty("logback.debug");
        } catch (SecurityException unused) {
            strU = null;
        }
        if (strU == null) {
            strU = c3315dC0.u(attributesImpl.getValue("debug"));
        }
        if (C8056za.m(strU) || strU.equalsIgnoreCase("false") || strU.equalsIgnoreCase("null")) {
            n("debug attribute not set");
        } else {
            HS0 hs0 = this.e;
            V81 v81 = new V81();
            v81.j(hs0);
            if (hs0.g.b(v81)) {
                v81.start();
            }
        }
        String strU2 = c3315dC0.u(attributesImpl.getValue("scan"));
        if (!C8056za.m(strU2) && !"false".equalsIgnoreCase(strU2)) {
            ScheduledExecutorService scheduledExecutorServiceH = this.e.h();
            HS0 hs1 = this.e;
            C4852kJ c4852kJ = C4852kJ.a;
            C4642jJ c4642jJ = (C4642jJ) hs1.i.get("CONFIGURATION_WATCH_LIST");
            URL url = c4642jJ == null ? null : c4642jJ.h;
            if (url == null) {
                p("Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done.");
            } else {
                RunnableC1388Ko1 runnableC1388Ko1 = new RunnableC1388Ko1();
                runnableC1388Ko1.h = System.currentTimeMillis();
                runnableC1388Ko1.j(this.e);
                this.e.i(runnableC1388Ko1, "RECONFIGURE_ON_CHANGE_TASK");
                String strU3 = c3315dC0.u(attributesImpl.getValue("scanPeriod"));
                if (C8056za.m(strU3)) {
                    o40A = null;
                } else {
                    try {
                        o40A = O40.a(strU3);
                    } catch (NumberFormatException e) {
                        m("Error while converting [" + strU2 + "] to long", e);
                        o40A = null;
                    }
                }
                if (o40A != null) {
                    n("Will scan for changes in [" + url + "] ");
                    StringBuilder sb = new StringBuilder("Setting ReconfigureOnChangeTask scanning period to ");
                    sb.append(o40A);
                    n(sb.toString());
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long j = o40A.a;
                    this.e.l.add(((ScheduledThreadPoolExecutor) scheduledExecutorServiceH).scheduleAtFixedRate(runnableC1388Ko1, j, j, timeUnit));
                }
            }
        }
        HS0 hs2 = this.e;
        C8056za.w(c3315dC0.u(attributesImpl.getValue("packagingData")), false);
        hs2.getClass();
        if (C6706t70.a()) {
            new IM(this.e);
            ArrayList arrayList = hs2.v;
            if (!arrayList.contains("org.codehaus.groovy.runtime")) {
                arrayList.add("org.codehaus.groovy.runtime");
            }
        }
        c3315dC0.t(this.e);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        n("End of configuration.");
        c3315dC0.s();
    }
}
