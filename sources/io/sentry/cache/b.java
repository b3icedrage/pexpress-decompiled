package io.sentry.cache;

import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.C6795ta;
import defpackage.CG1;
import defpackage.CI1;
import defpackage.InterfaceC1560Mu0;
import defpackage.NG1;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Charset i = Charset.forName("UTF-8");

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final io.sentry.util.l<InterfaceC1560Mu0> e = new io.sentry.util.l<>(new C6795ta(this));

    @NotNull
    public final File g;
    public final int h;

    public b(@NotNull C2688aH1 c2688aH1, @NotNull String str, int i2) {
        p.b(c2688aH1, "SentryOptions is required.");
        this.d = c2688aH1;
        this.g = new File(str);
        this.h = i2;
    }

    @Nullable
    public final C3537eG1 a(@NotNull File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C3537eG1 c3537eG1E = this.e.a().e(bufferedInputStream);
                bufferedInputStream.close();
                return c3537eG1E;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.d.getLogger().d(NG1.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    @Nullable
    public final CI1 b(@NotNull CG1 cg1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(cg1.f()), i));
            try {
                CI1 ci1 = (CI1) this.e.a().d(bufferedReader, CI1.class);
                bufferedReader.close();
                return ci1;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.d.getLogger().d(NG1.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }
}
