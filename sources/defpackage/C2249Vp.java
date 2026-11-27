package defpackage;

import io.sentry.ILogger;
import io.sentry.util.C4527a;
import io.sentry.util.x;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2249Vp {

    @NotNull
    public final String a;

    public C2249Vp(@NotNull String str) {
        this.a = str;
    }

    @Nullable
    public static C2249Vp a(@NotNull C2171Up c2171Up, @Nullable List<String> list) {
        String str;
        C2249Vp c2249Vp;
        String str2;
        C2171Up c2171Up2 = c2171Up;
        String str3 = "%20";
        ILogger iLogger = c2171Up2.h;
        C2249Vp c2249Vp2 = null;
        C2171Up c2171UpA = list != null ? C2171Up.a(x.c(list), iLogger) : C2171Up.a(null, iLogger);
        ConcurrentHashMap<String, String> concurrentHashMap = c2171Up2.a;
        StringBuilder sb = new StringBuilder();
        String str4 = c2171UpA.e;
        int i = 0;
        if (str4 == null || str4.isEmpty()) {
            str = "";
        } else {
            sb.append(str4);
            Charset charset = x.a;
            int i2 = 0;
            while (i < str4.length()) {
                if (str4.charAt(i) == ',') {
                    i2++;
                }
                i++;
            }
            i = i2 + 1;
            str = ",";
        }
        C4527a.C0404a c0404aA = c2171Up2.b.a();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            c0404aA.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i3 = i;
            String str5 = str;
            for (String str6 : treeSet) {
                String strC = "sentry-sample_rate".equals(str6) ? C2171Up.c(c2171Up2.c) : "sentry-sample_rand".equals(str6) ? C2171Up.c(c2171Up2.d) : concurrentHashMap.get(str6);
                if (strC != null) {
                    c2249Vp = c2249Vp2;
                    ILogger iLogger2 = c2171Up2.h;
                    if (i3 >= 64) {
                        iLogger2.a(NG1.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
                    } else {
                        try {
                            str2 = str3;
                            try {
                                String str7 = str5 + URLEncoder.encode(str6, "UTF-8").replaceAll("\\+", str3) + "=" + URLEncoder.encode(strC, "UTF-8").replaceAll("\\+", str3);
                                if (sb.length() + str7.length() > 8192) {
                                    iLogger2.a(NG1.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str6, 8192);
                                } else {
                                    i3++;
                                    sb.append(str7);
                                    str5 = ",";
                                }
                            } catch (Throwable th) {
                                th = th;
                                iLogger2.c(NG1.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strC);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                        }
                    }
                    c2171Up2 = c2171Up;
                    c2249Vp2 = c2249Vp;
                    str3 = str2;
                } else {
                    c2249Vp = c2249Vp2;
                }
                str2 = str3;
                c2171Up2 = c2171Up;
                c2249Vp2 = c2249Vp;
                str3 = str2;
            }
            C2249Vp c2249Vp3 = c2249Vp2;
            String string = sb.toString();
            return string.isEmpty() ? c2249Vp3 : new C2249Vp(string);
        } catch (Throwable th3) {
            try {
                c0404aA.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
