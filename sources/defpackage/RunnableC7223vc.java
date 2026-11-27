package defpackage;

import android.view.View;

/* JADX INFO: renamed from: vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7223vc implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC7223vc(Object obj, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((View) this.g).setVisibility(this.e);
                break;
            default:
                ((C7708xt1.e) this.g).b(this.e);
                break;
        }
    }
}
