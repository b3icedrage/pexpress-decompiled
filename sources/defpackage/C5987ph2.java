package defpackage;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ph2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5987ph2 extends C2784ak0 implements Function0<Long> {
    public static final C5987ph2 m = new C5987ph2(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
