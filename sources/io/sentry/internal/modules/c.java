package io.sentry.internal.modules;

import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.util.C4528b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {
    public final Pattern e;
    public final Pattern f;
    public final ClassLoader g;

    public static final class a {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        public a(@NotNull String str, @NotNull String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = c.class.getClassLoader();
        this.e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.g = C4528b.a(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map<String, String> b() {
        HashMap map = new HashMap();
        ArrayList<a> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.e.matcher(resources.nextElement().toString());
                a aVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        aVar = new a(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } catch (Throwable th) {
            this.a.d(NG1.ERROR, "Unable to detect modules via manifest files.", th);
        }
        for (a aVar2 : arrayList) {
            map.put(aVar2.a, aVar2.b);
        }
        return map;
    }
}
