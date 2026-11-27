package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class M11 extends AbstractC5395ms1 {

    @NotNull
    public static final CY0 e;

    @NotNull
    public static final CY0 f;

    @NotNull
    public static final byte[] g;

    @NotNull
    public static final byte[] h;

    @NotNull
    public static final byte[] i;

    @NotNull
    public final C1802Pw a;

    @NotNull
    public final List<b> b;

    @NotNull
    public final CY0 c;
    public long d;

    public static final class a {

        @NotNull
        public final C1802Pw a;

        @NotNull
        public CY0 b;

        @NotNull
        public final ArrayList c;

        public a() {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            C1802Pw c1802Pw = C1802Pw.h;
            this.a = C1802Pw.a.c(boundary);
            this.b = M11.e;
            this.c = new ArrayList();
        }
    }

    public static final class b {

        @Nullable
        public final C2813ao0 a;

        @NotNull
        public final AbstractC5395ms1 b;

        public b(C2813ao0 c2813ao0, AbstractC5395ms1 abstractC5395ms1) {
            this.a = c2813ao0;
            this.b = abstractC5395ms1;
        }
    }

    static {
        Pattern pattern = CY0.d;
        e = CY0.a.a("multipart/mixed");
        CY0.a.a("multipart/alternative");
        CY0.a.a("multipart/digest");
        CY0.a.a("multipart/parallel");
        f = CY0.a.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public M11(@NotNull C1802Pw boundaryByteString, @NotNull CY0 type, @NotNull List<b> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.a = boundaryByteString;
        this.b = parts;
        Pattern pattern = CY0.d;
        this.c = CY0.a.a(type + "; boundary=" + boundaryByteString.q());
        this.d = -1L;
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jD = d(null, true);
        this.d = jD;
        return jD;
    }

    @Override // defpackage.AbstractC5395ms1
    @NotNull
    public final CY0 b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        d(sink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC2606Zu interfaceC2606Zu, boolean z) throws EOFException {
        C1481Lu c1481Lu;
        InterfaceC2606Zu c1481Lu2;
        if (z) {
            c1481Lu2 = new C1481Lu();
            c1481Lu = c1481Lu2;
        } else {
            c1481Lu = 0;
            c1481Lu2 = interfaceC2606Zu;
        }
        List<b> list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            C1802Pw c1802Pw = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                Intrinsics.checkNotNull(c1481Lu2);
                c1481Lu2.Z0(bArr);
                c1481Lu2.q1(c1802Pw);
                c1481Lu2.Z0(bArr);
                c1481Lu2.Z0(bArr2);
                if (!z) {
                    return j;
                }
                Intrinsics.checkNotNull(c1481Lu);
                long j2 = j + c1481Lu.e;
                c1481Lu.g();
                return j2;
            }
            b bVar = list.get(i2);
            C2813ao0 c2813ao0 = bVar.a;
            Intrinsics.checkNotNull(c1481Lu2);
            c1481Lu2.Z0(bArr);
            c1481Lu2.q1(c1802Pw);
            c1481Lu2.Z0(bArr2);
            int size2 = c2813ao0.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c1481Lu2.y0(c2813ao0.c(i3)).Z0(g).y0(c2813ao0.f(i3)).Z0(bArr2);
            }
            AbstractC5395ms1 abstractC5395ms1 = bVar.b;
            CY0 cy0B = abstractC5395ms1.b();
            if (cy0B != null) {
                c1481Lu2.y0("Content-Type: ").y0(cy0B.a).Z0(bArr2);
            }
            long jA = abstractC5395ms1.a();
            if (jA != -1) {
                c1481Lu2.y0("Content-Length: ").o1(jA).Z0(bArr2);
            } else if (z) {
                Intrinsics.checkNotNull(c1481Lu);
                c1481Lu.g();
                return -1L;
            }
            c1481Lu2.Z0(bArr2);
            if (z) {
                j += jA;
            } else {
                abstractC5395ms1.c(c1481Lu2);
            }
            c1481Lu2.Z0(bArr2);
            i2++;
        }
    }
}
