package io.sentry.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> {

    @NotNull
    public final a<T> b;

    @Nullable
    public volatile T a = null;

    @NotNull
    public final C4527a c = new C4527a();

    public interface a<T> {
        @NotNull
        T b();
    }

    public l(@NotNull a<T> aVar) {
        this.b = aVar;
    }

    @NotNull
    public final T a() {
        if (this.a == null) {
            C4527a.C0404a c0404aA = this.c.a();
            try {
                if (this.a == null) {
                    this.a = this.b.b();
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
        return this.a;
    }

    public final void b() {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            this.a = null;
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

    public final void c(@Nullable T t) {
        C4527a.C0404a c0404aA = this.c.a();
        try {
            this.a = t;
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
