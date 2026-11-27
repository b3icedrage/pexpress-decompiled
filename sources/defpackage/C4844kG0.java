package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: kG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4844kG0 extends C5494nM {
    public C6859tr h;
    public C3524eC0 i;

    public static void u(HS0 hs0, URL url) {
        C4852kJ c4852kJ = C4852kJ.a;
        C4642jJ c4642jJ = (C4642jJ) hs0.i.get("CONFIGURATION_WATCH_LIST");
        if (c4642jJ == null) {
            c4642jJ = new C4642jJ();
            c4642jJ.j(hs0);
            hs0.i(c4642jJ, "CONFIGURATION_WATCH_LIST");
        } else {
            c4642jJ.h = null;
            c4642jJ.j.clear();
            c4642jJ.i.clear();
        }
        c4642jJ.h = url;
        if (url != null) {
            c4642jJ.q(url);
        }
    }

    public final void q(InputStream inputStream, String str) {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        WC1 wc1 = new WC1(this.e);
        wc1.d(inputSource);
        s(wc1.e);
        ArrayList<XP1> arrayListK = C0564Aa.k(this.e.g.c(), jCurrentTimeMillis);
        Pattern patternCompile = Pattern.compile("XML_PARSING");
        for (XP1 xp1 : arrayListK) {
            if (2 == xp1.getLevel() && patternCompile.matcher(xp1.getMessage()).lookingAt()) {
                return;
            }
        }
        n("Registering current configuration as safe fallback point");
        this.e.i(wc1.e, "SAFE_JORAN_CONFIGURATION");
    }

    public final void r(URL url) throws C5054lG0 {
        InputStream inputStream = null;
        try {
            try {
                u(this.e, url);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                uRLConnection.setUseCaches(false);
                inputStream = uRLConnection.getInputStream();
                q(inputStream, url.toExternalForm());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        m("Could not close input stream", e);
                        throw new C5054lG0("Could not close input stream", e);
                    }
                }
            } catch (IOException e2) {
                String str = "Could not open URL [" + url + "].";
                m(str, e2);
                throw new C5054lG0(str, e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    m("Could not close input stream", e3);
                    throw new C5054lG0("Could not close input stream", e3);
                }
            }
            throw th;
        }
    }

    public void s(List<VC1> list) {
        int i = 0;
        HS0 hs0 = this.e;
        C5286mM1 c5286mM1 = new C5286mM1();
        c5286mM1.h = new HashMap<>();
        c5286mM1.j(hs0);
        c5286mM1.q(new C5439n50("configuration/variable"), new C7674xj1());
        c5286mM1.q(new C5439n50("configuration/property"), new C7674xj1());
        c5286mM1.q(new C5439n50("configuration/substitutionProperty"), new C7674xj1());
        C5439n50 c5439n50 = new C5439n50("configuration/timestamp");
        RZ1 rz1 = new RZ1();
        rz1.h = false;
        c5286mM1.q(c5439n50, rz1);
        c5286mM1.q(new C5439n50("configuration/shutdownHook"), new DL1());
        c5286mM1.q(new C5439n50("configuration/define"), new C8044zW());
        c5286mM1.q(new C5439n50("configuration/contextProperty"), new CM());
        c5286mM1.q(new C5439n50("configuration/conversionRule"), new NM());
        C5439n50 c5439n51 = new C5439n50("configuration/statusListener");
        C3148cQ1 c3148cQ1 = new C3148cQ1();
        c3148cQ1.h = false;
        c3148cQ1.i = null;
        c3148cQ1.j = null;
        c5286mM1.q(c5439n51, c3148cQ1);
        C5439n50 c5439n52 = new C5439n50("configuration/appender");
        C7878yi c7878yi = new C7878yi();
        c7878yi.i = false;
        c5286mM1.q(c5439n52, c7878yi);
        c5286mM1.q(new C5439n50("configuration/appender/appender-ref"), new C0744Ci());
        c5286mM1.q(new C5439n50("configuration/newRule"), new C7746y41());
        c5286mM1.q(new C5439n50("*/param"), new C1504Mb1(t()));
        c5286mM1.q(new C5439n50("configuration"), new NI());
        c5286mM1.q(new C5439n50("configuration/contextName"), new C7588xK(1));
        C5439n50 c5439n53 = new C5439n50("configuration/contextListener");
        JS0 js0 = new JS0();
        js0.h = false;
        c5286mM1.q(c5439n53, js0);
        c5286mM1.q(new C5439n50("configuration/insertFromJNDI"), new JA0());
        C5439n50 c5439n54 = new C5439n50("configuration/evaluator");
        V70 v70 = new V70();
        v70.i = false;
        c5286mM1.q(c5439n54, v70);
        c5286mM1.q(new C5439n50("configuration/appender/sift"), new JL1());
        c5286mM1.q(new C5439n50("configuration/appender/sift/*"), new C5218m21());
        C5439n50 c5439n55 = new C5439n50("configuration/logger");
        GS0 gs0 = new GS0();
        gs0.h = false;
        c5286mM1.q(c5439n55, gs0);
        c5286mM1.q(new C5439n50("configuration/logger/level"), new C5924pP0());
        c5286mM1.q(new C5439n50("configuration/root"), new UA1());
        c5286mM1.q(new C5439n50("configuration/root/level"), new C5924pP0());
        c5286mM1.q(new C5439n50("configuration/logger/appender-ref"), new C0744Ci());
        c5286mM1.q(new C5439n50("configuration/root/appender-ref"), new C0744Ci());
        c5286mM1.q(new C5439n50("*/if"), new C2610Zv0());
        c5286mM1.q(new C5439n50("*/if/then"), new C7632xY1());
        c5286mM1.q(new C5439n50("*/if/then/*"), new C5218m21());
        c5286mM1.q(new C5439n50("*/if/else"), new C6069q50());
        c5286mM1.q(new C5439n50("*/if/else/*"), new C5218m21());
        if (C3057c.j == -1) {
            try {
                Class.forName("javax.management.ObjectName");
                C3057c.j = 1;
            } catch (Throwable unused) {
                C3057c.j = 0;
            }
        }
        if (C3057c.j == 1) {
            c5286mM1.q(new C5439n50("configuration/jmxConfigurator"), new FD0());
        }
        c5286mM1.q(new C5439n50("configuration/include"), new C7088ux0());
        c5286mM1.q(new C5439n50("configuration/consolePlugin"), new C7588xK(i));
        c5286mM1.q(new C5439n50("configuration/receiver"), new C0920Eo1());
        C3524eC0 c3524eC0 = new C3524eC0(this.e, c5286mM1, new C5229m50());
        this.i = c3524eC0;
        HS0 hs1 = this.e;
        C3315dC0 c3315dC0 = c3524eC0.b;
        c3315dC0.j(hs1);
        C3524eC0 c3524eC1 = this.i;
        C3072c31 c3072c31 = new C3072c31(t());
        c3072c31.j(this.e);
        c3524eC1.c.add(c3072c31);
        C2863b31 c2863b31 = new C2863b31(t());
        c2863b31.j(this.e);
        c3524eC1.c.add(c2863b31);
        C4019gb.a(c3315dC0.m);
        this.i.b.i.put("APPENDER_BAG", new HashMap());
        synchronized (this.e.j) {
            this.i.g.b(list);
        }
    }

    public final C6859tr t() {
        if (this.h == null) {
            HS0 hs0 = this.e;
            C6859tr c6859tr = new C6859tr();
            c6859tr.h = new HashMap();
            c6859tr.j(hs0);
            this.h = c6859tr;
        }
        return this.h;
    }
}
