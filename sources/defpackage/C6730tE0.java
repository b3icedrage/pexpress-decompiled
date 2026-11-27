package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6730tE0 implements InterfaceC2403Xe0 {

    @NotNull
    public static final C6730tE0 a = new C6730tE0();

    @Override // defpackage.InterfaceC2403Xe0
    @NotNull
    public final AbstractC4649jL0 a(@NotNull C4267hk1 proto, @NotNull String flexibleId, @NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (Intrinsics.a(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.l(FI0.g) ? new C2242Vm1(lowerBound, upperBound) : C5492nL0.a(lowerBound, upperBound);
        }
        return R70.c(Q70.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
