package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: renamed from: oa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5749oa2 implements Runnable {
    public final /* synthetic */ C7639xa2 d;
    public final /* synthetic */ C1778Po e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ RunnableC5749oa2(C7639xa2 c7639xa2, C1778Po c1778Po, int i, Runnable runnable) {
        this.d = c7639xa2;
        this.e = c1778Po;
        this.g = i;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C1778Po c1778Po = this.e;
        final int i = this.g;
        Runnable runnable = this.h;
        final C7639xa2 c7639xa2 = this.d;
        JW1 jw1 = c7639xa2.f;
        try {
            final T80 t80 = c7639xa2.c;
            Objects.requireNonNull(t80);
            jw1.g(new JW1.a() { // from class: qa2
                @Override // JW1.a
                public final Object c() {
                    return Integer.valueOf(t80.j());
                }
            });
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) c7639xa2.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                jw1.g(new JW1.a() { // from class: ra2
                    @Override // JW1.a
                    public final Object c() {
                        c7639xa2.d.a(c1778Po, i + 1);
                        return null;
                    }
                });
            } else {
                c7639xa2.a(c1778Po, i);
            }
        } catch (IW1 unused) {
            c7639xa2.d.a(c1778Po, i + 1);
        } finally {
            runnable.run();
        }
    }
}
