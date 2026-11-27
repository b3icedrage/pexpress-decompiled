package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3863fp extends AbstractC0637Ay0<C4283hp, a> {

    @NotNull
    public final CR0 d;

    /* JADX INFO: renamed from: fp$a */
    public static final class a implements InterfaceC7722xy0<C4283hp> {

        @InterfaceC2691aI1("period")
        public final int a;

        @InterfaceC2691aI1("optInNbDev")
        public final double b;

        public a() {
            this(0);
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
            int i = this.a * 2;
            return new C4283hp(new double[i], new double[i], new double[i]);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Double.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "BBandsParams(period=" + this.a + ", optInNbDev=" + this.b + ")";
        }

        public /* synthetic */ a(int i) {
            this(20, 2.0d);
        }

        public a(int i, double d) {
            this.a = i;
            this.b = d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3863fp(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.BBands;
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
