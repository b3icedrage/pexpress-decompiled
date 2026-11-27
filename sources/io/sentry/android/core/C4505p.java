package io.sentry.android.core;

import android.os.Debug;
import defpackage.C6180qd1;
import defpackage.InterfaceC6030pu0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4505p implements InterfaceC6030pu0 {
    @Override // defpackage.InterfaceC6030pu0
    public final void a() {
    }

    @Override // defpackage.InterfaceC6030pu0
    public final void c(@NotNull C6180qd1 c6180qd1) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c6180qd1.b = Long.valueOf(jFreeMemory);
        c6180qd1.c = Long.valueOf(nativeHeapSize);
    }
}
