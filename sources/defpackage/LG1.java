package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.v;
import io.sentry.util.C4527a;
import io.sentry.util.p;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LG1 {

    @Nullable
    public static volatile LG1 c;

    @NotNull
    public static final C4527a d = new C4527a();

    @Nullable
    public static volatile Boolean e = null;

    @NotNull
    public static final C4527a f = new C4527a();
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    @NotNull
    public static LG1 d() {
        if (c == null) {
            C4527a.C0404a c0404aA = d.a();
            try {
                if (c == null) {
                    c = new LG1();
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
        return c;
    }

    public final void a(@NotNull String str) {
        p.b(str, "integration is required.");
        this.a.add(str);
    }

    public final void b(@NotNull String str, @NotNull String str2) {
        this.b.add(new v(str, str2));
        C4527a.C0404a c0404aA = f.a();
        try {
            e = null;
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

    public final boolean c(@NotNull ILogger iLogger) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        C4527a.C0404a c0404aA = f.a();
        try {
            boolean z = false;
            for (v vVar : this.b) {
                if (vVar.d.startsWith("maven:io.sentry:") && !"8.35.0".equalsIgnoreCase(vVar.e)) {
                    iLogger.a(NG1.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", vVar.d, "8.35.0", vVar.e);
                    z = true;
                }
            }
            if (z) {
                NG1 ng1 = NG1.ERROR;
                iLogger.a(ng1, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.a(ng1, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.a(ng1, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.a(ng1, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            e = Boolean.valueOf(z);
            c0404aA.close();
            return z;
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
