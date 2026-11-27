package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6229qq1 implements InterfaceC5599nq1 {

    @NotNull
    public final VK1 a;

    public C6229qq1(@NotNull VK1 showAlertDialogUseCase) {
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        this.a = showAlertDialogUseCase;
    }

    public static Object b(C6229qq1 c6229qq1, int i, String str, InterfaceC6396rf0 interfaceC6396rf0, KN kn, JM jm, int i2) {
        if ((i2 & 1) != 0) {
            i = R.string.error_starting_robot_description_text;
        }
        final int i3 = i;
        final String str2 = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) != 0) {
            interfaceC6396rf0 = new C0658Bf0(Boolean.FALSE);
        }
        if ((i2 & 8) != 0) {
            kn = null;
        }
        c6229qq1.getClass();
        final boolean z = kn != null;
        final C5809oq1 activeAction = new C5809oq1(kn, interfaceC6396rf0);
        final C7121v6 dismissAction = new C7121v6(c6229qq1, 4);
        Intrinsics.checkNotNullParameter(activeAction, "activeAction");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        Boolean boolA = c6229qq1.a.a(new AbstractC1592Nf.r(N9.a(new Function1() { // from class: qg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.g(R.string.an_error_occured_text);
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                AlertVerticalButtonsDialogParams.f(i3);
                TF tf = AlertVerticalButtonsDialogParams.a;
                String text = str2;
                if (text != null && text.length() > 0) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    tf.d = text;
                }
                if (z) {
                    C6399rg action = new C6399rg(dismissAction, 0);
                    Intrinsics.checkNotNullParameter(action, "action");
                    tf.k = action;
                    TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.try_again_text), new C1907Rf(activeAction, 1), 6);
                    tf.o = false;
                    tf.n = false;
                } else {
                    TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 6);
                }
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC5599nq1
    @Nullable
    public final Object a(@NotNull C4078gq1 c4078gq1, @NotNull InterfaceC6396rf0<Boolean> interfaceC6396rf0, @Nullable KN kn, @NotNull Function0<Unit> function0, @NotNull JM<? super Unit> jm) {
        int iOrdinal = c4078gq1.a.ordinal();
        VK1 vk1 = this.a;
        if (iOrdinal == 0) {
            Object objA = vk1.a(new AbstractC1592Nf.A(new C4927kg(function0, 4)), null, null);
            MN mn = MN.d;
            if (objA != mn) {
                objA = Unit.a;
            }
            return objA == mn ? objA : Unit.a;
        }
        if (iOrdinal == 1) {
            Object objA2 = vk1.a(AbstractC1592Nf.B.b, null, null);
            MN mn2 = MN.d;
            if (objA2 != mn2) {
                objA2 = Unit.a;
            }
            return objA2 == mn2 ? objA2 : Unit.a;
        }
        if (iOrdinal == 2) {
            final C7946z2 action = new C7946z2(function0, 5);
            Intrinsics.checkNotNullParameter(action, "action");
            Object objA3 = vk1.a(new AbstractC1592Nf.e(C7343w9.a(new Function1() { // from class: Wf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                    Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                    AlertDialogParams.g(R.string.email_already_registered_text);
                    AlertDialogParams.d(R.drawable.ic_error_big);
                    TF.a.b(AlertDialogParams, Integer.valueOf(R.string.log_in), new C2405Xf(action, 0), 6);
                    TF.a.e(AlertDialogParams, Integer.valueOf(R.string.cancel_text), null, 6);
                    return Unit.a;
                }
            })), null, null);
            MN mn3 = MN.d;
            if (objA3 != mn3) {
                objA3 = Unit.a;
            }
            return objA3 == mn3 ? objA3 : Unit.a;
        }
        if (iOrdinal == 4) {
            Object objB = b(this, 0, c4078gq1.b, null, null, jm, 13);
            return objB == MN.d ? objB : Unit.a;
        }
        if (iOrdinal == 5) {
            Object objB2 = b(this, R.string.email_error_hint_text, null, null, null, jm, 14);
            return objB2 == MN.d ? objB2 : Unit.a;
        }
        if (iOrdinal == 6) {
            C8141zy action2 = new C8141zy(function0, 3);
            Intrinsics.checkNotNullParameter(action2, "action");
            Object objA4 = vk1.a(new AbstractC1592Nf.s(N9.a(new C6609sg(action2, 0))), null, null);
            MN mn4 = MN.d;
            if (objA4 != mn4) {
                objA4 = Unit.a;
            }
            return objA4 == mn4 ? objA4 : Unit.a;
        }
        if (iOrdinal != 8) {
            if (iOrdinal != 9) {
                Object objB3 = b(this, 0, c4078gq1.b, interfaceC6396rf0, kn, jm, 1);
                return objB3 == MN.d ? objB3 : Unit.a;
            }
            Object objB4 = b(this, R.string.login_failed_description, null, null, null, jm, 14);
            return objB4 == MN.d ? objB4 : Unit.a;
        }
        Object objA5 = vk1.a(new AbstractC1592Nf.q(N9.a(new C5980pg(0))), null, null);
        MN mn5 = MN.d;
        if (objA5 != mn5) {
            objA5 = Unit.a;
        }
        return objA5 == mn5 ? objA5 : Unit.a;
    }
}
