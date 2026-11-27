package defpackage;

import io.sentry.util.C4527a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0841Do0 {

    @NotNull
    public static final HashMap h;

    @NotNull
    public final HashMap a = new HashMap();

    @NotNull
    public final ArrayList b = new ArrayList();

    @NotNull
    public final C4527a c = new C4527a();

    @Nullable
    public C2234Vk d = null;

    @Nullable
    public C2234Vk e = null;

    @Nullable
    public C2234Vk f = null;

    @Nullable
    public C2257Vr1 g = null;

    static {
        HashMap map = new HashMap();
        h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final void a() {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final Object b(@NotNull String str) {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            Object obj = this.a.get(str);
            c0404aA.close();
            return obj;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final Object c(@NotNull Class cls, @NotNull String str) {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            Object obj = this.a.get(str);
            if (cls.isInstance(obj)) {
                c0404aA.close();
                return obj;
            }
            Class cls2 = (Class) h.get(cls.getCanonicalName());
            if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
                c0404aA.close();
                return null;
            }
            c0404aA.close();
            return obj;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(@Nullable Object obj, @NotNull String str) {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            this.a.put(str, obj);
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
