package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7538x5 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: x5$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("LOCAL", 0);
            d = aVar;
            a aVar2 = new a("CONTEXT", 1);
            e = aVar2;
            a aVar3 = new a("SYSTEM", 2);
            g = aVar3;
            h = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    public static void a(C3315dC0 c3315dC0, String str, String str2, a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            c3315dC0.getClass();
            if (str == null || str2 == null) {
                return;
            }
            c3315dC0.j.put(str, str2.trim());
            return;
        }
        if (iOrdinal == 1) {
            HS0 hs0 = c3315dC0.e;
            hs0.getClass();
            if ("HOSTNAME".equalsIgnoreCase(str)) {
                HashMap map = hs0.h;
                if (((String) map.get("HOSTNAME")) == null) {
                    map.put("HOSTNAME", str2);
                }
            } else {
                hs0.h.put(str, str2);
            }
            hs0.s = new KS0(hs0);
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        try {
            System.setProperty(str, str2);
        } catch (SecurityException e) {
            c3315dC0.m("Failed to set system property [" + str + "]", e);
        }
    }

    public static a b(String str) {
        if ("SYSTEM".equalsIgnoreCase(str)) {
            return a.g;
        }
        return "CONTEXT".equalsIgnoreCase(str) ? a.e : a.d;
    }
}
