package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: l91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5033l91 implements Runnable {
    public final /* synthetic */ InterfaceC3744fF1 d;
    public final /* synthetic */ C5456n91 e;

    public RunnableC5033l91(InterfaceC3744fF1 interfaceC3744fF1, C5456n91 c5456n91) {
        this.d = interfaceC3744fF1;
        this.e = c5456n91;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b(this.e, Unit.a);
    }
}
