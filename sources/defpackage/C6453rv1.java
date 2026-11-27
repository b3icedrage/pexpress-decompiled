package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6453rv1 implements InterfaceC6034pv1 {

    @NotNull
    public final ActivityC1745Pd a;

    @NotNull
    public final ReporterApi b;

    public C6453rv1(@NotNull ActivityC1745Pd activity, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = activity;
        this.b = reporter;
    }

    @Override // defpackage.InterfaceC6034pv1
    public final void a(@NotNull String earned, @NotNull String profitLimit, @NotNull C2141Uf passiveBtnCallback) {
        Intrinsics.checkNotNullParameter(earned, "earned");
        Intrinsics.checkNotNullParameter(profitLimit, "profitLimit");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        C7652xe.f(this.a).d(new C6244qv1(this, earned, profitLimit, passiveBtnCallback, null));
    }
}
