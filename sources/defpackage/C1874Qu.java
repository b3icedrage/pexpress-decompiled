package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import io.jsonwebtoken.JwtParser;
import java.io.EOFException;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1874Qu implements InterfaceC8124zs0 {
    public static final C1874Qu a = new C1874Qu();

    @NotNull
    public static final C1874Qu b = new C1874Qu();

    @NotNull
    public static final IG0 a(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return d(-1, "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) q(-1, output)));
    }

    @NotNull
    public static final XG0 b(@NotNull Number value, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new XG0("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) q(-1, output)));
    }

    @NotNull
    public static final XG0 c(@NotNull MH1 keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new XG0("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    public static final IG0 d(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        return new IG0(message);
    }

    @NotNull
    public static final IG0 e(@NotNull String message, @NotNull CharSequence input, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return d(i, message + "\nJSON input: " + ((Object) q(i, input)));
    }

    public static final void f(ArrayList arrayList, String str, String str2, String str3) {
        if (d.h(str, str3, false)) {
            String strSubstring = str.substring(str2.length(), str.length() - str3.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList.add(StringsKt.d0(strSubstring).toString());
        }
    }

    @NotNull
    public static final ArrayList g(@NotNull List newValueParameterTypes, @NotNull List oldValueParameters, @NotNull InterfaceC2076Tj0 newOwner) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        ArrayList<Pair> arrayListJ0 = CollectionsKt.j0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(XE.m(arrayListJ0, 10));
        for (Pair pair : arrayListJ0) {
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) pair.d;
            Xc2 xc2 = (Xc2) pair.e;
            int iL = xc2.l();
            InterfaceC2396Xc interfaceC2396XcK = xc2.k();
            C5638o21 name = xc2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean zZ0 = xc2.z0();
            boolean zJ0 = xc2.j0();
            boolean zF0 = xc2.f0();
            AbstractC4649jL0 abstractC4649jL0F = xc2.q0() != null ? C4900kZ.j(newOwner).t().f(abstractC4649jL0) : null;
            VN1 vn1I = xc2.i();
            Intrinsics.checkNotNullExpressionValue(vn1I, "getSource(...)");
            arrayList.add(new Yc2(newOwner, null, iL, interfaceC2396XcK, name, abstractC4649jL0, zZ0, zJ0, zF0, abstractC4649jL0F, vn1I));
        }
        return arrayList;
    }

    public static C1625Np h(C8095zj2 c8095zj2) throws IOException {
        long jG = 0;
        String strE = "";
        String strE2 = "";
        while (true) {
            int iF = c8095zj2.f();
            if (iF == 0) {
                return new C1625Np(jG, strE, strE2);
            }
            int i = iF >>> 3;
            int i2 = iF & 7;
            switch (i) {
                case 1:
                    C8095zj2.a(i, 0, i2);
                    c8095zj2.g();
                    break;
                case 2:
                    C8095zj2.a(i, 0, i2);
                    jG = c8095zj2.g();
                    break;
                case 3:
                    C8095zj2.a(i, 0, i2);
                    c8095zj2.g();
                    break;
                case 4:
                    C8095zj2.a(i, 2, i2);
                    strE = c8095zj2.e();
                    break;
                case 5:
                    C8095zj2.a(i, 0, i2);
                    c8095zj2.g();
                    break;
                case 6:
                    C8095zj2.a(i, 2, i2);
                    strE2 = c8095zj2.e();
                    break;
                case 7:
                    C8095zj2.a(i, 0, i2);
                    c8095zj2.g();
                    break;
                case 8:
                    C8095zj2.a(i, 2, i2);
                    c8095zj2.e();
                    break;
                default:
                    c8095zj2.h(i2);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress i(int i, int i2, String str) {
        int i3;
        int i4;
        int iS;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i5 < i2) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && d.n(str, i5, "::", false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i2) {
                    break;
                }
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iS = C6806tc2.s(str.charAt(i5));
                    if (iS != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iS;
                    i5++;
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (!d.n(str, i5, ":", false)) {
                    if (!d.n(str, i5, ".", false)) {
                        return null;
                    }
                    int i10 = i6 - 2;
                    int i11 = i10;
                    while (i8 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i12 = 0;
                        int i13 = i8;
                        while (i13 < i2) {
                            char cCharAt = str.charAt(i13);
                            if (Intrinsics.e(cCharAt, 48) < 0 || Intrinsics.e(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i8 != i13) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i8 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i8 = i13;
                    }
                    if (i11 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i5++;
            }
            i8 = i5;
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iS = C6806tc2.s(str.charAt(i5));
                if (iS != -1) {
                    break;
                }
                i3 = (i3 << 4) + iS;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i14 = i6 + 1;
                bArr[i6] = (byte) (255 & (i3 >>> 8));
                i6 += 2;
                bArr[i14] = (byte) (i3 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i15 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static C6561sS j(C8095zj2 c8095zj2) throws IOException {
        while (true) {
            int iF = c8095zj2.f();
            if (iF == 0) {
                return new C6561sS();
            }
            int i = iF >>> 3;
            int i2 = iF & 7;
            if (i == 1) {
                C8095zj2.a(i, 2, i2);
                c8095zj2.e();
            } else if (i == 2) {
                C8095zj2.a(i, 2, i2);
                c8095zj2.e();
            } else if (i == 3) {
                C8095zj2.a(i, 0, i2);
                c8095zj2.g();
            } else if (i == 4) {
                C8095zj2.a(i, 2, i2);
                c8095zj2.c();
            } else if (i != 6) {
                c8095zj2.h(i2);
            } else {
                C8095zj2.a(i, 2, i2);
                C8095zj2 c8095zj2D = c8095zj2.d();
                while (true) {
                    int iF2 = c8095zj2D.f();
                    if (iF2 != 0) {
                        int i3 = iF2 >>> 3;
                        int i4 = iF2 & 7;
                        if (i3 != 1) {
                            c8095zj2D.h(i4);
                        } else {
                            C8095zj2.a(i3, 2, i4);
                            c8095zj2D.c();
                        }
                    }
                }
            }
        }
    }

    public static void k(C8095zj2 c8095zj2, HashMap map) throws IOException {
        int i;
        int i2;
        int i3 = 0;
        C4578j02 c4578j02 = null;
        int iG = 0;
        while (true) {
            int iF = c8095zj2.f();
            if (iF == 0) {
                if (c4578j02 != null) {
                    map.put(Integer.valueOf(iG), c4578j02);
                    return;
                }
                return;
            }
            int i4 = iF >>> 3;
            int i5 = iF & 7;
            int i6 = 1;
            if (i4 != 1) {
                int i7 = 2;
                if (i4 != 2) {
                    c8095zj2.h(i5);
                } else {
                    C8095zj2.a(i4, 2, i5);
                    C8095zj2 c8095zj2D = c8095zj2.d();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int iG2 = i3;
                    String strE = "";
                    while (true) {
                        int iF2 = c8095zj2D.f();
                        if (iF2 != 0) {
                            int i8 = iF2 >>> 3;
                            int i9 = iF2 & 7;
                            switch (i8) {
                                case 1:
                                    i = i7;
                                    C8095zj2.a(i8, i3, i9);
                                    iG2 = (int) c8095zj2D.g();
                                    break;
                                case 2:
                                    i = i7;
                                    C8095zj2.a(i8, i, i9);
                                    strE = c8095zj2D.e();
                                    i3 = 0;
                                    break;
                                case 3:
                                    C8095zj2.a(i8, i7, i9);
                                    C8095zj2 c8095zj2D2 = c8095zj2D.d();
                                    String strE2 = "";
                                    long jG = 0;
                                    while (true) {
                                        int iF3 = c8095zj2D2.f();
                                        if (iF3 == 0) {
                                            arrayList.add(new C4756jq1(strE2, jG));
                                            i3 = 0;
                                            i = 2;
                                        } else {
                                            int i10 = iF3 >>> 3;
                                            int i11 = iF3 & 7;
                                            if (i10 != i6) {
                                                i2 = 2;
                                                if (i10 != 2) {
                                                    c8095zj2D2.h(i11);
                                                } else {
                                                    C8095zj2.a(i10, 0, i11);
                                                    jG = c8095zj2D2.g();
                                                    i2 = 2;
                                                }
                                            } else {
                                                i2 = 2;
                                                C8095zj2.a(i10, 2, i11);
                                                strE2 = c8095zj2D2.e();
                                            }
                                            i7 = i2;
                                            i6 = 1;
                                        }
                                        break;
                                    }
                                    break;
                                case 4:
                                    C8095zj2.a(i8, i7, i9);
                                    arrayList4.add(h(c8095zj2D.d()));
                                    i3 = 0;
                                    i = 2;
                                    break;
                                case 5:
                                    C8095zj2.a(i8, i7, i9);
                                    arrayList5.add(j(c8095zj2D.d()));
                                    i3 = 0;
                                    i = 2;
                                    break;
                                case 6:
                                    C8095zj2.a(i8, i3, i9);
                                    c8095zj2D.g();
                                    i = i7;
                                    break;
                                case 7:
                                    C8095zj2.a(i8, i7, i9);
                                    arrayList2.add(c8095zj2D.e());
                                    i3 = 0;
                                    i = 2;
                                    break;
                                case 8:
                                    C8095zj2.a(i8, i3, i9);
                                    c8095zj2D.g();
                                    i = i7;
                                    break;
                                case 9:
                                    C8095zj2.a(i8, i7, i9);
                                    arrayList3.add(c8095zj2D.e());
                                    i3 = 0;
                                    i = 2;
                                    break;
                                default:
                                    c8095zj2D.h(i9);
                                    i3 = 0;
                                    i = 2;
                                    break;
                            }
                            i7 = i;
                            i6 = 1;
                        } else {
                            c4578j02 = new C4578j02(iG2, strE, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                        }
                    }
                }
            } else {
                C8095zj2.a(i4, i3, i5);
                iG = (int) c8095zj2.g();
            }
        }
    }

    public static float l(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    @NotNull
    public static final RI0 m(@NotNull InterfaceC4853kJ0 interfaceC4853kJ0) {
        Object obj;
        Intrinsics.checkNotNullParameter(interfaceC4853kJ0, "<this>");
        if (interfaceC4853kJ0 instanceof RI0) {
            return (RI0) interfaceC4853kJ0;
        }
        if (!(interfaceC4853kJ0 instanceof XJ0)) {
            throw new C3761fL0("Cannot calculate JVM erasure for type: " + interfaceC4853kJ0);
        }
        List<SJ0> upperBounds = ((XJ0) interfaceC4853kJ0).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SJ0 sj0 = (SJ0) next;
            Intrinsics.c(sj0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC5044lD interfaceC5044lDC = ((WJ0) sj0).a.V0().c();
            FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
            if (fc != null && fc.h() != SC.e && fc.h() != SC.i) {
                obj = next;
                break;
            }
        }
        SJ0 sj1 = (SJ0) obj;
        if (sj1 == null) {
            sj1 = (SJ0) CollectionsKt.firstOrNull(upperBounds);
        }
        return sj1 != null ? n(sj1) : C2017Sp1.a.b(Object.class);
    }

    @NotNull
    public static final RI0 n(@NotNull SJ0 sj0) {
        Intrinsics.checkNotNullParameter(sj0, "<this>");
        InterfaceC4853kJ0 interfaceC4853kJ0G = sj0.g();
        if (interfaceC4853kJ0G != null) {
            return m(interfaceC4853kJ0G);
        }
        throw new C3761fL0("Cannot calculate JVM erasure for type: " + sj0);
    }

    @Nullable
    public static final TO0 o(@NotNull FC fc) {
        FC fc2;
        Intrinsics.checkNotNullParameter(fc, "<this>");
        int i = C4900kZ.a;
        Intrinsics.checkNotNullParameter(fc, "<this>");
        Iterator<AbstractC4649jL0> it = fc.y().V0().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                fc2 = null;
                break;
            }
            AbstractC4649jL0 next = it.next();
            if (!RK0.x(next)) {
                InterfaceC5044lD interfaceC5044lDC = next.V0().c();
                int i2 = C4432iZ.a;
                if (C4432iZ.n(interfaceC5044lDC, SC.d) || C4432iZ.n(interfaceC5044lDC, SC.g)) {
                    Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    fc2 = (FC) interfaceC5044lDC;
                    break;
                }
            }
        }
        if (fc2 == null) {
            return null;
        }
        QY0 qy0Y = fc2.Y();
        TO0 to0 = qy0Y instanceof TO0 ? (TO0) qy0Y : null;
        return to0 == null ? o(fc2) : to0;
    }

    @NotNull
    public static final void p(@NotNull AbstractC4995l0 abstractC4995l0, @NotNull String entity) {
        Intrinsics.checkNotNullParameter(abstractC4995l0, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        abstractC4995l0.q(abstractC4995l0.a - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    @NotNull
    public static final CharSequence q(int i, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbF = C1039Gc0.f(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbF.append(charSequence.subSequence(i2, i3).toString());
                sbF.append(str2);
                return sbF.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void r(@NotNull C2895bC c2895bC, @NotNull byte[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int i3 = c2895bC.b;
        if (c2895bC.c - i3 < i2) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i2 + JwtParser.SEPARATOR_CHAR);
        }
        ByteBuffer copyTo = c2895bC.a;
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(destination, i, i2);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i3, destination, i, i2);
        }
        Unit unit = Unit.a;
        c2895bC.c(i2);
    }

    public static final void s(@NotNull TextView textView, @NotNull String newText) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(newText, "newText");
        if (Intrinsics.a(textView.getText().toString(), newText)) {
            return;
        }
        textView.setText(newText);
        EditText editText = textView instanceof EditText ? (EditText) textView : null;
        if (editText != null) {
            editText.setSelection(editText.getText().length());
        }
    }

    public static final void t(@NotNull EditText editText, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        editText.setClickable(false);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        if (editText.requestFocus()) {
            Object systemService = C6333rM.getSystemService(context, InputMethodManager.class);
            if (systemService == null) {
                throw new IllegalStateException("The class is not a supported system service.");
            }
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }

    @NotNull
    public static final void u(@NotNull AbstractC4995l0 abstractC4995l0, @NotNull Number result) {
        Intrinsics.checkNotNullParameter(abstractC4995l0, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC4995l0.r(abstractC4995l0, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    @Nullable
    public static final String v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!StringsKt.C(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (Intrinsics.e(cCharAt, 31) <= 0 || Intrinsics.e(cCharAt, 127) >= 0 || StringsKt.F(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressI = (d.o(str, "[", false) && d.h(str, "]", false)) ? i(1, str.length() - 1, str) : i(0, str.length(), str);
        if (inetAddressI == null) {
            return null;
        }
        byte[] address = inetAddressI.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressI.getHostAddress();
            }
            throw new AssertionError(C1742Pc.d('\'', "Invalid IPv6 address: '", str));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        C1481Lu c1481Lu = new C1481Lu();
        while (i < address.length) {
            if (i == i2) {
                c1481Lu.j1(58);
                i += i5;
                if (i == 16) {
                    c1481Lu.j1(58);
                }
            } else {
                if (i > 0) {
                    c1481Lu.j1(58);
                }
                byte b2 = address[i];
                byte[] bArr = C6806tc2.a;
                c1481Lu.s1(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c1481Lu.Q0();
    }

    public static final void w(@NotNull C2895bC c2895bC, @NotNull byte[] source, int i, int i2) throws C7351wB0 {
        Intrinsics.checkNotNullParameter(c2895bC, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = c2895bC.c;
        int i4 = c2895bC.e - i3;
        if (i4 < i2) {
            throw new C7351wB0("byte array", i2, i4);
        }
        ByteBuffer buffer = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(buffer, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        ByteBuffer byteBuffer = WY0.a;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        WY0.a(buffer, c2895bC.a, 0, i2, i3);
        c2895bC.a(i2);
    }
}
