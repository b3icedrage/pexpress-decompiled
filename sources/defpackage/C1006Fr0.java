package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1006Fr0 {

    @NotNull
    public static final b d = new b();

    @NotNull
    public static final C2498Yk<C1006Fr0> e = new C2498Yk<>("TimeoutPlugin");

    @Nullable
    public final Long a;

    @Nullable
    public final Long b;

    @Nullable
    public final Long c;

    /* JADX INFO: renamed from: Fr0$a */
    public static final class a {

        @Nullable
        public Long a;

        @Nullable
        public Long b;

        @Nullable
        public Long c;

        static {
            Intrinsics.checkNotNullParameter("TimeoutConfiguration", AppMeasurementSdk.ConditionalUserProperty.NAME);
        }

        public a() {
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public static void a(Long l) {
            if (l != null && l.longValue() <= 0) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b) && Intrinsics.a(this.c, aVar.c);
        }

        public final int hashCode() {
            Long l = this.a;
            int iHashCode = (l != null ? l.hashCode() : 0) * 31;
            Long l2 = this.b;
            int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
            Long l3 = this.c;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: Fr0$b */
    public static final class b implements InterfaceC4755jq0<a, C1006Fr0>, InterfaceC3657eq0<a> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C1006Fr0 c1006Fr0, C1782Pp0 scope) {
            C1006Fr0 plugin = c1006Fr0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            C6860tr0.d dVar = C6860tr0.b;
            C6860tr0 c6860tr0 = (C6860tr0) C4965kq0.a(scope);
            C1084Gr0 block = new C1084Gr0(plugin, scope, null);
            Intrinsics.checkNotNullParameter(block, "block");
            c6860tr0.a.add(block);
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C1006Fr0 b(Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new C1006Fr0(aVar.a, aVar.b, aVar.c);
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C1006Fr0> getKey() {
            return C1006Fr0.e;
        }
    }

    public C1006Fr0(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }
}
