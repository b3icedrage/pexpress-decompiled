package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6674sz0 extends AbstractC7066uq {

    @NotNull
    public final InterfaceC3371dV e;

    @NotNull
    public final C5412my0 f;

    @NotNull
    public final C4612j90 g;

    @NotNull
    public final Kc2 h;

    @NotNull
    public final C4250hg0 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C1699On1 k;

    @NotNull
    public final C4250hg0 l;

    /* JADX INFO: renamed from: sz0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigViewModel$1", f = "IndicatorsManualConfigViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: sz0$a$a, reason: collision with other inner class name */
        public static final class C0491a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C6674sz0 d;

            public C0491a(C6674sz0 c6674sz0) {
                this.d = c6674sz0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.d.j.setValue((InterfaceC7722xy0) obj);
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6674sz0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6674sz0 c6674sz0 = C6674sz0.this;
                C4250hg0 c4250hg0 = c6674sz0.i;
                C0491a c0491a = new C0491a(c6674sz0);
                this.d = 1;
                if (c4250hg0.c(c0491a, this) == mn) {
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

    /* JADX INFO: renamed from: sz0$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigViewModel$2", f = "IndicatorsManualConfigViewModel.kt", l = {37}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: sz0$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C6674sz0 d;

            public a(C6674sz0 c6674sz0) {
                this.d = c6674sz0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((Boolean) obj).booleanValue();
                this.d.s();
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C6674sz0.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6674sz0 c6674sz0 = C6674sz0.this;
                C1699On1 c1699On1 = c6674sz0.g.m;
                a aVar = new a(c6674sz0);
                this.d = 1;
                Object objC = c1699On1.d.c(new C6884tz0(aVar), this);
                if (objC != mn) {
                    objC = Unit.a;
                }
                if (objC == mn) {
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

    /* JADX INFO: renamed from: sz0$c */
    public static final class c implements InterfaceC6396rf0<C7725xz0> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: sz0$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: sz0$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigViewModel$special$$inlined$map$1$2", f = "IndicatorsManualConfigViewModel.kt", l = {219}, m = "emit")
            public static final class C0492a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0492a(JM jm) {
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
                C0492a c0492a;
                if (jm instanceof C0492a) {
                    c0492a = (C0492a) jm;
                    int i = c0492a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0492a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0492a = new C0492a(jm);
                    }
                } else {
                    c0492a = new C0492a(jm);
                }
                Object obj2 = c0492a.d;
                MN mn = MN.d;
                int i2 = c0492a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    InterfaceC7722xy0 interfaceC7722xy0 = (InterfaceC7722xy0) obj;
                    C7725xz0 c7725xz0A = interfaceC7722xy0 != null ? C7935yz0.a(interfaceC7722xy0) : null;
                    c0492a.e = 1;
                    if (this.d.a(c7725xz0A, c0492a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super C7725xz0> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6674sz0(@NotNull InterfaceC3371dV callbacks, @NotNull C5412my0 indicatorManualConfigProvider, @NotNull C4612j90 events, @NotNull Kc2 validateFieldInManualConfigUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(indicatorManualConfigProvider, "indicatorManualConfigProvider");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(validateFieldInManualConfigUseCase, "validateFieldInManualConfigUseCase");
        this.e = callbacks;
        this.f = indicatorManualConfigProvider;
        this.g = events;
        this.h = validateFieldInManualConfigUseCase;
        this.i = indicatorManualConfigProvider.d;
        GP1 gp1I = C1589Ne.i(null);
        this.j = gp1I;
        C1699On1 c1699On1K = k(new c(gp1I), null, new C7395wP1());
        this.k = c1699On1K;
        this.l = new C4250hg0(c1699On1K, 0);
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
        C6561sS.g(this, new b(null));
    }

    public static double p(String str) {
        return (str.length() == 2 && KS1.z(str) == '0' && Character.isDigit(str.charAt(1))) ? p(String.valueOf(str.charAt(1))) : ((double) QX0.a(r(str) * ((double) 10))) / 10.0d;
    }

    public static double r(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return QO.p(string);
    }

    public final void n(@NotNull String newValue, @NotNull EnumC7224vc0 id, boolean z) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(id, "id");
        double dR = z ? r(newValue) : p(newValue);
        C3471dy0 c3471dy0O = o(id);
        if (c3471dy0O != null) {
            GP1 gp1 = this.j;
            InterfaceC7722xy0 interfaceC7722xy0 = (InterfaceC7722xy0) gp1.getValue();
            if (interfaceC7722xy0 == null) {
                return;
            }
            Double dValueOf = Double.valueOf(dR);
            this.h.getClass();
            InterfaceC7722xy0 interfaceC7722xy0A = Kc2.a(id, dValueOf, interfaceC7722xy0, c3471dy0O, z);
            if (interfaceC7722xy0A == null) {
                return;
            }
            gp1.getClass();
            gp1.m(null, interfaceC7722xy0A);
        }
    }

    public final C3471dy0 o(EnumC7224vc0 enumC7224vc0) {
        C7725xz0 c7725xz0 = (C7725xz0) this.k.d.getValue();
        if (c7725xz0 == null) {
            return null;
        }
        Iterator<T> it = c7725xz0.c.iterator();
        while (it.hasNext()) {
            for (C3471dy0 c3471dy0 : ((C1027Fy0) it.next()).c) {
                if (c3471dy0.a == enumC7224vc0) {
                    return c3471dy0;
                }
            }
        }
        return null;
    }

    public final void q(@NotNull EnumC7224vc0 id) {
        Intrinsics.checkNotNullParameter(id, "id");
        C3471dy0 c3471dy0O = o(id);
        if (c3471dy0O != null) {
            GP1 gp1 = this.j;
            InterfaceC7722xy0 interfaceC7722xy0 = (InterfaceC7722xy0) gp1.getValue();
            if (interfaceC7722xy0 == null) {
                return;
            }
            Double dValueOf = Double.valueOf(p(c3471dy0O.b.toString()));
            this.h.getClass();
            InterfaceC7722xy0 interfaceC7722xy0A = Kc2.a(id, dValueOf, interfaceC7722xy0, c3471dy0O, false);
            if (interfaceC7722xy0A == null) {
                return;
            }
            gp1.getClass();
            gp1.m(null, interfaceC7722xy0A);
        }
    }

    public final void s() {
        C7725xz0 c7725xz0 = (C7725xz0) this.k.d.getValue();
        if (c7725xz0 != null) {
            Iterator<T> it = c7725xz0.c.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((C1027Fy0) it.next()).c.iterator();
                while (it2.hasNext()) {
                    q(((C3471dy0) it2.next()).a);
                }
            }
        }
    }
}
