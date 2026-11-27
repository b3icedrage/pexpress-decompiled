package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6621sj implements WN {

    @NotNull
    public static final GW1 a = new GW1("NO_DECISION");

    @NotNull
    public static final int[] b = {1, 10, 100, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final void b(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                J90.a(th, th2);
            }
        }
    }

    public static final void c(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i);
            byteBufferDuplicate.position(i);
            destination.put(byteBufferDuplicate);
        }
    }

    @Nullable
    public static final RI0 d(@NotNull MH1 mh1) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        if (mh1 instanceof C6543sM) {
            return ((C6543sM) mh1).b;
        }
        if (mh1 instanceof NH1) {
            return d(((NH1) mh1).a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final AbstractC4649jL0 e(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        if (abstractC4649jL0 instanceof InterfaceC3928g72) {
            return ((InterfaceC3928g72) abstractC4649jL0).N();
        }
        return null;
    }

    @NotNull
    public static final AbstractC7992zE1 f(Object obj) {
        if (obj != C4994l.b) {
            return (AbstractC7992zE1) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    @Nullable
    public static final void g(@NotNull InterfaceC6856tq interfaceC6856tq, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(interfaceC6856tq, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        interfaceC6856tq.V(layoutInflaterFrom, parent);
    }

    @NotNull
    public static final P92 h(@NotNull P92 p92, @NotNull AbstractC4649jL0 origin) {
        Intrinsics.checkNotNullParameter(p92, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return r(p92, e(origin));
    }

    public static final boolean i(Object obj) {
        return obj == C4994l.b;
    }

    public static final boolean j(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        return abstractC4649jL0.Y0() instanceof AbstractC2299We0;
    }

    public static boolean k(IO1... io1Arr) {
        for (IO1 io1 : io1Arr) {
            if (io1.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final C6411rj l(@NotNull Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new C6411rj(array);
    }

    @NotNull
    public static final AbstractC5706oM1 m(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            return ((AbstractC2299We0) p92Y0).e;
        }
        if (p92Y0 instanceof AbstractC5706oM1) {
            return (AbstractC5706oM1) p92Y0;
        }
        throw new C6489s51();
    }

    public static byte[] n(C1098Gw c1098Gw) throws Throwable {
        long jU = c1098Gw.u();
        if (jU > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i = (int) jU;
        Intrinsics.checkNotNullParameter(c1098Gw, "<this>");
        if (i == 0) {
            return C5189lv.a;
        }
        byte[] dst = new byte[i];
        Intrinsics.checkNotNullParameter(c1098Gw, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        C2895bC c2895bCL = C5189lv.l(c1098Gw, 1);
        if (c2895bCL != null) {
            int i2 = 0;
            do {
                try {
                    int iMin = Math.min(i, c2895bCL.c - c2895bCL.b);
                    C1874Qu.r(c2895bCL, dst, i2, iMin);
                    i -= iMin;
                    i2 += iMin;
                    if (i <= 0) {
                        C5189lv.f(c1098Gw, c2895bCL);
                        break;
                    }
                    try {
                        c2895bCL = C5189lv.m(c1098Gw, c2895bCL);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            C5189lv.f(c1098Gw, c2895bCL);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (c2895bCL != null);
        }
        if (i <= 0) {
            return dst;
        }
        throw new EOFException(C1332Jw.a(i, "Premature end of stream: expected ", " bytes"));
    }

    public static String o(AbstractC7769yA0 abstractC7769yA0, Charset charset) {
        Intrinsics.checkNotNullParameter(abstractC7769yA0, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return C7279vr.b(charsetDecoderNewDecoder, abstractC7769yA0);
    }

    @NotNull
    public static final ByteBuffer p(@NotNull ByteBuffer byteBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        Intrinsics.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i);
        myDuplicate$lambda$1.limit(i + i2);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        Intrinsics.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    @NotNull
    public static final AbstractC5706oM1 q(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            return ((AbstractC2299We0) p92Y0).g;
        }
        if (p92Y0 instanceof AbstractC5706oM1) {
            return (AbstractC5706oM1) p92Y0;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final P92 r(@NotNull P92 p92, @Nullable AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(p92, "<this>");
        if (p92 instanceof InterfaceC3928g72) {
            return r(((InterfaceC3928g72) p92).N0(), abstractC4649jL0);
        }
        if (abstractC4649jL0 == null || abstractC4649jL0.equals(p92)) {
            return p92;
        }
        if (p92 instanceof AbstractC5706oM1) {
            return new C6545sM1((AbstractC5706oM1) p92, abstractC4649jL0);
        }
        if (p92 instanceof AbstractC2299We0) {
            return new C2764af0((AbstractC2299We0) p92, abstractC4649jL0);
        }
        throw new C6489s51();
    }

    public static final void s(@NotNull C2895bC c2895bC, @NotNull ByteBuffer copyTo) throws C7351wB0 {
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        Intrinsics.checkNotNullParameter(copyTo, "source");
        int iRemaining = copyTo.remaining();
        ByteBuffer destination = c2895bC.a;
        int i = c2895bC.c;
        int i2 = c2895bC.e - i;
        if (i2 < iRemaining) {
            throw new C7351wB0("buffer content", iRemaining, i2);
        }
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            p(destination, i, copyTo.remaining()).put(copyTo);
        } else {
            byte[] bArrArray = copyTo.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array()");
            int iPosition = copyTo.position() + copyTo.arrayOffset();
            int iRemaining2 = copyTo.remaining();
            ByteBuffer buffer = ByteBuffer.wrap(bArrArray, iPosition, iRemaining2).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(buffer, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            ByteBuffer byteBuffer = WY0.a;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            WY0.a(buffer, destination, 0, iRemaining2, i);
            copyTo.position(copyTo.limit());
        }
        c2895bC.a(iRemaining);
    }

    public static final void t(@NotNull C0864Dw c0864Dw, @NotNull CharSequence text, int i, int i2, @NotNull Charset charset) {
        int i3;
        Intrinsics.checkNotNullParameter(c0864Dw, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset != Charsets.UTF_8) {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            C7279vr.d(charsetEncoderNewEncoder, c0864Dw, text, i, i2);
            return;
        }
        C2895bC c2895bCN = C5189lv.n(c0864Dw, 1, null);
        int i4 = i;
        while (true) {
            try {
                CharSequence charSequence = text;
                int i5 = i2;
                int iG = ED.g(c2895bCN.a, charSequence, i4, i5, c2895bCN.c, c2895bCN.e);
                C4352i82.a aVar = C4352i82.e;
                int i6 = ((short) (iG >>> 16)) & 65535;
                i4 += i6;
                c2895bCN.a(((short) (iG & 65535)) & 65535);
                if (i6 != 0 || i4 >= i5) {
                    i3 = i4 < i5 ? 1 : 0;
                } else {
                    i3 = 8;
                }
                if (i3 <= 0) {
                    c0864Dw.c();
                    return;
                } else {
                    c2895bCN = C5189lv.n(c0864Dw, i3, c2895bCN);
                    text = charSequence;
                    i2 = i5;
                }
            } catch (Throwable th) {
                c0864Dw.c();
                throw th;
            }
        }
    }

    @Override // defpackage.WN
    @Nullable
    public Object a(@NotNull VN vn) throws VN {
        throw vn;
    }
}
