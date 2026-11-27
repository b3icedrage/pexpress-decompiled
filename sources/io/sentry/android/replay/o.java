package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import defpackage.ML0;
import defpackage.RunnableC3128cK;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends ML0 implements Function0<s> {
    public static final o d = new o(0);

    @Override // kotlin.jvm.functions.Function0
    public final s invoke() {
        s sVar = new s();
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC3128cK(sVar, 3));
        return sVar;
    }
}
