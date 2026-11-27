package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2934bP implements Callable<Void> {
    public final /* synthetic */ long d;
    public final /* synthetic */ YO e;

    public CallableC2934bP(YO yo, long j) {
        this.e = yo;
        this.d = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.d);
        this.e.k.a(bundle);
        return null;
    }
}
