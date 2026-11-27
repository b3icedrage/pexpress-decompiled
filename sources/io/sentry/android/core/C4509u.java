package io.sentry.android.core;

import android.net.TrafficStats;
import defpackage.InterfaceC2265Vu0;

/* JADX INFO: renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4509u implements InterfaceC2265Vu0 {
    public static final C4509u a = new C4509u();

    @Override // defpackage.InterfaceC2265Vu0
    public final void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // defpackage.InterfaceC2265Vu0
    public final void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
