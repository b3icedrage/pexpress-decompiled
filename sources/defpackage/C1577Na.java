package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1577Na extends C1110Ha {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577Na(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull ZT1 subIdProvider, @NotNull String placeCall, @NotNull C5176lq1 params, @NotNull C3378dX0 marketingEventsManager, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        super(appData, reporter, subIdProvider, placeCall, params, marketingEventsManager, activationStateProviderApi);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(placeCall, "placeCall");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marketingEventsManager, "marketingEventsManager");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.C1110Ha
    @Nullable
    public final Object c(@NotNull LM lm) {
        C1499Ma c1499Ma;
        if (lm instanceof C1499Ma) {
            c1499Ma = (C1499Ma) lm;
            int i = c1499Ma.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1499Ma.g = i - Integer.MIN_VALUE;
            } else {
                c1499Ma = new C1499Ma(this, lm);
            }
        } else {
            c1499Ma = new C1499Ma(this, lm);
        }
        Object objD = c1499Ma.d;
        MN mn = MN.d;
        int i2 = c1499Ma.g;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            c1499Ma.g = 1;
            objD = C1110Ha.d(this, c1499Ma);
            if (objD == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
        }
        String str = (String) objD;
        return StringsKt.X(StringsKt.V(str, "a=", str), ';');
    }
}
