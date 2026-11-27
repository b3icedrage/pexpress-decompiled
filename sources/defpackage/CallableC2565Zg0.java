package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2565Zg0 implements Callable<C3415dh0.a> {
    public final /* synthetic */ String d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ C2487Yg0 g;
    public final /* synthetic */ int h;

    public CallableC2565Zg0(String str, Context context, C2487Yg0 c2487Yg0, int i) {
        this.d = str;
        this.e = context;
        this.g = c2487Yg0;
        this.h = i;
    }

    @Override // java.util.concurrent.Callable
    public final C3415dh0.a call() {
        return C3415dh0.a(this.d, this.e, this.g, this.h);
    }
}
