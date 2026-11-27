package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4837kE implements E10 {

    @NotNull
    public final C4953km1 b;

    @NotNull
    public final String c;

    /* JADX INFO: renamed from: kE$a */
    @InterfaceC3368dU(c = "com.api.feature.trading.direction.other_calculators.ClosePriceDirectionCalculator", f = "ClosePriceDirectionCalculator.kt", l = {20}, m = "calculateDirection")
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
            return C4837kE.this.c(null, this);
        }
    }

    public C4837kE(@NotNull C4953km1 randomDirectionCalculator) {
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        this.b = randomDirectionCalculator;
        CR0 cr0 = CR0.ADX;
        this.c = "close_price";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        C5047lE c5047lE;
        if (lm instanceof C5047lE) {
            c5047lE = (C5047lE) lm;
            int i = c5047lE.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5047lE.g = i - Integer.MIN_VALUE;
            } else {
                c5047lE = new C5047lE(this, lm);
            }
        } else {
            c5047lE = new C5047lE(this, lm);
        }
        Object obj = c5047lE.d;
        MN mn = MN.d;
        int i2 = c5047lE.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            H32.a aVar = i10.d;
            if (aVar != null) {
                if (i10.c instanceof InterfaceC2441Xr.b) {
                    H32.a aVar2 = H32.a.CALL_UP;
                    if (aVar == aVar2) {
                        aVar2 = H32.a.PUT_DOWN;
                    }
                    aVar = aVar2;
                }
                O10.c cVarA = P10.a(aVar);
                E10.b.b(this, "used");
                return cVarA;
            }
            c5047lE.g = 1;
            C4953km1 c4953km1 = this.b;
            C3279d22 c3279d22 = C5163lm1.a;
            b.e.getClass();
            C3279d22 asset = C5163lm1.a;
            Intrinsics.checkNotNullParameter(asset, "asset");
            AbstractC4743jm1 abstractC4743jm1 = c4953km1.b;
            Intrinsics.checkNotNullParameter(abstractC4743jm1, "<this>");
            obj = abstractC4743jm1.b() ? H32.a.CALL_UP : H32.a.PUT_DOWN;
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        H32.a aVar3 = (H32.a) obj;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        return new O10.b(aVar3);
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
