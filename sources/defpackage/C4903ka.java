package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4903ka extends AbstractC4108h00 {
    public K80 h;
    public C1174Hv0 i;

    /* JADX INFO: renamed from: ka$a */
    @InterfaceC3368dU(c = "com.amplitude.core.platform.plugins.AmplitudeDestination$enqueue$1$1", f = "AmplitudeDestination.kt", l = {51}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C0612Aq g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0612Aq c0612Aq, JM<? super a> jm) {
            super(2, jm);
            this.g = c0612Aq;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C4903ka.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C4903ka c4903ka = C4903ka.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1174Hv0 c1174Hv0 = c4903ka.i;
                if (c1174Hv0 == null) {
                    Intrinsics.l("identifyInterceptor");
                    throw null;
                }
                this.d = 1;
                obj = c1174Hv0.a(this.g, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C0612Aq event = (C0612Aq) obj;
            if (event != null) {
                c4903ka.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                K80 k80 = c4903ka.h;
                if (k80 == null) {
                    Intrinsics.l("pipeline");
                    throw null;
                }
                k80.a(event);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: ka$b */
    @InterfaceC3368dU(c = "com.amplitude.core.platform.plugins.AmplitudeDestination$flush$1", f = "AmplitudeDestination.kt", l = {39}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C4903ka.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C4903ka c4903ka = C4903ka.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1174Hv0 c1174Hv0 = c4903ka.i;
                if (c1174Hv0 == null) {
                    Intrinsics.l("identifyInterceptor");
                    throw null;
                }
                this.d = 1;
                if (c1174Hv0.c(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            K80 k80 = c4903ka.h;
            if (k80 != null) {
                k80.b.n(new C4272hl2(EnumC4481il2.e, null));
                return Unit.a;
            }
            Intrinsics.l("pipeline");
            throw null;
        }
    }

    @Override // defpackage.AbstractC4108h00, defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        K80 k80 = new K80(amplitude);
        this.h = k80;
        k80.h = true;
        J80 j80 = new J80(k80, null);
        Y90 y90 = amplitude.f;
        EM em = amplitude.c;
        C5189lv.k(em, y90, j80, 2);
        C5189lv.k(em, amplitude.e, new I80(k80, null), 2);
        this.i = new C1174Hv0(amplitude.e(), amplitude, amplitude.l, amplitude.a, this);
        C1722Ov0 plugin = new C1722Ov0();
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(h(), "<set-?>");
        this.d.a(plugin);
    }

    @Override // defpackage.M80
    @Nullable
    public final C0612Aq b(@NotNull C0612Aq payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // defpackage.M80
    @Nullable
    public final C8133zv0 c(@NotNull C8133zv0 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // defpackage.M80
    @Nullable
    public final C2605Zt1 d(@NotNull C2605Zt1 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // defpackage.M80
    @Nullable
    public final C2796an0 f(@NotNull C2796an0 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // defpackage.M80
    public final void flush() {
        C3595ea c3595eaH = h();
        C3595ea c3595eaH2 = h();
        C5189lv.k(c3595eaH.c, c3595eaH2.f, new b(null), 2);
    }

    public final void j(C0612Aq c0612Aq) {
        if (c0612Aq != null) {
            if (c0612Aq.b()) {
                C5189lv.k(h().c, h().f, new a(c0612Aq, null), 2);
                return;
            }
            h().l.warn("Event is invalid for missing information like userId and deviceId. Dropping event: " + c0612Aq.a());
        }
    }
}
