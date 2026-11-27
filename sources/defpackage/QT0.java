package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class QT0 extends AbstractC5212m1 {

    @NotNull
    public final U22 b;

    @NotNull
    public final O3 c;

    @NotNull
    public final RT0 d;

    @InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.LossLimitStopChecker", f = "LossLimitStopChecker.kt", l = {17}, m = "shouldStopClause")
    public static final class a extends LM {
        public double d;
        public /* synthetic */ Object e;
        public int h;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return QT0.this.c(null, this);
        }
    }

    public QT0(@NotNull U22 tradingDefaultsProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull RT0 lossLimitUseCase) {
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        this.b = tradingDefaultsProvider;
        this.c = accountModeSelectionUseCase;
        this.d = lossLimitUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5212m1
    @Nullable
    public final Object c(@NotNull C7398wQ1 c7398wQ1, @NotNull JM<? super Boolean> jm) {
        a aVar;
        double d;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object obj = aVar.e;
        Object obj2 = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            double d2 = c7398wQ1.a;
            aVar.d = d2;
            aVar.h = 1;
            Object objE = e(aVar);
            if (objE == obj2) {
                return obj2;
            }
            obj = objE;
            d = d2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d = aVar.d;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(d < ((double) (-Math.abs(((Number) obj).longValue()))));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QT0.d(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull LM lm) {
        PT0 pt0;
        QT0 qt0;
        if (lm instanceof PT0) {
            pt0 = (PT0) lm;
            int i = pt0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt0.h = i - Integer.MIN_VALUE;
            } else {
                pt0 = new PT0(this, lm);
            }
        } else {
            pt0 = new PT0(this, lm);
        }
        Object objO = pt0.e;
        MN mn = MN.d;
        int i2 = pt0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            pt0.d = this;
            pt0.h = 1;
            objO = C4466ii.o(this.d.isEnabled(), pt0);
            if (objO != mn) {
                qt0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
            return objO;
        }
        qt0 = pt0.d;
        C1795Pt1.b(objO);
        if (!((Boolean) objO).booleanValue()) {
            return new Long(Long.MIN_VALUE);
        }
        pt0.d = null;
        pt0.h = 2;
        Object objD = qt0.d(pt0);
        return objD == mn ? mn : objD;
    }
}
