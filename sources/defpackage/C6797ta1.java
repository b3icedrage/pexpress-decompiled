package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ta1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6797ta1 implements InterfaceC6168qa1 {

    @NotNull
    public final ZT1 a;

    @Nullable
    public C2128Ua1 b;

    @Nullable
    public InterfaceC6168qa1.a c;

    @NotNull
    public final GP1 d;

    /* JADX INFO: renamed from: ta1$a */
    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$sendEvent$1", f = "NisyReporterBase.kt", l = {72}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C2658a80 g;

        /* JADX INFO: renamed from: ta1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$sendEvent$1$1", f = "NisyReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class C0496a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public C0496a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0496a c0496a = new C0496a(2, jm);
                c0496a.d = ((Boolean) obj).booleanValue();
                return c0496a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0496a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2658a80 c2658a80, JM<? super a> jm) {
            super(2, jm);
            this.g = c2658a80;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6797ta1.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C6797ta1 c6797ta1 = C6797ta1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = c6797ta1.d;
                C0496a c0496a = new C0496a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, c0496a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C2128Ua1 c2128Ua1 = c6797ta1.b;
            if (c2128Ua1 != null) {
                c2128Ua1.a(this.g);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: ta1$b */
    @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$setProperty$1", f = "NisyReporterBase.kt", l = {83}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C7713xv0 g;

        /* JADX INFO: renamed from: ta1$b$a */
        @InterfaceC3368dU(c = "com.base.feature.analytics.reporters.OurAnalyticsReporterBase$setProperty$1$1", f = "NisyReporterBase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
            public /* synthetic */ boolean d;

            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(2, jm);
                aVar.d = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return Boolean.valueOf(this.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7713xv0 c7713xv0, JM<? super b> jm) {
            super(2, jm);
            this.g = c7713xv0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6797ta1.this.new b(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C6797ta1 c6797ta1 = C6797ta1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                GP1 gp1 = c6797ta1.d;
                a aVar = new a(2, null);
                this.d = 1;
                if (C4466ii.p(gp1, aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C2128Ua1 c2128Ua1 = c6797ta1.b;
            if (c2128Ua1 != null) {
                c2128Ua1.b(this.g);
            }
            return Unit.a;
        }
    }

    public C6797ta1(@NotNull ZT1 subIdProviderApi) {
        Intrinsics.checkNotNullParameter(subIdProviderApi, "subIdProviderApi");
        this.a = subIdProviderApi;
        this.d = C1589Ne.i(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC6168qa1
    public final void c() {
        C2128Ua1 c2128Ua1 = this.b;
        if (c2128Ua1 != null) {
            C5189lv.k(c2128Ua1, null, new C2050Ta1(c2128Ua1, null), 3);
        }
    }

    @Override // defpackage.InterfaceC6168qa1
    public final void f() {
        C2128Ua1 c2128Ua1 = this.b;
        if (c2128Ua1 != null) {
            C5189lv.k(c2128Ua1, null, new C1972Sa1(c2128Ua1, null), 3);
        }
    }

    @Override // defpackage.InterfaceC6168qa1
    public final void g(@NotNull C2658a80 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!((Boolean) this.d.getValue()).booleanValue()) {
            C5189lv.k(C3784fT.a, null, new a(event, null), 3);
            return;
        }
        C2128Ua1 c2128Ua1 = this.b;
        if (c2128Ua1 != null) {
            c2128Ua1.a(event);
        }
    }

    @Override // defpackage.InterfaceC6168qa1
    public final void h(@NotNull C7713xv0 identify) {
        Intrinsics.checkNotNullParameter(identify, "identify");
        if (!((Boolean) this.d.getValue()).booleanValue()) {
            C5189lv.k(C3784fT.a, null, new b(identify, null), 3);
            return;
        }
        C2128Ua1 c2128Ua1 = this.b;
        if (c2128Ua1 != null) {
            c2128Ua1.b(identify);
        }
    }

    @Override // defpackage.InterfaceC6168qa1
    public final void i(@NotNull ApplicationC0963Fd appContext, @NotNull EM scope, @NotNull C0807Dd profileFlow) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(profileFlow, "profileFlow");
        Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com", "host");
        C5189lv.k(scope, C6266r20.a, new C6377ra1(profileFlow, this, null), 2);
        C5189lv.k(scope, C6266r20.c, new C6587sa1(this, appContext, null), 2);
    }
}
