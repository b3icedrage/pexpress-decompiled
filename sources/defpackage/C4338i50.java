package defpackage;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: i50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4338i50 extends C2784ak0 implements Function0<Long> {
    public static final C4338i50 m = new C4338i50(0, SystemClock.class, "elapsedRealtimeNanos", "elapsedRealtimeNanos()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtimeNanos());
    }
}
