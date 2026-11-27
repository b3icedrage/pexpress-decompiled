package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: bm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3018bm2 extends AbstractBinderC7056um2 {
    public final C7266vm2 b;
    public final TaskCompletionSource c;
    public final /* synthetic */ C3437dm2 d;

    public BinderC3018bm2(C3437dm2 c3437dm2, TaskCompletionSource taskCompletionSource) {
        this.d = c3437dm2;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.b = new C7266vm2("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }
}
