package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class US1 implements KQ {
    public final /* synthetic */ KQ a;

    public US1(@NotNull KQ currentChartPosition) {
        Intrinsics.checkNotNullParameter(currentChartPosition, "currentChartPosition");
        this.a = currentChartPosition;
    }

    @Override // defpackage.KQ
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.KQ
    @NotNull
    public final FP1<Long> b() {
        return this.a.b();
    }

    @Override // defpackage.KQ
    public final void c(float f) {
        this.a.c(f);
    }

    @Override // defpackage.KQ
    public final void d(long j) {
        this.a.d(j);
    }

    @Override // defpackage.KQ
    @NotNull
    public final SZ1 e() {
        return this.a.e();
    }
}
