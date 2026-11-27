package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: ux0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7088ux0 extends AbstractC5858p5 {
    public String h;
    public boolean i;

    public static void v(WC1 wc1) {
        ArrayList arrayList = wc1.e;
        if (arrayList.size() == 0) {
            return;
        }
        VC1 vc1 = (VC1) arrayList.get(0);
        if (vc1 != null && vc1.b.equalsIgnoreCase("included")) {
            arrayList.remove(0);
        }
        ArrayList arrayList2 = wc1.e;
        VC1 vc2 = (VC1) arrayList.get(arrayList2.size() - 1);
        if (vc2 == null || !vc2.b.equalsIgnoreCase("included")) {
            return;
        }
        arrayList.remove(arrayList2.size() - 1);
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        URL resource;
        URL url;
        WC1 wc1 = new WC1(this.e);
        InputStream inputStreamOpenStream = null;
        this.h = null;
        this.i = C8056za.w(attributesImpl.getValue("optional"), false);
        String value = attributesImpl.getValue("file");
        String value2 = attributesImpl.getValue(ImagesContract.URL);
        String value3 = attributesImpl.getValue("resource");
        int i = !C8056za.m(value) ? 1 : 0;
        if (!C8056za.m(value2)) {
            i++;
        }
        if (!C8056za.m(value3)) {
            i++;
        }
        if (i == 0) {
            l("One of \"path\", \"resource\" or \"url\" attributes must be set.");
            return;
        }
        if (i > 1) {
            l("Only one of \"file\", \"url\" or \"resource\" attributes should be set.");
            return;
        }
        if (i != 1) {
            throw new IllegalStateException(C1332Jw.a(i, "Count value [", "] is not expected"));
        }
        String value4 = attributesImpl.getValue("file");
        String value5 = attributesImpl.getValue(ImagesContract.URL);
        String value6 = attributesImpl.getValue("resource");
        if (!C8056za.m(value4)) {
            String strU = c3315dC0.u(value4);
            this.h = strU;
            try {
                url = new File(strU).toURI().toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                url = null;
            }
        } else if (!C8056za.m(value5)) {
            String strU2 = c3315dC0.u(value5);
            this.h = strU2;
            try {
                resource = new URL(strU2);
                url = resource;
            } catch (MalformedURLException e2) {
                m("URL [" + strU2 + "] is not well formed.", e2);
                url = null;
            }
        } else {
            if (C8056za.m(value6)) {
                throw new IllegalStateException("A URL stream should have been returned");
            }
            String strU3 = c3315dC0.u(value6);
            this.h = strU3;
            boolean z = C6559sR0.a;
            ClassLoader classLoader = C6559sR0.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            try {
                resource = classLoader.getResource(strU3);
            } catch (Throwable unused) {
                resource = null;
            }
            if (resource == null) {
                String strD = C1039Gc0.d("Could not find resource corresponding to [", strU3, "]");
                if (!this.i) {
                    p(strD);
                }
                url = null;
            } else {
                url = resource;
            }
        }
        if (url != null) {
            HS0 hs0 = this.e;
            C4852kJ c4852kJ = C4852kJ.a;
            C4642jJ c4642jJ = (C4642jJ) hs0.i.get("CONFIGURATION_WATCH_LIST");
            C4852kJ c4852kJ2 = C4852kJ.a;
            if (c4642jJ == null) {
                Ff2 ff2 = new Ff2("Null ConfigurationWatchList. Cannot add " + url, c4852kJ2);
                if (hs0 == null) {
                    System.out.println("Null context in ".concat(C4642jJ.class.getName()));
                } else {
                    C4538ir c4538ir = hs0.g;
                    if (c4538ir != null) {
                        c4538ir.a(ff2);
                    }
                }
            } else {
                C1968Rz0 c1968Rz0 = new C1968Rz0("Adding [" + url + "] to configuration watch list.", c4852kJ2);
                if (hs0 == null) {
                    System.out.println("Null context in ".concat(C4642jJ.class.getName()));
                } else {
                    C4538ir c4538ir2 = hs0.g;
                    if (c4538ir2 != null) {
                        c4538ir2.a(c1968Rz0);
                    }
                }
                c4642jJ.q(url);
            }
            try {
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            } catch (IOException unused2) {
                String str2 = "Failed to open [" + url.toString() + "]";
                if (!this.i) {
                    p(str2);
                }
            }
        }
        if (inputStreamOpenStream != null) {
            try {
                try {
                    wc1.j(this.e);
                    wc1.d(new InputSource(inputStreamOpenStream));
                    v(wc1);
                    C7247vi c7247vi = c3315dC0.k.g;
                    ((List) c7247vi.c).addAll(c7247vi.a + 2, wc1.e);
                } catch (C5054lG0 e3) {
                    m("Error while parsing  " + this.h, e3);
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenStream.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
        if (inputStreamOpenStream == null) {
            return;
        }
        try {
            inputStreamOpenStream.close();
        } catch (IOException unused4) {
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
