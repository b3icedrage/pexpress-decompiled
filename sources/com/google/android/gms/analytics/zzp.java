package com.google.android.gms.analytics;

import defpackage.EK;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements ThreadFactory {
    private static final AtomicInteger zza = new AtomicInteger();

    private zzp() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new zzq(runnable, EK.e(zza.incrementAndGet(), "measurement-"));
    }

    public /* synthetic */ zzp(zzo zzoVar) {
    }
}
