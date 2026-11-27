package defpackage;

import android.view.Choreographer;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes.dex */
public final class Fd2 implements Choreographer.FrameCallback {
    public final /* synthetic */ ViewDataBinding d;

    public Fd2(ViewDataBinding viewDataBinding) {
        this.d = viewDataBinding;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.i.run();
    }
}
