package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class MY1 extends Thread {
    public final /* synthetic */ ML0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public MY1(Function0<Unit> function0) {
        this.d = (ML0) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ML0, kotlin.jvm.functions.Function0] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.d.invoke();
    }
}
