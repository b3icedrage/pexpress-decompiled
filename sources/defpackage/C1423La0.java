package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: La0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1423La0 {
    public static volatile C1423La0 b;
    public static final C1423La0 c = new C1423La0(0);
    public final Map<a, AbstractC8097zk0.e<?, ?>> a;

    /* JADX INFO: renamed from: La0$a */
    public static final class a {
        public final IZ0 a;
        public final int b;

        public a(int i, IZ0 iz0) {
            this.a = iz0;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public C1423La0() {
        this.a = new HashMap();
    }

    public static C1423La0 a() {
        C1423La0 c1423La0;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        C1423La0 c1423La1 = b;
        if (c1423La1 != null) {
            return c1423La1;
        }
        synchronized (C1423La0.class) {
            try {
                c1423La0 = b;
                if (c1423La0 == null) {
                    Class<?> cls = C1345Ka0.a;
                    C1423La0 c1423La2 = null;
                    if (cls != null) {
                        try {
                            c1423La2 = (C1423La0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c1423La0 = c1423La2 != null ? c1423La2 : c;
                    b = c1423La0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1423La0;
    }

    public C1423La0(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
