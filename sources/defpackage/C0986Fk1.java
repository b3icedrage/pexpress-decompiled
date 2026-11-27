package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: Fk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986Fk1 implements L71 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final C6175qc0 g = new C6175qc0("key", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(1))));
    public static final C6175qc0 h = new C6175qc0(AppMeasurementSdk.ConditionalUserProperty.VALUE, C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(2))));
    public static final C0908Ek1 i = new C0908Ek1();
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final C1064Gk1 d;
    public final C1220Ik1 e = new C1220Ik1(this);

    public C0986Fk1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C1064Gk1 c1064Gk1) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = c1064Gk1;
    }

    public static int h(C6175qc0 c6175qc0) {
        InterfaceC8098zk1 interfaceC8098zk1 = (InterfaceC8098zk1) ((Annotation) c6175qc0.b.get(InterfaceC8098zk1.class));
        if (interfaceC8098zk1 != null) {
            return ((C7886yk) interfaceC8098zk1).a;
        }
        throw new I60("Field has no @Protobuf config");
    }

    @Override // defpackage.L71
    @NonNull
    public final L71 a(@NonNull C6175qc0 c6175qc0, Object obj) {
        c(c6175qc0, obj, true);
        return this;
    }

    public final void b(@NonNull C6175qc0 c6175qc0, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        InterfaceC8098zk1 interfaceC8098zk1 = (InterfaceC8098zk1) ((Annotation) c6175qc0.b.get(InterfaceC8098zk1.class));
        if (interfaceC8098zk1 == null) {
            throw new I60("Field has no @Protobuf config");
        }
        i(((C7886yk) interfaceC8098zk1).a << 3);
        i(i2);
    }

    public final void c(@NonNull C6175qc0 c6175qc0, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(c6175qc0) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(c6175qc0, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, c6175qc0, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(c6175qc0) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            i((h(c6175qc0) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            InterfaceC8098zk1 interfaceC8098zk1 = (InterfaceC8098zk1) ((Annotation) c6175qc0.b.get(InterfaceC8098zk1.class));
            if (interfaceC8098zk1 == null) {
                throw new I60("Field has no @Protobuf config");
            }
            i(((C7886yk) interfaceC8098zk1).a << 3);
            j(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(c6175qc0, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(c6175qc0) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        K71 k71 = (K71) this.b.get(obj.getClass());
        if (k71 != null) {
            g(k71, c6175qc0, obj, z);
            return;
        }
        Tc2 tc2 = (Tc2) this.c.get(obj.getClass());
        if (tc2 != null) {
            C1220Ik1 c1220Ik1 = this.e;
            c1220Ik1.a = false;
            c1220Ik1.c = c6175qc0;
            c1220Ik1.b = z;
            tc2.a(obj, c1220Ik1);
            return;
        }
        if (obj instanceof InterfaceC6837tk1) {
            b(c6175qc0, ((InterfaceC6837tk1) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(c6175qc0, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, c6175qc0, obj, z);
        }
    }

    @Override // defpackage.L71
    @NonNull
    public final L71 d(@NonNull C6175qc0 c6175qc0, boolean z) {
        b(c6175qc0, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.L71
    @NonNull
    public final L71 e(@NonNull C6175qc0 c6175qc0, int i2) {
        b(c6175qc0, i2, true);
        return this;
    }

    @Override // defpackage.L71
    @NonNull
    public final L71 f(@NonNull C6175qc0 c6175qc0, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        InterfaceC8098zk1 interfaceC8098zk1 = (InterfaceC8098zk1) ((Annotation) c6175qc0.b.get(InterfaceC8098zk1.class));
        if (interfaceC8098zk1 == null) {
            throw new I60("Field has no @Protobuf config");
        }
        i(((C7886yk) interfaceC8098zk1).a << 3);
        j(j);
        return this;
    }

    public final void g(K71 k71, C6175qc0 c6175qc0, Object obj, boolean z) throws IOException {
        C5504nP0 c5504nP0 = new C5504nP0();
        c5504nP0.d = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = c5504nP0;
            try {
                k71.a(obj, this);
                this.a = outputStream;
                long j = c5504nP0.d;
                c5504nP0.close();
                if (z && j == 0) {
                    return;
                }
                i((h(c6175qc0) << 3) | 2);
                j(j);
                k71.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c5504nP0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void j(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
