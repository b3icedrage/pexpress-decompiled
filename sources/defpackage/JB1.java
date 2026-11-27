package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JB1 extends AbstractC0637Ay0<C6990uV, a> {

    @NotNull
    public final CR0 d;

    public static final class a implements InterfaceC7722xy0<C6990uV> {

        @InterfaceC2691aI1("acceleration")
        public final double a;

        @InterfaceC2691aI1("maximum")
        public final double b;

        public a() {
            this(0);
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int a() {
            return 2;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int b() {
            return 0;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final E10.c c() {
            return new C6990uV(0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "SARParams(acceleration=" + this.a + ", maximum=" + this.b + ")";
        }

        public a(int i) {
            this.a = 1.0d;
            this.b = 1.0d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JB1(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.SAR;
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
