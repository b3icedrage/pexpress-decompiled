package defpackage;

import com.appsflyer.internal.AFi1aSDK;
import io.sentry.android.ndk.c;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KO implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ KO(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                LO lo = (LO) this.e;
                MO moB = lo.b((QZ1) this.g);
                if (moB != null) {
                    lo.a.add(moB);
                }
                break;
            case 1:
                RunnableC2790al2 runnableC2790al2 = (RunnableC2790al2) this.e;
                C6117qJ1 c6117qJ1 = (C6117qJ1) this.g;
                if (runnableC2790al2.u.d instanceof AbstractC4575j0.b) {
                    c6117qJ1.cancel(true);
                }
                break;
            case 2:
                ((AFi1aSDK) this.e).AFKeystoreWrapper((Runnable) this.g);
                break;
            default:
                NativeScope nativeScope = ((c) this.e).b;
                F f = (F) this.g;
                if (f != null) {
                    String str = f.e;
                    String str2 = f.d;
                    String str3 = f.h;
                    String str4 = f.g;
                    nativeScope.getClass();
                    NativeScope.nativeSetUser(str, str2, str3, str4);
                } else {
                    nativeScope.getClass();
                    NativeScope.nativeRemoveUser();
                }
                break;
        }
    }
}
