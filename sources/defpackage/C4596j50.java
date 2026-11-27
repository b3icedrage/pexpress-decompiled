package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractLongTimeSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4596j50 extends AbstractLongTimeSource {

    @NotNull
    public final Function0<Long> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4596j50(int i) {
        super(R40.NANOSECONDS);
        C4338i50 elapsedRealtimeNanos = C4338i50.m;
        Intrinsics.checkNotNullParameter(elapsedRealtimeNanos, "elapsedRealtimeNanos");
        this.c = elapsedRealtimeNanos;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public final long b() {
        return this.c.invoke().longValue();
    }
}
