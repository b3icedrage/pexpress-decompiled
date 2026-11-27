package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class H22 extends AbstractC7949z22 {

    @NotNull
    public final AbstractC7004uZ1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H22(@NotNull C4923kf appData, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull J22 tradingCurrentAsset, @NotNull NQ currentIndicatorProvider, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull AbstractC2783ak assetUseCase) {
        super(appData, timeSelectionsProvider, tradingCurrentAsset, currentIndicatorProvider, indicatorUseCase, betDurationUseCase, assetUseCase);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(tradingCurrentAsset, "tradingCurrentAsset");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(assetUseCase, "assetUseCase");
        this.p = timeSelectionsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC7949z22
    @Nullable
    public final Object c(@NotNull C3279d22 c3279d22, @Nullable C1709Or betDurationSelection, @NotNull LM lm) {
        G22 g22;
        long j;
        if (lm instanceof G22) {
            g22 = (G22) lm;
            int i = g22.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                g22.h = i - Integer.MIN_VALUE;
            } else {
                g22 = new G22(this, lm);
            }
        } else {
            g22 = new G22(this, lm);
        }
        Object objA = g22.e;
        MN mn = MN.d;
        int i2 = g22.h;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            if (betDurationSelection == null) {
                g22.d = c3279d22;
                g22.h = 1;
                objA = this.p.a(g22);
                if (objA == mn) {
                    return mn;
                }
            }
            c3279d22.getClass();
            Intrinsics.checkNotNullParameter(betDurationSelection, "betDurationSelection");
            if (b.k(betDurationSelection.a, AbstractC7004uZ1.b) || !c3279d22.r) {
                long j2 = AbstractC7004uZ1.c;
                j = betDurationSelection.a;
                if ((b.k(j, j2) || !c3279d22.s) && (!b.k(j, AbstractC7004uZ1.d) || !c3279d22.t)) {
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c3279d22 = g22.d;
        C1795Pt1.b(objA);
        betDurationSelection = (C1709Or) objA;
        c3279d22.getClass();
        Intrinsics.checkNotNullParameter(betDurationSelection, "betDurationSelection");
        if (b.k(betDurationSelection.a, AbstractC7004uZ1.b)) {
            long j3 = AbstractC7004uZ1.c;
            j = betDurationSelection.a;
            z = b.k(j, j3) ? false : false;
        } else {
            long j4 = AbstractC7004uZ1.c;
            j = betDurationSelection.a;
            if (b.k(j, j4)) {
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.AbstractC7949z22
    @NotNull
    public final String f(@NotNull I10 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return params.a.l;
    }

    @Override // defpackage.AbstractC7949z22
    @NotNull
    public final String h(@NotNull C6942uF commonAsset) {
        Intrinsics.checkNotNullParameter(commonAsset, "commonAsset");
        String strN = StringsKt.N(StringsKt.M(commonAsset.d, "#"), "_otc");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = strN.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return C1039Gc0.d("https://assets.pbotservices.com/icons/assets/", upperCase, ".svg");
    }

    @Override // defpackage.AbstractC7949z22
    public final int i(@NotNull C3279d22 asset, @NotNull C1709Or time) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(time, "time");
        Integer num = asset.d ? asset.f : -1;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
