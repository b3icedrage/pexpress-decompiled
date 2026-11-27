package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4065gm1 extends AbstractC0637Ay0<C6990uV, a> {

    @NotNull
    public final CR0 d;

    /* JADX INFO: renamed from: gm1$a */
    public static final class a implements InterfaceC7722xy0<C6990uV> {

        @InterfaceC2691aI1("period")
        public final int a;

        public a() {
            this(14);
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int a() {
            return this.a * 2;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int b() {
            return this.a;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final E10.c c() {
            return new C6990uV(new double[this.a * 2]);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return SK.b(new StringBuilder("RSIParams(period="), this.a, ")");
        }

        public a(int i) {
            this.a = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4065gm1(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.Rsi;
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final Class<a> a() {
        return a.class;
    }

    @Override // defpackage.AbstractC0637Ay0
    public final InterfaceC7722xy0 b() {
        return new a(7);
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final CR0 c() {
        return this.d;
    }
}
