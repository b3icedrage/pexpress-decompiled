package defpackage;

import io.sentry.android.ndk.c;
import io.sentry.ndk.NativeScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Zj2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ Zj2(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                RunnableC2786ak2 runnableC2786ak2 = (RunnableC2786ak2) this.e;
                C6117qJ1 c6117qJ1 = (C6117qJ1) this.g;
                if (!(runnableC2786ak2.d.d instanceof AbstractC4575j0.b)) {
                    c6117qJ1.l(runnableC2786ak2.h.getForegroundInfoAsync());
                } else {
                    c6117qJ1.cancel(true);
                }
                break;
            default:
                c cVar = (c) this.e;
                cVar.getClass();
                C3561eO1 c3561eO1 = (C3561eO1) this.g;
                String string = c3561eO1.d.toString();
                String string2 = c3561eO1.e.toString();
                cVar.b.getClass();
                NativeScope.nativeSetTrace(string, string2);
                break;
        }
    }
}
