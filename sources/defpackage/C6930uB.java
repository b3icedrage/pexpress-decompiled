package defpackage;

import com.impl.core.backend.responseModels.Deposit;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6930uB {

    @NotNull
    public final C6754tM0 a;

    public C6930uB(@NotNull C6754tM0 lastDepositUseCase) {
        Intrinsics.checkNotNullParameter(lastDepositUseCase, "lastDepositUseCase");
        this.a = lastDepositUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C6720tB c6720tB;
        C6930uB c6930uB;
        Deposit deposit;
        Deposit deposit2;
        Deposit deposit3;
        long serverTimeMs;
        long serverTimeMs2;
        C6754tM0 c6754tM0;
        Deposit deposit4;
        if (lm instanceof C6720tB) {
            c6720tB = (C6720tB) lm;
            int i = c6720tB.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6720tB.j = i - Integer.MIN_VALUE;
            } else {
                c6720tB = new C6720tB(this, lm);
            }
        } else {
            c6720tB = new C6720tB(this, lm);
        }
        Object objN = c6720tB.h;
        MN mn = MN.d;
        int i2 = c6720tB.j;
        if (i2 == 0) {
            C1795Pt1.b(objN);
            c6720tB.d = this;
            c6720tB.j = 1;
            objN = this.a.n(c6720tB);
            if (objN != mn) {
                c6930uB = this;
            }
            return mn;
        }
        if (i2 == 1) {
            C6930uB c6930uB2 = (C6930uB) c6720tB.d;
            C1795Pt1.b(objN);
            c6930uB = c6930uB2;
        } else {
            if (i2 == 2) {
                deposit = c6720tB.g;
                deposit2 = c6720tB.e;
                c6930uB = (C6930uB) c6720tB.d;
                C1795Pt1.b(objN);
                deposit3 = (Deposit) objN;
                Objects.toString(deposit3);
                serverTimeMs = deposit.getServerTimeMs();
                if (deposit3 != null) {
                    serverTimeMs2 = deposit3.getServerTimeMs();
                } else {
                    serverTimeMs2 = 0;
                }
                if (serverTimeMs <= serverTimeMs2) {
                    deposit2 = null;
                }
                if (deposit2 != null) {
                    c6754tM0 = c6930uB.a;
                    c6720tB.d = deposit2;
                    c6720tB.e = null;
                    c6720tB.g = null;
                    c6720tB.j = 3;
                    if (c6754tM0.o(deposit2, c6720tB) != mn) {
                        deposit4 = deposit2;
                    }
                    return mn;
                }
                return null;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deposit4 = (Deposit) c6720tB.d;
            C1795Pt1.b(objN);
        }
        return new Double(deposit4.getAmount());
        deposit = (Deposit) objN;
        if (deposit != null) {
            deposit.toString();
            C6754tM0.a aVar = c6930uB.a.g;
            c6720tB.d = c6930uB;
            c6720tB.e = deposit;
            c6720tB.g = deposit;
            c6720tB.j = 2;
            objN = C4466ii.q(aVar, c6720tB);
            if (objN != mn) {
                deposit2 = deposit;
                deposit3 = (Deposit) objN;
                Objects.toString(deposit3);
                serverTimeMs = deposit.getServerTimeMs();
                if (deposit3 != null) {
                    serverTimeMs2 = deposit3.getServerTimeMs();
                } else {
                    serverTimeMs2 = 0;
                }
                if (serverTimeMs <= serverTimeMs2) {
                    deposit2 = null;
                }
                if (deposit2 != null) {
                    c6754tM0 = c6930uB.a;
                    c6720tB.d = deposit2;
                    c6720tB.e = null;
                    c6720tB.g = null;
                    c6720tB.j = 3;
                    if (c6754tM0.o(deposit2, c6720tB) != mn) {
                        deposit4 = deposit2;
                        return new Double(deposit4.getAmount());
                    }
                }
            }
            return mn;
        }
        return null;
    }
}
