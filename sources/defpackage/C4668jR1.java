package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4668jR1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final Enum a(@NotNull InterfaceC0565Aa0 interfaceC0565Aa0, @NotNull LM lm) {
        C4410iR1 c4410iR1;
        if (lm instanceof C4410iR1) {
            c4410iR1 = (C4410iR1) lm;
            int i = c4410iR1.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4410iR1.e = i - Integer.MIN_VALUE;
            } else {
                c4410iR1 = new C4410iR1(lm);
            }
        } else {
            c4410iR1 = new C4410iR1(lm);
        }
        Object objC = c4410iR1.d;
        MN mn = MN.d;
        int i2 = c4410iR1.e;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            EnumC7637xa0 enumC7637xa0 = EnumC7637xa0.CUSTOM_INDICATORS;
            c4410iR1.e = 1;
            objC = interfaceC0565Aa0.c();
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objC);
        }
        AbstractC7427wa0 abstractC7427wa0 = (AbstractC7427wa0) objC;
        Intrinsics.checkNotNullParameter(abstractC7427wa0, "<this>");
        EnumC4200hR1 enumC4200hR1 = null;
        AbstractC7427wa0.a aVar = abstractC7427wa0 instanceof AbstractC7427wa0.a ? (AbstractC7427wa0.a) abstractC7427wa0 : null;
        if (aVar != null) {
            for (EnumC4200hR1 enumC4200hR2 : EnumC4200hR1.values()) {
                if (enumC4200hR2.d == aVar.a) {
                    enumC4200hR1 = enumC4200hR2;
                    break;
                }
            }
            if (enumC4200hR1 != null) {
                return enumC4200hR1;
            }
        }
        return EnumC4200hR1.CONTROL_OLD_STRATEGY_LIST;
    }
}
