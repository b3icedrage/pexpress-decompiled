package io.sentry.android.core.internal.util;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        e.b = Process.myTid();
    }
}
