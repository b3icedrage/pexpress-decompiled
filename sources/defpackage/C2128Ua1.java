package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ua1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2128Ua1 implements KN {
    public final /* synthetic */ EM d;

    @NotNull
    public final A90 e;

    /* JADX INFO: renamed from: Ua1$a */
    @InterfaceC3368dU(c = "com.pexpress.events.impl.PExpEventsImpl$sendEvent$1", f = "ExpEventsImpl.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C2658a80 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2658a80 c2658a80, JM<? super a> jm) {
            super(2, jm);
            this.g = c2658a80;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2128Ua1.this.new a(this.g, jm);
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
                A90 a90 = C2128Ua1.this.e;
                this.d = 1;
                if (a90.d(this.g, this) == mn) {
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

    /* JADX INFO: renamed from: Ua1$b */
    @InterfaceC3368dU(c = "com.pexpress.events.impl.PExpEventsImpl$setProperty$1", f = "ExpEventsImpl.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C7713xv0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7713xv0 c7713xv0, JM<? super b> jm) {
            super(2, jm);
            this.g = c7713xv0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2128Ua1.this.new b(this.g, jm);
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
                A90 a90 = C2128Ua1.this.e;
                this.d = 1;
                if (a90.f(this.g, this) == mn) {
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

    public C2128Ua1(@NotNull C7416wW1 store, @NotNull C4979kv builderInfo) {
        Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", "apiKey");
        Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com", "host");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(builderInfo, "builderInfo");
        this.d = LN.a(C6266r20.a);
        this.e = new A90(store, builderInfo);
        C5189lv.k(this, null, new C1894Ra1(this, null), 3);
    }

    public final void a(@NotNull C2658a80 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C5189lv.k(this, null, new a(event, null), 3);
    }

    public final void b(@NotNull C7713xv0 identify) {
        Intrinsics.checkNotNullParameter(identify, "identify");
        C5189lv.k(this, null, new b(identify, null), 3);
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.d.d;
    }
}
