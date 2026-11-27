package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4015ga extends Thread {
    public final /* synthetic */ C4693ja d;

    public C4015ga(C4693ja c4693ja) {
        this.d = c4693ja;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        JZ1 jz1 = this.d.h;
        Intrinsics.c(jz1, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((KZ1) jz1).d.l(null);
    }
}
