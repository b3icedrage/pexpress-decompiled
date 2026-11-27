package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4842kF1 implements E10 {

    @NotNull
    public final E10 b;

    @NotNull
    public final C4953km1 c;
    public boolean d;

    /* JADX INFO: renamed from: kF1$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.direction.other_calculators.SelectingDirectionCalculator", f = "SelectingDirectionCalculator.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "calculateDirection")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int g;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return C4842kF1.this.c(null, this);
        }
    }

    public C4842kF1(@NotNull E10 primaryDirectionCalculator, @NotNull C4953km1 randomDirectionCalculator) {
        Intrinsics.checkNotNullParameter(primaryDirectionCalculator, "primaryDirectionCalculator");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        this.b = primaryDirectionCalculator;
        this.c = randomDirectionCalculator;
        this.d = true;
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 == r1) goto L35;
     */
    @Override // defpackage.E10
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.I10 r6, @org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C5052lF1
            if (r0 == 0) goto L13
            r0 = r7
            lF1 r0 = (defpackage.C5052lF1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            lF1 r0 = new lF1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.g
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.C1795Pt1.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.C1795Pt1.b(r7)
            goto L61
        L36:
            defpackage.C1795Pt1.b(r7)
            Xr r7 = r6.c
            boolean r7 = r7 instanceof defpackage.InterfaceC2441Xr.b
            if (r7 == 0) goto L45
            boolean r7 = r5.d
            if (r7 == 0) goto L45
            r7 = r3
            goto L46
        L45:
            r7 = 0
        L46:
            r2 = r7 ^ 1
            r5.d = r2
            if (r7 == 0) goto L72
            java.lang.String r7 = "close price used"
            E10.b.b(r5, r7)
            kE r7 = new kE
            km1 r2 = r5.c
            r7.<init>(r2)
            r0.g = r3
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L61
            goto L81
        L61:
            O10 r7 = (defpackage.O10) r7
            boolean r6 = r7 instanceof O10.c
            if (r6 == 0) goto L71
            O10$a r6 = new O10$a
            O10$c r7 = (O10.c) r7
            H32$a r7 = r7.a
            r6.<init>(r7)
            return r6
        L71:
            return r7
        L72:
            java.lang.String r7 = "primary calculator used"
            E10.b.b(r5, r7)
            r0.g = r4
            E10 r7 = r5.b
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4842kF1.b(I10, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.E10
    @Nullable
    public final Object c(@NotNull I10 i10, @NotNull JM<? super H32.a> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object objB = aVar.d;
        Object obj = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            aVar.g = 1;
            objB = b(i10, aVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        return ((O10) objB).a();
    }
}
