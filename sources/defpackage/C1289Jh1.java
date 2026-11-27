package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1289Jh1 implements InterfaceC1211Ih1 {

    @NotNull
    public final X4 a;

    @NotNull
    public final ReporterApi b;

    public C1289Jh1(@NotNull X4 accountVerificationScreenStarter, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(accountVerificationScreenStarter, "accountVerificationScreenStarter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = accountVerificationScreenStarter;
        this.b = reporter;
    }

    @Override // defpackage.InterfaceC1211Ih1
    @Nullable
    public final Object a(@NotNull C0902Ei1 c0902Ei1) {
        ReporterApi.a.b(this.b, EnumC5028l80.B0, null, null, 14);
        Object objA = this.a.a(c0902Ei1);
        return objA == MN.d ? objA : Unit.a;
    }
}
