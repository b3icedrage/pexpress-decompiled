package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", l = {146, 174}, m = "invokeSuspend")
public final class C1084Gr0 extends AW1 implements InterfaceC1060Gj0<JF1, C3032br0, JM<? super C2250Vp0>, Object> {
    public int d;
    public /* synthetic */ JF1 e;
    public /* synthetic */ C3032br0 g;
    public final /* synthetic */ C1006Fr0 h;
    public final /* synthetic */ C1782Pp0 i;

    /* JADX INFO: renamed from: Gr0$a */
    public static final class a extends ML0 implements Function1<Throwable, Unit> {
        public final /* synthetic */ C2936bP1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2936bP1 c2936bP1) {
            super(1);
            this.d = c2936bP1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.d.l(null);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Gr0$b */
    @InterfaceC3368dU(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", l = {164}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ Long e;
        public final /* synthetic */ C3032br0 g;
        public final /* synthetic */ C4002gV1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l, C3032br0 c3032br0, C4002gV1 c4002gV1, JM jm) {
            super(2, jm);
            this.e = l;
            this.g = c3032br0;
            this.h = c4002gV1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new b(this.e, this.g, this.h, jm);
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
            if (i == 0) {
                C1795Pt1.b(obj);
                long jLongValue = this.e.longValue();
                this.d = 1;
                if (IW.b(jLongValue, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C3032br0 request = this.g;
            Intrinsics.checkNotNullParameter(request, "request");
            Z72 z72 = request.a;
            z72.a();
            StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            C4466ii.d(z72, sb);
            String url = sb.toString();
            Intrinsics.checkNotNullExpressionValue(url, "appendTo(StringBuilder(256)).toString()");
            C1006Fr0.b key = C1006Fr0.d;
            Intrinsics.checkNotNullParameter(key, "key");
            Map map = (Map) request.f.e(C3867fq0.a);
            C1006Fr0.a aVar = (C1006Fr0.a) (map != null ? map.get(key) : null);
            Object obj2 = aVar != null ? aVar.a : null;
            Intrinsics.checkNotNullParameter(url, "url");
            StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
            sb2.append(url);
            sb2.append(", request_timeout=");
            if (obj2 == null) {
                obj2 = "unknown";
            }
            C4758jr0 c4758jr0 = new C4758jr0(K1.a(sb2, obj2, " ms]"));
            C1162Hr0.a.c("Request timeout: " + request.a);
            String message = c4758jr0.getMessage();
            Intrinsics.checkNotNull(message);
            CancellationException cancellationException = new CancellationException(message);
            cancellationException.initCause(c4758jr0);
            this.h.E(cancellationException);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084Gr0(C1006Fr0 c1006Fr0, C1782Pp0 c1782Pp0, JM<? super C1084Gr0> jm) {
        super(3, jm);
        this.h = c1006Fr0;
        this.i = c1782Pp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                C1795Pt1.b(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        JF1 jf1 = this.e;
        C3032br0 c3032br0 = this.g;
        C3722f82 c3722f82 = c3032br0.a.a;
        Intrinsics.checkNotNullParameter(c3722f82, "<this>");
        if (Intrinsics.a(c3722f82.a, "ws") || Intrinsics.a(c3722f82.a, "wss")) {
            this.e = null;
            this.d = 1;
            Object objA = jf1.a(c3032br0, this);
            if (objA != mn) {
                return objA;
            }
        } else {
            C1006Fr0.b key = C1006Fr0.d;
            Intrinsics.checkNotNullParameter(key, "key");
            C2498Yk<Map<InterfaceC3657eq0<?>, Object>> c2498Yk = C3867fq0.a;
            YH yh = c3032br0.f;
            Map map = (Map) yh.e(c2498Yk);
            C1006Fr0.a capability = (C1006Fr0.a) (map != null ? map.get(key) : null);
            C1006Fr0 c1006Fr0 = this.h;
            if (capability == null && (c1006Fr0.a != null || c1006Fr0.b != null || c1006Fr0.c != null)) {
                capability = new C1006Fr0.a();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(capability, "capability");
                ((Map) yh.a(c2498Yk, C2822ar0.d)).put(key, capability);
            }
            if (capability != null) {
                Long l = capability.b;
                if (l == null) {
                    l = c1006Fr0.b;
                }
                C1006Fr0.a.a(l);
                capability.b = l;
                Long l2 = capability.c;
                if (l2 == null) {
                    l2 = c1006Fr0.c;
                }
                C1006Fr0.a.a(l2);
                capability.c = l2;
                Long l3 = capability.a;
                if (l3 == null) {
                    l3 = c1006Fr0.a;
                }
                C1006Fr0.a.a(l3);
                capability.a = l3;
                if (l3 == null) {
                    l3 = c1006Fr0.a;
                }
                if (l3 != null && l3.longValue() != Long.MAX_VALUE) {
                    c3032br0.e.W(new a(C5189lv.k(this.i, null, new b(l3, c3032br0, c3032br0.e, null), 3)));
                }
            }
            this.e = null;
            this.d = 2;
            Object objA2 = jf1.a(c3032br0, this);
            if (objA2 != mn) {
                return objA2;
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(JF1 jf1, C3032br0 c3032br0, JM<? super C2250Vp0> jm) {
        C1084Gr0 c1084Gr0 = new C1084Gr0(this.h, this.i, jm);
        c1084Gr0.e = jf1;
        c1084Gr0.g = c3032br0;
        return c1084Gr0.invokeSuspend(Unit.a);
    }
}
