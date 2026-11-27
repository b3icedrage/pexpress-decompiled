package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: af1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2765af1 extends AbstractC2140Ue1 {
    public static final long F;
    public static final /* synthetic */ int G = 0;

    @NotNull
    public final O3 A;

    @NotNull
    public final Pa2 B;

    @NotNull
    public final InterfaceC7012ub2 C;

    @NotNull
    public final GP1 D;

    @NotNull
    public final C1699On1 E;

    /* JADX INFO: renamed from: af1$a */
    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformViewModelImpl$onInit$1", f = "PlatformViewModelImpl.kt", l = {76}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: af1$a$a, reason: collision with other inner class name */
        public static final class C0217a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2765af1 d;

            public C0217a(C2765af1 c2765af1) {
                this.d = c2765af1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C2765af1 c2765af1 = this.d;
                GP1 gp1 = c2765af1.D;
                gp1.getClass();
                gp1.m(null, "about:blank");
                c2765af1.l();
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2765af1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            int i2 = C2765af1.G;
            C2765af1 c2765af1 = C2765af1.this;
            C6120qK1 c6120qK1 = c2765af1.d.v;
            C0217a c0217a = new C0217a(c2765af1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, c0217a, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: af1$b */
    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformViewModelImpl$startListenForAccountChange$1", f = "PlatformViewModelImpl.kt", l = {62}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: af1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2765af1 d;

            public a(C2765af1 c2765af1) {
                this.d = c2765af1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                String str;
                EnumC4164hF1 enumC4164hF1 = (EnumC4164hF1) obj;
                int iOrdinal = enumC4164hF1.ordinal();
                if (iOrdinal == 0) {
                    str = "/demo-quick-high-low/";
                } else {
                    if (iOrdinal != 1) {
                        throw new C6489s51();
                    }
                    str = "/quick-high-low/";
                }
                C2765af1 c2765af1 = this.d;
                c2765af1.D.setValue(c2765af1.B.p() + str);
                Object objA = c2765af1.x.a(enumC4164hF1.d, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2765af1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((b) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C2765af1 c2765af1 = C2765af1.this;
                C1699On1 c1699On1L = c2765af1.A.l();
                a aVar = new a(c2765af1);
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

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        F = c.g(1, R40.SECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2765af1(@NotNull YX depositScreenStarter, @NotNull C4923kf appData, @NotNull C4612j90 events, @NotNull ReporterApi reporter, @NotNull LU deeplinkManager, @NotNull C3051bx1 robotIndicatorProvider, @NotNull VK1 showAlertDialogUseCase, @NotNull AbstractC5045lD0 isShowUseCase, @NotNull I50 emailUseCase, @NotNull O3 selectedAccountModeSelectionUseCase, @NotNull Pa2 urlsProvider, @NotNull InterfaceC7012ub2 userRepository) {
        super(depositScreenStarter, appData, events, reporter, deeplinkManager, robotIndicatorProvider, showAlertDialogUseCase, isShowUseCase, emailUseCase, selectedAccountModeSelectionUseCase);
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(robotIndicatorProvider, "robotIndicatorProvider");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(isShowUseCase, "isShowUseCase");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        Intrinsics.checkNotNullParameter(selectedAccountModeSelectionUseCase, "selectedAccountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.A = selectedAccountModeSelectionUseCase;
        this.B = urlsProvider;
        this.C = userRepository;
        GP1 gp1I = C1589Ne.i(urlsProvider.p());
        this.D = gp1I;
        this.E = C4466ii.f(gp1I);
    }

    @Override // defpackage.AbstractC2140Ue1, defpackage.C7576xG
    public final void j() {
        super.j();
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    @Override // defpackage.AbstractC2140Ue1
    public final void n() {
        C5189lv.k(C8056za.j(this), C6266r20.a, new b(null), 2);
    }
}
