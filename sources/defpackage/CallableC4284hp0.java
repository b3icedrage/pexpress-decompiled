package defpackage;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: hp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC4284hp0 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC4284hp0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                C4533ip0 c4533ip0 = (C4533ip0) this.e;
                c4533ip0.getClass();
                try {
                    c4533ip0.e.getClass();
                    c4533ip0.b = InetAddress.getLocalHost().getCanonicalHostName();
                    c4533ip0.c = System.currentTimeMillis() + c4533ip0.a;
                    return null;
                } finally {
                    c4533ip0.d.set(false);
                }
            default:
                return ((CG1.a) this.e).a();
        }
    }
}
