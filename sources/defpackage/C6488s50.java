package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6488s50 extends AbstractC0637Ay0<XM1, a> {

    @NotNull
    public final CR0 d;

    /* JADX INFO: renamed from: s50$a */
    public static final class a implements InterfaceC7722xy0<XM1> {

        @InterfaceC2691aI1("slowTimePeriod")
        public final int a;

        @InterfaceC2691aI1("fastTimePeriod")
        public final int b;

        public a() {
            this(0);
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int a() {
            return Math.max(this.a, this.b);
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int b() {
            return this.a;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final E10.c c() {
            return new XM1(a());
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("EmaParams(slowTimePeriod=");
            sb.append(this.a);
            sb.append(", fastTimePeriod=");
            return SK.b(sb, this.b, ")");
        }

        public a(int i) {
            this.a = 50;
            this.b = 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6488s50(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.Ema;
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final Class<a> a() {
        return a.class;
    }

    @Override // defpackage.AbstractC0637Ay0
    public final InterfaceC7722xy0 b() {
        return new a(0);
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final CR0 c() {
        return this.d;
    }
}
