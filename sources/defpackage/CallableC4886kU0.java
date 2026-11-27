package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: kU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4886kU0 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC4886kU0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                return new JU0((C3788fU0) this.e);
            default:
                return ((C6651sr1) this.e).b("firebase");
        }
    }
}
