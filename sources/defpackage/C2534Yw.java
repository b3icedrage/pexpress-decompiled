package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2534Yw extends AbstractC0637Ay0<C6990uV, a> {

    @NotNull
    public final CR0 d;

    /* JADX INFO: renamed from: Yw$a */
    public static final class a implements InterfaceC7722xy0<C6990uV> {

        @InterfaceC2691aI1("period")
        public final int a;

        public a() {
            this((Object) null);
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
            return SK.b(new StringBuilder("CCIParams(period="), this.a, ")");
        }

        public a(int i) {
            this.a = i;
        }

        public /* synthetic */ a(Object obj) {
            this(20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2534Yw(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR experimentsProviderApi) {
        super(indicatorParamsUseCase, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.d = CR0.CCI;
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final Class<a> a() {
        return a.class;
    }

    @Override // defpackage.AbstractC0637Ay0
    public final InterfaceC7722xy0 b() {
        return new a((Object) null);
    }

    @Override // defpackage.AbstractC0637Ay0
    @NotNull
    public final CR0 c() {
        return this.d;
    }
}
