package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ZO implements Callable<Void> {
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ YO g;

    public ZO(YO yo, long j, String str) {
        this.g = yo;
        this.d = j;
        this.e = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        YO yo = this.g;
        C7813yP c7813yP = yo.m;
        if (c7813yP != null && c7813yP.i.get()) {
            return null;
        }
        yo.i.b.c(this.e, this.d);
        return null;
    }
}
