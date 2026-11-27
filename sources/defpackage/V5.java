package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class V5 implements U5 {

    @NotNull
    public final YX a;

    @NotNull
    public final ReporterApi b;

    public V5(@NotNull YX depositScreenStarter, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = depositScreenStarter;
        this.b = reporter;
    }

    @Override // defpackage.U5
    @Nullable
    public final Object a(@NotNull H5 h5) {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.i0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.b, enumC5028l80, new C1510Md1("Account activation"), null, 12);
        Object objE = this.a.e(h5);
        return objE == MN.d ? objE : Unit.a;
    }
}
