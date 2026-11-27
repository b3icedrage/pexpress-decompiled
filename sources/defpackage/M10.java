package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class M10 {

    @NotNull
    public final NQ a;

    @NotNull
    public final AbstractC4743jm1 b;

    @NotNull
    public final BR0 c;

    @NotNull
    public final C6348rR d;

    public M10(@NotNull NQ currentIndicatorProvider, @NotNull AbstractC4743jm1 random, @NotNull BR0 localDirectionCalculatorsProvider, @NotNull C6348rR customIndicatorsExperimentProvider) {
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(localDirectionCalculatorsProvider, "localDirectionCalculatorsProvider");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        this.a = currentIndicatorProvider;
        this.b = random;
        this.c = localDirectionCalculatorsProvider;
        this.d = customIndicatorsExperimentProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LM lm) {
        J10 j10;
        M10 m10;
        String str;
        M10 m11;
        if (lm instanceof J10) {
            j10 = (J10) lm;
            int i = j10.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                j10.i = i - Integer.MIN_VALUE;
            } else {
                j10 = new J10(this, lm);
            }
        } else {
            j10 = new J10(this, lm);
        }
        Object objO = j10.g;
        MN mn = MN.d;
        int i2 = j10.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<C1491Lx0> interfaceC6396rf0 = this.a.b;
            j10.d = this;
            j10.i = 1;
            objO = C4466ii.o(interfaceC6396rf0, j10);
            if (objO != mn) {
                m10 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            m10 = j10.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = j10.e;
            m11 = j10.d;
            C1795Pt1.b(objO);
        }
        return new C5402mv(str, m11.b, !((Boolean) objO).booleanValue(), new K10(1, m11.c, BR0.class, "getLocalDirectionCalculator", "getLocalDirectionCalculator(Ljava/lang/String;)Lcom/api/feature/trading/direction/base_calculators/DirectionCalculator;", 0, 0));
        String str2 = ((C1491Lx0) objO).b;
        InterfaceC6396rf0<Boolean> interfaceC6396rf1 = m10.d.c;
        j10.d = m10;
        j10.e = str2;
        j10.i = 2;
        Object objO2 = C4466ii.o(interfaceC6396rf1, j10);
        if (objO2 != mn) {
            str = str2;
            objO = objO2;
            m11 = m10;
            return new C5402mv(str, m11.b, !((Boolean) objO).booleanValue(), new K10(1, m11.c, BR0.class, "getLocalDirectionCalculator", "getLocalDirectionCalculator(Ljava/lang/String;)Lcom/api/feature/trading/direction/base_calculators/DirectionCalculator;", 0, 0));
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) {
        L10 l10;
        E10.a aVar;
        if (lm instanceof L10) {
            l10 = (L10) lm;
            int i = l10.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                l10.h = i - Integer.MIN_VALUE;
            } else {
                l10 = new L10(this, lm);
            }
        } else {
            l10 = new L10(this, lm);
        }
        Object obj = l10.e;
        Object obj2 = MN.d;
        int i2 = l10.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            E10.a aVar2 = E10.a;
            l10.d = aVar2;
            l10.h = 1;
            Object objA = a(l10);
            if (objA == obj2) {
                return obj2;
            }
            aVar = aVar2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = l10.d;
            C1795Pt1.b(obj);
        }
        C5402mv params = (C5402mv) obj;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        C4953km1 c4953km1 = new C4953km1(params.b);
        C4837kE c4837kE = new C4837kE(c4953km1);
        CR0 cr0 = CR0.ADX;
        String str = params.a;
        if (Intrinsics.a(str, "close_price")) {
            return c4837kE;
        }
        E10 e10 = (E10) params.d.invoke(str);
        return params.c ? new C4842kF1(e10, c4953km1) : e10;
    }
}
