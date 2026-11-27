package defpackage;

import io.sentry.cache.e;
import io.sentry.cache.f;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4045gh1 implements Runnable {
    public static final Charset e = Charset.forName("UTF-8");

    @NotNull
    public final C2688aH1 d;

    public RunnableC4045gh1(@NotNull C2688aH1 c2688aH1) {
        this.d = c2688aH1;
    }

    @Nullable
    public final Date a(@NotNull File file) {
        C2688aH1 c2688aH1 = this.d;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), e));
            try {
                String line = bufferedReader.readLine();
                c2688aH1.getLogger().a(NG1.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateJ = N7.j(line);
                bufferedReader.close();
                return dateJ;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error reading the crash marker file.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            c2688aH1.getLogger().c(NG1.ERROR, e3, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2688aH1 c2688aH1 = this.d;
        String cacheDirPath = c2688aH1.getCacheDirPath();
        if (cacheDirPath == null) {
            c2688aH1.getLogger().a(NG1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        f envelopeDiskCache = c2688aH1.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof e) && !((e) envelopeDiskCache).h()) {
            c2688aH1.getLogger().a(NG1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i = e.n;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC1560Mu0 serializer = c2688aH1.getSerializer();
        if (file.exists()) {
            c2688aH1.getLogger().a(NG1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), e));
                try {
                    CI1 ci1 = (CI1) serializer.d(bufferedReader, CI1.class);
                    if (ci1 == null) {
                        c2688aH1.getLogger().a(NG1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(c2688aH1.getCacheDirPath(), ".sentry-native/last_crash");
                        CI1.b bVar = ci1.k;
                        CI1.b bVar2 = CI1.b.Crashed;
                        if (bVar == bVar2) {
                            C2909bG1 c2909bG1 = C2909bG1.c;
                            C4527a.C0404a c0404aA = c2909bG1.b.a();
                            try {
                                c2909bG1.a = false;
                                c0404aA.close();
                                c2909bG1.a();
                            } catch (Throwable th) {
                                try {
                                    c0404aA.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (file2.exists()) {
                            c2688aH1.getLogger().a(NG1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file2);
                            ci1.d(bVar2, null, true, null);
                            ci1.b(dateA);
                        } else if (ci1.r == null) {
                            ci1.b(N7.h());
                        }
                        if (file2.exists() && !file2.delete()) {
                            c2688aH1.getLogger().a(NG1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        QF1.e().k(new C3537eG1(null, c2688aH1.getSdkVersion(), CG1.d(serializer, ci1)), new C0841Do0());
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c2688aH1.getLogger().d(NG1.ERROR, "Error processing previous session.", th5);
            }
            if (file.delete()) {
                return;
            }
            c2688aH1.getLogger().a(NG1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
