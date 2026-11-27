package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2907bG extends AbstractC7066uq {

    @NotNull
    public final InterfaceC1653Ny0 e;

    @NotNull
    public final AbstractC7949z22 f;

    @NotNull
    public final C6120qK1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2907bG(@NotNull InterfaceC1653Ny0 callbacks, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull AbstractC2199Uy0 indicatorUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        this.e = callbacks;
        this.f = tradingAssetsProvider;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.g = c6120qK1G;
        C4466ii.e(c6120qK1G);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object n(C2907bG c2907bG, LM lm) {
        C2683aG c2683aG;
        String str;
        if (lm instanceof C2683aG) {
            c2683aG = (C2683aG) lm;
            int i = c2683aG.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2683aG.g = i - Integer.MIN_VALUE;
            } else {
                c2683aG = new C2683aG(c2907bG, lm);
            }
        } else {
            c2683aG = new C2683aG(c2907bG, lm);
        }
        Object objO = c2683aG.d;
        MN mn = MN.d;
        int i2 = c2683aG.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<C3279d22> interfaceC6396rf0 = c2907bG.f.o;
            c2683aG.g = 1;
            objO = C4466ii.o(interfaceC6396rf0, c2683aG);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        C3279d22 c3279d22 = (C3279d22) objO;
        return (c3279d22 == null || (str = c3279d22.c) == null) ? "" : str;
    }
}
