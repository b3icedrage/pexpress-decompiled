package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2117Tx implements Runnable {
    public final /* synthetic */ C4606j72.a d;
    public final /* synthetic */ Typeface e;

    public RunnableC2117Tx(C4606j72.a aVar, Typeface typeface) {
        this.d = aVar;
        this.e = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7708xt1.e eVar = this.d.b;
        if (eVar != null) {
            eVar.c(this.e);
        }
    }
}
