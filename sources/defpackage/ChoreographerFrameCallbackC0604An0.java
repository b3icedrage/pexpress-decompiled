package defpackage;

import android.view.Choreographer;

/* JADX INFO: renamed from: An0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0604An0 implements Choreographer.FrameCallback {
    public final /* synthetic */ C6251qy d;

    public /* synthetic */ ChoreographerFrameCallbackC0604An0(C6251qy c6251qy) {
        this.d = c6251qy;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        RV rv = C6266r20.a;
        this.d.B(QV0.a, Long.valueOf(j));
    }
}
