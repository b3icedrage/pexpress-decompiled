package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2266Vu1 implements InterfaceC2188Uu1 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final VK1 b;

    @NotNull
    public final C6964uM0 c;

    public AbstractC2266Vu1(@NotNull ReporterApi reporter, @NotNull VK1 showAlertDialogUseCase, @NotNull C6964uM0 lastDialogShownHolder) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(lastDialogShownHolder, "lastDialogShownHolder");
        this.a = reporter;
        this.b = showAlertDialogUseCase;
        this.c = lastDialogShownHolder;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object a(@NotNull Function0<Unit> action, @NotNull JM<? super Unit> jm) {
        l("Stopped verification", "warning");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean boolA = this.b.a(new AbstractC1592Nf.z(N9.a(new C0582Ag(action, 0))), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object b(@NotNull C2924bL1 action, @NotNull JM jm) {
        l("Error connecting to platform", "error");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean boolA = this.b.a(new AbstractC1592Nf.g(N9.a(new C2561Zf(action))), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object c(@NotNull JM jm) {
        l("Enabled auto selection", "info");
        Intrinsics.checkNotNullParameter(null, "activeAction");
        Intrinsics.checkNotNullParameter(null, "passiveAction");
        Boolean boolA = this.b.a(new AbstractC1592Nf.C1594b(C7343w9.a(new C1829Qf(0))), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object d(@NotNull JM jm) {
        l("Connection to WS lost", "error");
        Intrinsics.checkNotNullParameter(null, "action");
        Boolean boolA = this.b.a(new AbstractC1592Nf.d(N9.a(new C2219Vf(0))), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object e(@NotNull final String reason, @Nullable final Integer num, @NotNull final Function0<Unit> passiveBtnCallback, @NotNull JM<? super Unit> jm) {
        l("Robot was stopped", "warning");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        Boolean boolA = this.b.a(new AbstractC1592Nf.y(N9.a(new Function1() { // from class: zg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                AlertVerticalButtonsDialogParams.g(R.string.robot_was_stopped_title_text);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new C7530x3(passiveBtnCallback, 2), 2);
                TF tf = AlertVerticalButtonsDialogParams.a;
                Integer num2 = num;
                if (num2 != null) {
                    tf.c = num2;
                } else {
                    String text = reason;
                    if (text.length() > 0) {
                        Intrinsics.checkNotNullParameter(text, "text");
                        tf.d = text;
                    } else {
                        AlertVerticalButtonsDialogParams.f(R.string.error_starting_robot_description_text);
                    }
                }
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object f(@NotNull final String reason, @Nullable final Integer num, @NotNull final C3343dL1 passiveBtnCallback, @NotNull JM jm) {
        l("Error starting robot", "error");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        Boolean boolA = this.b.a(new AbstractC1592Nf.h(N9.a(new Function1() { // from class: bg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                AlertVerticalButtonsDialogParams.g(R.string.error_starting_robot_title_text);
                TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new C2767ag(passiveBtnCallback, 0), 2);
                TF tf = AlertVerticalButtonsDialogParams.a;
                Integer num2 = num;
                if (num2 != null) {
                    tf.c = num2;
                } else {
                    String text = reason;
                    if (text.length() > 0) {
                        Intrinsics.checkNotNullParameter(text, "text");
                        tf.d = text;
                    } else {
                        AlertVerticalButtonsDialogParams.f(R.string.error_starting_robot_description_text);
                    }
                }
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object g(@NotNull final C6693t4 activeAction, @NotNull final C6819tg dismissAction, @NotNull JM jm) {
        l("Max income blocked", "info");
        ReporterApi.a.b(this.a, EnumC5028l80.M0, new C1840Qi1(), VE.c(EnumC5326ma.e), 8);
        Intrinsics.checkNotNullParameter(dismissAction, "passiveAction");
        Intrinsics.checkNotNullParameter(activeAction, "activeAction");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        Boolean boolA = this.b.a(new AbstractC1592Nf.u(C7343w9.a(new Function1() { // from class: wg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.d(R.drawable.ic_information);
                AlertDialogParams.g(R.string.dialog_profit_limit_tittle);
                AlertDialogParams.f(R.string.dialog_profit_limit_description);
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.cancel_text), new C4797k3(dismissAction, 2), 2);
                AlertDialogParams.a(Integer.valueOf(R.string.activate_text), R.color.defaultProfitLimitBlockedDialogActionButtonColor, R.color.defaultProfitLimitBlockedDialogActionButtonTextColor, new C2405Xf(activeAction, 1));
                C7239vg action = new C7239vg(dismissAction, 0);
                Intrinsics.checkNotNullParameter(action, "action");
                AlertDialogParams.a.k = action;
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object h(@NotNull final String email, @NotNull final C4 activeBtnCallback, @NotNull final C5668oA passiveBtnCallback, @NotNull JM jm) {
        l("View bets platform app", "info");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        Boolean boolA = this.b.a(new AbstractC1592Nf.C1595c(C7343w9.a(new Function1() { // from class: Tf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.d(R.drawable.ic_information);
                AlertDialogParams.g(R.string.dialog_show_bet_option_app_title);
                List<? extends Object> args = VE.c(Integer.valueOf(R.string.platform_name));
                Intrinsics.checkNotNullParameter(args, "args");
                TF tf = AlertDialogParams.a;
                tf.b = args;
                AlertDialogParams.f(R.string.dialog_show_bet_option_app_description);
                List<? extends Object> args2 = VE.c(email);
                Intrinsics.checkNotNullParameter(args2, "args");
                tf.e = args2;
                int i = 0;
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), new C1907Rf(passiveBtnCallback, i), 2);
                TF.a.b(AlertDialogParams, Integer.valueOf(R.string.open_text), new C1985Sf(activeBtnCallback, i), 6);
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object i(@NotNull C6425rm1 action, @NotNull JM jm) {
        l("Trading limit", "warning");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean boolA = this.b.a(new AbstractC1592Nf.l(N9.a(new C4249hg(action, 0))), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object j(@NotNull final List newDemoBalance, @NotNull final C7239vg action, @NotNull JM jm) {
        l("Insufficient funds demo", "warning");
        Intrinsics.checkNotNullParameter(newDemoBalance, "newDemoBalance");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean boolA = this.b.a(new AbstractC1592Nf.i(N9.a(new Function1() { // from class: cg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                AlertVerticalButtonsDialogParams.d(R.drawable.ic_information);
                AlertVerticalButtonsDialogParams.g(R.string.insufficient_funds_title_text);
                AlertVerticalButtonsDialogParams.f(R.string.fill_up_to_10000_text);
                List<? extends Object> args = newDemoBalance;
                Intrinsics.checkNotNullParameter(args, "args");
                AlertVerticalButtonsDialogParams.a.e = args;
                TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.refill_text), new X5(action, 1), 6);
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    @Override // defpackage.InterfaceC2188Uu1
    @Nullable
    public final Object k(@NotNull final C2405Xf activeAction, @NotNull final NR passiveAction, @NotNull JM jm) {
        l("Insufficient funds real", "warning");
        Intrinsics.checkNotNullParameter(passiveAction, "passiveAction");
        Intrinsics.checkNotNullParameter(activeAction, "activeAction");
        Boolean boolA = this.b.a(new AbstractC1592Nf.j(C7343w9.a(new Function1() { // from class: eg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.d(R.drawable.ic_information);
                AlertDialogParams.g(R.string.insufficient_funds_title_text);
                AlertDialogParams.f(R.string.insufficient_funds_description_text);
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.close_text), new C3410dg(passiveAction, 0), 2);
                TF.a.b(AlertDialogParams, Integer.valueOf(R.string.deposit_text), new N4(activeAction, 1), 6);
                return Unit.a;
            }
        })), null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }

    public final void l(String title, String str) {
        ReporterApi.a.b(this.a, EnumC5028l80.q0, new C6472s10(title), null, 12);
        C4721jh c4721jh = U0.u;
        if (c4721jh != null) {
            c4721jh.invoke(title, str);
        }
        C6964uM0 c6964uM0 = this.c;
        c6964uM0.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        c6964uM0.a = title;
    }
}
