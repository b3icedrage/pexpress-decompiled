package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3338dK {

    @NotNull
    public final Rf2 a;
    public final long b;
    public final long c;

    @NotNull
    public final ES0 d;

    @NotNull
    public final Handler e;

    @NotNull
    public final a f;

    @NotNull
    public final RunnableC3128cK g;

    /* JADX INFO: renamed from: dK$a */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3338dK c3338dK = C3338dK.this;
            c3338dK.d.d();
            C6104qF0.a("PING");
            c3338dK.a.h(" ");
            c3338dK.e.postDelayed(this, c3338dK.b);
        }
    }

    public C3338dK(@NotNull Rf2 ws, long j, long j2, @NotNull ES0 logger) {
        Intrinsics.checkNotNullParameter(ws, "ws");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = ws;
        this.b = j;
        this.c = j2;
        this.d = logger;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new a();
        this.g = new RunnableC3128cK(this, 0);
    }
}
