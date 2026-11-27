package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2134Uc1 extends AbstractC7452wg1<String> implements InterfaceC1900Rc1 {

    @NotNull
    public final InterfaceC1442Lg1 d;

    @NotNull
    public final AbstractC0662Bg1.a<String> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2134Uc1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = preferencesRepository;
        this.e = C1052Gg1.d("PENDING_ADD_USER_EMAIL");
    }

    @Override // defpackage.InterfaceC1900Rc1
    @Nullable
    public final Object d(@NotNull LM lm) {
        return this.d.c(C5487nJ1.b(this), lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1900Rc1
    @Nullable
    public final Object e(@Nullable String str, @NotNull LM lm) {
        C1978Sc1 c1978Sc1;
        if (lm instanceof C1978Sc1) {
            c1978Sc1 = (C1978Sc1) lm;
            int i = c1978Sc1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1978Sc1.h = i - Integer.MIN_VALUE;
            } else {
                c1978Sc1 = new C1978Sc1(this, lm);
            }
        } else {
            c1978Sc1 = new C1978Sc1(this, lm);
        }
        Object objO = c1978Sc1.e;
        MN mn = MN.d;
        int i2 = c1978Sc1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<String> interfaceC6396rf0K = k();
            c1978Sc1.d = str;
            c1978Sc1.h = 1;
            objO = C4466ii.o(interfaceC6396rf0K, c1978Sc1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c1978Sc1.d;
            C1795Pt1.b(objO);
        }
        String str2 = (String) objO;
        return Boolean.valueOf((str2 == null || StringsKt.I(str2) || str == null || StringsKt.I(str) || !str2.equalsIgnoreCase(str)) ? false : true);
    }

    @Override // defpackage.InterfaceC1900Rc1
    @Nullable
    public final Object f(@NotNull String str, @NotNull LM lm) {
        return l(new C2056Tc1(str, null), lm);
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.e;
    }
}
