package defpackage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Ko1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1388Ko1 extends C5494nM implements Runnable {
    public long h;

    public final void q(HS0 hs0, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VC1 vc1 = (VC1) it.next();
                if (!"include".equalsIgnoreCase(vc1.a)) {
                    arrayList.add(vc1);
                }
            }
        }
        C4844kG0 c4844kG0 = new C4844kG0();
        c4844kG0.j(this.e);
        HS0 hs1 = this.e;
        C4852kJ c4852kJ = C4852kJ.a;
        C4642jJ c4642jJ = (C4642jJ) hs1.i.get("CONFIGURATION_WATCH_LIST");
        c4642jJ.getClass();
        C4642jJ c4642jJ2 = new C4642jJ();
        c4642jJ2.h = c4642jJ.h;
        c4642jJ2.i = new ArrayList(c4642jJ.i);
        c4642jJ2.j = new ArrayList(c4642jJ.j);
        if (arrayList.isEmpty()) {
            p("No previous configuration to fall back on.");
            return;
        }
        p("Given previous errors, falling back to previously registered safe configuration.");
        try {
            hs0.j();
            this.e.i(c4642jJ2, "CONFIGURATION_WATCH_LIST");
            c4844kG0.s(arrayList);
            n("Re-registering previous fallback configuration once more as a fallback configuration point");
            c4844kG0.e.i(list, "SAFE_JORAN_CONFIGURATION");
            n("after registerSafeConfiguration: " + list);
        } catch (C5054lG0 e) {
            m("Unexpected exception thrown by a configuration considered safe.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        HS0 hs0 = this.e;
        C4852kJ c4852kJ = C4852kJ.a;
        C4642jJ c4642jJ = (C4642jJ) hs0.i.get("CONFIGURATION_WATCH_LIST");
        if (c4642jJ == null) {
            p("Empty ConfigurationWatchList in context");
            return;
        }
        if (new ArrayList(c4642jJ.i).isEmpty()) {
            n("Empty watch file list. Disabling ");
            return;
        }
        int size = c4642jJ.i.size();
        for (int i = 0; i < size; i++) {
            if (((Long) c4642jJ.j.get(i)).longValue() != ((File) c4642jJ.i.get(i)).lastModified()) {
                URL url = c4642jJ.h;
                n("Detected change in configuration files.");
                n("Will reset and reconfigure context named [" + this.e.e + "]");
                HS0 hs1 = this.e;
                if (!url.toString().endsWith("xml")) {
                    if (url.toString().endsWith("groovy")) {
                        if (!C6706t70.a()) {
                            l("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
                            return;
                        } else {
                            hs1.j();
                            C3476e.s(hs1, this, url);
                            return;
                        }
                    }
                    return;
                }
                C4844kG0 c4844kG0 = new C4844kG0();
                c4844kG0.j(this.e);
                C4538ir c4538ir = this.e.g;
                List list = (List) c4844kG0.e.i.get("SAFE_JORAN_CONFIGURATION");
                hs1.j();
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    c4844kG0.r(url);
                    ArrayList<XP1> arrayListK = C0564Aa.k(c4538ir.c(), jCurrentTimeMillis);
                    Pattern patternCompile = Pattern.compile("XML_PARSING");
                    for (XP1 xp1 : arrayListK) {
                        if (2 == xp1.getLevel() && patternCompile.matcher(xp1.getMessage()).lookingAt()) {
                            q(hs1, list);
                            return;
                        }
                    }
                    return;
                } catch (C5054lG0 unused) {
                    q(hs1, list);
                    return;
                }
            }
        }
    }

    public final String toString() {
        return C0681Bn.c(new StringBuilder("ReconfigureOnChangeTask(born:"), this.h, ")");
    }
}
