package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1592Nf {

    @NotNull
    public final TF a;

    /* JADX INFO: renamed from: Nf$A */
    public static final class A extends AbstractC1592Nf {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(@NotNull final Function0<Unit> action) {
            super(C7343w9.a(new Function1() { // from class: Bg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                    Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                    AlertDialogParams.g(R.string.error_need_vpn_title);
                    AlertDialogParams.f(R.string.error_need_vpn_sub_title);
                    AlertDialogParams.d(R.drawable.ic_error_vpn);
                    TF.a.b(AlertDialogParams, Integer.valueOf(R.string.instruction_text), new P4(action, 2), 6);
                    TF.a.e(AlertDialogParams, Integer.valueOf(R.string.close_text), null, 6);
                    return Unit.a;
                }
            }));
            Intrinsics.checkNotNullParameter(action, "action");
        }
    }

    /* JADX INFO: renamed from: Nf$B */
    public static final class B extends AbstractC1592Nf {

        @NotNull
        public static final B b = new B(N9.a(new C5758od(1)));
    }

    /* JADX INFO: renamed from: Nf$C */
    public static final class C extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$a, reason: case insensitive filesystem */
    public static final class C1593a extends AbstractC1592Nf {

        @NotNull
        public static final C1593a b = new C1593a(N9.a(new C1514Mf(0)));
    }

    /* JADX INFO: renamed from: Nf$b, reason: case insensitive filesystem */
    public static final class C1594b extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$c, reason: case insensitive filesystem */
    public static final class C1595c extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$d */
    public static final class d extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$e */
    public static final class e extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$f */
    public static final class f extends AbstractC1592Nf {

        @NotNull
        public static final f b = new f(N9.a(new C2483Yf(0)));
    }

    /* JADX INFO: renamed from: Nf$g */
    public static final class g extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$h */
    public static final class h extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$i */
    public static final class i extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$j */
    public static final class j extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$k */
    public static final class k extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$l */
    public static final class l extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$m */
    public static final class m extends AbstractC1592Nf {
        public m(final int i) {
            super(N9.a(new Function1() { // from class: ig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    M9.a AlertVerticalButtonsDialogParams = (M9.a) obj;
                    Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                    AlertVerticalButtonsDialogParams.g(R.string.login_failed_title);
                    AlertVerticalButtonsDialogParams.f(i);
                    AlertVerticalButtonsDialogParams.d(R.drawable.ic_error_big);
                    TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.darken_alert_dialog_ok), null, 6);
                    return Unit.a;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Nf$n */
    public static final class n extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$o */
    public static final class o extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$p */
    public static final class p extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$q */
    public static final class q extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$r */
    public static final class r extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$s */
    public static final class s extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$t */
    public static final class t extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$u */
    public static final class u extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$v */
    public static final class v extends AbstractC1592Nf {

        @NotNull
        public final Function0<Unit> b;

        @NotNull
        public final Function2<Integer, Boolean, Unit> c;

        @NotNull
        public final Function1<Integer, Unit> d;

        @NotNull
        public final Function1<Integer, Unit> e;

        public v(@NotNull final String packageName, @NotNull final Function0 openChatAction, @NotNull final Function1 closeAction, @NotNull final Function1 noActionIfRated, @NotNull final Function2 activeAction) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(openChatAction, "openChatAction");
            Intrinsics.checkNotNullParameter(activeAction, "activeAction");
            Intrinsics.checkNotNullParameter(closeAction, "closeAction");
            Intrinsics.checkNotNullParameter(noActionIfRated, "noActionIfRated");
            Function1 receiver = new Function1() { // from class: xg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C6635sm1.a RateAppDialogParams = (C6635sm1.a) obj;
                    Intrinsics.checkNotNullParameter(RateAppDialogParams, "$this$RateAppDialogParams");
                    RateAppDialogParams.getClass();
                    String packageName2 = packageName;
                    Intrinsics.checkNotNullParameter(packageName2, "packageName");
                    RateAppDialogParams.f = packageName2;
                    Function2<? super Integer, ? super Boolean, Unit> buttonAction = activeAction;
                    Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
                    RateAppDialogParams.c = buttonAction;
                    Function0<Unit> openChatAction2 = openChatAction;
                    Intrinsics.checkNotNullParameter(openChatAction2, "openChatAction");
                    RateAppDialogParams.b = openChatAction2;
                    Function1<? super Integer, Unit> closeAction2 = closeAction;
                    Intrinsics.checkNotNullParameter(closeAction2, "closeAction");
                    RateAppDialogParams.d = closeAction2;
                    Function1<? super Integer, Unit> noActionIfRated2 = noActionIfRated;
                    Intrinsics.checkNotNullParameter(noActionIfRated2, "noActionIfRated");
                    RateAppDialogParams.e = noActionIfRated2;
                    TF tf = RateAppDialogParams.a;
                    tf.n = false;
                    tf.o = false;
                    return Unit.a;
                }
            };
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            C6635sm1.a aVar = new C6635sm1.a();
            receiver.invoke(aVar);
            C6635sm1 c6635sm1 = new C6635sm1(aVar.f, aVar.b, aVar.d, aVar.e, aVar.c);
            aVar.c(c6635sm1);
            super(c6635sm1);
            this.b = openChatAction;
            this.c = activeAction;
            this.d = closeAction;
            this.e = noActionIfRated;
        }
    }

    /* JADX INFO: renamed from: Nf$w */
    public static final class w extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$x */
    public static final class x extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$y */
    public static final class y extends AbstractC1592Nf {
    }

    /* JADX INFO: renamed from: Nf$z */
    public static final class z extends AbstractC1592Nf {
    }

    public AbstractC1592Nf(TF tf) {
        this.a = tf;
    }
}
