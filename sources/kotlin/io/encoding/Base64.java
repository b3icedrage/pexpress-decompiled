package kotlin.io.encoding;

import defpackage.AbstractC5838p0;
import defpackage.C1952Ru;
import defpackage.C6227qq;
import defpackage.EK;
import defpackage.SK;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class Base64 {

    @NotNull
    public static final a d = new a(null);
    public final boolean a;
    public final boolean b;

    @NotNull
    public final PaddingOption c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaddingOption {
        public static final PaddingOption d;
        public static final PaddingOption e;
        public static final PaddingOption g;
        public static final /* synthetic */ PaddingOption[] h;

        static {
            PaddingOption paddingOption = new PaddingOption("PRESENT", 0);
            d = paddingOption;
            PaddingOption paddingOption2 = new PaddingOption("ABSENT", 1);
            e = paddingOption2;
            PaddingOption paddingOption3 = new PaddingOption("PRESENT_OPTIONAL", 2);
            g = paddingOption3;
            PaddingOption[] paddingOptionArr = {paddingOption, paddingOption2, paddingOption3, new PaddingOption("ABSENT_OPTIONAL", 3)};
            h = paddingOptionArr;
            C1952Ru.i(paddingOptionArr);
        }

        public PaddingOption() {
            throw null;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) h.clone();
        }
    }

    public static final class a extends Base64 {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            boolean z = false;
            super(z, z, PaddingOption.d, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.d;
        new Base64(true, false, paddingOption);
        new Base64(false, true, paddingOption);
    }

    public /* synthetic */ Base64(boolean z, boolean z2, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, paddingOption);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0162 A[EDGE_INSN: B:142:0x0162->B:71:0x0162 BREAK  A[LOOP:2: B:66:0x0150->B:70:0x015f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150 A[ADDED_TO_REGION, LOOP:2: B:66:0x0150->B:70:0x015f, LOOP_START, PHI: r15
      0x0150: PHI (r15v12 int) = (r15v9 int), (r15v13 int) binds: [B:64:0x014d, B:70:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f A[LOOP:2: B:66:0x0150->B:70:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01df  */
    public static byte[] a(Base64 base64, String source) {
        byte[] source2;
        int i;
        int i2;
        PaddingOption paddingOption;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        base64 = base64;
        int length = source.length();
        Intrinsics.checkNotNullParameter(source, "source");
        byte b = 255;
        int i9 = 0;
        if (source != null) {
            int length2 = source.length();
            AbstractC5838p0.INSTANCE.getClass();
            AbstractC5838p0.Companion.a(0, length, length2);
            String strSubstring = source.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.c;
            Intrinsics.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
            source2 = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(source2, "getBytes(...)");
        } else {
            Intrinsics.checkNotNullParameter(source, "source");
            int length3 = source.length();
            AbstractC5838p0.INSTANCE.getClass();
            AbstractC5838p0.Companion.a(0, length, length3);
            byte[] bArr = new byte[length];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = source.charAt(i11);
                if (cCharAt <= 255) {
                    bArr[i10] = (byte) cCharAt;
                    i10++;
                } else {
                    bArr[i10] = 63;
                    i10++;
                }
            }
            source2 = bArr;
        }
        int length4 = source2.length;
        Intrinsics.checkNotNullParameter(source2, "source");
        int length5 = source2.length;
        AbstractC5838p0.INSTANCE.getClass();
        AbstractC5838p0.Companion.a(0, length4, length5);
        Intrinsics.checkNotNullParameter(source2, "source");
        int i12 = 1;
        boolean z = base64.b;
        if (length4 == 0) {
            i2 = 0;
        } else {
            if (length4 == 1) {
                throw new IllegalArgumentException(EK.e(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z) {
                i = length4;
                for (int i13 = 0; i13 < length4; i13++) {
                    int i14 = C6227qq.a[source2[i13] & 255];
                    if (i14 < 0) {
                        if (i14 == -2) {
                            i -= length4 - i13;
                            break;
                        }
                        i--;
                    }
                }
            } else if (source2[length4 - 1] == 61) {
                i = length4 - 1;
                if (source2[length4 - 2] == 61) {
                    i = length4 - 2;
                }
            } else {
                i = length4;
            }
            i2 = (int) ((((long) i) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr2 = new byte[i2];
        int[] iArr = base64.a ? C6227qq.b : C6227qq.a;
        int i15 = -8;
        int i16 = 0;
        int i17 = 0;
        int i18 = -8;
        while (true) {
            i12 = i12;
            paddingOption = base64.c;
            if (i16 >= length4) {
                i3 = 0;
                break;
            }
            if (i18 != i15 || (i8 = i16 + 3) >= length4) {
                i4 = source2[i16] & b;
                i5 = iArr[i4];
                if (i5 < 0) {
                    i16++;
                    i17 = (i17 << 6) | i5;
                    i7 = i18 + 6;
                    if (i7 >= 0) {
                        bArr2[i9] = (byte) (i17 >>> i7);
                        i17 &= (i12 << i7) - 1;
                        i18 -= 2;
                        i9++;
                        i12 = i12;
                        b = 255;
                        i15 = -8;
                        base64 = base64;
                    } else {
                        i18 = i7;
                    }
                } else {
                    if (i5 == -2) {
                        if (i18 != -8) {
                            throw new IllegalArgumentException(EK.e(i16, "Redundant pad character at index "));
                        }
                        if (i18 != -6) {
                            if (i18 != -4) {
                                if (paddingOption != PaddingOption.e) {
                                    throw new IllegalArgumentException(EK.e(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                }
                                i6 = i16 + 1;
                                if (z) {
                                    while (i6 < length4) {
                                        if (C6227qq.a[source2[i6] & 255] != -1) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                if (i6 != length4 || source2[i6] != 61) {
                                    throw new IllegalArgumentException(EK.e(i6, "Missing one pad character at index "));
                                }
                                i16 = i6 + 1;
                            } else if (i18 != -2) {
                                throw new IllegalStateException("Unreachable");
                            }
                            i3 = i12;
                            break;
                        }
                        if (paddingOption == PaddingOption.e) {
                            throw new IllegalArgumentException(EK.e(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                        }
                        i16++;
                        i3 = i12;
                        break;
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder("Invalid symbol '");
                        sb.append((char) i4);
                        sb.append("'(");
                        String string = Integer.toString(i4, CharsKt.checkRadix(8));
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        sb.append(string);
                        sb.append(") at index ");
                        sb.append(i16);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i16++;
                }
                b = 255;
                i15 = -8;
            } else {
                int i19 = i16 + 4;
                int i20 = (iArr[source2[i16] & b] << 18) | (iArr[source2[i16 + 1] & b] << 12) | (iArr[source2[i16 + 2] & b] << 6) | iArr[source2[i8] & b];
                if (i20 >= 0) {
                    bArr2[i9] = (byte) (i20 >> 16);
                    int i21 = i9 + 2;
                    bArr2[i9 + 1] = (byte) (i20 >> 8);
                    i9 += 3;
                    bArr2[i21] = (byte) i20;
                    base64 = base64;
                    i16 = i19;
                } else {
                    i4 = source2[i16] & b;
                    i5 = iArr[i4];
                    if (i5 < 0) {
                        i16++;
                        i17 = (i17 << 6) | i5;
                        i7 = i18 + 6;
                        if (i7 >= 0) {
                            bArr2[i9] = (byte) (i17 >>> i7);
                            i17 &= (i12 << i7) - 1;
                            i18 -= 2;
                            i9++;
                            i12 = i12;
                            b = 255;
                            i15 = -8;
                            base64 = base64;
                        } else {
                            i18 = i7;
                        }
                    } else {
                        if (i5 == -2) {
                            if (i18 != -8) {
                                throw new IllegalArgumentException(EK.e(i16, "Redundant pad character at index "));
                            }
                            if (i18 != -6) {
                                if (i18 != -4) {
                                    if (paddingOption != PaddingOption.e) {
                                        throw new IllegalArgumentException(EK.e(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                    }
                                    i6 = i16 + 1;
                                    if (z) {
                                        while (i6 < length4) {
                                            if (C6227qq.a[source2[i6] & 255] != -1) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                    if (i6 != length4) {
                                    }
                                    throw new IllegalArgumentException(EK.e(i6, "Missing one pad character at index "));
                                }
                                if (i18 != -2) {
                                    throw new IllegalStateException("Unreachable");
                                }
                                i3 = i12;
                                break;
                            }
                            if (paddingOption == PaddingOption.e) {
                                throw new IllegalArgumentException(EK.e(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            }
                            i16++;
                            i3 = i12;
                            break;
                        }
                        if (z) {
                            StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                            sb2.append((char) i4);
                            sb2.append("'(");
                            String string2 = Integer.toString(i4, CharsKt.checkRadix(8));
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            sb2.append(string2);
                            sb2.append(") at index ");
                            sb2.append(i16);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i16++;
                    }
                    b = 255;
                }
                i15 = -8;
            }
        }
        if (i18 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i18 != -8 && i3 == 0 && paddingOption == PaddingOption.d) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i17 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z) {
            while (i16 < length4) {
                if (C6227qq.a[source2[i16] & 255] != -1) {
                    break;
                }
                i16++;
            }
        }
        if (i16 >= length4) {
            if (i9 == i2) {
                return bArr2;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i22 = source2[i16] & 255;
        StringBuilder sb3 = new StringBuilder("Symbol '");
        sb3.append((char) i22);
        sb3.append("'(");
        String string3 = Integer.toString(i22, CharsKt.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb3.append(string3);
        sb3.append(") at index ");
        throw new IllegalArgumentException(SK.b(sb3, i16 - 1, " is prohibited after the pad character"));
    }

    public Base64(boolean z, boolean z2, PaddingOption paddingOption) {
        this.a = z;
        this.b = z2;
        this.c = paddingOption;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
