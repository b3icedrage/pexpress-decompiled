package defpackage;

import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: iU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4418iU0 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC4418iU0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                return C5729oU0.c((ByteArrayInputStream) this.e, null);
            default:
                return ((CG1.a) this.e).a();
        }
    }
}
