package io.sentry.android.core.cache;

import android.os.SystemClock;
import defpackage.C0841Do0;
import defpackage.C1039Gc0;
import defpackage.C1742Pc;
import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.C6495s7;
import defpackage.NG1;
import defpackage.RB1;
import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.internal.util.b;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.performance.i;
import io.sentry.cache.e;
import io.sentry.util.f;
import io.sentry.util.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {
    public static final List<C0380a<?>> p = Arrays.asList(new C0380a(AnrV2Integration.a.class, "ANR", "last_anr_report", new C1742Pc(7)), new C0380a(TombstoneIntegration.a.class, "Tombstone", "last_tombstone_report", new C6495s7(6)));

    @NotNull
    public final b o;

    /* JADX INFO: renamed from: io.sentry.android.core.cache.a$a, reason: collision with other inner class name */
    public static final class C0380a<T> {

        @NotNull
        public final Class<T> a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;

        @NotNull
        public final InterfaceC0381a<T> d;

        /* JADX INFO: renamed from: io.sentry.android.core.cache.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC0381a<T> {
            @NotNull
            Long a(T t);
        }

        public C0380a(@NotNull Class<T> cls, @NotNull String str, @NotNull String str2, @NotNull InterfaceC0381a<T> interfaceC0381a) {
            this.a = cls;
            this.b = str;
            this.c = str2;
            this.d = interfaceC0381a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        b bVar = b.a;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        p.b(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.o = bVar;
    }

    @Nullable
    public static Long j(@NotNull C2688aH1 c2688aH1, @NotNull String str, @NotNull String str2) {
        String cacheDirPath = c2688aH1.getCacheDirPath();
        p.b(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strC = f.c(file);
            if (strC != null && !strC.equals("null")) {
                return Long.valueOf(Long.parseLong(strC.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                c2688aH1.getLogger().a(NG1.DEBUG, C1039Gc0.d("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            c2688aH1.getLogger().d(NG1.ERROR, C1039Gc0.d("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    @Override // io.sentry.cache.e, io.sentry.cache.f
    public final boolean W(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        return m(c3537eG1, c0841Do0);
    }

    @Override // io.sentry.cache.e, io.sentry.cache.f
    public final void X(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        m(c3537eG1, c0841Do0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final boolean m(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        List<C0380a<?>> list = p;
        boolean zF = f(c3537eG1, c0841Do0);
        C2688aH1 c2688aH1 = this.d;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2688aH1;
        i iVar = h.c().i;
        if (UncaughtExceptionHandlerIntegration.a.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && iVar.e()) {
            this.o.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - iVar.g;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                NG1 ng1 = NG1.DEBUG;
                logger.a(ng1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = c2688aH1.getOutboxPath();
                if (outboxPath == null) {
                    c2688aH1.getLogger().a(ng1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        c2688aH1.getLogger().d(NG1.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        for (C0380a<?> c0380a : list) {
            c0380a.getClass();
            RB1 rb1 = new RB1(c0380a, sentryAndroidOptions, this);
            Class<?> cls = c0380a.a;
            Object objB = c0841Do0.b("sentry:typeCheckHint");
            if (cls.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB != null) {
                C0380a c0380a2 = (C0380a) rb1.d;
                Long lA = c0380a2.d.a((T) objB);
                ILogger logger2 = ((SentryAndroidOptions) rb1.e).getLogger();
                NG1 ng2 = NG1.DEBUG;
                String str = c0380a2.b;
                logger2.a(ng2, "Writing last reported %s marker with timestamp %d", str, lA);
                C2688aH1 c2688aH2 = ((a) rb1.g).d;
                String cacheDirPath = c2688aH2.getCacheDirPath();
                if (cacheDirPath == null) {
                    c2688aH2.getLogger().a(ng2, C1039Gc0.d("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, c0380a2.c));
                        try {
                            fileOutputStream.write(String.valueOf(lA).getBytes(io.sentry.cache.b.i));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        c2688aH2.getLogger().d(NG1.ERROR, C1039Gc0.d("Error writing the ", str, " marker to the disk"), th4);
                    }
                }
            }
        }
        return zF;
    }
}
