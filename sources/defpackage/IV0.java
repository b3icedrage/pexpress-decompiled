package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class IV0 extends NV0 {

    @NotNull
    public final InterfaceC3951gE1 d;

    @NotNull
    public final C4612j90 e;

    @NotNull
    public final C4923kf f;

    @NotNull
    public final UX g;

    @NotNull
    public final InterfaceC0565Aa0 h;

    @NotNull
    public final ReporterApi i;

    @Nullable
    public C2936bP1 j;

    @NotNull
    public final androidx.lifecycle.b k;

    @NotNull
    public final W11<Integer> l;

    @NotNull
    public final W11<Integer> m;

    @NotNull
    public final W11<C2343Wt> n;

    @NotNull
    public final b o;
    public boolean p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final GP1 r;

    @NotNull
    public final androidx.lifecycle.b s;

    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivityViewModel$initExperimentsListener$1", f = "MainActivityViewModel.kt", l = {114}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return IV0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            IV0 iv0 = IV0.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC0565Aa0 interfaceC0565Aa0 = iv0.h;
                this.d = 1;
                obj = JK0.a(interfaceC0565Aa0, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            if (obj != HK0.CONTROL_GROUP) {
                GP1 gp1 = iv0.r;
                Boolean bool = Boolean.TRUE;
                gp1.getClass();
                gp1.m(null, bool);
            }
            return Unit.a;
        }
    }

    public static final class b implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ C4250hg0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: IV0$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivityViewModel$special$$inlined$map$1$2", f = "MainActivityViewModel.kt", l = {219}, m = "emit")
            public static final class C0050a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0050a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0050a c0050a;
                if (jm instanceof C0050a) {
                    c0050a = (C0050a) jm;
                    int i = c0050a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0050a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0050a = new C0050a(jm);
                    }
                } else {
                    c0050a = new C0050a(jm);
                }
                Object obj2 = c0050a.d;
                MN mn = MN.d;
                int i2 = c0050a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((FF) obj).b);
                    c0050a.e = 1;
                    if (this.d.a(boolValueOf, c0050a) == mn) {
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

        public b(C4250hg0 c4250hg0) {
            this.d = c4250hg0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivityViewModel$startListenForDeposit$1", f = "MainActivityViewModel.kt", l = {84}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return IV0.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                UX ux = IV0.this.g;
                this.d = 1;
                if (ux.b(this) == mn) {
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

    public IV0(@NotNull InterfaceC3951gE1 screensProvider, @NotNull C4612j90 events, @NotNull C4923kf appDataRepository, @NotNull UX depositNavigationManager, @NotNull IV1 supportMessagesDataMapManager, @NotNull L52 tutorialPassedPreferenceUseCaseApi, @NotNull InterfaceC0565Aa0 experimentsProviderApi, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(depositNavigationManager, "depositNavigationManager");
        Intrinsics.checkNotNullParameter(supportMessagesDataMapManager, "supportMessagesDataMapManager");
        Intrinsics.checkNotNullParameter(tutorialPassedPreferenceUseCaseApi, "tutorialPassedPreferenceUseCaseApi");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.d = screensProvider;
        this.e = events;
        this.f = appDataRepository;
        this.g = depositNavigationManager;
        this.h = experimentsProviderApi;
        this.i = reporter;
        this.k = QO.d(supportMessagesDataMapManager.b());
        this.l = new W11<>(48);
        this.m = new W11<>();
        this.n = new W11<>();
        this.o = new b(new C4250hg0(appDataRepository.b, 0));
        this.q = C1589Ne.i(null);
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.r = gp1I;
        this.s = QO.d(gp1I);
    }

    public static final C2343Wt z(IV0 iv0) {
        C2343Wt c2343WtD = iv0.n.d();
        return c2343WtD == null ? new C2343Wt(0) : c2343WtD;
    }

    @Override // defpackage.NV0
    public final void l(boolean z) {
        GP1 gp1 = this.e.n;
        Boolean boolValueOf = Boolean.valueOf(z);
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }

    @Override // defpackage.NV0
    @NotNull
    public final b m() {
        return this.o;
    }

    @Override // defpackage.NV0
    @NotNull
    public final W11 n() {
        return this.n;
    }

    @Override // defpackage.NV0
    @NotNull
    public final W11 o() {
        return this.l;
    }

    @Override // defpackage.NV0
    @NotNull
    public final GP1 p() {
        return this.q;
    }

    @Override // defpackage.NV0
    @NotNull
    public final W11 q() {
        return this.m;
    }

    @Override // defpackage.NV0
    @NotNull
    public final androidx.lifecycle.b r() {
        return this.s;
    }

    @Override // defpackage.NV0
    @NotNull
    public final androidx.lifecycle.b s() {
        return this.k;
    }

    @Override // defpackage.NV0
    public final void t() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    @Override // defpackage.NV0
    @NotNull
    public final androidx.lifecycle.b u() {
        return QO.d(this.f.e);
    }

    @Override // defpackage.NV0
    public final void v(boolean z) {
        GP1 gp1 = this.e.l;
        Boolean boolValueOf = Boolean.valueOf(z);
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }

    @Override // defpackage.NV0
    public final void w() {
        GP1 gp1 = this.q;
        InterfaceC7385wM0.a aVar = this.f.k.getValue() != null ? InterfaceC7385wM0.a.g : InterfaceC7385wM0.a.e;
        gp1.getClass();
        gp1.m(null, aVar);
    }

    @Override // defpackage.NV0
    public final void x() {
        C2936bP1 c2936bP1 = this.j;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        this.j = C5189lv.k(C3784fT.a, null, new c(null), 3);
    }

    @Override // defpackage.NV0
    public final void y(@NotNull C4250hg0 navigationFlow) {
        Intrinsics.checkNotNullParameter(navigationFlow, "navigationFlow");
        C5189lv.k(C8056za.j(this), null, new MV0(this, navigationFlow, null), 3);
    }
}
