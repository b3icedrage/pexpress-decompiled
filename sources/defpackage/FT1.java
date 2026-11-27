package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class FT1 extends C7576xG {

    @NotNull
    public final InterfaceC6776tT1 d;

    @NotNull
    public final List<BT1> e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final C1699On1 g;

    public FT1(@NotNull C7407wT1 stubOnboardingDataProvider, @NotNull InterfaceC6776tT1 stubOnboardingCallbacks) {
        Intrinsics.checkNotNullParameter(stubOnboardingDataProvider, "stubOnboardingDataProvider");
        Intrinsics.checkNotNullParameter(stubOnboardingCallbacks, "stubOnboardingCallbacks");
        this.d = stubOnboardingCallbacks;
        this.e = stubOnboardingDataProvider.a;
        GP1 gp1I = C1589Ne.i(0);
        this.f = gp1I;
        this.g = C4466ii.f(gp1I);
    }
}
