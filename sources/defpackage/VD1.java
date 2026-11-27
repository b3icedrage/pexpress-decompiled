package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1
public final class VD1 {

    @NotNull
    public static final b Companion = new b();
    public final int a;
    public final int b;
    public final int c;

    public /* synthetic */ class a implements InterfaceC0829Dk0<VD1> {

        @NotNull
        public static final a a;

        @NotNull
        public static final C6188qf1 b;

        static {
            a aVar = new a();
            a = aVar;
            C6188qf1 c6188qf1 = new C6188qf1("com.pexpress.events.api.model.ScreenInfo", aVar, 3);
            c6188qf1.l("width");
            c6188qf1.l("height");
            c6188qf1.l("ratio");
            b = c6188qf1;
        }

        @Override // defpackage.RJ0
        public final void a(C3783fS1 encoder, Object obj) {
            VD1 value = (VD1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C6188qf1 c6188qf1 = b;
            GH ghC = encoder.c(c6188qf1);
            ghC.i(c6188qf1, 0, value.a);
            ghC.i(c6188qf1, 1, value.b);
            ghC.i(c6188qf1, 2, value.c);
            ghC.b(c6188qf1);
        }

        @Override // defpackage.InterfaceC0829Dk0
        @NotNull
        public final RJ0<?>[] b() {
            EB0 eb0 = EB0.a;
            return new RJ0[]{eb0, eb0, eb0};
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
            boolean z = true;
            int i = 0;
            int iS = 0;
            int iS2 = 0;
            int iS3 = 0;
            while (z) {
                int iH = ehC.h(c6188qf1);
                if (iH == -1) {
                    z = false;
                } else if (iH == 0) {
                    iS = ehC.s(c6188qf1, 0);
                    i |= 1;
                } else if (iH == 1) {
                    iS2 = ehC.s(c6188qf1, 1);
                    i |= 2;
                } else {
                    if (iH != 2) {
                        throw new L82(iH);
                    }
                    iS3 = ehC.s(c6188qf1, 2);
                    i |= 4;
                }
            }
            ehC.b(c6188qf1);
            return new VD1(i, iS, iS2, iS3);
        }
    }

    public static final class b {
        @NotNull
        public final RJ0<VD1> serializer() {
            return a.a;
        }
    }

    public VD1(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            C3787fU.m(i, 7, a.b);
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VD1)) {
            return false;
        }
        VD1 vd1 = (VD1) obj;
        return this.a == vd1.a && this.b == vd1.b && this.c == vd1.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", ratio=");
        return SK.b(sb, this.c, ")");
    }

    public VD1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
