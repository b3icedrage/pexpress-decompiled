package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class L3 extends K3 {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final M2 e;

    @NotNull
    public final ReporterApi f;

    @NotNull
    public final c g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final C4250hg0 i;

    @NotNull
    public final C6610sg0 j;

    @NotNull
    public final C6120qK1 k;

    @NotNull
    public final C1621Nn1 l;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoViewModelBase$accountActivationSteps$1", f = "AccountMainInfoViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<List<? extends C6911u6>, AbstractC5652o6, JM<? super C6911u6>, Object> {
        public /* synthetic */ List d;
        public /* synthetic */ AbstractC5652o6 e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            List list = this.d;
            return this.e instanceof AbstractC5652o6.c ? (C6911u6) list.get(0) : (C6911u6) list.get(1);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(List<? extends C6911u6> list, AbstractC5652o6 abstractC5652o6, JM<? super C6911u6> jm) {
            a aVar = new a(3, jm);
            aVar.d = list;
            aVar.e = abstractC5652o6;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoViewModelBase$onIdClick$1", f = "AccountMainInfoViewModelBase.kt", l = {58}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return L3.this.new b(jm);
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
                L3 l3 = L3.this;
                C6120qK1 c6120qK1 = l3.k;
                C6945uG c6945uG = (C6945uG) l3.d.k.getValue();
                Long l = c6945uG != null ? new Long(c6945uG.a) : null;
                this.d = 1;
                if (c6120qK1.a(l, this) == mn) {
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

    public static final class c implements InterfaceC6396rf0<Long> {
        public final /* synthetic */ GP1 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: L3$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoViewModelBase$special$$inlined$map$1$2", f = "AccountMainInfoViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0080a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0080a(JM jm) {
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
                C0080a c0080a;
                if (jm instanceof C0080a) {
                    c0080a = (C0080a) jm;
                    int i = c0080a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0080a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0080a = new C0080a(jm);
                    }
                } else {
                    c0080a = new C0080a(jm);
                }
                Object obj2 = c0080a.d;
                MN mn = MN.d;
                int i2 = c0080a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    Long l = new Long(c6945uG != null ? c6945uG.a : 0L);
                    c0080a.e = 1;
                    if (this.d.a(l, c0080a) == mn) {
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

        public c(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Long> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public L3(@NotNull C4923kf appData, @NotNull M2 accountCallbacks, @NotNull ReporterApi reporter, @NotNull C7105v2 activationStepsProvider, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountCallbacks, "accountCallbacks");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationStepsProvider, "activationStepsProvider");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.d = appData;
        this.e = accountCallbacks;
        this.f = reporter;
        this.g = new c(appData.k);
        this.h = appData.l;
        C4250hg0 c4250hg0 = new C4250hg0(activationStateProviderApi.a(), 0);
        this.i = c4250hg0;
        this.j = new C6610sg0(activationStepsProvider.c, c4250hg0, new a(3, null));
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.k = c6120qK1G;
        this.l = C4466ii.e(c6120qK1G);
    }

    @Override // defpackage.K3
    @NotNull
    public final C6610sg0 l() {
        return this.j;
    }

    @Override // defpackage.K3
    @NotNull
    public final InterfaceC6396rf0<AbstractC5652o6> m() {
        return this.i;
    }

    @Override // defpackage.K3
    @NotNull
    public final C1621Nn1 n() {
        return this.l;
    }

    @Override // defpackage.K3
    @NotNull
    public final GP1 o() {
        return this.h;
    }

    @Override // defpackage.K3
    @NotNull
    public final c p() {
        return this.g;
    }

    @Override // defpackage.K3
    public final void q() {
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
        ReporterApi.a.b(this.f, EnumC5028l80.C0, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 8);
    }

    @Override // defpackage.K3
    public final void r() {
        this.e.i();
    }
}
