package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class UR0 {

    @NotNull
    public static final b Companion = new b();

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public /* synthetic */ class a implements InterfaceC0829Dk0<UR0> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("com.pexpress.events.api.model.LocationInfo", aVar, 3);
            c6188qf1.l("country");
            c6188qf1.l("city");
            c6188qf1.l("region");
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            UR0 value = (UR0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            b bVar = UR0.Companion;
            C6144qS1 c6144qS1 = C6144qS1.a;
            ghC.p(c6188qf1, 0, c6144qS1, value.a);
            ghC.p(c6188qf1, 1, c6144qS1, value.b);
            ghC.p(c6188qf1, 2, c6144qS1, value.c);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            C6144qS1 c6144qS1 = C6144qS1.a;
            return new RJ0[]{C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1), C1173Hv.c(c6144qS1)};
        }

        @Override // defpackage.RJ0
        @NotNull
        public final MH1 c() {
            return b;
        }

        @Override // defpackage.RJ0
        public final Object d(InterfaceC7828yU decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C6188qf1 c6188qf1 = b;
            EH ehC = decoder.c(c6188qf1);
            String str = null;
            boolean z = true;
            int i = 0;
            String str2 = null;
            String str3 = null;
            while (z) {
                int iH = ehC.h(c6188qf1);
                if (iH == -1) {
                    z = false;
                } else if (iH == 0) {
                    str = (String) ehC.C(c6188qf1, 0, C6144qS1.a, str);
                    i |= 1;
                } else if (iH == 1) {
                    str2 = (String) ehC.C(c6188qf1, 1, C6144qS1.a, str2);
                    i |= 2;
                } else {
                    if (iH != 2) {
                        throw new L82(iH);
                    }
                    str3 = (String) ehC.C(c6188qf1, 2, C6144qS1.a, str3);
                    i |= 4;
                }
            }
            ehC.b(c6188qf1);
            return new UR0(i, str, str2, str3);
        }
    }

    public static final class b {
        @NotNull
        public final RJ0<UR0> serializer() {
            return a.a;
        }
    }

    public UR0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            C3787fU.m(i, 7, a.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UR0)) {
            return false;
        }
        UR0 ur0 = (UR0) obj;
        return Intrinsics.a(this.a, ur0.a) && Intrinsics.a(this.b, ur0.b) && Intrinsics.a(this.c, ur0.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationInfo(country=");
        sb.append(this.a);
        sb.append(", city=");
        sb.append(this.b);
        sb.append(", region=");
        return C5807oq.b(sb, this.c, ")");
    }

    public UR0(@Nullable String str) {
        this.a = str;
        this.b = null;
        this.c = null;
    }
}
