package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import io.sentry.ILogger;
import io.sentry.util.k;
import io.sentry.vendor.gson.stream.c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4257hi implements OnFailureListener, InterfaceC7527x20 {
    public final Object d;

    public /* synthetic */ C4257hi(Object obj) {
        this.d = obj;
    }

    public void a(@NotNull C6319rH0 c6319rH0, @NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        c cVar = c6319rH0.a;
        if (obj == null) {
            cVar.k();
            return;
        }
        if (obj instanceof Character) {
            c6319rH0.j(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c6319rH0.j((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c6319rH0.k(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c6319rH0.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c6319rH0.j(N7.q((Date) obj));
                return;
            } catch (Exception e) {
                iLogger.d(NG1.ERROR, "Error when serializing Date", e);
                cVar.k();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c6319rH0.j(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.d(NG1.ERROR, "Error when serializing TimeZone", e2);
                cVar.k();
                return;
            }
        }
        if (obj instanceof BH0) {
            ((BH0) obj).serialize(c6319rH0, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(c6319rH0, iLogger, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            b(c6319rH0, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            b(c6319rH0, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            c(c6319rH0, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c6319rH0.j(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = k.a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            b(c6319rH0, iLogger, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c6319rH0.k(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c6319rH0.j(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c6319rH0.j(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c6319rH0.j(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c6319rH0.j(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            c(c6319rH0, iLogger, k.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c6319rH0.j(obj.toString());
            return;
        }
        try {
            a(c6319rH0, iLogger, ((AH0) this.d).b(iLogger, obj));
        } catch (Exception e3) {
            iLogger.d(NG1.ERROR, "Failed serializing unknown object.", e3);
            c6319rH0.j("[OBJECT]");
        }
    }

    public void b(@NotNull C6319rH0 c6319rH0, @NotNull ILogger iLogger, @NotNull Collection collection) throws IOException {
        c cVar = c6319rH0.a;
        cVar.q();
        cVar.c();
        int i = cVar.g;
        int[] iArr = cVar.e;
        if (i == iArr.length) {
            cVar.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.e;
        int i2 = cVar.g;
        cVar.g = i2 + 1;
        iArr2[i2] = 1;
        cVar.d.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(c6319rH0, iLogger, it.next());
        }
        cVar.f(']', 1, 2);
    }

    public void c(@NotNull C6319rH0 c6319rH0, @NotNull ILogger iLogger, @NotNull Map map) throws IOException {
        c6319rH0.a();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c6319rH0.c((String) obj);
                a(c6319rH0, iLogger, map.get(obj));
            }
        }
        c6319rH0.b();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        C1717Ot1.b bVarA = C1795Pt1.a(exception);
        C1717Ot1.a aVar = C1717Ot1.e;
        ((C6251qy) this.d).resumeWith(bVarA);
    }

    public C4257hi(int i) {
        this.d = new AH0(i);
    }

    public C4257hi(@NotNull UUID requestId, @NotNull InterfaceC7234ve2 target) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(target, "target");
        this.d = target;
    }
}
