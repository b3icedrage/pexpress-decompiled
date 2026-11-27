package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.Api;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7279vr implements UR1 {

    @Nullable
    public static C3362dS d;

    @NotNull
    public static final String b(@NotNull CharsetDecoder charsetDecoder, @NotNull AbstractC7769yA0 input) throws Throwable {
        CoderResult cr;
        C2895bC c2895bCM;
        boolean z = true;
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        long j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Intrinsics.checkNotNullParameter(input, "<this>");
        StringBuilder dst = new StringBuilder((int) Math.min(j, input instanceof C1098Gw ? input.u() : Math.max(input.u(), 16L)));
        CharBuffer charBuffer = C6927uA.a;
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        C2895bC c2895bCL = C5189lv.l(input, 1);
        int iRemaining = 0;
        if (c2895bCL != null) {
            int i = 1;
            int i2 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int i3 = c2895bCL.c;
                    int i4 = c2895bCL.b;
                    int i5 = i3 - i4;
                    if (i5 >= i) {
                        int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER - iRemaining2;
                        if (i6 != 0) {
                            try {
                                ByteBuffer byteBuffer = c2895bCL.a;
                                ByteBuffer byteBuffer2 = WY0.a;
                                ByteBuffer buffer = C6621sj.p(byteBuffer, i4, i5);
                                Intrinsics.checkNotNullParameter(buffer, "buffer");
                                charBufferAllocate.clear();
                                if (i6 < 8192) {
                                    charBufferAllocate.limit(i6);
                                }
                                CoderResult rc = charsetDecoder.decode(buffer, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append((CharSequence) charBufferAllocate);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                    C6927uA.e(rc);
                                }
                                i2 = (rc.isUnderflow() && buffer.hasRemaining()) ? i2 + 1 : 1;
                                if (buffer.limit() != i5) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                c2895bCL.c(buffer.position());
                                i = i2;
                            } catch (Throwable th) {
                                throw th;
                            }
                            th = th;
                            if (z) {
                                C5189lv.f(input, c2895bCL);
                            }
                            throw th;
                        }
                        i = 0;
                        i5 = c2895bCL.c - c2895bCL.b;
                    }
                    if (i5 == 0) {
                        try {
                            c2895bCM = C5189lv.m(input, c2895bCL);
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                        }
                    } else if (i5 < i || c2895bCL.f - c2895bCL.e < 8) {
                        C5189lv.f(input, c2895bCL);
                        c2895bCM = C5189lv.l(input, i);
                    } else {
                        c2895bCM = c2895bCL;
                    }
                    if (c2895bCM == null) {
                        break;
                    }
                    if (i <= 0) {
                        iRemaining = 1;
                        c2895bCL = c2895bCM;
                        break;
                    }
                    c2895bCL = c2895bCM;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (iRemaining != 0) {
                C5189lv.f(input, c2895bCL);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER - iRemaining;
            if (i7 == 0) {
                break;
            }
            if (i7 < 8192) {
                charBufferAllocate.limit(i7);
            }
            cr = charsetDecoder.decode(C6927uA.b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append((CharSequence) charBufferAllocate);
            if (cr.isUnmappable() || cr.isMalformed()) {
                Intrinsics.checkNotNullExpressionValue(cr, "cr");
                C6927uA.e(cr);
            }
        } while (cr.isOverflow());
        String string = dst.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @NotNull
    public static final C1098Gw c(@NotNull CharsetEncoder charsetEncoder, @NotNull String input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        C0864Dw c0864Dw = new C0864Dw(null);
        try {
            d(charsetEncoder, c0864Dw, input, i, i2);
            return c0864Dw.t();
        } catch (Throwable th) {
            c0864Dw.close();
            throw th;
        }
    }

    public static final void d(@NotNull CharsetEncoder charsetEncoder, @NotNull C0864Dw destination, @NotNull CharSequence input, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i >= i2) {
            return;
        }
        C2895bC c2895bCN = C5189lv.n(destination, 1, null);
        while (true) {
            try {
                int iB = C6927uA.b(charsetEncoder, input, i, i2, c2895bCN);
                if (iB < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i += iB;
                if (i >= i2) {
                    i3 = 0;
                } else {
                    i3 = iB == 0 ? 8 : 1;
                }
                if (i3 > 0) {
                    c2895bCN = C5189lv.n(destination, i3, c2895bCN);
                } else {
                    destination.c();
                    C2895bC c2895bCN2 = C5189lv.n(destination, 1, null);
                    int i4 = 1;
                    while (true) {
                        try {
                            i4 = C6927uA.a(charsetEncoder, c2895bCN2) ? 0 : i4 + 1;
                            if (i4 <= 0) {
                                destination.c();
                                return;
                            }
                            c2895bCN2 = C5189lv.n(destination, 1, c2895bCN2);
                        } catch (Throwable th) {
                            destination.c();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                destination.c();
                throw th2;
            }
        }
    }

    @NotNull
    public static final RI0 e(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        return j(clsAnnotationType);
    }

    public static final int f(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final Class g(@NotNull RI0 ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Class<?> clsH = ((InterfaceC7774yC) ri0).h();
        Intrinsics.c(clsH, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsH;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final Class h(@NotNull RI0 ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Class<?> clsH = ((InterfaceC7774yC) ri0).h();
        if (clsH.isPrimitive()) {
            String name = clsH.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsH;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final Class i(@NotNull RI0 ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Class<?> clsH = ((InterfaceC7774yC) ri0).h();
        if (clsH.isPrimitive()) {
            return clsH;
        }
        String name = clsH.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final RI0 j(@NotNull Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return C2017Sp1.a.b(cls);
    }

    public static final boolean k(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!Intrinsics.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.UR1
    public Object a(C1441Lg0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        InterfaceC7384wM[] interfaceC7384wMArr = C7690xn1.a;
        return new C2422Xk1(stream, e.d, -2, EnumC1796Pu.d);
    }
}
