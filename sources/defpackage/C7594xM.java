package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.naming.Context;
import javax.naming.NamingException;

/* JADX INFO: renamed from: xM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7594xM implements FM {
    public static final ThreadLocal<HS0> c = new ThreadLocal<>();
    public final Map<String, HS0> a = Collections.synchronizedMap(new HashMap());
    public final HS0 b;

    public C7594xM(HS0 hs0) {
        this.b = hs0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    @Override // defpackage.FM
    public final HS0 a() throws Throwable {
        Context contextA;
        URL urlB;
        ArrayList arrayList;
        HS0 hs0 = c.get();
        if (hs0 != null) {
            return hs0;
        }
        String strB = null;
        try {
            contextA = GD0.a();
            try {
                strB = GD0.b(contextA, "java:comp/env/logback/context-name");
            } catch (NamingException unused) {
            }
        } catch (NamingException unused2) {
            contextA = null;
        }
        if (strB == null) {
            return this.b;
        }
        Map<String, HS0> map = this.a;
        HS0 hs1 = map.get(strB);
        if (hs1 == null) {
            hs1 = new HS0();
            hs1.b(strB);
            map.put(strB, hs1);
            C4538ir c4538ir = hs1.g;
            String strB2 = GD0.b(contextA, "java:comp/env/logback/configuration-resource");
            if (strB2 != null) {
                c4538ir.a(new C1968Rz0(C1039Gc0.d("Searching for [", strB2, "]"), this));
                urlB = b(c4538ir, strB2);
                if (urlB == null) {
                    c4538ir.a(new Ff2(C5807oq.b(C6495s7.b("The jndi resource [", strB2, "] for context ["), hs1.e, "] does not lead to a valid file"), this));
                }
            } else {
                urlB = b(c4538ir, "logback-" + hs1.e + ".xml");
            }
            if (urlB != null) {
                try {
                    C4844kG0 c4844kG0 = new C4844kG0();
                    hs1.j();
                    c4844kG0.j(hs1);
                    c4844kG0.r(urlB);
                } catch (C5054lG0 unused3) {
                }
                C3567eQ1.b(hs1);
            } else {
                try {
                    new C7173vM(hs1).b();
                } catch (C5054lG0 unused4) {
                }
            }
            C4538ir c4538ir2 = hs1.g;
            if (c4538ir2 == null) {
                C3567eQ1.b(hs1);
            } else {
                synchronized (c4538ir2.f) {
                    arrayList = new ArrayList(c4538ir2.e);
                }
                if (arrayList.size() == 0) {
                    C3567eQ1.b(hs1);
                }
            }
        }
        return hs1;
    }

    public final URL b(C4538ir c4538ir, String str) {
        URL resource;
        c4538ir.a(new C1968Rz0(C1039Gc0.d("Searching for [", str, "]"), this));
        boolean z = C6559sR0.a;
        try {
            resource = Thread.currentThread().getContextClassLoader().getResource(str);
        } catch (Throwable unused) {
            resource = null;
        }
        if (resource != null) {
            return resource;
        }
        ClassLoader classLoader = C6559sR0.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            return classLoader.getResource(str);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
