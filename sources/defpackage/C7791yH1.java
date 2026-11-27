package defpackage;

import java.util.TimerTask;

/* JADX INFO: renamed from: yH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7791yH1 extends TimerTask {
    public final /* synthetic */ C7581xH1 d;

    public C7791yH1(C7581xH1 c7581xH1) {
        this.d = c7581xH1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C7581xH1 c7581xH1 = this.d;
        EnumC4869kO1 status = c7581xH1.getStatus();
        if (status == null) {
            status = EnumC4869kO1.DEADLINE_EXCEEDED;
        }
        c7581xH1.f(status, c7581xH1.r.g != null, null);
        c7581xH1.m.set(false);
    }
}
