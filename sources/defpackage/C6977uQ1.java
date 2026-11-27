package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6977uQ1 extends AbstractC0637Ay0<C6138qQ1, a> {

    @NotNull
    public final CR0 d;

    /* JADX INFO: renamed from: uQ1$a */
    public static final class a implements InterfaceC7722xy0<C6138qQ1> {

        @InterfaceC2691aI1("K")
        public final int a;

        @InterfaceC2691aI1("D")
        public final int b;

        @InterfaceC2691aI1("m")
        public final int c;

        public a() {
            this(0);
        }

        public static a d(a aVar, int i, int i2, int i3, int i4) {
            if ((i4 & 1) != 0) {
                i = aVar.a;
            }
            if ((i4 & 2) != 0) {
                i2 = aVar.b;
            }
            if ((i4 & 4) != 0) {
                i3 = aVar.c;
            }
            return new a(i, i2, i3);
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int a() {
            return this.a + this.b + this.c + 1;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final int b() {
            return this.a;
        }

        @Override // defpackage.InterfaceC7722xy0
        public final E10.c c() {
            return new C6138qQ1(new double[a()], new double[a()]);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StochasticParams(k=");
            sb.append(this.a);
            sb.append(", d=");
            sb.append(this.b);
            sb.append(", m=");
            return SK.b(sb, this.c, ")");
        }

        public /* synthetic */ a(int i) {
            this(14, 3, 3);
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6977uQ1(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.Stochastic;
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
