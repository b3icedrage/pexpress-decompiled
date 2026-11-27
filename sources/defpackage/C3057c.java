package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3057c implements InterfaceC4185hM1, J71 {

    @NotNull
    public static final GW1 d = new GW1("RESUME_TOKEN");

    @NotNull
    public static final C3057c e = new C3057c();
    public static Field g = null;
    public static boolean h = false;
    public static boolean i = true;
    public static int j = -1;

    public static void a(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            } else {
                j4 = j3 + j2;
            }
        } while (!atomicLong.compareAndSet(j3, j4 >= 0 ? j4 : Long.MAX_VALUE));
    }

    public static final void b(CQ0 cq0, InterfaceC1132Hh0 interfaceC1132Hh0) {
        if (interfaceC1132Hh0 instanceof C3449dr) {
            cq0.add(((C3449dr) interfaceC1132Hh0).a);
            return;
        }
        if (interfaceC1132Hh0 instanceof PH) {
            Iterator it = ((PH) interfaceC1132Hh0).a.iterator();
            while (it.hasNext()) {
                b(cq0, (InterfaceC7750y51) it.next());
            }
            return;
        }
        if (interfaceC1132Hh0 instanceof C8008zK) {
            return;
        }
        if (interfaceC1132Hh0 instanceof TL1) {
            b(cq0, ((TL1) interfaceC1132Hh0).a);
            return;
        }
        if (!(interfaceC1132Hh0 instanceof P9)) {
            if (interfaceC1132Hh0 instanceof C3388da1) {
                b(cq0, ((C3388da1) interfaceC1132Hh0).b);
            }
        } else {
            P9 p9 = (P9) interfaceC1132Hh0;
            b(cq0, p9.a);
            Iterator it2 = p9.b.iterator();
            while (it2.hasNext()) {
                b(cq0, (InterfaceC1132Hh0) it2.next());
            }
        }
    }

    public static String c(AbstractC1565Mw abstractC1565Mw) {
        StringBuilder sb = new StringBuilder(abstractC1565Mw.size());
        for (int i2 = 0; i2 < abstractC1565Mw.size(); i2++) {
            byte bA = abstractC1565Mw.a(i2);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    @NotNull
    public static final RJ0 d(@NotNull T0 t0, @NotNull EH decoder, @Nullable String str) {
        Intrinsics.checkNotNullParameter(t0, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        t0.getClass();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        RJ0 rj0J = decoder.a().j(t0.e(), str);
        if (rj0J != null) {
            return rj0J;
        }
        U0.o(t0.e(), str);
        throw null;
    }

    @NotNull
    public static final RJ0 f(@NotNull T0 t0, @NotNull C3783fS1 encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(t0, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t0.getClass();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        RJ0 rj0I = encoder.a().i(t0.e(), value);
        if (rj0I != null) {
            return rj0I;
        }
        RI0 subClass = C2017Sp1.a.b(value.getClass());
        RI0 baseClass = t0.e();
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String strF = subClass.f();
        if (strF == null) {
            strF = String.valueOf(subClass);
        }
        U0.o(baseClass, strF);
        throw null;
    }

    public static final int g(@NotNull Bitmap allocationByteCountCompat) {
        int i2;
        Intrinsics.checkNotNullParameter(allocationByteCountCompat, "$this$allocationByteCountCompat");
        if (allocationByteCountCompat.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + allocationByteCountCompat + " [" + allocationByteCountCompat.getWidth() + " x " + allocationByteCountCompat.getHeight() + "] + " + allocationByteCountCompat.getConfig()).toString());
        }
        try {
            return allocationByteCountCompat.getAllocationByteCount();
        } catch (Exception unused) {
            int width = allocationByteCountCompat.getWidth();
            int height = allocationByteCountCompat.getHeight();
            Bitmap.Config config = allocationByteCountCompat.getConfig();
            int i3 = width * height;
            if (config == Bitmap.Config.ALPHA_8) {
                i2 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i2 = 2;
            } else {
                i2 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            return i3 * i2;
        }
    }

    @NotNull
    public static final Bitmap.Config h(@NotNull Bitmap safeConfig) {
        Intrinsics.checkNotNullParameter(safeConfig, "$this$safeConfig");
        Bitmap.Config config = safeConfig.getConfig();
        return config != null ? config : Bitmap.Config.ARGB_8888;
    }

    public static boolean j(String str) {
        AbstractC4027gd.d dVar = Mh2.a;
        Set<InterfaceC3122cI> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC4027gd.c);
        HashSet hashSet = new HashSet();
        for (InterfaceC3122cI interfaceC3122cI : setUnmodifiableSet) {
            if (interfaceC3122cI.b().equals(str)) {
                hashSet.add(interfaceC3122cI);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC3122cI) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean k(@NotNull Bitmap.Config isHardware) {
        Intrinsics.checkNotNullParameter(isHardware, "$this$isHardware");
        return Build.VERSION.SDK_INT >= 26 && isHardware == Bitmap.Config.HARDWARE;
    }

    public static JsonElement l(C7790yH0 c7790yH0) {
        boolean z;
        try {
            try {
                c7790yH0.G();
                z = false;
                try {
                    return (JsonElement) W52.z.a(c7790yH0);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return JsonNull.d;
                    }
                    throw new HH0(e);
                }
            } catch (EOFException e3) {
                e = e3;
                z = true;
            }
        } catch (C3584eW0 e4) {
            throw new HH0(e4);
        } catch (IOException e5) {
            throw new C2911bH0(e5);
        } catch (NumberFormatException e6) {
            throw new HH0(e6);
        }
    }

    @Nullable
    public static final byte[] m(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(text.length());
        int i2 = 0;
        while (i2 < text.length()) {
            if (text.charAt(i2) == '%') {
                if (i2 + 2 <= StringsKt.E(text)) {
                    int i3 = i2 + 1;
                    i2 += 3;
                    String strSubstring = text.substring(i3, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Integer numB0 = StringsKt.b0(16, strSubstring);
                    if (numB0 != null) {
                        byteArrayOutputStream.write(numB0.intValue());
                    }
                }
                return null;
            }
            int iF = StringsKt.F('%', i2, 4, text);
            Integer numValueOf = iF >= 0 ? Integer.valueOf(iF) : null;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : text.length();
            String strSubstring2 = text.substring(i2, iIntValue);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            byte[] bytes = strSubstring2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byteArrayOutputStream.write(bytes);
            i2 = iIntValue;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void n(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                EB1.b(new IllegalStateException(C6419rl.a("More produced than requested: ", j4)));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object o(@NotNull C2250Vp0 c2250Vp0, @NotNull LM lm) throws Throwable {
        CC1 cc1;
        if (lm instanceof CC1) {
            cc1 = (CC1) lm;
            int i2 = cc1.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cc1.g = i2 - Integer.MIN_VALUE;
            } else {
                cc1 = new CC1(lm);
            }
        } else {
            cc1 = new CC1(lm);
        }
        Object objF = cc1.e;
        MN mn = MN.d;
        int i3 = cc1.g;
        if (i3 == 0) {
            C1795Pt1.b(objF);
            InterfaceC0942Ew interfaceC0942EwC = c2250Vp0.d().c();
            cc1.d = c2250Vp0;
            cc1.g = 1;
            objF = interfaceC0942EwC.f(Long.MAX_VALUE, cc1);
            if (objF == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2250Vp0 = cc1.d;
            C1795Pt1.b(objF);
        }
        return new GC1(c2250Vp0.d, c2250Vp0.c(), c2250Vp0.d(), C6621sj.n((C1098Gw) objF));
    }

    @Nullable
    public static final Object r(@NotNull ND1 nd1, ND1 nd2, @NotNull Function2 function2) {
        Object og;
        Object objD0;
        try {
            F62.e(2, function2);
            og = function2.invoke(nd2, nd1);
        } catch (Throwable th) {
            og = new OG(th, false);
        }
        MN mn = MN.d;
        if (og == mn || (objD0 = nd1.d0(og)) == C3787fU.e) {
            return mn;
        }
        if (objD0 instanceof OG) {
            throw ((OG) objD0).a;
        }
        return C3787fU.o(objD0);
    }

    @Override // defpackage.J71
    public Object e() {
        return new ConcurrentHashMap();
    }

    @SuppressLint({"NewApi"})
    public float i(@NonNull View view) {
        if (i) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void p(@NonNull View view, float f) {
        if (i) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        view.setAlpha(f);
    }

    public void q(@NonNull View view, int i2) {
        if (!h) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                g.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // defpackage.InterfaceC4185hM1
    public void lock() {
    }

    @Override // defpackage.InterfaceC4185hM1
    public void unlock() {
    }
}
