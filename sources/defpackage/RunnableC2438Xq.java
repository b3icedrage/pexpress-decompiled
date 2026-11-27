package defpackage;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2438Xq implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar d;

    public RunnableC2438Xq(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d();
    }
}
