package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class PZ0<T> implements InterfaceC7779yD1<T> {
    public static final int[] n = new int[0];
    public static final Unsafe o = C4356i92.j();
    public final int[] a;
    public final Object[] b;
    public final GZ0 c;
    public final boolean d;
    public final boolean e;
    public final int[] f;
    public final int g;
    public final int h;
    public final InterfaceC5646o41 i;
    public final EQ0 j;
    public final M82<?, ?> k;
    public final AbstractC1659Oa0<?> l;
    public final InterfaceC7625xW0 m;

    public PZ0(int[] iArr, Object[] objArr, int i, int i2, GZ0 gz0, boolean z, int[] iArr2, int i3, int i4, InterfaceC5646o41 interfaceC5646o41, EQ0 eq0, M82 m82, AbstractC1659Oa0 abstractC1659Oa0, InterfaceC7625xW0 interfaceC7625xW0) {
        this.a = iArr;
        this.b = objArr;
        boolean z2 = gz0 instanceof AbstractC0595Ak0;
        this.e = z;
        this.d = abstractC1659Oa0 != null && abstractC1659Oa0.d(gz0);
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = interfaceC5646o41;
        this.j = eq0;
        this.k = m82;
        this.l = abstractC1659Oa0;
        this.c = gz0;
        this.m = interfaceC7625xW0;
    }

    public static void C(int i, Object obj, InterfaceC5160ll2 interfaceC5160ll2) {
        if (obj instanceof String) {
            ((JE) interfaceC5160ll2).a.V(i, (String) obj);
        } else {
            ((JE) interfaceC5160ll2).a(i, (AbstractC1646Nw) obj);
        }
    }

    public static List o(G0 g0, long j) {
        return (List) C4356i92.c.i(j, g0);
    }

    public static PZ0 r(AZ0 az0, InterfaceC5646o41 interfaceC5646o41, EQ0 eq0, M82 m82, AbstractC1659Oa0 abstractC1659Oa0, InterfaceC7625xW0 interfaceC7625xW0) {
        if (az0 instanceof C1930Rm1) {
            return s((C1930Rm1) az0, interfaceC5646o41, eq0, m82, abstractC1659Oa0, interfaceC7625xW0);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:0x027a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x0295  */
    /* JADX WARN: Code duplicated, block: B:178:0x037f  */
    public static <T> PZ0<T> s(C1930Rm1 c1930Rm1, InterfaceC5646o41 interfaceC5646o41, EQ0 eq0, M82<?, ?> m82, AbstractC1659Oa0<?> abstractC1659Oa0, InterfaceC7625xW0 interfaceC7625xW0) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int iObjectFieldOffset3;
        int i17;
        int i18;
        Field fieldV;
        char cCharAt9;
        int i19;
        int i20;
        int i21;
        Object obj;
        Field fieldV2;
        int i22;
        Object obj2;
        Field fieldV3;
        int i23;
        char cCharAt10;
        int i24;
        int i25;
        char cCharAt11;
        int i26;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        int i29 = 0;
        boolean z = c1930Rm1.c() == EnumC7468wk1.e;
        String str = c1930Rm1.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i32 = iCharAt5 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                cCharAt13 = str.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            iCharAt5 = i32 | (cCharAt13 << i33);
            i31 = i28;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
            iArr = n;
            i3 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt6 = str.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i11 = i34 + 1;
                    cCharAt8 = str.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i11;
                }
                iCharAt6 = i35 | (cCharAt8 << i36);
                i34 = i11;
            }
            int i37 = i34 + 1;
            int iCharAt7 = str.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i10 = i37 + 1;
                    cCharAt7 = str.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i10;
                }
                iCharAt7 = i38 | (cCharAt7 << i39);
                i37 = i10;
            }
            int i40 = i37 + 1;
            iCharAt = str.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i9 = i40 + 1;
                    cCharAt6 = str.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i9;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i9;
            }
            int i43 = i40 + 1;
            iCharAt2 = str.charAt(i40);
            if (iCharAt2 >= 55296) {
                int i44 = iCharAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i8 = i43 + 1;
                    cCharAt5 = str.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i8;
                }
                iCharAt2 = i44 | (cCharAt5 << i45);
                i43 = i8;
            }
            int i46 = i43 + 1;
            int iCharAt8 = str.charAt(i43);
            if (iCharAt8 >= 55296) {
                int i47 = iCharAt8 & 8191;
                int i48 = 13;
                while (true) {
                    i7 = i46 + 1;
                    cCharAt4 = str.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i7;
                }
                iCharAt8 = i47 | (cCharAt4 << i48);
                i46 = i7;
            }
            int i49 = i46 + 1;
            iCharAt3 = str.charAt(i46);
            if (iCharAt3 >= 55296) {
                int i50 = iCharAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i6 = i49 + 1;
                    cCharAt3 = str.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i6;
                }
                iCharAt3 = i50 | (cCharAt3 << i51);
                i49 = i6;
            }
            int i52 = i49 + 1;
            int iCharAt9 = str.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i5 = i52 + 1;
                    cCharAt2 = str.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i5;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i5;
            }
            int i55 = i52 + 1;
            iCharAt4 = str.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i4 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i57 = i4;
                }
                iCharAt4 = i56 | (cCharAt << i58);
                i55 = i4;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt3 + iCharAt9];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i29 = iCharAt6;
            i31 = i55;
        }
        Unsafe unsafe = o;
        Class<?> cls = c1930Rm1.a.getClass();
        int[] iArr3 = new int[i3 * 3];
        Object[] objArr2 = new Object[i3 * 2];
        int i59 = iCharAt3 + iCharAt4;
        int i60 = i59;
        int i61 = iCharAt4;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = str.charAt(i31);
            int i65 = length;
            if (iCharAt10 >= 55296) {
                int i66 = iCharAt10 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    cCharAt12 = str.charAt(i67);
                    i12 = i29;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    i29 = i12;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i13 = i27;
            } else {
                i12 = i29;
                i13 = i64;
            }
            int i69 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i25 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i26 = i70;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 = i26 | ((cCharAt11 & 8191) << i72);
                    i72 += 13;
                    i71 = i25;
                }
                iCharAt11 = i26 | (cCharAt11 << i72);
                i14 = i25;
            } else {
                i14 = i69;
            }
            int i73 = iCharAt10;
            int i74 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            Object[] objArr3 = c1930Rm1.c;
            if (i74 >= 51) {
                int i75 = i14 + 1;
                int iCharAt12 = str.charAt(i14);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i23 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        i24 = i76;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 = i24 | ((cCharAt10 & 8191) << i78);
                        i78 += 13;
                        i77 = i23;
                    }
                    iCharAt12 = i24 | (cCharAt10 << i78);
                    i19 = i23;
                } else {
                    i19 = i75;
                }
                int i79 = iCharAt12;
                int i80 = i74 - 51;
                int i81 = i19;
                if (i80 == 9 || i80 == 17) {
                    i20 = i2 + 1;
                    objArr2[((i63 / 3) * 2) + 1] = objArr3[i2];
                } else {
                    if (i80 == 12 && !z) {
                        i20 = i2 + 1;
                        objArr2[((i63 / 3) * 2) + 1] = objArr3[i2];
                    }
                    i21 = i79 * 2;
                    obj = objArr3[i21];
                    if (obj instanceof Field) {
                        fieldV2 = (Field) obj;
                    } else {
                        fieldV2 = v(cls, (String) obj);
                        objArr3[i21] = fieldV2;
                    }
                    objArr = objArr2;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldV2);
                    i22 = i21 + 1;
                    obj2 = objArr3[i22];
                    if (obj2 instanceof Field) {
                        fieldV3 = (Field) obj2;
                    } else {
                        fieldV3 = v(cls, (String) obj2);
                        objArr3[i22] = fieldV3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV3);
                    i18 = iObjectFieldOffset4;
                    i15 = i81;
                    i17 = 0;
                }
                i2 = i20;
                i21 = i79 * 2;
                obj = objArr3[i21];
                if (obj instanceof Field) {
                    fieldV2 = (Field) obj;
                } else {
                    fieldV2 = v(cls, (String) obj);
                    objArr3[i21] = fieldV2;
                }
                objArr = objArr2;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldV2);
                i22 = i21 + 1;
                obj2 = objArr3[i22];
                if (obj2 instanceof Field) {
                    fieldV3 = (Field) obj2;
                } else {
                    fieldV3 = v(cls, (String) obj2);
                    objArr3[i22] = fieldV3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV3);
                i18 = iObjectFieldOffset5;
                i15 = i81;
                i17 = 0;
            } else {
                objArr = objArr2;
                int i82 = i2 + 1;
                Field fieldV4 = v(cls, (String) objArr3[i2]);
                if (i74 == 9 || i74 == 17) {
                    objArr[((i63 / 3) * 2) + 1] = fieldV4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i2 += 2;
                        objArr[((i63 / 3) * 2) + 1] = objArr3[i82];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (!z) {
                            i2 += 2;
                            objArr[((i63 / 3) * 2) + 1] = objArr3[i82];
                        }
                    } else if (i74 == 50) {
                        int i83 = i61 + 1;
                        iArr[i61] = i63;
                        int i84 = (i63 / 3) * 2;
                        int i85 = i2 + 2;
                        objArr[i84] = objArr3[i82];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i84 + 1] = objArr3[i85];
                            i2 += 3;
                        } else {
                            i2 = i85;
                        }
                        i61 = i83;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                    if ((iCharAt11 & 4096) == 4096 || i74 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i14;
                        i16 = 0;
                    } else {
                        int i86 = i14 + 1;
                        int iCharAt13 = str.charAt(i14);
                        if (iCharAt13 >= 55296) {
                            int i87 = iCharAt13 & 8191;
                            int i88 = 13;
                            while (true) {
                                i15 = i86 + 1;
                                cCharAt9 = str.charAt(i86);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i87 |= (cCharAt9 & 8191) << i88;
                                i88 += 13;
                                i86 = i15;
                            }
                            iCharAt13 = i87 | (cCharAt9 << i88);
                        } else {
                            i15 = i86;
                        }
                        int i89 = (iCharAt13 / 32) + (i12 * 2);
                        Object obj3 = objArr3[i89];
                        if (obj3 instanceof Field) {
                            fieldV = (Field) obj3;
                        } else {
                            fieldV = v(cls, (String) obj3);
                            objArr3[i89] = fieldV;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                        i16 = iCharAt13 % 32;
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i17 = i16;
                    i18 = iObjectFieldOffset;
                }
                i2 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i14;
                    i16 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i14;
                    i16 = 0;
                }
                if (i74 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset2;
                i17 = i16;
                i18 = iObjectFieldOffset;
            }
            int i90 = i63 + 1;
            iArr4[i63] = i73;
            int i91 = i63 + 2;
            String str2 = str;
            iArr4[i90] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i74 << 20) | i18;
            i63 += 3;
            iArr4[i91] = (i17 << 20) | iObjectFieldOffset3;
            length = i65;
            iArr3 = iArr4;
            i29 = i12;
            str = str2;
            i31 = i15;
            objArr2 = objArr;
        }
        return new PZ0<>(iArr3, objArr2, iCharAt, iCharAt2, c1930Rm1.a, z, iArr, iCharAt4, i59, interfaceC5646o41, eq0, m82, abstractC1659Oa0, interfaceC7625xW0);
    }

    public static int t(long j, Object obj) {
        return ((Integer) C4356i92.c.i(j, obj)).intValue();
    }

    public static long u(long j, Object obj) {
        return ((Long) C4356i92.c.i(j, obj)).longValue();
    }

    public static Field v(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbB = C6495s7.b("Field ", str, " for ");
            sbB.append(cls.getName());
            sbB.append(" not found. Known fields are ");
            sbB.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbB.toString());
        }
    }

    public static int y(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(T t, InterfaceC5160ll2 interfaceC5160ll2) {
        Map.Entry entry;
        char c;
        int i;
        boolean z;
        boolean z2;
        boolean z3 = this.d;
        AbstractC1659Oa0<?> abstractC1659Oa0 = this.l;
        if (z3) {
            C0649Bc0<T> c0649Bc0B = abstractC1659Oa0.b(t);
            if (c0649Bc0B.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c0649Bc0B.g().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (i2 < length) {
            int iZ = z(i2);
            int i5 = iArr[i2];
            int iY = y(iZ);
            if (iY <= 17) {
                int i6 = iArr[i2 + 2];
                c = 1;
                int i7 = i6 & 1048575;
                if (i7 != i3) {
                    i4 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            if (entry != null) {
                abstractC1659Oa0.a(entry);
                if (i5 >= 0) {
                    abstractC1659Oa0.f(entry);
                    throw null;
                }
            }
            int i8 = iZ & 1048575;
            int[] iArr2 = iArr;
            long j = i8;
            switch (iY) {
                case 0:
                    length = length;
                    if ((i4 & i) != 0) {
                        double dE = C4356i92.c.e(j, t);
                        HE.a aVar = ((JE) interfaceC5160ll2).a;
                        aVar.getClass();
                        aVar.Q(i5, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    length = length;
                    if ((i4 & i) != 0) {
                        float f = C4356i92.c.f(j, t);
                        HE.a aVar2 = ((JE) interfaceC5160ll2).a;
                        aVar2.getClass();
                        aVar2.O(i5, Float.floatToRawIntBits(f));
                    }
                    break;
                case 2:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.a0(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 3:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.a0(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 4:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.S(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 5:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.Q(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 6:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.O(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 7:
                    length = length;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.L(i5, C4356i92.c.c(j, t));
                    }
                    break;
                case 8:
                    length = length;
                    if ((i4 & i) != 0) {
                        C(i5, unsafe.getObject(t, j), interfaceC5160ll2);
                    }
                    break;
                case 9:
                    length = length;
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        InterfaceC7779yD1 interfaceC7779yD1J = j(i2);
                        JE je = (JE) interfaceC5160ll2;
                        je.getClass();
                        GZ0 gz0 = (GZ0) object;
                        HE.a aVar3 = je.a;
                        aVar3.X(i5, 2);
                        G0 g0 = (G0) gz0;
                        int iF = g0.f();
                        if (iF == -1) {
                            iF = interfaceC7779yD1J.g(g0);
                            g0.o(iF);
                        }
                        aVar3.Z(iF);
                        interfaceC7779yD1J.e(gz0, aVar3.e);
                    }
                    break;
                case 10:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a(i5, (AbstractC1646Nw) unsafe.getObject(t, j));
                    }
                    break;
                case 11:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.Y(i5, unsafe.getInt(t, j));
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.S(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 13:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.O(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 14:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).a.Q(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 15:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        int i9 = unsafe.getInt(t, j);
                        ((JE) interfaceC5160ll2).a.Y(i5, (i9 >> 31) ^ (i9 << 1));
                    }
                    break;
                case 16:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        ((JE) interfaceC5160ll2).a.a0(i5, (j2 << 1) ^ (j2 >> 63));
                    }
                    break;
                case 17:
                    length = length;
                    z = false;
                    if ((i4 & i) != 0) {
                        ((JE) interfaceC5160ll2).b(i5, unsafe.getObject(t, j), j(i2));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    length = length;
                    z = false;
                    HD1.B(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 19:
                    length = length;
                    z = false;
                    HD1.F(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 20:
                    length = length;
                    z = false;
                    HD1.I(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    length = length;
                    z = false;
                    HD1.Q(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 22:
                    length = length;
                    z = false;
                    HD1.H(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    length = length;
                    z = false;
                    HD1.E(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    length = length;
                    z = false;
                    HD1.D(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 25:
                    length = length;
                    z = false;
                    HD1.z(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 26:
                    length = length;
                    HD1.O(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2);
                    break;
                case 27:
                    length = length;
                    HD1.J(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, j(i2));
                    break;
                case 28:
                    length = length;
                    HD1.A(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2);
                    break;
                case 29:
                    z2 = false;
                    HD1.P(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 30:
                    z2 = false;
                    HD1.C(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 31:
                    z2 = false;
                    HD1.K(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    z2 = false;
                    HD1.L(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 33:
                    z2 = false;
                    HD1.M(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 34:
                    z2 = false;
                    HD1.N(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, false);
                    break;
                case 35:
                    length = length;
                    HD1.B(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 36:
                    length = length;
                    HD1.F(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 37:
                    length = length;
                    HD1.I(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 38:
                    length = length;
                    HD1.Q(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 39:
                    length = length;
                    HD1.H(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    length = length;
                    HD1.E(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    length = length;
                    HD1.D(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 42:
                    length = length;
                    HD1.z(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 43:
                    length = length;
                    HD1.P(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 44:
                    length = length;
                    HD1.C(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 45:
                    length = length;
                    HD1.K(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 46:
                    length = length;
                    HD1.L(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 47:
                    length = length;
                    HD1.M(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 48:
                    length = length;
                    HD1.N(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, c);
                    break;
                case 49:
                    length = length;
                    HD1.G(iArr2[i2], (List) unsafe.getObject(t, j), interfaceC5160ll2, j(i2));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    length = length;
                    B(interfaceC5160ll2, i5, unsafe.getObject(t, j), i2);
                    break;
                case 51:
                    length = length;
                    if (n(t, i5, i2)) {
                        double dDoubleValue = ((Double) C4356i92.c.i(j, t)).doubleValue();
                        HE.a aVar4 = ((JE) interfaceC5160ll2).a;
                        aVar4.getClass();
                        aVar4.Q(i5, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    length = length;
                    if (n(t, i5, i2)) {
                        float fFloatValue = ((Float) C4356i92.c.i(j, t)).floatValue();
                        HE.a aVar5 = ((JE) interfaceC5160ll2).a;
                        aVar5.getClass();
                        aVar5.O(i5, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.a0(i5, u(j, t));
                    }
                    break;
                case 54:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.a0(i5, u(j, t));
                    }
                    break;
                case 55:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.S(i5, t(j, t));
                    }
                    break;
                case 56:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.Q(i5, u(j, t));
                    }
                    break;
                case 57:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.O(i5, t(j, t));
                    }
                    break;
                case 58:
                    length = length;
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.L(i5, ((Boolean) C4356i92.c.i(j, t)).booleanValue());
                    }
                    break;
                case 59:
                    length = length;
                    if (n(t, i5, i2)) {
                        C(i5, unsafe.getObject(t, j), interfaceC5160ll2);
                    }
                    break;
                case 60:
                    if (n(t, i5, i2)) {
                        Object object2 = unsafe.getObject(t, j);
                        InterfaceC7779yD1 interfaceC7779yD1J2 = j(i2);
                        JE je2 = (JE) interfaceC5160ll2;
                        je2.getClass();
                        GZ0 gz1 = (GZ0) object2;
                        HE.a aVar6 = je2.a;
                        aVar6.X(i5, 2);
                        G0 g1 = (G0) gz1;
                        int iF2 = g1.f();
                        length = length;
                        if (iF2 == -1) {
                            iF2 = interfaceC7779yD1J2.g(g1);
                            g1.o(iF2);
                        }
                        aVar6.Z(iF2);
                        interfaceC7779yD1J2.e(gz1, aVar6.e);
                    } else {
                        length = length;
                    }
                    break;
                case 61:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a(i5, (AbstractC1646Nw) unsafe.getObject(t, j));
                    }
                    length = length;
                    break;
                case 62:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.Y(i5, t(j, t));
                    }
                    length = length;
                    break;
                case 63:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.S(i5, t(j, t));
                    }
                    length = length;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.O(i5, t(j, t));
                    }
                    length = length;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).a.Q(i5, u(j, t));
                    }
                    length = length;
                    break;
                case 66:
                    if (n(t, i5, i2)) {
                        int iT = t(j, t);
                        ((JE) interfaceC5160ll2).a.Y(i5, (iT >> 31) ^ (iT << 1));
                    }
                    length = length;
                    break;
                case 67:
                    if (n(t, i5, i2)) {
                        long jU = u(j, t);
                        ((JE) interfaceC5160ll2).a.a0(i5, (jU << c) ^ (jU >> 63));
                    }
                    length = length;
                    break;
                case 68:
                    if (n(t, i5, i2)) {
                        ((JE) interfaceC5160ll2).b(i5, unsafe.getObject(t, j), j(i2));
                    }
                    length = length;
                    break;
                default:
                    length = length;
                    break;
            }
            i2 += 3;
            iArr = iArr2;
            length = length;
        }
        if (entry != null) {
            abstractC1659Oa0.f(entry);
            throw null;
        }
        M82<?, ?> m82 = this.k;
        m82.h(m82.a(t), interfaceC5160ll2);
    }

    public final <K, V> void B(InterfaceC5160ll2 interfaceC5160ll2, int i, Object obj, int i2) {
        if (obj != null) {
            Object objI = i(i2);
            InterfaceC7625xW0 interfaceC7625xW0 = this.m;
            C6574sW0.a<?, ?> aVarC = interfaceC7625xW0.c(objI);
            C7204vW0 c7204vW0E = interfaceC7625xW0.e(obj);
            HE.a aVar = ((JE) interfaceC5160ll2).a;
            aVar.getClass();
            for (Map.Entry<K, V> entry : c7204vW0E.entrySet()) {
                aVar.X(i, 2);
                aVar.Z(C6574sW0.a(aVarC, entry.getKey(), entry.getValue()));
                K key = entry.getKey();
                V value = entry.getValue();
                C0649Bc0.j(aVar, aVarC.a, 1, key);
                C0649Bc0.j(aVar, aVarC.b, 2, value);
            }
        }
    }

    public final boolean a(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, int i) {
        return m(i, abstractC0595Ak0) == m(i, abstractC0595Ak1);
    }

    @Override // defpackage.InterfaceC7779yD1
    public final void b(T t) {
        int[] iArr;
        int i;
        int i2 = this.g;
        while (true) {
            iArr = this.f;
            i = this.h;
            if (i2 >= i) {
                break;
            }
            long jZ = z(iArr[i2]) & 1048575;
            Object objI = C4356i92.c.i(jZ, t);
            if (objI != null) {
                C4356i92.p(t, jZ, this.m.b(objI));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.j.a(iArr[i], t);
            i++;
        }
        this.k.d(t);
        if (this.d) {
            this.l.e(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x011e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [yD1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [yD1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [yD1] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [yD1] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // defpackage.InterfaceC7779yD1
    public final boolean c(T t) {
        int iY;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean zM = true;
            if (i2 >= this.g) {
                if (this.d) {
                    this.l.b(t).e();
                }
                return true;
            }
            int i4 = this.f[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int iZ = z(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = o.getInt(t, i7);
                }
                i = i7;
            }
            if ((268435456 & iZ) == 0) {
                iY = y(iZ);
                if (iY != 9 || iY == 17) {
                    if (i == 1048575) {
                        zM = m(i4, t);
                    } else if ((i8 & i3) == 0) {
                        zM = false;
                    }
                    if (zM) {
                        continue;
                    } else if (!j(i4).c(C4356i92.c.i(iZ & 1048575, t))) {
                    }
                    i2++;
                } else {
                    if (iY != 27) {
                        if (iY == 60 || iY == 68) {
                            if (!n(t, i5, i4)) {
                                continue;
                            } else if (!j(i4).c(C4356i92.c.i(iZ & 1048575, t))) {
                            }
                            i2++;
                        } else if (iY != 49) {
                            if (iY != 50) {
                                continue;
                            } else {
                                Object objI = C4356i92.c.i(iZ & 1048575, t);
                                InterfaceC7625xW0 interfaceC7625xW0 = this.m;
                                C7204vW0 c7204vW0E = interfaceC7625xW0.e(objI);
                                if (!c7204vW0E.isEmpty() && interfaceC7625xW0.c(i(i4)).b.d == EnumC7465wj2.MESSAGE) {
                                    ?? A = 0;
                                    for (Object obj : c7204vW0E.values()) {
                                        A = A;
                                        if (A == 0) {
                                            A = C0596Ak1.c.a(obj.getClass());
                                        }
                                        if (!A.c(obj)) {
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    List list = (List) C4356i92.c.i(iZ & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? J = j(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (J.c(list.get(i9))) {
                            }
                        }
                    }
                    i2++;
                }
            } else {
                if (i == 1048575 ? m(i4, t) : (i3 & i8) != 0) {
                    iY = y(iZ);
                    if (iY != 9) {
                    }
                    if (i == 1048575) {
                        zM = m(i4, t);
                    } else if ((i8 & i3) == 0) {
                        zM = false;
                    }
                    if (zM) {
                        continue;
                    } else if (!j(i4).c(C4356i92.c.i(iZ & 1048575, t))) {
                    }
                    i2++;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // defpackage.InterfaceC7779yD1
    public final void d(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
        AbstractC0595Ak0 abstractC0595Ak2;
        abstractC0595Ak1.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                AbstractC0595Ak0 abstractC0595Ak3 = abstractC0595Ak0;
                Class<?> cls = HD1.a;
                M82<?, ?> m82 = this.k;
                m82.f(abstractC0595Ak3, m82.e(m82.a(abstractC0595Ak3), m82.a(abstractC0595Ak1)));
                if (this.d) {
                    HD1.x(this.l, abstractC0595Ak3, abstractC0595Ak1);
                    return;
                }
                return;
            }
            int iZ = z(i);
            long j = 1048575 & iZ;
            int i2 = iArr[i];
            switch (y(iZ)) {
                case 0:
                    if (!m(i, abstractC0595Ak1)) {
                        abstractC0595Ak2 = abstractC0595Ak0;
                    } else {
                        C4356i92.e eVar = C4356i92.c;
                        abstractC0595Ak2 = abstractC0595Ak0;
                        eVar.m(abstractC0595Ak2, j, eVar.e(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak2);
                    }
                    break;
                case 1:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.e eVar2 = C4356i92.c;
                        eVar2.n(abstractC0595Ak0, j, eVar2.f(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 2:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.o(abstractC0595Ak0, j, C4356i92.c.h(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 3:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.o(abstractC0595Ak0, j, C4356i92.c.h(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 4:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 5:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.o(abstractC0595Ak0, j, C4356i92.c.h(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 6:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 7:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.e eVar3 = C4356i92.c;
                        eVar3.k(abstractC0595Ak0, j, eVar3.c(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 8:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.p(abstractC0595Ak0, j, C4356i92.c.i(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 9:
                    p(abstractC0595Ak0, abstractC0595Ak1, i);
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 10:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.p(abstractC0595Ak0, j, C4356i92.c.i(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 11:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 13:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 14:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.o(abstractC0595Ak0, j, C4356i92.c.h(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 15:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.n(abstractC0595Ak0, C4356i92.c.g(j, abstractC0595Ak1), j);
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 16:
                    if (m(i, abstractC0595Ak1)) {
                        C4356i92.o(abstractC0595Ak0, j, C4356i92.c.h(j, abstractC0595Ak1));
                        w(i, abstractC0595Ak0);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 17:
                    p(abstractC0595Ak0, abstractC0595Ak1, i);
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.j.b(abstractC0595Ak0, abstractC0595Ak1, j);
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class<?> cls2 = HD1.a;
                    C4356i92.e eVar4 = C4356i92.c;
                    C4356i92.p(abstractC0595Ak0, j, this.m.a(eVar4.i(j, abstractC0595Ak0), eVar4.i(j, abstractC0595Ak1)));
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (n(abstractC0595Ak1, i2, i)) {
                        C4356i92.p(abstractC0595Ak0, j, C4356i92.c.i(j, abstractC0595Ak1));
                        x(abstractC0595Ak0, i2, i);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 60:
                    q(abstractC0595Ak0, abstractC0595Ak1, i);
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (n(abstractC0595Ak1, i2, i)) {
                        C4356i92.p(abstractC0595Ak0, j, C4356i92.c.i(j, abstractC0595Ak1));
                        x(abstractC0595Ak0, i2, i);
                    }
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                case 68:
                    q(abstractC0595Ak0, abstractC0595Ak1, i);
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
                default:
                    abstractC0595Ak2 = abstractC0595Ak0;
                    break;
            }
            i += 3;
            abstractC0595Ak0 = abstractC0595Ak2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // defpackage.InterfaceC7779yD1
    public final void e(T t, InterfaceC5160ll2 interfaceC5160ll2) throws Throwable {
        Map.Entry entry;
        interfaceC5160ll2.getClass();
        if (!this.e) {
            A(t, interfaceC5160ll2);
            return;
        }
        Throwable th = null;
        boolean z = this.d;
        AbstractC1659Oa0<?> abstractC1659Oa0 = this.l;
        if (z) {
            C0649Bc0<T> c0649Bc0B = abstractC1659Oa0.b(t);
            if (c0649Bc0B.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c0649Bc0B.g().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int iZ = z(i);
            int i2 = iArr[i];
            if (entry != null) {
                abstractC1659Oa0.a(entry);
                if (i2 >= 0) {
                    abstractC1659Oa0.f(entry);
                    throw th;
                }
            }
            Throwable th2 = th;
            switch (y(iZ)) {
                case 0:
                    if (m(i, t)) {
                        double dE = C4356i92.c.e(iZ & 1048575, t);
                        HE.a aVar = ((JE) interfaceC5160ll2).a;
                        aVar.getClass();
                        aVar.Q(i2, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (m(i, t)) {
                        float f = C4356i92.c.f(iZ & 1048575, t);
                        HE.a aVar2 = ((JE) interfaceC5160ll2).a;
                        aVar2.getClass();
                        aVar2.O(i2, Float.floatToRawIntBits(f));
                    }
                    break;
                case 2:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.a0(i2, C4356i92.c.h(iZ & 1048575, t));
                    }
                    break;
                case 3:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.a0(i2, C4356i92.c.h(iZ & 1048575, t));
                    }
                    break;
                case 4:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.S(i2, C4356i92.c.g(iZ & 1048575, t));
                    }
                    break;
                case 5:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.Q(i2, C4356i92.c.h(iZ & 1048575, t));
                    }
                    break;
                case 6:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.O(i2, C4356i92.c.g(iZ & 1048575, t));
                    }
                    break;
                case 7:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.L(i2, C4356i92.c.c(iZ & 1048575, t));
                    }
                    break;
                case 8:
                    if (m(i, t)) {
                        C(i2, C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2);
                    }
                    break;
                case 9:
                    if (m(i, t)) {
                        Object objI = C4356i92.c.i(iZ & 1048575, t);
                        InterfaceC7779yD1 interfaceC7779yD1J = j(i);
                        GZ0 gz0 = (GZ0) objI;
                        HE.a aVar3 = ((JE) interfaceC5160ll2).a;
                        aVar3.X(i2, 2);
                        G0 g0 = (G0) gz0;
                        int iF = g0.f();
                        if (iF == -1) {
                            iF = interfaceC7779yD1J.g(g0);
                            g0.o(iF);
                        }
                        aVar3.Z(iF);
                        interfaceC7779yD1J.e(gz0, aVar3.e);
                    }
                    break;
                case 10:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a(i2, (AbstractC1646Nw) C4356i92.c.i(iZ & 1048575, t));
                    }
                    break;
                case 11:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.Y(i2, C4356i92.c.g(iZ & 1048575, t));
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.S(i2, C4356i92.c.g(iZ & 1048575, t));
                    }
                    break;
                case 13:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.O(i2, C4356i92.c.g(iZ & 1048575, t));
                    }
                    break;
                case 14:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).a.Q(i2, C4356i92.c.h(iZ & 1048575, t));
                    }
                    break;
                case 15:
                    if (m(i, t)) {
                        int iG = C4356i92.c.g(iZ & 1048575, t);
                        ((JE) interfaceC5160ll2).a.Y(i2, (iG >> 31) ^ (iG << 1));
                    }
                    break;
                case 16:
                    if (m(i, t)) {
                        long jH = C4356i92.c.h(iZ & 1048575, t);
                        ((JE) interfaceC5160ll2).a.a0(i2, (jH << 1) ^ (jH >> 63));
                    }
                    break;
                case 17:
                    if (m(i, t)) {
                        ((JE) interfaceC5160ll2).b(i2, C4356i92.c.i(iZ & 1048575, t), j(i));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    HD1.B(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 19:
                    HD1.F(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 20:
                    HD1.I(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    HD1.Q(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 22:
                    HD1.H(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    HD1.E(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    HD1.D(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 25:
                    HD1.z(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 26:
                    HD1.O(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2);
                    break;
                case 27:
                    HD1.J(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, j(i));
                    break;
                case 28:
                    HD1.A(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2);
                    break;
                case 29:
                    HD1.P(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 30:
                    HD1.C(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 31:
                    HD1.K(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    HD1.L(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 33:
                    HD1.M(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 34:
                    HD1.N(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, false);
                    break;
                case 35:
                    HD1.B(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 36:
                    HD1.F(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 37:
                    HD1.I(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 38:
                    HD1.Q(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 39:
                    HD1.H(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    HD1.E(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    HD1.D(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 42:
                    HD1.z(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 43:
                    HD1.P(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 44:
                    HD1.C(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 45:
                    HD1.K(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 46:
                    HD1.L(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 47:
                    HD1.M(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 48:
                    HD1.N(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, true);
                    break;
                case 49:
                    HD1.G(iArr[i], (List) C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2, j(i));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    B(interfaceC5160ll2, i2, C4356i92.c.i(iZ & 1048575, t), i);
                    break;
                case 51:
                    if (n(t, i2, i)) {
                        double dDoubleValue = ((Double) C4356i92.c.i(iZ & 1048575, t)).doubleValue();
                        HE.a aVar4 = ((JE) interfaceC5160ll2).a;
                        aVar4.getClass();
                        aVar4.Q(i2, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (n(t, i2, i)) {
                        float fFloatValue = ((Float) C4356i92.c.i(iZ & 1048575, t)).floatValue();
                        HE.a aVar5 = ((JE) interfaceC5160ll2).a;
                        aVar5.getClass();
                        aVar5.O(i2, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.a0(i2, u(iZ & 1048575, t));
                    }
                    break;
                case 54:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.a0(i2, u(iZ & 1048575, t));
                    }
                    break;
                case 55:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.S(i2, t(iZ & 1048575, t));
                    }
                    break;
                case 56:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.Q(i2, u(iZ & 1048575, t));
                    }
                    break;
                case 57:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.O(i2, t(iZ & 1048575, t));
                    }
                    break;
                case 58:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.L(i2, ((Boolean) C4356i92.c.i(iZ & 1048575, t)).booleanValue());
                    }
                    break;
                case 59:
                    if (n(t, i2, i)) {
                        C(i2, C4356i92.c.i(iZ & 1048575, t), interfaceC5160ll2);
                    }
                    break;
                case 60:
                    if (n(t, i2, i)) {
                        Object objI2 = C4356i92.c.i(iZ & 1048575, t);
                        InterfaceC7779yD1 interfaceC7779yD1J2 = j(i);
                        GZ0 gz1 = (GZ0) objI2;
                        HE.a aVar6 = ((JE) interfaceC5160ll2).a;
                        aVar6.X(i2, 2);
                        G0 g1 = (G0) gz1;
                        int iF2 = g1.f();
                        if (iF2 == -1) {
                            iF2 = interfaceC7779yD1J2.g(g1);
                            g1.o(iF2);
                        }
                        aVar6.Z(iF2);
                        interfaceC7779yD1J2.e(gz1, aVar6.e);
                    }
                    break;
                case 61:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a(i2, (AbstractC1646Nw) C4356i92.c.i(iZ & 1048575, t));
                    }
                    break;
                case 62:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.Y(i2, t(iZ & 1048575, t));
                    }
                    break;
                case 63:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.S(i2, t(iZ & 1048575, t));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.O(i2, t(iZ & 1048575, t));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).a.Q(i2, u(iZ & 1048575, t));
                    }
                    break;
                case 66:
                    if (n(t, i2, i)) {
                        int iT = t(iZ & 1048575, t);
                        ((JE) interfaceC5160ll2).a.Y(i2, (iT >> 31) ^ (iT << 1));
                    }
                    break;
                case 67:
                    if (n(t, i2, i)) {
                        long jU = u(iZ & 1048575, t);
                        ((JE) interfaceC5160ll2).a.a0(i2, (jU << 1) ^ (jU >> 63));
                    }
                    break;
                case 68:
                    if (n(t, i2, i)) {
                        ((JE) interfaceC5160ll2).b(i2, C4356i92.c.i(iZ & 1048575, t), j(i));
                    }
                    break;
            }
            i += 3;
            th = th2;
        }
        Throwable th3 = th;
        if (entry != null) {
            abstractC1659Oa0.f(entry);
            throw th3;
        }
        M82<?, ?> m82 = this.k;
        m82.h(m82.a(t), interfaceC5160ll2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7779yD1
    public final int f(AbstractC0595Ak0 abstractC0595Ak0) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZ = z(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iZ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (y(iZ)) {
                case 0:
                    i = i3 * 53;
                    iB = XB0.b(Double.doubleToLongBits(C4356i92.c.e(j, abstractC0595Ak0)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(C4356i92.c.f(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = XB0.b(C4356i92.c.h(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = XB0.b(C4356i92.c.h(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = XB0.b(C4356i92.c.h(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = C4356i92.c.c(j, abstractC0595Ak0);
                    Charset charset = XB0.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) C4356i92.c.i(j, abstractC0595Ak0)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objI = C4356i92.c.i(j, abstractC0595Ak0);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = XB0.b(C4356i92.c.h(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = C4356i92.c.g(j, abstractC0595Ak0);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = XB0.b(C4356i92.c.h(j, abstractC0595Ak0));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objI2 = C4356i92.c.i(j, abstractC0595Ak0);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(Double.doubleToLongBits(((Double) C4356i92.c.i(j, abstractC0595Ak0)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) C4356i92.c.i(j, abstractC0595Ak0)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(u(j, abstractC0595Ak0));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(u(j, abstractC0595Ak0));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(u(j, abstractC0595Ak0));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) C4356i92.c.i(j, abstractC0595Ak0)).booleanValue();
                        Charset charset2 = XB0.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = ((String) C4356i92.c.i(j, abstractC0595Ak0)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(u(j, abstractC0595Ak0));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = t(j, abstractC0595Ak0);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = XB0.b(u(j, abstractC0595Ak0));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (n(abstractC0595Ak0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4356i92.c.i(j, abstractC0595Ak0).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.k.a(abstractC0595Ak0).hashCode() + (i3 * 53);
        if (!this.d) {
            return iHashCode2;
        }
        return this.l.b(abstractC0595Ak0).a.hashCode() + (iHashCode2 * 53);
    }

    @Override // defpackage.InterfaceC7779yD1
    public final int g(G0 g0) {
        return this.e ? l(g0) : k(g0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.InterfaceC7779yD1
    public final boolean h(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zY = true;
            if (i < length) {
                int iZ = z(i);
                long j = iZ & 1048575;
                switch (y(iZ)) {
                    case 0:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar = C4356i92.c;
                            if (Double.doubleToLongBits(eVar.e(j, abstractC0595Ak0)) != Double.doubleToLongBits(eVar.e(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case 1:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar2 = C4356i92.c;
                            if (Float.floatToIntBits(eVar2.f(j, abstractC0595Ak0)) != Float.floatToIntBits(eVar2.f(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case 2:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar3 = C4356i92.c;
                            if (eVar3.h(j, abstractC0595Ak0) != eVar3.h(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 3:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar4 = C4356i92.c;
                            if (eVar4.h(j, abstractC0595Ak0) != eVar4.h(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 4:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar5 = C4356i92.c;
                            if (eVar5.g(j, abstractC0595Ak0) != eVar5.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 5:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar6 = C4356i92.c;
                            if (eVar6.h(j, abstractC0595Ak0) != eVar6.h(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 6:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar7 = C4356i92.c;
                            if (eVar7.g(j, abstractC0595Ak0) != eVar7.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 7:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar8 = C4356i92.c;
                            if (eVar8.c(j, abstractC0595Ak0) != eVar8.c(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 8:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar9 = C4356i92.c;
                            if (!HD1.y(eVar9.i(j, abstractC0595Ak0), eVar9.i(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case 9:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar10 = C4356i92.c;
                            if (!HD1.y(eVar10.i(j, abstractC0595Ak0), eVar10.i(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case 10:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar11 = C4356i92.c;
                            if (!HD1.y(eVar11.i(j, abstractC0595Ak0), eVar11.i(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case 11:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar12 = C4356i92.c;
                            if (eVar12.g(j, abstractC0595Ak0) != eVar12.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar13 = C4356i92.c;
                            if (eVar13.g(j, abstractC0595Ak0) != eVar13.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 13:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar14 = C4356i92.c;
                            if (eVar14.g(j, abstractC0595Ak0) != eVar14.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 14:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar15 = C4356i92.c;
                            if (eVar15.h(j, abstractC0595Ak0) != eVar15.h(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 15:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar16 = C4356i92.c;
                            if (eVar16.g(j, abstractC0595Ak0) != eVar16.g(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 16:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar17 = C4356i92.c;
                            if (eVar17.h(j, abstractC0595Ak0) != eVar17.h(j, abstractC0595Ak1)) {
                                zY = false;
                            }
                        }
                        break;
                    case 17:
                        if (!a(abstractC0595Ak0, abstractC0595Ak1, i)) {
                            zY = false;
                        } else {
                            C4356i92.e eVar18 = C4356i92.c;
                            if (!HD1.y(eVar18.i(j, abstractC0595Ak0), eVar18.i(j, abstractC0595Ak1))) {
                                zY = false;
                            }
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    case 19:
                    case 20:
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        C4356i92.e eVar19 = C4356i92.c;
                        zY = HD1.y(eVar19.i(j, abstractC0595Ak0), eVar19.i(j, abstractC0595Ak1));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        C4356i92.e eVar20 = C4356i92.c;
                        zY = HD1.y(eVar20.i(j, abstractC0595Ak0), eVar20.i(j, abstractC0595Ak1));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        C4356i92.e eVar21 = C4356i92.c;
                        if (eVar21.g(j2, abstractC0595Ak0) != eVar21.g(j2, abstractC0595Ak1) || !HD1.y(eVar21.i(j, abstractC0595Ak0), eVar21.i(j, abstractC0595Ak1))) {
                            zY = false;
                        }
                        break;
                }
                if (zY) {
                    i += 3;
                }
            } else {
                M82<?, ?> m82 = this.k;
                if (m82.a(abstractC0595Ak0).equals(m82.a(abstractC0595Ak1))) {
                    if (!this.d) {
                        return true;
                    }
                    AbstractC1659Oa0<?> abstractC1659Oa0 = this.l;
                    return abstractC1659Oa0.b(abstractC0595Ak0).equals(abstractC1659Oa0.b(abstractC0595Ak1));
                }
            }
        }
        return false;
    }

    public final Object i(int i) {
        return this.b[(i / 3) * 2];
    }

    public final InterfaceC7779yD1 j(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        InterfaceC7779yD1 interfaceC7779yD1 = (InterfaceC7779yD1) objArr[i2];
        if (interfaceC7779yD1 != null) {
            return interfaceC7779yD1;
        }
        InterfaceC7779yD1<T> interfaceC7779yD1A = C0596Ak1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC7779yD1A;
        return interfaceC7779yD1A;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int k(G0 g0) {
        int i;
        int iE;
        int iH;
        int iE2;
        int iB;
        int iZ;
        int iE3;
        int iD;
        int iW;
        int iG;
        int iE4;
        int iA;
        Unsafe unsafe = o;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iE5 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 < iArr.length) {
                int iZ2 = z(i4);
                int i6 = iArr[i4];
                int iY = y(iZ2);
                if (iY <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i3) {
                        i5 = unsafe.getInt(g0, i8);
                        i3 = i8;
                    }
                } else {
                    i = 0;
                }
                long j = iZ2 & i2;
                switch (iY) {
                    case 0:
                        if ((i5 & i) != 0) {
                            iE5 = EK.a(i6, 8, iE5);
                        }
                        break;
                    case 1:
                        if ((i5 & i) != 0) {
                            iE5 = EK.a(i6, 4, iE5);
                        }
                        break;
                    case 2:
                        if ((i5 & i) != 0) {
                            long j2 = unsafe.getLong(g0, j);
                            iE = HE.E(i6);
                            iH = HE.H(j2);
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 3:
                        if ((i5 & i) != 0) {
                            long j3 = unsafe.getLong(g0, j);
                            iE = HE.E(i6);
                            iH = HE.H(j3);
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 4:
                        if ((i5 & i) != 0) {
                            int i9 = unsafe.getInt(g0, j);
                            iE2 = HE.E(i6);
                            iB = HE.B(i9);
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case 5:
                        if ((i5 & i) != 0) {
                            iZ = HE.z(i6);
                            iE5 += iZ;
                        }
                        break;
                    case 6:
                        if ((i5 & i) != 0) {
                            iZ = HE.y(i6);
                            iE5 += iZ;
                        }
                        break;
                    case 7:
                        if ((i5 & i) != 0) {
                            iE5 = EK.a(i6, 1, iE5);
                        }
                        break;
                    case 8:
                        if ((i5 & i) != 0) {
                            Object object = unsafe.getObject(g0, j);
                            if (object instanceof AbstractC1646Nw) {
                                iW = HE.w(i6, (AbstractC1646Nw) object);
                            } else {
                                iE3 = HE.E(i6);
                                iD = HE.D((String) object);
                                iW = iD + iE3;
                            }
                            iE5 = iW + iE5;
                        }
                        break;
                    case 9:
                        if ((i5 & i) != 0) {
                            iZ = HD1.l(i6, unsafe.getObject(g0, j), j(i4));
                            iE5 += iZ;
                        }
                        break;
                    case 10:
                        if ((i5 & i) != 0) {
                            iZ = HE.w(i6, (AbstractC1646Nw) unsafe.getObject(g0, j));
                            iE5 += iZ;
                        }
                        break;
                    case 11:
                        if ((i5 & i) != 0) {
                            iZ = HE.F(i6, unsafe.getInt(g0, j));
                            iE5 += iZ;
                        }
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        if ((i5 & i) != 0) {
                            int i10 = unsafe.getInt(g0, j);
                            iE2 = HE.E(i6);
                            iB = HE.B(i10);
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case 13:
                        if ((i5 & i) != 0) {
                            iE5 = EK.a(i6, 4, iE5);
                        }
                        break;
                    case 14:
                        if ((i5 & i) != 0) {
                            iE5 = EK.a(i6, 8, iE5);
                        }
                        break;
                    case 15:
                        if ((i5 & i) != 0) {
                            int i11 = unsafe.getInt(g0, j);
                            iE2 = HE.E(i6);
                            iB = HE.G((i11 >> 31) ^ (i11 << 1));
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case 16:
                        if ((i5 & i) != 0) {
                            long j4 = unsafe.getLong(g0, j);
                            iE = HE.E(i6);
                            iH = HE.H((j4 >> 63) ^ (j4 << 1));
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 17:
                        if ((i5 & i) != 0) {
                            iZ = HE.A(i6, (GZ0) unsafe.getObject(g0, j), j(i4));
                            iE5 += iZ;
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        iZ = HD1.f(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 19:
                        iZ = HD1.d(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 20:
                        iZ = HD1.j(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        iZ = HD1.u(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 22:
                        iZ = HD1.h(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        iZ = HD1.f(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        iZ = HD1.d(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(g0, j);
                        Class<?> cls = HD1.a;
                        int size = list.size();
                        iE5 += size == 0 ? 0 : (HE.E(i6) + 1) * size;
                        break;
                    case 26:
                        iZ = HD1.r(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 27:
                        iZ = HD1.m(i6, (List) unsafe.getObject(g0, j), j(i4));
                        iE5 += iZ;
                        break;
                    case 28:
                        iZ = HD1.a(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 29:
                        iZ = HD1.s(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 30:
                        iZ = HD1.b(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 31:
                        iZ = HD1.d(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        iZ = HD1.f(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 33:
                        iZ = HD1.n(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 34:
                        iZ = HD1.p(i6, (List) unsafe.getObject(g0, j));
                        iE5 += iZ;
                        break;
                    case 35:
                        iG = HD1.g((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 36:
                        iG = HD1.e((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 37:
                        iG = HD1.k((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 38:
                        iG = HD1.v((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 39:
                        iG = HD1.i((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        iG = HD1.g((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        iG = HD1.e((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 42:
                        List list2 = (List) unsafe.getObject(g0, j);
                        Class<?> cls2 = HD1.a;
                        iG = list2.size();
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 43:
                        iG = HD1.t((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 44:
                        iG = HD1.c((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 45:
                        iG = HD1.e((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 46:
                        iG = HD1.g((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 47:
                        iG = HD1.o((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 48:
                        iG = HD1.q((List) unsafe.getObject(g0, j));
                        if (iG > 0) {
                            iE4 = HE.E(i6);
                            iE5 = C8045zW0.a(iG, iE4, iG, iE5);
                        }
                        break;
                    case 49:
                        List list3 = (List) unsafe.getObject(g0, j);
                        InterfaceC7779yD1 interfaceC7779yD1J = j(i4);
                        Class<?> cls3 = HD1.a;
                        int size2 = list3.size();
                        if (size2 == 0) {
                            iA = 0;
                        } else {
                            iA = 0;
                            for (int i12 = 0; i12 < size2; i12++) {
                                iA += HE.A(i6, (GZ0) list3.get(i12), interfaceC7779yD1J);
                            }
                        }
                        iE5 += iA;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        iZ = this.m.d(i6, unsafe.getObject(g0, j), i(i4));
                        iE5 += iZ;
                        break;
                    case 51:
                        if (n(g0, i6, i4)) {
                            iE5 = EK.a(i6, 8, iE5);
                        }
                        break;
                    case 52:
                        if (n(g0, i6, i4)) {
                            iE5 = EK.a(i6, 4, iE5);
                        }
                        break;
                    case 53:
                        if (n(g0, i6, i4)) {
                            long jU = u(j, g0);
                            iE = HE.E(i6);
                            iH = HE.H(jU);
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 54:
                        if (n(g0, i6, i4)) {
                            long jU2 = u(j, g0);
                            iE = HE.E(i6);
                            iH = HE.H(jU2);
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 55:
                        if (n(g0, i6, i4)) {
                            int iT = t(j, g0);
                            iE2 = HE.E(i6);
                            iB = HE.B(iT);
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case 56:
                        if (n(g0, i6, i4)) {
                            iZ = HE.z(i6);
                            iE5 += iZ;
                        }
                        break;
                    case 57:
                        if (n(g0, i6, i4)) {
                            iZ = HE.y(i6);
                            iE5 += iZ;
                        }
                        break;
                    case 58:
                        if (n(g0, i6, i4)) {
                            iE5 = EK.a(i6, 1, iE5);
                        }
                        break;
                    case 59:
                        if (n(g0, i6, i4)) {
                            Object object2 = unsafe.getObject(g0, j);
                            if (object2 instanceof AbstractC1646Nw) {
                                iW = HE.w(i6, (AbstractC1646Nw) object2);
                            } else {
                                iE3 = HE.E(i6);
                                iD = HE.D((String) object2);
                                iW = iD + iE3;
                            }
                            iE5 = iW + iE5;
                        }
                        break;
                    case 60:
                        if (n(g0, i6, i4)) {
                            iZ = HD1.l(i6, unsafe.getObject(g0, j), j(i4));
                            iE5 += iZ;
                        }
                        break;
                    case 61:
                        if (n(g0, i6, i4)) {
                            iZ = HE.w(i6, (AbstractC1646Nw) unsafe.getObject(g0, j));
                            iE5 += iZ;
                        }
                        break;
                    case 62:
                        if (n(g0, i6, i4)) {
                            iZ = HE.F(i6, t(j, g0));
                            iE5 += iZ;
                        }
                        break;
                    case 63:
                        if (n(g0, i6, i4)) {
                            int iT2 = t(j, g0);
                            iE2 = HE.E(i6);
                            iB = HE.B(iT2);
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        if (n(g0, i6, i4)) {
                            iE5 = EK.a(i6, 4, iE5);
                        }
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        if (n(g0, i6, i4)) {
                            iE5 = EK.a(i6, 8, iE5);
                        }
                        break;
                    case 66:
                        if (n(g0, i6, i4)) {
                            int iT3 = t(j, g0);
                            iE2 = HE.E(i6);
                            iB = HE.G((iT3 >> 31) ^ (iT3 << 1));
                            iZ = iB + iE2;
                            iE5 += iZ;
                        }
                        break;
                    case 67:
                        if (n(g0, i6, i4)) {
                            long jU3 = u(j, g0);
                            iE = HE.E(i6);
                            iH = HE.H((jU3 >> 63) ^ (jU3 << 1));
                            iZ = iH + iE;
                            iE5 += iZ;
                        }
                        break;
                    case 68:
                        if (n(g0, i6, i4)) {
                            iZ = HE.A(i6, (GZ0) unsafe.getObject(g0, j), j(i4));
                            iE5 += iZ;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            } else {
                M82<?, ?> m82 = this.k;
                int iB2 = m82.b(m82.a(g0)) + iE5;
                if (!this.d) {
                    return iB2;
                }
                C0649Bc0<T> c0649Bc0B = this.l.b(g0);
                int i13 = 0;
                int iC = 0;
                while (true) {
                    YM1 ym1 = c0649Bc0B.a;
                    if (i13 >= ym1.e.size()) {
                        for (Map.Entry<Object, Object> entry : ym1.e()) {
                            iC = C0649Bc0.c((C0649Bc0.a) entry.getKey(), entry.getValue()) + iC;
                        }
                        return iB2 + iC;
                    }
                    Map.Entry<Object, Object> entryD = ym1.d(i13);
                    iC = C0649Bc0.c((C0649Bc0.a) entryD.getKey(), entryD.getValue()) + iC;
                    i13++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int l(G0 g0) {
        int iE;
        int iH;
        int iE2;
        int iB;
        int iZ;
        int iE3;
        int iD;
        int iW;
        int iE4;
        int iH2;
        int iG;
        int iE5;
        int iA;
        Unsafe unsafe = o;
        int i = 0;
        int iE6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                M82<?, ?> m82 = this.k;
                return m82.b(m82.a(g0)) + iE6;
            }
            int iZ2 = z(i);
            int iY = y(iZ2);
            int i2 = iArr[i];
            long j = iZ2 & 1048575;
            if (iY >= EnumC1117Hc0.e.d && iY <= EnumC1117Hc0.g.d) {
                int i3 = iArr[i + 2];
            }
            switch (iY) {
                case 0:
                    if (m(i, g0)) {
                        iE6 = EK.a(i2, 8, iE6);
                    }
                    break;
                case 1:
                    if (m(i, g0)) {
                        iE6 = EK.a(i2, 4, iE6);
                    }
                    break;
                case 2:
                    if (m(i, g0)) {
                        long jH = C4356i92.c.h(j, g0);
                        iE = HE.E(i2);
                        iH = HE.H(jH);
                        iZ = iH + iE;
                        iE6 += iZ;
                    }
                    break;
                case 3:
                    if (m(i, g0)) {
                        long jH2 = C4356i92.c.h(j, g0);
                        iE = HE.E(i2);
                        iH = HE.H(jH2);
                        iZ = iH + iE;
                        iE6 += iZ;
                    }
                    break;
                case 4:
                    if (m(i, g0)) {
                        int iG2 = C4356i92.c.g(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.B(iG2);
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case 5:
                    if (m(i, g0)) {
                        iZ = HE.z(i2);
                        iE6 += iZ;
                    }
                    break;
                case 6:
                    if (m(i, g0)) {
                        iZ = HE.y(i2);
                        iE6 += iZ;
                    }
                    break;
                case 7:
                    if (m(i, g0)) {
                        iE6 = EK.a(i2, 1, iE6);
                    }
                    break;
                case 8:
                    if (m(i, g0)) {
                        Object objI = C4356i92.c.i(j, g0);
                        if (objI instanceof AbstractC1646Nw) {
                            iW = HE.w(i2, (AbstractC1646Nw) objI);
                        } else {
                            iE3 = HE.E(i2);
                            iD = HE.D((String) objI);
                            iW = iD + iE3;
                        }
                        iE6 = iW + iE6;
                    }
                    break;
                case 9:
                    if (m(i, g0)) {
                        iZ = HD1.l(i2, C4356i92.c.i(j, g0), j(i));
                        iE6 += iZ;
                    }
                    break;
                case 10:
                    if (m(i, g0)) {
                        iZ = HE.w(i2, (AbstractC1646Nw) C4356i92.c.i(j, g0));
                        iE6 += iZ;
                    }
                    break;
                case 11:
                    if (m(i, g0)) {
                        iZ = HE.F(i2, C4356i92.c.g(j, g0));
                        iE6 += iZ;
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (m(i, g0)) {
                        int iG3 = C4356i92.c.g(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.B(iG3);
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case 13:
                    if (m(i, g0)) {
                        iE6 = EK.a(i2, 4, iE6);
                    }
                    break;
                case 14:
                    if (m(i, g0)) {
                        iE6 = EK.a(i2, 8, iE6);
                    }
                    break;
                case 15:
                    if (m(i, g0)) {
                        int iG4 = C4356i92.c.g(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.G((iG4 >> 31) ^ (iG4 << 1));
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case 16:
                    if (m(i, g0)) {
                        long jH3 = C4356i92.c.h(j, g0);
                        iE4 = HE.E(i2);
                        iH2 = HE.H((jH3 >> 63) ^ (jH3 << 1));
                        iZ = iH2 + iE4;
                        iE6 += iZ;
                    }
                    break;
                case 17:
                    if (m(i, g0)) {
                        iZ = HE.A(i2, (GZ0) C4356i92.c.i(j, g0), j(i));
                        iE6 += iZ;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iZ = HD1.f(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 19:
                    iZ = HD1.d(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 20:
                    iZ = HD1.j(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    iZ = HD1.u(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 22:
                    iZ = HD1.h(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iZ = HD1.f(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iZ = HD1.d(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 25:
                    List listO = o(g0, j);
                    Class<?> cls = HD1.a;
                    int size = listO.size();
                    iE6 += size == 0 ? 0 : (HE.E(i2) + 1) * size;
                    break;
                case 26:
                    iZ = HD1.r(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 27:
                    iZ = HD1.m(i2, o(g0, j), j(i));
                    iE6 += iZ;
                    break;
                case 28:
                    iZ = HD1.a(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 29:
                    iZ = HD1.s(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 30:
                    iZ = HD1.b(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 31:
                    iZ = HD1.d(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    iZ = HD1.f(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 33:
                    iZ = HD1.n(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 34:
                    iZ = HD1.p(i2, o(g0, j));
                    iE6 += iZ;
                    break;
                case 35:
                    iG = HD1.g((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 36:
                    iG = HD1.e((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 37:
                    iG = HD1.k((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 38:
                    iG = HD1.v((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 39:
                    iG = HD1.i((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    iG = HD1.g((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    iG = HD1.e((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(g0, j);
                    Class<?> cls2 = HD1.a;
                    iG = list.size();
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 43:
                    iG = HD1.t((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 44:
                    iG = HD1.c((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 45:
                    iG = HD1.e((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 46:
                    iG = HD1.g((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 47:
                    iG = HD1.o((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 48:
                    iG = HD1.q((List) unsafe.getObject(g0, j));
                    if (iG > 0) {
                        iE5 = HE.E(i2);
                        iE6 = C8045zW0.a(iG, iE5, iG, iE6);
                    }
                    break;
                case 49:
                    List listO2 = o(g0, j);
                    InterfaceC7779yD1 interfaceC7779yD1J = j(i);
                    Class<?> cls3 = HD1.a;
                    int size2 = listO2.size();
                    if (size2 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            iA += HE.A(i2, (GZ0) listO2.get(i4), interfaceC7779yD1J);
                        }
                    }
                    iE6 += iA;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    iZ = this.m.d(i2, C4356i92.c.i(j, g0), i(i));
                    iE6 += iZ;
                    break;
                case 51:
                    if (n(g0, i2, i)) {
                        iE6 = EK.a(i2, 8, iE6);
                    }
                    break;
                case 52:
                    if (n(g0, i2, i)) {
                        iE6 = EK.a(i2, 4, iE6);
                    }
                    break;
                case 53:
                    if (n(g0, i2, i)) {
                        long jU = u(j, g0);
                        iE = HE.E(i2);
                        iH = HE.H(jU);
                        iZ = iH + iE;
                        iE6 += iZ;
                    }
                    break;
                case 54:
                    if (n(g0, i2, i)) {
                        long jU2 = u(j, g0);
                        iE = HE.E(i2);
                        iH = HE.H(jU2);
                        iZ = iH + iE;
                        iE6 += iZ;
                    }
                    break;
                case 55:
                    if (n(g0, i2, i)) {
                        int iT = t(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.B(iT);
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case 56:
                    if (n(g0, i2, i)) {
                        iZ = HE.z(i2);
                        iE6 += iZ;
                    }
                    break;
                case 57:
                    if (n(g0, i2, i)) {
                        iZ = HE.y(i2);
                        iE6 += iZ;
                    }
                    break;
                case 58:
                    if (n(g0, i2, i)) {
                        iE6 = EK.a(i2, 1, iE6);
                    }
                    break;
                case 59:
                    if (n(g0, i2, i)) {
                        Object objI2 = C4356i92.c.i(j, g0);
                        if (objI2 instanceof AbstractC1646Nw) {
                            iW = HE.w(i2, (AbstractC1646Nw) objI2);
                        } else {
                            iE3 = HE.E(i2);
                            iD = HE.D((String) objI2);
                            iW = iD + iE3;
                        }
                        iE6 = iW + iE6;
                    }
                    break;
                case 60:
                    if (n(g0, i2, i)) {
                        iZ = HD1.l(i2, C4356i92.c.i(j, g0), j(i));
                        iE6 += iZ;
                    }
                    break;
                case 61:
                    if (n(g0, i2, i)) {
                        iZ = HE.w(i2, (AbstractC1646Nw) C4356i92.c.i(j, g0));
                        iE6 += iZ;
                    }
                    break;
                case 62:
                    if (n(g0, i2, i)) {
                        iZ = HE.F(i2, t(j, g0));
                        iE6 += iZ;
                    }
                    break;
                case 63:
                    if (n(g0, i2, i)) {
                        int iT2 = t(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.B(iT2);
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (n(g0, i2, i)) {
                        iE6 = EK.a(i2, 4, iE6);
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (n(g0, i2, i)) {
                        iE6 = EK.a(i2, 8, iE6);
                    }
                    break;
                case 66:
                    if (n(g0, i2, i)) {
                        int iT3 = t(j, g0);
                        iE2 = HE.E(i2);
                        iB = HE.G((iT3 >> 31) ^ (iT3 << 1));
                        iZ = iB + iE2;
                        iE6 += iZ;
                    }
                    break;
                case 67:
                    if (n(g0, i2, i)) {
                        long jU3 = u(j, g0);
                        iE4 = HE.E(i2);
                        iH2 = HE.H((jU3 >> 63) ^ (jU3 << 1));
                        iZ = iH2 + iE4;
                        iE6 += iZ;
                    }
                    break;
                case 68:
                    if (n(g0, i2, i)) {
                        iZ = HE.A(i2, (GZ0) C4356i92.c.i(j, g0), j(i));
                        iE6 += iZ;
                    }
                    break;
            }
            i += 3;
        }
    }

    public final boolean m(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iZ = z(i);
            long j2 = iZ & 1048575;
            switch (y(iZ)) {
                case 0:
                    if (C4356i92.c.e(j2, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (C4356i92.c.f(j2, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (C4356i92.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C4356i92.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C4356i92.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C4356i92.c.c(j2, obj);
                case 8:
                    Object objI = C4356i92.c.i(j2, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof AbstractC1646Nw) {
                        return !AbstractC1646Nw.e.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C4356i92.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1646Nw.e.equals(C4356i92.c.i(j2, obj));
                case 11:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C4356i92.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C4356i92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C4356i92.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C4356i92.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C4356i92.c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(T t, int i, int i2) {
        return C4356i92.c.g((long) (this.a[i2 + 2] & 1048575), t) == i;
    }

    public final void p(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, int i) {
        long jZ = z(i) & 1048575;
        if (m(i, abstractC0595Ak1)) {
            C4356i92.e eVar = C4356i92.c;
            Object objI = eVar.i(jZ, abstractC0595Ak0);
            Object objI2 = eVar.i(jZ, abstractC0595Ak1);
            if (objI != null && objI2 != null) {
                C4356i92.p(abstractC0595Ak0, jZ, XB0.c(objI, objI2));
                w(i, abstractC0595Ak0);
            } else if (objI2 != null) {
                C4356i92.p(abstractC0595Ak0, jZ, objI2);
                w(i, abstractC0595Ak0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, int i) {
        int iZ = z(i);
        int i2 = this.a[i];
        long j = iZ & 1048575;
        if (n(abstractC0595Ak1, i2, i)) {
            Object objI = n(abstractC0595Ak0, i2, i) ? C4356i92.c.i(j, abstractC0595Ak0) : null;
            Object objI2 = C4356i92.c.i(j, abstractC0595Ak1);
            if (objI != null && objI2 != null) {
                C4356i92.p(abstractC0595Ak0, j, XB0.c(objI, objI2));
                x(abstractC0595Ak0, i2, i);
            } else if (objI2 != null) {
                C4356i92.p(abstractC0595Ak0, j, objI2);
                x(abstractC0595Ak0, i2, i);
            }
        }
    }

    public final void w(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C4356i92.n(obj, (1 << (i2 >>> 20)) | C4356i92.c.g(j, obj), j);
    }

    public final void x(T t, int i, int i2) {
        C4356i92.n(t, i, this.a[i2 + 2] & 1048575);
    }

    public final int z(int i) {
        return this.a[i + 1];
    }
}
