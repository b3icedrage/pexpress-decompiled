package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Q40 implements RJ0<b> {

    @NotNull
    public static final Q40 a = new Q40();

    @NotNull
    public static final C5986ph1 b = new C5986ph1("kotlin.time.Duration", AbstractC5356mh1.i.a);

    @Override // defpackage.RJ0
    public final void a(C3783fS1 encoder, Object obj) {
        long j = ((b) obj).d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        b.a aVar = b.e;
        StringBuilder sb = new StringBuilder();
        if (b.o(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jT = b.o(j) ? b.t(j) : j;
        long jR = b.r(jT, R40.HOURS);
        boolean z = false;
        int iR = b.n(jT) ? 0 : (int) (b.r(jT, R40.MINUTES) % ((long) 60));
        int iR2 = b.n(jT) ? 0 : (int) (b.r(jT, R40.SECONDS) % ((long) 60));
        int iM = b.m(jT);
        if (b.n(j)) {
            jR = 9999999999999L;
        }
        boolean z2 = jR != 0;
        boolean z3 = (iR2 == 0 && iM == 0) ? false : true;
        if (iR != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jR);
            sb.append('H');
        }
        if (z) {
            sb.append(iR);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            b.e(sb, iR2, iM, 9, "S", true);
        }
        encoder.B(sb.toString());
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return b;
    }

    @Override // defpackage.RJ0
    public final Object d(InterfaceC7828yU decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        b.a aVar = b.e;
        String value = decoder.t();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new b(c.a(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C1039Gc0.d("Invalid ISO duration string format: '", value, "'."), e);
        }
    }
}
