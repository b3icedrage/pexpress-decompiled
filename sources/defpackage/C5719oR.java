package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5719oR implements FU<Unit> {

    @NotNull
    public final C6348rR a;

    @NotNull
    public final GU b;

    public C5719oR(@NotNull C6348rR customIndicatorsExperimentProvider) {
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        this.a = customIndicatorsExperimentProvider;
        this.b = GU.CUSTOM_INDICATORS_ENABLE_DEEPLINK;
    }

    @Override // defpackage.FU
    public final Object a(Object obj, HU hu) {
        Object objA = this.a.a(hu);
        return objA == MN.d ? objA : Unit.a;
    }

    @Override // defpackage.FU
    @NotNull
    public final GU getKey() {
        return this.b;
    }
}
