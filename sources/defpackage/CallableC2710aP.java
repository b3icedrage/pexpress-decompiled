package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: aP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2710aP implements Callable<Void> {
    public final /* synthetic */ String d;
    public final /* synthetic */ YO e;

    public CallableC2710aP(YO yo, String str) {
        this.e = yo;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        YO.a(this.e, this.d);
        return null;
    }
}
