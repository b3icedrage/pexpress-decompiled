package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import io.sentry.android.core.b0;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3003bj implements InterfaceC2570Zi {

    @NotNull
    public static final Set<String> c;

    @NotNull
    public final C6499s8 a;

    @NotNull
    public final AtomicBoolean b;

    /* JADX INFO: renamed from: bj$a */
    @InterfaceC3368dU(c = "com.base.feature.telemetry.appsflyer.AppsFlyerHealthReporterImpl$1", f = "AppsFlyerHealthReporterImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
        public /* synthetic */ boolean d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = C3003bj.this.new a(jm);
            aVar.d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Unit> jm) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3003bj.this.b.set(this.d);
            return Unit.a;
        }
    }

    static {
        String[] elements = {"debug", "qa", "rc"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        c = C1526Mj.H(elements);
    }

    public C3003bj(@NotNull GX1 flagProvider) {
        Intrinsics.checkNotNullParameter(flagProvider, "flagProvider");
        AbstractC4743jm1.INSTANCE.getClass();
        this.a = new C6499s8(AbstractC4743jm1.e.c().nextDouble() < (c.contains(BuildConfig.BUILD_TYPE) ? 1.0d : 0.1d));
        this.b = new AtomicBoolean(false);
        C4466ii.v(LN.a(CoroutineContext.Element.a.c(C0564Aa.a(), C6266r20.a)), new C4718jg0(flagProvider.c, new a(null)));
    }

    public static void c(C6080q8 c6080q8) {
        C0702Bu c0702Bu = new C0702Bu();
        c0702Bu.k = "appsflyer";
        c0702Bu.h = c6080q8.a;
        c0702Bu.m = c6080q8.b ? NG1.WARNING : NG1.INFO;
        for (Map.Entry<String, Object> entry : c6080q8.c.entrySet()) {
            c0702Bu.f(entry.getValue(), entry.getKey());
        }
        QF1.e().g(c0702Bu);
    }

    @Override // defpackage.InterfaceC2570Zi
    public final void a(@NotNull EnumC6919u8 kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (this.b.get()) {
            try {
                c(this.a.b(kind));
            } catch (Throwable th) {
                b0.f("AppsFlyerHealth", "AppsFlyer telemetry failed", th);
            }
        }
    }

    @Override // defpackage.InterfaceC2570Zi
    public final void b(@NotNull EnumC6919u8 kind, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (this.b.get()) {
            try {
                C6709t8 c6709t8A = this.a.a(kind, num, str, str2);
                c(c6709t8A.a);
                C6289r8 c6289r8 = c6709t8A.b;
                if (c6289r8 != null) {
                    QF1.b(c6289r8.a, NG1.WARNING, new C2779aj(c6289r8, 0));
                }
            } catch (Throwable th) {
                b0.f("AppsFlyerHealth", "AppsFlyer telemetry failed", th);
            }
        }
    }
}
