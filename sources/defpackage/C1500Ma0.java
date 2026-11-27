package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Ma0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1500Ma0 {
    public static volatile C1500Ma0 b;
    public static final C1500Ma0 c = new C1500Ma0(0);
    public final Map<Object, Object> a;

    public C1500Ma0() {
        this.a = new HashMap();
    }

    public static void a() {
        if (b == null) {
            synchronized (C1500Ma0.class) {
                try {
                    if (b == null) {
                        Class<?> cls = C1267Ja0.a;
                        C1500Ma0 c1500Ma0 = null;
                        if (cls != null) {
                            try {
                                c1500Ma0 = (C1500Ma0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1500Ma0 == null) {
                            c1500Ma0 = c;
                        }
                        b = c1500Ma0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C1500Ma0(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
