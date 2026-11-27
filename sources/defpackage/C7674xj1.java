package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.instrumentation.file.f;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: xj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7674xj1 extends AbstractC5858p5 {
    public static void v(C3315dC0 c3315dC0, InputStream inputStream, C7538x5.a aVar) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            c3315dC0.getClass();
            for (String str : properties.keySet()) {
                String property = properties.getProperty(str);
                if (str != null && property != null) {
                    c3315dC0.j.put(str, property.trim());
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            for (String str2 : properties.keySet()) {
                try {
                    System.setProperty(str2, properties.getProperty(str2));
                } catch (SecurityException e) {
                    c3315dC0.m("Failed to set system property [" + str2 + "]", e);
                }
            }
            return;
        }
        IM im = new IM(c3315dC0.e);
        for (String str3 : properties.keySet()) {
            HS0 hs0 = im.e;
            String property2 = properties.getProperty(str3);
            hs0.getClass();
            if ("HOSTNAME".equalsIgnoreCase(str3)) {
                HashMap map = hs0.h;
                if (((String) map.get("HOSTNAME")) == null) {
                    map.put("HOSTNAME", property2);
                }
            } else {
                hs0.h.put(str3, property2);
            }
            hs0.s = new KS0(hs0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0171 A[PHI: r4
      0x0171: PHI (r4v10 char) = (r4v7 char), (r4v8 char), (r4v9 char) binds: [B:65:0x016f, B:68:0x0175, B:71:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        URL resource;
        if ("substitutionProperty".equals(str)) {
            p("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String value2 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C7538x5.a aVarB = C7538x5.b(attributesImpl.getValue("scope"));
        String value3 = attributesImpl.getValue("file");
        String value4 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String value5 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String value6 = attributesImpl.getValue("resource");
        if (!C8056za.m(value3) && C8056za.m(value4) && C8056za.m(value5) && C8056za.m(value6)) {
            String strU = c3315dC0.u(attributesImpl.getValue("file"));
            try {
                v(c3315dC0, f.a.c(new FileInputStream(strU), strU), aVarB);
                return;
            } catch (FileNotFoundException unused) {
                l("Could not find properties file [" + strU + "].");
                return;
            } catch (IOException e) {
                m("Could not read properties file [" + strU + "].", e);
                return;
            }
        }
        String value7 = attributesImpl.getValue("file");
        String value8 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String value9 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!C8056za.m(attributesImpl.getValue("resource")) && C8056za.m(value8) && C8056za.m(value9) && C8056za.m(value7)) {
            String strU2 = c3315dC0.u(attributesImpl.getValue("resource"));
            boolean z = C6559sR0.a;
            ClassLoader classLoader = C6559sR0.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            try {
                resource = classLoader.getResource(strU2);
            } catch (Throwable unused2) {
                resource = null;
            }
            if (resource == null) {
                l("Could not find resource [" + strU2 + "].");
                return;
            }
            try {
                v(c3315dC0, FirebasePerfUrlConnection.openStream(resource), aVarB);
                return;
            } catch (IOException e2) {
                m("Could not read resource file [" + strU2 + "].", e2);
                return;
            }
        }
        String value10 = attributesImpl.getValue("file");
        String value11 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String value12 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String value13 = attributesImpl.getValue("resource");
        if (C8056za.m(value11) || C8056za.m(value12) || !C8056za.m(value10) || !C8056za.m(value13)) {
            l("In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.");
            return;
        }
        int length = value2.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = value2.charAt(i);
            if (cCharAt == '\\') {
                i += 2;
                cCharAt = value2.charAt(i2);
                if (cCharAt == 'n') {
                    cCharAt = '\n';
                } else if (cCharAt == 'r') {
                    cCharAt = '\r';
                } else if (cCharAt == 't') {
                    cCharAt = '\t';
                } else if (cCharAt == 'f') {
                    cCharAt = '\f';
                } else {
                    char c = '\b';
                    if (cCharAt == '\b') {
                        cCharAt = c;
                    } else {
                        c = '\"';
                        if (cCharAt == '\"') {
                            cCharAt = c;
                        } else {
                            c = '\'';
                            if (cCharAt == '\'') {
                                cCharAt = c;
                            } else if (cCharAt == '\\') {
                                cCharAt = '\\';
                            }
                        }
                    }
                }
            } else {
                i = i2;
            }
            sb.append(cCharAt);
        }
        C7538x5.a(c3315dC0, value, c3315dC0.u(sb.toString().trim()), aVarB);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
    }
}
