package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ue1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2140Ue1 extends AbstractC4260hi2 {

    @NotNull
    public final YX m;

    @NotNull
    public final C4612j90 n;

    @NotNull
    public final ReporterApi o;

    @NotNull
    public final LU p;

    @NotNull
    public final VK1 q;

    @NotNull
    public final AbstractC5045lD0 r;

    @NotNull
    public final I50 s;

    @NotNull
    public final O3 t;

    @NotNull
    public final C6120qK1 u;

    @NotNull
    public final C1621Nn1 v;

    @NotNull
    public final c w;

    @NotNull
    public final C6120qK1 x;

    @NotNull
    public final C1621Nn1 y;

    @NotNull
    public final C6120qK1 z;

    /* JADX INFO: renamed from: Ue1$a */
    @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$onInit$1", f = "PlatformViewModelBase.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC2140Ue1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            AbstractC2140Ue1 abstractC2140Ue1 = AbstractC2140Ue1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                YX yx = abstractC2140Ue1.m;
                this.d = 1;
                obj = yx.b(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ReporterApi.a.a(abstractC2140Ue1.o, EnumC5113la.PLATFORM_APP_INSTALLED, Boolean.TRUE);
            }
            abstractC2140Ue1.getClass();
            KN knJ = C8056za.j(abstractC2140Ue1);
            RV rv = C6266r20.a;
            C5189lv.k(knJ, rv, new C2482Ye1(abstractC2140Ue1, null), 2);
            abstractC2140Ue1.n();
            if (!((Boolean) abstractC2140Ue1.d.e.getValue()).booleanValue()) {
                C5189lv.k(C8056za.j(abstractC2140Ue1), rv, new C2300We1(abstractC2140Ue1, null), 2);
            }
            C5189lv.k(C8056za.j(abstractC2140Ue1), rv, new C2404Xe1(abstractC2140Ue1, null), 2);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ue1$b */
    @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$showDialog$1", f = "PlatformViewModelBase.kt", l = {161}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ List<Integer> i;
        public final /* synthetic */ int j;
        public final /* synthetic */ List<String> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ Function0<Unit> m;
        public final /* synthetic */ FragmentManager n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, List<Integer> list, int i3, List<String> list2, int i4, Function0<Unit> function0, FragmentManager fragmentManager, int i5, JM<? super b> jm) {
            super(2, jm);
            this.g = i;
            this.h = i2;
            this.i = list;
            this.j = i3;
            this.k = list2;
            this.l = i4;
            this.m = function0;
            this.n = fragmentManager;
            this.o = i5;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC2140Ue1.this.new b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                VK1 vk1 = AbstractC2140Ue1.this.q;
                final List<Integer> titleArgs = this.i;
                Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
                final List<String> subtitleArgs = this.k;
                Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
                final Function0<Unit> activeButtonAction = this.m;
                Intrinsics.checkNotNullParameter(activeButtonAction, "activeButtonAction");
                final int i2 = this.j;
                final int i3 = this.l;
                final int i4 = this.g;
                final int i5 = this.h;
                Function1 receiver = new Function1() { // from class: ug
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        C3692f10.a DialogFullScreenParams = (C3692f10.a) obj2;
                        Intrinsics.checkNotNullParameter(DialogFullScreenParams, "$this$DialogFullScreenParams");
                        DialogFullScreenParams.d(i4);
                        DialogFullScreenParams.g(i5);
                        List<? extends Object> args = titleArgs;
                        Intrinsics.checkNotNullParameter(args, "args");
                        TF tf = DialogFullScreenParams.a;
                        tf.b = args;
                        DialogFullScreenParams.f(i2);
                        List<? extends Object> args2 = subtitleArgs;
                        Intrinsics.checkNotNullParameter(args2, "args");
                        tf.e = args2;
                        TF.a.b(DialogFullScreenParams, Integer.valueOf(i3), new C6819tg(activeButtonAction, 0), 6);
                        DialogFullScreenParams.c = false;
                        DialogFullScreenParams.b = null;
                        return Unit.a;
                    }
                };
                Intrinsics.checkNotNullParameter(receiver, "receiver");
                C3692f10.a aVar = new C3692f10.a();
                receiver.invoke(aVar);
                C3692f10 c3692f10 = new C3692f10(aVar.b, aVar.c);
                aVar.c(c3692f10);
                AbstractC1592Nf.t tVar = new AbstractC1592Nf.t(c3692f10);
                Integer num = new Integer(this.o);
                this.d = 1;
                if (vk1.a(tVar, this.n, num) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ue1$c */
    public static final class c implements InterfaceC6396rf0<C6542sL1> {
        public final /* synthetic */ C1621Nn1 d;
        public final /* synthetic */ AbstractC2140Ue1 e;

        /* JADX INFO: renamed from: Ue1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ AbstractC2140Ue1 e;

            /* JADX INFO: renamed from: Ue1$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$special$$inlined$map$1$2", f = "PlatformViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0155a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0155a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0, AbstractC2140Ue1 abstractC2140Ue1) {
                this.d = interfaceC6606sf0;
                this.e = abstractC2140Ue1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0155a c0155a;
                if (jm instanceof C0155a) {
                    c0155a = (C0155a) jm;
                    int i = c0155a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0155a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0155a = new C0155a(jm);
                    }
                } else {
                    c0155a = new C0155a(jm);
                }
                Object obj2 = c0155a.d;
                MN mn = MN.d;
                int i2 = c0155a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C4612j90.a aVar = (C4612j90.a) this.e.n.d.d.getValue();
                    C6542sL1 c6542sL1 = aVar != null ? (C6542sL1) aVar.a : null;
                    c0155a.e = 1;
                    if (this.d.a(c6542sL1, c0155a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(C1621Nn1 c1621Nn1, AbstractC2140Ue1 abstractC2140Ue1) {
            this.d = c1621Nn1;
            this.e = abstractC2140Ue1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C6542sL1> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: Ue1$d */
    @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$startListenForAccountChange$1", f = "PlatformViewModelBase.kt", l = {123}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: Ue1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ AbstractC2140Ue1 d;

            public a(AbstractC2140Ue1 abstractC2140Ue1) {
                this.d = abstractC2140Ue1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                Object objA = this.d.x.a(((EnumC4164hF1) obj).d, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC2140Ue1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((d) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC2140Ue1 abstractC2140Ue1 = AbstractC2140Ue1.this;
                C1699On1 c1699On1L = abstractC2140Ue1.t.l();
                a aVar = new a(abstractC2140Ue1);
                this.d = 1;
                if (c1699On1L.d.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2140Ue1(@NotNull YX depositScreenStarter, @NotNull C4923kf appData, @NotNull C4612j90 events, @NotNull ReporterApi reporter, @NotNull LU deeplinkManager, @NotNull C3051bx1 robotIndicatorProvider, @NotNull VK1 showAlertDialogUseCase, @NotNull AbstractC5045lD0 isShowUseCase, @NotNull I50 emailUseCase, @NotNull O3 selectAccountModeSelectionUseCaseApi) {
        super(appData);
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(robotIndicatorProvider, "robotIndicatorProvider");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(isShowUseCase, "isShowUseCase");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        Intrinsics.checkNotNullParameter(selectAccountModeSelectionUseCaseApi, "selectAccountModeSelectionUseCaseApi");
        this.m = depositScreenStarter;
        this.n = events;
        this.o = reporter;
        this.p = deeplinkManager;
        this.q = showAlertDialogUseCase;
        this.r = isShowUseCase;
        this.s = emailUseCase;
        this.t = selectAccountModeSelectionUseCaseApi;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.u = c6120qK1G;
        this.v = C4466ii.e(c6120qK1G);
        this.w = new c(events.f, this);
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.x = c6120qK1G2;
        this.y = C4466ii.e(c6120qK1G2);
        C6120qK1 c6120qK1G3 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.z = c6120qK1G3;
        C4466ii.e(c6120qK1G3);
    }

    @Override // defpackage.C7576xG
    public void j() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    public final void m(@NotNull FragmentManager fragmentManager, int i, int i2, int i3, @NotNull List<Integer> titleArgs, int i4, @NotNull List<String> subtitleArgs, int i5, @NotNull Function0<Unit> activeButtonAction) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
        Intrinsics.checkNotNullParameter(activeButtonAction, "activeButtonAction");
        C5189lv.k(C8056za.j(this), null, new b(i2, i3, titleArgs, i4, subtitleArgs, i5, activeButtonAction, fragmentManager, i, null), 3);
    }

    public void n() {
        C5189lv.k(C8056za.j(this), C6266r20.a, new d(null), 2);
    }
}
