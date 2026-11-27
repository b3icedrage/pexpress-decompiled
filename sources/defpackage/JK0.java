package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JK0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final Enum a(@NotNull InterfaceC0565Aa0 interfaceC0565Aa0, @NotNull LM lm) {
        IK0 ik0;
        if (lm instanceof IK0) {
            ik0 = (IK0) lm;
            int i = ik0.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik0.e = i - Integer.MIN_VALUE;
            } else {
                ik0 = new IK0(lm);
            }
        } else {
            ik0 = new IK0(lm);
        }
        Object objC = ik0.d;
        MN mn = MN.d;
        int i2 = ik0.e;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            EnumC7637xa0 enumC7637xa0 = EnumC7637xa0.CUSTOM_INDICATORS;
            ik0.e = 1;
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
        HK0 hk0 = null;
        AbstractC7427wa0.a aVar = abstractC7427wa0 instanceof AbstractC7427wa0.a ? (AbstractC7427wa0.a) abstractC7427wa0 : null;
        if (aVar != null) {
            for (HK0 hk1 : HK0.values()) {
                if (hk1.d == aVar.a) {
                    hk0 = hk1;
                    break;
                }
            }
            if (hk0 != null) {
                return hk0;
            }
        }
        return HK0.CONTROL_GROUP;
    }
}
