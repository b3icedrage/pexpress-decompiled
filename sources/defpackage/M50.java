package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class M50 extends C7576xG {

    @NotNull
    public final C1273Jc0 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C1699On1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final C1699On1 h;

    @NotNull
    public final C6120qK1 i;

    @NotNull
    public final C1621Nn1 j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final C1699On1 l;

    @NotNull
    public final InterfaceC6396rf0<Boolean> m;

    @InterfaceC3368dU(c = "com.api.library.registration.screens.email.EmailViewModel$isActionButtonDisabled$1", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<String, AbstractC0961Fc0, JM<? super Boolean>, Object> {
        public /* synthetic */ String d;
        public /* synthetic */ AbstractC0961Fc0 e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d.length() == 0 || !Intrinsics.a(this.e, Jc2.a));
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(String str, AbstractC0961Fc0 abstractC0961Fc0, JM<? super Boolean> jm) {
            a aVar = new a(3, jm);
            aVar.d = str;
            aVar.e = abstractC0961Fc0;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public M50(@NotNull C1273Jc0 emailValidationUseCase) {
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        this.d = emailValidationUseCase;
        GP1 gp1I = C1589Ne.i(Jc2.a);
        this.e = gp1I;
        C1699On1 c1699On1F = C4466ii.f(gp1I);
        this.f = c1699On1F;
        GP1 gp1I2 = C1589Ne.i("");
        this.g = gp1I2;
        C1699On1 c1699On1F2 = C4466ii.f(gp1I2);
        this.h = c1699On1F2;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.i = c6120qK1G;
        this.j = C4466ii.e(c6120qK1G);
        GP1 gp1I3 = C1589Ne.i(Boolean.FALSE);
        this.k = gp1I3;
        this.l = C4466ii.f(gp1I3);
        this.m = C4466ii.m(new C6610sg0(c1699On1F2, c1699On1F, new a(3, null)));
    }

    @NotNull
    public InterfaceC6396rf0<Boolean> l() {
        return this.m;
    }

    public void m(@NotNull String email) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(email, "email");
        GP1 gp1 = this.g;
        gp1.getClass();
        gp1.m(null, email);
        String string = StringsKt.f0(email).toString();
        Intrinsics.checkNotNullParameter(string, "<this>");
        int length = string.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!CharsKt.c(string.charAt(length))) {
                charSequenceSubSequence = string.subSequence(0, length + 1);
                break;
            } else {
                if (i < 0) {
                    charSequenceSubSequence = "";
                    break;
                }
                length = i;
            }
        }
        gp1.setValue(charSequenceSubSequence.toString());
        String newValue = (String) gp1.getValue();
        C1273Jc0 c1273Jc0 = this.d;
        c1273Jc0.getClass();
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c1273Jc0.c = newValue;
        this.e.setValue(c1273Jc0.c());
    }

    public void n() {
    }
}
