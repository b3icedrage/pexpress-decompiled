package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XX0 extends AbstractC5212m1 {

    @NotNull
    public final U22 b;

    @NotNull
    public final O3 c;

    @NotNull
    public final InterfaceC2152Ui1 d;

    public XX0(@NotNull U22 tradingDefaultsProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase) {
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        this.b = tradingDefaultsProvider;
        this.c = accountModeSelectionUseCase;
        this.d = profitLimitUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(XX0 xx0, C7398wQ1 c7398wQ1, LM lm) {
        WX0 wx0;
        double d;
        if (lm instanceof WX0) {
            wx0 = (WX0) lm;
            int i = wx0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wx0.h = i - Integer.MIN_VALUE;
            } else {
                wx0 = new WX0(xx0, lm);
            }
        } else {
            wx0 = new WX0(xx0, lm);
        }
        Object obj = wx0.e;
        Object obj2 = MN.d;
        int i2 = wx0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            double d2 = c7398wQ1.a;
            wx0.d = d2;
            wx0.h = 1;
            Object objE = xx0.e(wx0);
            if (objE == obj2) {
                return obj2;
            }
            obj = objE;
            d = d2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = wx0.d;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(d >= ((double) ((Number) obj).longValue()));
    }

    @Override // defpackage.AbstractC5212m1
    @Nullable
    public final Object c(@NotNull C7398wQ1 c7398wQ1, @NotNull JM<? super Boolean> jm) {
        return f(this, c7398wQ1, (LM) jm);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (r10 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XX0.d(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull LM lm) {
        VX0 vx0;
        XX0 xx0;
        if (lm instanceof VX0) {
            vx0 = (VX0) lm;
            int i = vx0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx0.h = i - Integer.MIN_VALUE;
            } else {
                vx0 = new VX0(this, lm);
            }
        } else {
            vx0 = new VX0(this, lm);
        }
        Object objO = vx0.e;
        MN mn = MN.d;
        int i2 = vx0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            vx0.d = this;
            vx0.h = 1;
            objO = C4466ii.o(this.d.isEnabled(), vx0);
            if (objO != mn) {
                xx0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
            return objO;
        }
        xx0 = vx0.d;
        C1795Pt1.b(objO);
        if (!((Boolean) objO).booleanValue()) {
            return new Long(Long.MAX_VALUE);
        }
        vx0.d = null;
        vx0.h = 2;
        Object objD = xx0.d(vx0);
        return objD == mn ? mn : objD;
    }
}
