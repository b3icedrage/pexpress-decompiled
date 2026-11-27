package defpackage;

import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* JADX INFO: renamed from: tH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6738tH implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC6738tH(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C2711aP0 c2711aP0 = (C2711aP0) this.e;
                InterfaceC1612Nk1 interfaceC1612Nk1 = (InterfaceC1612Nk1) this.g;
                synchronized (c2711aP0) {
                    try {
                        if (c2711aP0.b == 0) {
                            c2711aP0.a.add((InterfaceC1612Nk1<T>) interfaceC1612Nk1);
                        } else {
                            c2711aP0.b.add((T) interfaceC1612Nk1.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((AFi1aSDK) this.e).registerClient((ReferrerProp) this.g);
                return;
        }
    }
}
