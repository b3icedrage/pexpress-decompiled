package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class QZ0<T> implements InterfaceC7989zD1<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = C4614j92.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final AbstractC8097zk0 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final InterfaceC5856p41 k;
    public final FQ0 l;
    public final N82<?, ?> m;
    public final AbstractC1737Pa0<?> n;
    public final InterfaceC7835yW0 o;

    public QZ0(int[] iArr, Object[] objArr, int i, int i2, AbstractC8097zk0 abstractC8097zk0, int[] iArr2, int i3, int i4, InterfaceC5856p41 interfaceC5856p41, FQ0 fq0, N82 n82, AbstractC1737Pa0 abstractC1737Pa0, InterfaceC7835yW0 interfaceC7835yW0) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = Objects.nonNull(abstractC8097zk0);
        this.f = abstractC1737Pa0 != null && abstractC1737Pa0.e(abstractC8097zk0);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = interfaceC5856p41;
        this.l = fq0;
        this.m = n82;
        this.n = abstractC1737Pa0;
        this.e = abstractC8097zk0;
        this.o = interfaceC7835yW0;
    }

    public static int A(long j, Object obj) {
        return ((Integer) C4614j92.c.h(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) C4614j92.c.h(j, obj)).longValue();
    }

    public static Field H(Class<?> cls, String str) {
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

    public static int M(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC8097zk0) {
            return ((AbstractC8097zk0) obj).m();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0269  */
    /* JADX WARN: Code duplicated, block: B:123:0x026c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0283  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:180:0x037e  */
    public static <T> QZ0<T> y(C2008Sm1 c2008Sm1, InterfaceC5856p41 interfaceC5856p41, FQ0 fq0, N82<?, ?> n82, AbstractC1737Pa0<?> abstractC1737Pa0, InterfaceC7835yW0 interfaceC7835yW0) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldH;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldH2;
        int i25;
        Object obj2;
        Field fieldH3;
        int i26;
        char cCharAt10;
        int i27;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        String str = c2008Sm1.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (str.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = str.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = p;
            i4 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = str.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = str.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = str.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = str.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = str.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = str.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = str.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i59 = (iCharAt3 * 2) + iCharAt4;
            int i60 = iCharAt7;
            i2 = iCharAt5;
            i3 = i60;
            i4 = iCharAt3;
            i32 = i56;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i59;
            i7 = iCharAt9;
        }
        Unsafe unsafe = q;
        Class<?> cls = c2008Sm1.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i61 = i7 + i3;
        int i62 = i61;
        int i63 = i7;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = str.charAt(i32);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                    length = i17;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i18 = i28;
            } else {
                i17 = length;
                i18 = i70;
            }
            int i74 = iCharAt11 & 255;
            int i75 = iCharAt10;
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            EnumC7678xk1 enumC7678xk1 = EnumC7678xk1.d;
            int[] iArr4 = iArr3;
            Object[] objArr2 = c2008Sm1.c;
            if (i74 >= 51) {
                int i76 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i27 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i27 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i26;
                    }
                    iCharAt12 = i27 | (cCharAt10 << i79);
                    i22 = i26;
                } else {
                    i22 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i74 - 51;
                int i82 = i22;
                if (i81 == 9 || i81 == 17) {
                    i23 = i6 + 1;
                    objArr[((i65 / 3) * 2) + 1] = objArr2[i6];
                } else {
                    if (i81 == 12 && (c2008Sm1.c().equals(enumC7678xk1) || (iCharAt11 & 2048) != 0)) {
                        i23 = i6 + 1;
                        objArr[((i65 / 3) * 2) + 1] = objArr2[i6];
                    }
                    i24 = i80 * 2;
                    obj = objArr2[i24];
                    if (obj instanceof Field) {
                        fieldH2 = (Field) obj;
                    } else {
                        fieldH2 = H(cls, (String) obj);
                        objArr2[i24] = fieldH2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH2);
                    i25 = i24 + 1;
                    obj2 = objArr2[i25];
                    if (obj2 instanceof Field) {
                        fieldH3 = (Field) obj2;
                    } else {
                        fieldH3 = H(cls, (String) obj2);
                        objArr2[i25] = fieldH3;
                    }
                    i19 = i4;
                    i20 = i82;
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i6 = i23;
                i24 = i80 * 2;
                obj = objArr2[i24];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H(cls, (String) obj);
                    objArr2[i24] = fieldH2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldH2);
                i25 = i24 + 1;
                obj2 = objArr2[i25];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H(cls, (String) obj2);
                    objArr2[i25] = fieldH3;
                }
                i19 = i4;
                i20 = i82;
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
            } else {
                int i83 = i6 + 1;
                Field fieldH4 = H(cls, (String) objArr2[i6]);
                i19 = i4;
                if (i74 == 9 || i74 == 17) {
                    objArr[((i65 / 3) * 2) + 1] = fieldH4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i6 += 2;
                        objArr[((i65 / 3) * 2) + 1] = objArr2[i83];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (c2008Sm1.c() == enumC7678xk1 || (iCharAt11 & 2048) != 0) {
                            i6 += 2;
                            objArr[((i65 / 3) * 2) + 1] = objArr2[i83];
                        }
                    } else if (i74 == 50) {
                        int i84 = i63 + 1;
                        iArr[i63] = i65;
                        int i85 = (i65 / 3) * 2;
                        int i86 = i6 + 2;
                        objArr[i85] = objArr2[i83];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i85 + 1] = objArr2[i86];
                            i6 += 3;
                        } else {
                            i6 = i86;
                        }
                        i63 = i84;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                    if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i18;
                        i21 = 0;
                    } else {
                        int i87 = i18 + 1;
                        int iCharAt13 = str.charAt(i18);
                        if (iCharAt13 >= 55296) {
                            int i88 = iCharAt13 & 8191;
                            int i89 = 13;
                            while (true) {
                                i20 = i87 + 1;
                                cCharAt9 = str.charAt(i87);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i88 |= (cCharAt9 & 8191) << i89;
                                i89 += 13;
                                i87 = i20;
                            }
                            iCharAt13 = i88 | (cCharAt9 << i89);
                        } else {
                            i20 = i87;
                        }
                        int i90 = (iCharAt13 / 32) + (i19 * 2);
                        Object obj3 = objArr2[i90];
                        if (obj3 instanceof Field) {
                            fieldH = (Field) obj3;
                        } else {
                            fieldH = H(cls, (String) obj3);
                            objArr2[i90] = fieldH;
                        }
                        int i91 = iCharAt13;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH);
                        i21 = i91 % 32;
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                }
                i6 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                }
                if (i74 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
            }
            int i92 = i65 + 1;
            iArr4[i65] = i75;
            int i93 = i65 + 2;
            int i94 = iObjectFieldOffset2;
            iArr4[i92] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | iObjectFieldOffset;
            i65 += 3;
            iArr4[i93] = (i21 << 20) | i94;
            str = str;
            iArr3 = iArr4;
            length = i17;
            i4 = i19;
            i32 = i20;
            c = 55296;
        }
        return new QZ0<>(iArr3, objArr, i2, i5, c2008Sm1.a, iArr, i7, i61, interfaceC5856p41, fq0, n82, abstractC1737Pa0, interfaceC7835yW0);
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final int C(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(Object obj, long j, FE fe, InterfaceC7989zD1 interfaceC7989zD1, C1423La0 c1423La0) throws C6724tC0.a {
        int iV;
        VB0.c cVarB = this.l.b(j, obj);
        int i = fe.b;
        if ((i & 7) != 3) {
            throw C6724tC0.b();
        }
        do {
            Object objI = interfaceC7989zD1.i();
            fe.b(objI, interfaceC7989zD1, c1423La0);
            interfaceC7989zD1.b(objI);
            cVarB.add(objI);
            CE ce = fe.a;
            if (ce.c() || fe.d != 0) {
                return;
            } else {
                iV = ce.v();
            }
        } while (iV == i);
        fe.d = iV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(Object obj, int i, FE fe, InterfaceC7989zD1 interfaceC7989zD1, C1423La0 c1423La0) throws C6724tC0 {
        int iV;
        VB0.c cVarB = this.l.b(i & 1048575, obj);
        int i2 = fe.b;
        if ((i2 & 7) != 2) {
            throw C6724tC0.b();
        }
        do {
            Object objI = interfaceC7989zD1.i();
            fe.c(objI, interfaceC7989zD1, c1423La0);
            interfaceC7989zD1.b(objI);
            cVarB.add(objI);
            CE ce = fe.a;
            if (ce.c() || fe.d != 0) {
                return;
            } else {
                iV = ce.v();
            }
        } while (iV == i2);
        fe.d = iV;
    }

    public final void F(int i, FE fe, Object obj) throws C6724tC0.a {
        if ((536870912 & i) != 0) {
            fe.w(2);
            C4614j92.o(obj, i & 1048575, fe.a.u());
        } else if (!this.g) {
            C4614j92.o(obj, i & 1048575, fe.e());
        } else {
            fe.w(2);
            C4614j92.o(obj, i & 1048575, fe.a.t());
        }
    }

    public final void G(int i, FE fe, Object obj) throws C6724tC0.a {
        boolean z = (536870912 & i) != 0;
        FQ0 fq0 = this.l;
        if (z) {
            fe.s(fq0.b(i & 1048575, obj), true);
        } else {
            fe.s(fq0.b(i & 1048575, obj), false);
        }
    }

    public final void I(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C4614j92.m(obj, (1 << (i2 >>> 20)) | C4614j92.c.f(j, obj), j);
    }

    public final void J(T t, int i, int i2) {
        C4614j92.m(t, i, this.a[i2 + 2] & 1048575);
    }

    public final void K(Object obj, int i, IZ0 iz0) {
        q.putObject(obj, N(i) & 1048575, iz0);
        I(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Object obj, int i, int i2, IZ0 iz0) {
        q.putObject(obj, N(i2) & 1048575, iz0);
        J(obj, i, i2);
    }

    public final int N(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final void O(T t, InterfaceC5373ml2 interfaceC5373ml2) {
        Map.Entry entry;
        int i;
        int i2;
        int[] iArr;
        boolean z;
        boolean z2;
        QZ0<T> qz0 = this;
        boolean z3 = qz0.f;
        AbstractC1737Pa0<?> abstractC1737Pa0 = qz0.n;
        if (z3) {
            C0571Ac0<T> c0571Ac0C = abstractC1737Pa0.c(t);
            if (c0571Ac0C.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c0571Ac0C.g().next();
            }
        } else {
            entry = null;
        }
        int[] iArr2 = qz0.a;
        int length = iArr2.length;
        Unsafe unsafe = q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iN = qz0.N(i5);
            int i7 = iArr2[i5];
            int iM = M(iN);
            if (iM <= 17) {
                int i8 = iArr2[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(t, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                abstractC1737Pa0.a(entry);
                if (i7 >= 0) {
                    abstractC1737Pa0.j(entry);
                    throw null;
                }
            }
            int i10 = iN & i3;
            int i11 = i;
            long j = i10;
            switch (iM) {
                case 0:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        double d = C4614j92.c.d(j, t);
                        GE ge = ((KE) interfaceC5373ml2).a;
                        ge.getClass();
                        ge.N(i7, Double.doubleToRawLongBits(d));
                    }
                    break;
                case 1:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        float fE = C4614j92.c.e(j, t);
                        GE ge2 = ((KE) interfaceC5373ml2).a;
                        ge2.getClass();
                        ge2.L(i7, Float.floatToRawIntBits(fE));
                    }
                    qz0 = this;
                    break;
                case 2:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.a0(i7, unsafe.getLong(t, j));
                    }
                    qz0 = this;
                    break;
                case 3:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.a0(i7, unsafe.getLong(t, j));
                    }
                    qz0 = this;
                    break;
                case 4:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.P(i7, unsafe.getInt(t, j));
                    }
                    qz0 = this;
                    break;
                case 5:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.N(i7, unsafe.getLong(t, j));
                    }
                    qz0 = this;
                    break;
                case 6:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.L(i7, unsafe.getInt(t, j));
                    }
                    qz0 = this;
                    break;
                case 7:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.H(i7, C4614j92.c.c(j, t));
                    }
                    qz0 = this;
                    break;
                case 8:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof String) {
                            ((KE) interfaceC5373ml2).a.V(i7, (String) object);
                        } else {
                            ((KE) interfaceC5373ml2).a.J(i7, (AbstractC1565Mw) object);
                        }
                    }
                    qz0 = this;
                    break;
                case 9:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.R(i7, (IZ0) unsafe.getObject(t, j), qz0.n(i5));
                    }
                    break;
                case 10:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.J(i7, (AbstractC1565Mw) unsafe.getObject(t, j));
                    }
                    qz0 = this;
                    break;
                case 11:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.Y(i7, unsafe.getInt(t, j));
                    }
                    qz0 = this;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.P(i7, unsafe.getInt(t, j));
                    }
                    qz0 = this;
                    break;
                case 13:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.L(i7, unsafe.getInt(t, j));
                    }
                    qz0 = this;
                    break;
                case 14:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a.N(i7, unsafe.getLong(t, j));
                    }
                    qz0 = this;
                    break;
                case 15:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        int i12 = unsafe.getInt(t, j);
                        ((KE) interfaceC5373ml2).a.Y(i7, (i12 >> 31) ^ (i12 << 1));
                    }
                    qz0 = this;
                    break;
                case 16:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        long j2 = unsafe.getLong(t, j);
                        ((KE) interfaceC5373ml2).a.a0(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    qz0 = this;
                    break;
                case 17:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    if (qz0.p(t, i5, i4, i6, i11)) {
                        ((KE) interfaceC5373ml2).a(i7, unsafe.getObject(t, j), qz0.n(i5));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iArr = iArr2;
                    ID1.o(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 19:
                    iArr = iArr2;
                    ID1.s(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 20:
                    iArr = iArr2;
                    ID1.u(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    iArr = iArr2;
                    ID1.A(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 22:
                    iArr = iArr2;
                    ID1.t(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iArr = iArr2;
                    ID1.r(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iArr = iArr2;
                    ID1.q(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 25:
                    iArr = iArr2;
                    ID1.n(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 26:
                    iArr = iArr2;
                    int i13 = iArr[i5];
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls = ID1.a;
                    if (list != null && !list.isEmpty()) {
                        KE ke = (KE) interfaceC5373ml2;
                        ke.getClass();
                        boolean z4 = list instanceof InterfaceC3983gP0;
                        GE ge3 = ke.a;
                        if (z4) {
                            InterfaceC3983gP0 interfaceC3983gP0 = (InterfaceC3983gP0) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object objC = interfaceC3983gP0.C();
                                if (objC instanceof String) {
                                    ge3.V(i13, (String) objC);
                                } else {
                                    ge3.J(i13, (AbstractC1565Mw) objC);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                ge3.V(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 27:
                    iArr = iArr2;
                    int i16 = iArr[i5];
                    List list2 = (List) unsafe.getObject(t, j);
                    InterfaceC7989zD1 interfaceC7989zD1N = qz0.n(i5);
                    Class<?> cls2 = ID1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        KE ke2 = (KE) interfaceC5373ml2;
                        ke2.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ke2.a.R(i16, (IZ0) list2.get(i17), interfaceC7989zD1N);
                        }
                    }
                    i2 = 1048575;
                    qz0 = this;
                    break;
                case 28:
                    iArr = iArr2;
                    int i18 = iArr[i5];
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = ID1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        KE ke3 = (KE) interfaceC5373ml2;
                        ke3.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ke3.a.J(i18, (AbstractC1565Mw) list3.get(i19));
                        }
                    }
                    i2 = 1048575;
                    break;
                case 29:
                    iArr = iArr2;
                    z = false;
                    ID1.z(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case 30:
                    iArr = iArr2;
                    z = false;
                    ID1.p(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case 31:
                    iArr = iArr2;
                    z = false;
                    ID1.v(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    iArr = iArr2;
                    z = false;
                    ID1.w(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case 33:
                    iArr = iArr2;
                    z = false;
                    ID1.x(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case 34:
                    iArr = iArr2;
                    z = false;
                    ID1.y(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, false);
                    i2 = 1048575;
                    break;
                case 35:
                    iArr = iArr2;
                    z2 = true;
                    ID1.o(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 36:
                    iArr = iArr2;
                    z2 = true;
                    ID1.s(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 37:
                    iArr = iArr2;
                    z2 = true;
                    ID1.u(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 38:
                    iArr = iArr2;
                    z2 = true;
                    ID1.A(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 39:
                    iArr = iArr2;
                    z2 = true;
                    ID1.t(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    iArr = iArr2;
                    z2 = true;
                    ID1.r(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    iArr = iArr2;
                    z2 = true;
                    ID1.q(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 42:
                    iArr = iArr2;
                    z2 = true;
                    ID1.n(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 43:
                    iArr = iArr2;
                    z2 = true;
                    ID1.z(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 44:
                    iArr = iArr2;
                    z2 = true;
                    ID1.p(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 45:
                    iArr = iArr2;
                    z2 = true;
                    ID1.v(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 46:
                    iArr = iArr2;
                    z2 = true;
                    ID1.w(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 47:
                    iArr = iArr2;
                    z2 = true;
                    ID1.x(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 48:
                    iArr = iArr2;
                    ID1.y(iArr[i5], (List) unsafe.getObject(t, j), interfaceC5373ml2, true);
                    i2 = 1048575;
                    break;
                case 49:
                    iArr = iArr2;
                    int i20 = iArr[i5];
                    List list4 = (List) unsafe.getObject(t, j);
                    InterfaceC7989zD1 interfaceC7989zD1N2 = qz0.n(i5);
                    Class<?> cls4 = ID1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        KE ke4 = (KE) interfaceC5373ml2;
                        ke4.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ke4.a(i20, list4.get(i21), interfaceC7989zD1N2);
                        }
                    }
                    i2 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(t, j);
                    if (object2 != null) {
                        Object objM = qz0.m(i5);
                        InterfaceC7835yW0 interfaceC7835yW0 = qz0.o;
                        C6364rW0.a<?, ?> aVarC = interfaceC7835yW0.c(objM);
                        C7415wW0 c7415wW0E = interfaceC7835yW0.e(object2);
                        GE ge4 = ((KE) interfaceC5373ml2).a;
                        ge4.getClass();
                        for (Map.Entry entry2 : c7415wW0E.entrySet()) {
                            ge4.X(i7, 2);
                            ge4.Z(C6364rW0.a(aVarC, entry2.getKey(), entry2.getValue()));
                            C6364rW0.b(ge4, aVarC, entry2.getKey(), entry2.getValue());
                            iArr2 = iArr2;
                        }
                    }
                    iArr = iArr2;
                    i2 = 1048575;
                    break;
                case 51:
                    if (qz0.r(t, i7, i5)) {
                        double dDoubleValue = ((Double) C4614j92.c.h(j, t)).doubleValue();
                        GE ge5 = ((KE) interfaceC5373ml2).a;
                        ge5.getClass();
                        ge5.N(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 52:
                    if (qz0.r(t, i7, i5)) {
                        float fFloatValue = ((Float) C4614j92.c.h(j, t)).floatValue();
                        GE ge6 = ((KE) interfaceC5373ml2).a;
                        ge6.getClass();
                        ge6.L(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 53:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.a0(i7, B(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 54:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.a0(i7, B(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 55:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.P(i7, A(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 56:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.N(i7, B(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 57:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.L(i7, A(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 58:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.H(i7, ((Boolean) C4614j92.c.h(j, t)).booleanValue());
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 59:
                    if (qz0.r(t, i7, i5)) {
                        Object object3 = unsafe.getObject(t, j);
                        if (object3 instanceof String) {
                            ((KE) interfaceC5373ml2).a.V(i7, (String) object3);
                        } else {
                            ((KE) interfaceC5373ml2).a.J(i7, (AbstractC1565Mw) object3);
                        }
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 60:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.R(i7, (IZ0) unsafe.getObject(t, j), qz0.n(i5));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 61:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.J(i7, (AbstractC1565Mw) unsafe.getObject(t, j));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 62:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.Y(i7, A(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 63:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.P(i7, A(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.L(i7, A(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a.N(i7, B(j, t));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 66:
                    if (qz0.r(t, i7, i5)) {
                        int iA = A(j, t);
                        ((KE) interfaceC5373ml2).a.Y(i7, (iA >> 31) ^ (iA << 1));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 67:
                    if (qz0.r(t, i7, i5)) {
                        long jB = B(j, t);
                        ((KE) interfaceC5373ml2).a.a0(i7, (jB << 1) ^ (jB >> 63));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                case 68:
                    if (qz0.r(t, i7, i5)) {
                        ((KE) interfaceC5373ml2).a(i7, unsafe.getObject(t, j), qz0.n(i5));
                    }
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
                default:
                    i2 = i3;
                    i5 = i5;
                    i4 = i4;
                    i6 = i6;
                    iArr = iArr2;
                    break;
            }
            i6 = i6;
            iArr2 = iArr;
            i4 = i4;
            i5 += 3;
            i3 = i2;
        }
        if (entry != null) {
            abstractC1737Pa0.j(entry);
            throw null;
        }
        N82<?, ?> n82 = qz0.m;
        n82.r(n82.g(t), interfaceC5373ml2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.InterfaceC7989zD1
    public final void a(T t, T t2) {
        T t3;
        if (!q(t)) {
            throw new IllegalArgumentException(FK.c(t, "Mutating immutable message: "));
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = ID1.a;
                N82<?, ?> n82 = this.m;
                n82.o(t4, n82.k(n82.g(t4), n82.g(t2)));
                if (this.f) {
                    ID1.k(this.n, t4, t2);
                    return;
                }
                return;
            }
            int iN = N(i);
            long j = 1048575 & iN;
            int i2 = iArr[i];
            switch (M(iN)) {
                case 0:
                    if (!o(i, t2)) {
                        t3 = t;
                    } else {
                        C4614j92.e eVar = C4614j92.c;
                        t3 = t;
                        eVar.l(t3, j, eVar.d(j, t2));
                        I(i, t3);
                    }
                    break;
                case 1:
                    if (o(i, t2)) {
                        C4614j92.e eVar2 = C4614j92.c;
                        eVar2.m(t, j, eVar2.e(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (o(i, t2)) {
                        C4614j92.n(t, j, C4614j92.c.g(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (o(i, t2)) {
                        C4614j92.n(t, j, C4614j92.c.g(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (o(i, t2)) {
                        C4614j92.n(t, j, C4614j92.c.g(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (o(i, t2)) {
                        C4614j92.e eVar3 = C4614j92.c;
                        eVar3.j(t, j, eVar3.c(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (o(i, t2)) {
                        C4614j92.o(t, j, C4614j92.c.h(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    u(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (o(i, t2)) {
                        C4614j92.o(t, j, C4614j92.c.h(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (o(i, t2)) {
                        C4614j92.n(t, j, C4614j92.c.g(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (o(i, t2)) {
                        C4614j92.m(t, C4614j92.c.f(j, t2), j);
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (o(i, t2)) {
                        C4614j92.n(t, j, C4614j92.c.g(j, t2));
                        I(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    u(i, t, t2);
                    t3 = t;
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
                    this.l.a(t, j, t2);
                    t3 = t;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class<?> cls2 = ID1.a;
                    C4614j92.e eVar4 = C4614j92.c;
                    C4614j92.o(t, j, this.o.a(eVar4.h(j, t), eVar4.h(j, t2)));
                    t3 = t;
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
                    if (r(t2, i2, i)) {
                        C4614j92.o(t, j, C4614j92.c.h(j, t2));
                        J(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 60:
                    v(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (r(t2, i2, i)) {
                        C4614j92.o(t, j, C4614j92.c.h(j, t2));
                        J(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 68:
                    v(i, t, t2);
                    t3 = t;
                    break;
                default:
                    t3 = t;
                    break;
            }
            i += 3;
            t = t3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7989zD1
    public final void b(T t) {
        if (q(t)) {
            if (t instanceof AbstractC8097zk0) {
                AbstractC8097zk0 abstractC8097zk0 = (AbstractC8097zk0) t;
                abstractC8097zk0.h(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC8097zk0.memoizedHashCode = 0;
                abstractC8097zk0.n();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iN = N(i);
                long j = 1048575 & iN;
                int iM = M(iN);
                if (iM != 9) {
                    if (iM != 60 && iM != 68) {
                        switch (iM) {
                            case 17:
                                if (o(i, t)) {
                                    n(i).b(q.getObject(t, j));
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
                                this.l.c(j, t);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.o.b(object));
                                }
                                break;
                        }
                    } else if (r(t, iArr[i], i)) {
                        n(i).b(q.getObject(t, j));
                    }
                } else if (o(i, t)) {
                    n(i).b(q.getObject(t, j));
                }
            }
            this.m.j(t);
            if (this.f) {
                this.n.f(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [zD1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [zD1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [zD1] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [zD1] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // defpackage.InterfaceC7989zD1
    public final boolean c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.i) {
            int i6 = this.h[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iN = N(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = q.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iN) == 0 || p(t, i6, i, i2, i10)) {
                int iM = M(iN);
                if (iM == 9 || iM == 17) {
                    if (p(t, i6, i, i2, i10)) {
                        if (!n(i6).c(C4614j92.c.h(iN & 1048575, t))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM != 27) {
                        if (iM == 60 || iM == 68) {
                            if (r(t, i7, i6)) {
                                if (!n(i6).c(C4614j92.c.h(iN & 1048575, t))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM != 49) {
                            if (iM != 50) {
                                continue;
                            } else {
                                Object objH = C4614j92.c.h(iN & 1048575, t);
                                InterfaceC7835yW0 interfaceC7835yW0 = this.o;
                                C7415wW0 c7415wW0E = interfaceC7835yW0.e(objH);
                                if (!c7415wW0E.isEmpty() && interfaceC7835yW0.c(m(i6)).b.d == EnumC7885yj2.MESSAGE) {
                                    ?? A = 0;
                                    for (Object obj : c7415wW0E.values()) {
                                        A = A;
                                        if (A == 0) {
                                            A = C0674Bk1.c.a(obj.getClass());
                                        }
                                        if (!A.c(obj)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) C4614j92.c.h(iN & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? N = n(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (N.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        if (this.f) {
            this.n.c(t).e();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.InterfaceC7989zD1
    public final boolean d(AbstractC8097zk0 abstractC8097zk0, AbstractC8097zk0 abstractC8097zk1) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iN = N(i);
                long j = iN & 1048575;
                switch (M(iN)) {
                    case 0:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar = C4614j92.c;
                            if (Double.doubleToLongBits(eVar.d(j, abstractC8097zk0)) != Double.doubleToLongBits(eVar.d(j, abstractC8097zk1))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar2 = C4614j92.c;
                            if (Float.floatToIntBits(eVar2.e(j, abstractC8097zk0)) != Float.floatToIntBits(eVar2.e(j, abstractC8097zk1))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar3 = C4614j92.c;
                            if (eVar3.g(j, abstractC8097zk0) != eVar3.g(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar4 = C4614j92.c;
                            if (eVar4.g(j, abstractC8097zk0) != eVar4.g(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar5 = C4614j92.c;
                            if (eVar5.f(j, abstractC8097zk0) != eVar5.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar6 = C4614j92.c;
                            if (eVar6.g(j, abstractC8097zk0) != eVar6.g(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar7 = C4614j92.c;
                            if (eVar7.f(j, abstractC8097zk0) != eVar7.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar8 = C4614j92.c;
                            if (eVar8.c(j, abstractC8097zk0) != eVar8.c(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar9 = C4614j92.c;
                            if (!ID1.l(eVar9.h(j, abstractC8097zk0), eVar9.h(j, abstractC8097zk1))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar10 = C4614j92.c;
                            if (!ID1.l(eVar10.h(j, abstractC8097zk0), eVar10.h(j, abstractC8097zk1))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar11 = C4614j92.c;
                            if (!ID1.l(eVar11.h(j, abstractC8097zk0), eVar11.h(j, abstractC8097zk1))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar12 = C4614j92.c;
                            if (eVar12.f(j, abstractC8097zk0) != eVar12.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar13 = C4614j92.c;
                            if (eVar13.f(j, abstractC8097zk0) != eVar13.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar14 = C4614j92.c;
                            if (eVar14.f(j, abstractC8097zk0) != eVar14.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar15 = C4614j92.c;
                            if (eVar15.g(j, abstractC8097zk0) != eVar15.g(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar16 = C4614j92.c;
                            if (eVar16.f(j, abstractC8097zk0) != eVar16.f(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar17 = C4614j92.c;
                            if (eVar17.g(j, abstractC8097zk0) != eVar17.g(j, abstractC8097zk1)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(abstractC8097zk0, abstractC8097zk1, i)) {
                            zL = false;
                        } else {
                            C4614j92.e eVar18 = C4614j92.c;
                            if (!ID1.l(eVar18.h(j, abstractC8097zk0), eVar18.h(j, abstractC8097zk1))) {
                                zL = false;
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
                        C4614j92.e eVar19 = C4614j92.c;
                        zL = ID1.l(eVar19.h(j, abstractC8097zk0), eVar19.h(j, abstractC8097zk1));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        C4614j92.e eVar20 = C4614j92.c;
                        zL = ID1.l(eVar20.h(j, abstractC8097zk0), eVar20.h(j, abstractC8097zk1));
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
                        C4614j92.e eVar21 = C4614j92.c;
                        if (eVar21.f(j2, abstractC8097zk0) != eVar21.f(j2, abstractC8097zk1) || !ID1.l(eVar21.h(j, abstractC8097zk0), eVar21.h(j, abstractC8097zk1))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                N82<?, ?> n82 = this.m;
                if (n82.g(abstractC8097zk0).equals(n82.g(abstractC8097zk1))) {
                    if (!this.f) {
                        return true;
                    }
                    AbstractC1737Pa0<?> abstractC1737Pa0 = this.n;
                    return abstractC1737Pa0.c(abstractC8097zk0).equals(abstractC1737Pa0.c(abstractC8097zk1));
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void e(Object obj, FE fe, C1423La0 c1423La0) {
        c1423La0.getClass();
        if (!q(obj)) {
            throw new IllegalArgumentException(FK.c(obj, "Mutating immutable message: "));
        }
        s(this.m, this.n, obj, fe, c1423La0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7989zD1
    public final int f(AbstractC8097zk0 abstractC8097zk0) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iN = N(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iN;
            int i6 = 1237;
            int iHashCode = 37;
            switch (M(iN)) {
                case 0:
                    i = i3 * 53;
                    iB = VB0.b(Double.doubleToLongBits(C4614j92.c.d(j, abstractC8097zk0)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(C4614j92.c.e(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = VB0.b(C4614j92.c.g(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = VB0.b(C4614j92.c.g(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = VB0.b(C4614j92.c.g(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = C4614j92.c.c(j, abstractC8097zk0);
                    Charset charset = VB0.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) C4614j92.c.h(j, abstractC8097zk0)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = C4614j92.c.h(j, abstractC8097zk0);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = VB0.b(C4614j92.c.g(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = C4614j92.c.f(j, abstractC8097zk0);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = VB0.b(C4614j92.c.g(j, abstractC8097zk0));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = C4614j92.c.h(j, abstractC8097zk0);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                    i3 = iB + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(Double.doubleToLongBits(((Double) C4614j92.c.h(j, abstractC8097zk0)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) C4614j92.c.h(j, abstractC8097zk0)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(B(j, abstractC8097zk0));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(B(j, abstractC8097zk0));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(B(j, abstractC8097zk0));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) C4614j92.c.h(j, abstractC8097zk0)).booleanValue();
                        Charset charset2 = VB0.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = ((String) C4614j92.c.h(j, abstractC8097zk0)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(B(j, abstractC8097zk0));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = A(j, abstractC8097zk0);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = VB0.b(B(j, abstractC8097zk0));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (r(abstractC8097zk0, i5, i4)) {
                        i = i3 * 53;
                        iB = C4614j92.c.h(j, abstractC8097zk0).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.m.g(abstractC8097zk0).hashCode() + (i3 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        return this.n.c(abstractC8097zk0).a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:140:0x037d A[PHI: r18
      0x037d: PHI (r18v47 int) = 
      (r18v30 int)
      (r18v31 int)
      (r18v32 int)
      (r18v36 int)
      (r18v38 int)
      (r18v39 int)
      (r18v40 int)
      (r18v44 int)
      (r18v48 int)
     binds: [B:214:0x053d, B:210:0x0521, B:206:0x0505, B:178:0x0474, B:160:0x0404, B:156:0x03ea, B:152:0x03d0, B:145:0x039a, B:139:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC7989zD1
    public final int g(F0 f0) {
        int i;
        int i2;
        int iC;
        int iC2;
        int iC3;
        int iE;
        int iC4;
        int iE2;
        int iC5;
        int iC6;
        int iW;
        int iC7;
        int size;
        int i3;
        int iC8;
        int iC9;
        int size2;
        int iC10;
        int iD;
        int iF;
        int iD2;
        int iC11;
        int iC12;
        int iC13;
        int iE3;
        int iC14;
        int iE4;
        QZ0 qz0 = this;
        F0 f1 = f0;
        int i4 = 1;
        Unsafe unsafe = q;
        int i5 = 0;
        int i6 = 0;
        int iW2 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = qz0.a;
            if (i5 >= iArr.length) {
                N82<?, ?> n82 = qz0.m;
                int iH = n82.h(n82.g(f1)) + iW2;
                if (!qz0.f) {
                    return iH;
                }
                C2706aN1 c2706aN1 = qz0.n.c(f1).a;
                int size3 = c2706aN1.d.size();
                int iC15 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    Map.Entry<C0571Ac0.a<Object>, Object> entryD = c2706aN1.d(i8);
                    iC15 += C0571Ac0.c(entryD.getKey(), entryD.getValue());
                }
                for (Map.Entry entry : c2706aN1.e()) {
                    iC15 += C0571Ac0.c((C0571Ac0.a) entry.getKey(), entry.getValue());
                }
                return iH + iC15;
            }
            int iN = qz0.N(i5);
            int iM = M(iN);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & 1048575;
            if (iM <= 17) {
                if (i11 != i7) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(f1, i11);
                    i7 = i11;
                }
                i = i4 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iN & 1048575;
            if (iM >= EnumC1195Ic0.e.d) {
                int i12 = EnumC1195Ic0.g.d;
            }
            switch (iM) {
                case 0:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC = GE.C(i9) + 8;
                        iW2 += iC;
                    }
                    break;
                case 1:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC2 = GE.C(i9);
                        iC6 = iC2 + 4;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 2:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        long j2 = unsafe.getLong(f1, j);
                        iC3 = GE.C(i9);
                        iE = GE.E(j2);
                        iW2 += iE + iC3;
                    }
                    qz0 = this;
                    break;
                case 3:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        long j3 = unsafe.getLong(f1, j);
                        iC3 = GE.C(i9);
                        iE = GE.E(j3);
                        iW2 += iE + iC3;
                    }
                    qz0 = this;
                    break;
                case 4:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        int i13 = unsafe.getInt(f1, j);
                        iC4 = GE.C(i9);
                        iE2 = GE.E(i13);
                        iW = iE2 + iC4;
                        iW2 += iW;
                    }
                    qz0 = this;
                    break;
                case 5:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC5 = GE.C(i9);
                        iC6 = iC5 + 8;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 6:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC2 = GE.C(i9);
                        iC6 = iC2 + 4;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 7:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC6 = GE.C(i9) + 1;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 8:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        Object object = unsafe.getObject(f1, j);
                        iW2 = (object instanceof AbstractC1565Mw ? GE.w(i9, (AbstractC1565Mw) object) : GE.B((String) object) + GE.C(i9)) + iW2;
                    }
                    qz0 = this;
                    break;
                case 9:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        Object object2 = unsafe.getObject(f1, j);
                        InterfaceC7989zD1 interfaceC7989zD1N = qz0.n(i5);
                        Class<?> cls = ID1.a;
                        if (object2 instanceof C5921pO0) {
                            iC = GE.y((C5921pO0) object2) + GE.C(i9);
                        } else {
                            int iC16 = GE.C(i9);
                            int iF2 = ((F0) ((IZ0) object2)).f(interfaceC7989zD1N);
                            iC = GE.D(iF2) + iF2 + iC16;
                        }
                        iW2 += iC;
                    }
                    break;
                case 10:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iW = GE.w(i9, (AbstractC1565Mw) unsafe.getObject(f1, j));
                        iW2 += iW;
                    }
                    qz0 = this;
                    break;
                case 11:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        int i14 = unsafe.getInt(f1, j);
                        iC4 = GE.C(i9);
                        iE2 = GE.D(i14);
                        iW = iE2 + iC4;
                        iW2 += iW;
                    }
                    qz0 = this;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        int i15 = unsafe.getInt(f1, j);
                        iC4 = GE.C(i9);
                        iE2 = GE.E(i15);
                        iW = iE2 + iC4;
                        iW2 += iW;
                    }
                    qz0 = this;
                    break;
                case 13:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC2 = GE.C(i9);
                        iC6 = iC2 + 4;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 14:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC5 = GE.C(i9);
                        iC6 = iC5 + 8;
                        iW2 += iC6;
                    }
                    qz0 = this;
                    f1 = f0;
                    break;
                case 15:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        int i16 = unsafe.getInt(f1, j);
                        iC4 = GE.C(i9);
                        iE2 = GE.z(i16);
                        iW = iE2 + iC4;
                        iW2 += iW;
                    }
                    qz0 = this;
                    break;
                case 16:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        long j4 = unsafe.getLong(f1, j);
                        iC3 = GE.C(i9);
                        iE = GE.A(j4);
                        iW2 += iE + iC3;
                    }
                    qz0 = this;
                    break;
                case 17:
                    i2 = i4;
                    if (qz0.p(f1, i5, i7, i6, i)) {
                        iC = ((F0) ((IZ0) unsafe.getObject(f1, j))).f(qz0.n(i5)) + (GE.C(i9) * 2);
                        iW2 += iC;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    i2 = i4;
                    iC = ID1.c(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case 19:
                    i2 = i4;
                    iC = ID1.b(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case 20:
                    i2 = i4;
                    List list = (List) unsafe.getObject(f1, j);
                    Class<?> cls2 = ID1.a;
                    if (list.size() == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = (GE.C(i9) * list.size()) + ID1.e(list);
                    }
                    iW2 += iC7;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    i2 = i4;
                    List list2 = (List) unsafe.getObject(f1, j);
                    Class<?> cls3 = ID1.a;
                    size = list2.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.i(list2);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case 22:
                    i2 = i4;
                    List list3 = (List) unsafe.getObject(f1, j);
                    Class<?> cls4 = ID1.a;
                    size = list3.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.d(list3);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i2 = i4;
                    iC = ID1.c(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    i2 = i4;
                    iC = ID1.b(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case 25:
                    i2 = i4;
                    List list4 = (List) unsafe.getObject(f1, j);
                    Class<?> cls5 = ID1.a;
                    int size4 = list4.size();
                    iW2 += size4 == 0 ? 0 : (GE.C(i9) + 1) * size4;
                    break;
                case 26:
                    i2 = i4;
                    List list5 = (List) unsafe.getObject(f1, j);
                    Class<?> cls6 = ID1.a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = GE.C(i9) * size5;
                        if (list5 instanceof InterfaceC3983gP0) {
                            InterfaceC3983gP0 interfaceC3983gP0 = (InterfaceC3983gP0) list5;
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object objC = interfaceC3983gP0.C();
                                iC7 = (objC instanceof AbstractC1565Mw ? GE.x((AbstractC1565Mw) objC) : GE.B((String) objC)) + iC7;
                            }
                        } else {
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object obj = list5.get(i18);
                                iC7 = (obj instanceof AbstractC1565Mw ? GE.x((AbstractC1565Mw) obj) : GE.B((String) obj)) + iC7;
                            }
                        }
                    }
                    iW2 += iC7;
                    break;
                case 27:
                    i2 = i4;
                    List list6 = (List) unsafe.getObject(f1, j);
                    InterfaceC7989zD1 interfaceC7989zD1N2 = qz0.n(i5);
                    Class<?> cls7 = ID1.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iC9 = 0;
                    } else {
                        iC9 = GE.C(i9) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            Object obj2 = list6.get(i19);
                            if (obj2 instanceof C5921pO0) {
                                iC9 = GE.y((C5921pO0) obj2) + iC9;
                            } else {
                                int iF3 = ((F0) ((IZ0) obj2)).f(interfaceC7989zD1N2);
                                iC9 = GE.D(iF3) + iF3 + iC9;
                            }
                        }
                    }
                    iW2 += iC9;
                    break;
                case 28:
                    i2 = i4;
                    List list7 = (List) unsafe.getObject(f1, j);
                    Class<?> cls8 = ID1.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = GE.C(i9) * size7;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            iC7 += GE.x((AbstractC1565Mw) list7.get(i20));
                        }
                    }
                    iW2 += iC7;
                    break;
                case 29:
                    i2 = i4;
                    List list8 = (List) unsafe.getObject(f1, j);
                    Class<?> cls9 = ID1.a;
                    size = list8.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.h(list8);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case 30:
                    i2 = i4;
                    List list9 = (List) unsafe.getObject(f1, j);
                    Class<?> cls10 = ID1.a;
                    size = list9.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.a(list9);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case 31:
                    i2 = i4;
                    iC = ID1.b(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    i2 = i4;
                    iC = ID1.c(i9, (List) unsafe.getObject(f1, j));
                    iW2 += iC;
                    break;
                case 33:
                    i2 = i4;
                    List list10 = (List) unsafe.getObject(f1, j);
                    Class<?> cls11 = ID1.a;
                    size = list10.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.f(list10);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case 34:
                    i2 = i4;
                    List list11 = (List) unsafe.getObject(f1, j);
                    Class<?> cls12 = ID1.a;
                    size = list11.size();
                    if (size == 0) {
                        iC7 = 0;
                    } else {
                        i3 = ID1.g(list11);
                        iC8 = GE.C(i9);
                        iC7 = (iC8 * size) + i3;
                    }
                    iW2 += iC7;
                    break;
                case 35:
                    i2 = i4;
                    List list12 = (List) unsafe.getObject(f1, j);
                    Class<?> cls13 = ID1.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 36:
                    i2 = i4;
                    List list13 = (List) unsafe.getObject(f1, j);
                    Class<?> cls14 = ID1.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 37:
                    i2 = i4;
                    size2 = ID1.e((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 38:
                    i2 = i4;
                    size2 = ID1.i((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 39:
                    i2 = i4;
                    size2 = ID1.d((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i2 = i4;
                    List list14 = (List) unsafe.getObject(f1, j);
                    Class<?> cls15 = ID1.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i2 = i4;
                    List list15 = (List) unsafe.getObject(f1, j);
                    Class<?> cls16 = ID1.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 42:
                    i2 = i4;
                    List list16 = (List) unsafe.getObject(f1, j);
                    Class<?> cls17 = ID1.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 43:
                    i2 = i4;
                    size2 = ID1.h((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 44:
                    i2 = i4;
                    size2 = ID1.a((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 45:
                    i2 = i4;
                    List list17 = (List) unsafe.getObject(f1, j);
                    Class<?> cls18 = ID1.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 46:
                    i2 = i4;
                    List list18 = (List) unsafe.getObject(f1, j);
                    Class<?> cls19 = ID1.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 47:
                    i2 = i4;
                    size2 = ID1.f((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 48:
                    i2 = i4;
                    size2 = ID1.g((List) unsafe.getObject(f1, j));
                    if (size2 > 0) {
                        iC10 = GE.C(i9);
                        iD = GE.D(size2);
                        iW2 += iD + iC10 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(f1, j);
                    InterfaceC7989zD1 interfaceC7989zD1N3 = qz0.n(i5);
                    Class<?> cls20 = ID1.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iF = 0;
                    } else {
                        int i21 = 0;
                        iF = 0;
                        while (i21 < size8) {
                            iF += ((F0) ((IZ0) list19.get(i21))).f(interfaceC7989zD1N3) + (GE.C(i9) * 2);
                            i21++;
                            i4 = i4;
                        }
                    }
                    i2 = i4;
                    iW2 += iF;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    iD2 = qz0.o.d(i9, unsafe.getObject(f1, j), qz0.m(i5));
                    iW2 += iD2;
                    i2 = i4;
                    break;
                case 51:
                    if (qz0.r(f1, i9, i5)) {
                        iC11 = GE.C(i9);
                        iD2 = iC11 + 8;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 52:
                    if (qz0.r(f1, i9, i5)) {
                        iC12 = GE.C(i9);
                        iD2 = iC12 + 4;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 53:
                    if (qz0.r(f1, i9, i5)) {
                        long jB = B(j, f1);
                        iC13 = GE.C(i9);
                        iE3 = GE.E(jB);
                        iW2 += iE3 + iC13;
                    }
                    i2 = i4;
                    break;
                case 54:
                    if (qz0.r(f1, i9, i5)) {
                        long jB2 = B(j, f1);
                        iC13 = GE.C(i9);
                        iE3 = GE.E(jB2);
                        iW2 += iE3 + iC13;
                    }
                    i2 = i4;
                    break;
                case 55:
                    if (qz0.r(f1, i9, i5)) {
                        int iA = A(j, f1);
                        iC14 = GE.C(i9);
                        iE4 = GE.E(iA);
                        iD2 = iE4 + iC14;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 56:
                    if (qz0.r(f1, i9, i5)) {
                        iC11 = GE.C(i9);
                        iD2 = iC11 + 8;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 57:
                    if (qz0.r(f1, i9, i5)) {
                        iC12 = GE.C(i9);
                        iD2 = iC12 + 4;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 58:
                    if (qz0.r(f1, i9, i5)) {
                        iD2 = GE.C(i9) + i4;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 59:
                    if (qz0.r(f1, i9, i5)) {
                        Object object3 = unsafe.getObject(f1, j);
                        iW2 = (object3 instanceof AbstractC1565Mw ? GE.w(i9, (AbstractC1565Mw) object3) : GE.B((String) object3) + GE.C(i9)) + iW2;
                    }
                    i2 = i4;
                    break;
                case 60:
                    if (qz0.r(f1, i9, i5)) {
                        Object object4 = unsafe.getObject(f1, j);
                        InterfaceC7989zD1 interfaceC7989zD1N4 = qz0.n(i5);
                        Class<?> cls21 = ID1.a;
                        if (object4 instanceof C5921pO0) {
                            iC14 = GE.C(i9);
                            iE4 = GE.y((C5921pO0) object4);
                            iD2 = iE4 + iC14;
                        } else {
                            int iC17 = GE.C(i9);
                            int iF4 = ((F0) ((IZ0) object4)).f(interfaceC7989zD1N4);
                            iD2 = GE.D(iF4) + iF4 + iC17;
                        }
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 61:
                    if (qz0.r(f1, i9, i5)) {
                        iD2 = GE.w(i9, (AbstractC1565Mw) unsafe.getObject(f1, j));
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 62:
                    if (qz0.r(f1, i9, i5)) {
                        int iA2 = A(j, f1);
                        iC14 = GE.C(i9);
                        iE4 = GE.D(iA2);
                        iD2 = iE4 + iC14;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 63:
                    if (qz0.r(f1, i9, i5)) {
                        int iA3 = A(j, f1);
                        iC14 = GE.C(i9);
                        iE4 = GE.E(iA3);
                        iD2 = iE4 + iC14;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (qz0.r(f1, i9, i5)) {
                        iC12 = GE.C(i9);
                        iD2 = iC12 + 4;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (qz0.r(f1, i9, i5)) {
                        iC11 = GE.C(i9);
                        iD2 = iC11 + 8;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 66:
                    if (qz0.r(f1, i9, i5)) {
                        int iA4 = A(j, f1);
                        iC14 = GE.C(i9);
                        iE4 = GE.z(iA4);
                        iD2 = iE4 + iC14;
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                case 67:
                    if (qz0.r(f1, i9, i5)) {
                        long jB3 = B(j, f1);
                        iC13 = GE.C(i9);
                        iE3 = GE.A(jB3);
                        iW2 += iE3 + iC13;
                    }
                    i2 = i4;
                    break;
                case 68:
                    if (qz0.r(f1, i9, i5)) {
                        iD2 = ((F0) ((IZ0) unsafe.getObject(f1, j))).f(qz0.n(i5)) + (GE.C(i9) * 2);
                        iW2 += iD2;
                    }
                    i2 = i4;
                    break;
                default:
                    i2 = i4;
                    break;
            }
            i5 += 3;
            i4 = i2;
        }
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void h(T t, InterfaceC5373ml2 interfaceC5373ml2) {
        interfaceC5373ml2.getClass();
        O(t, interfaceC5373ml2);
    }

    @Override // defpackage.InterfaceC7989zD1
    public final T i() {
        return (T) this.k.a(this.e);
    }

    public final boolean j(AbstractC8097zk0 abstractC8097zk0, AbstractC8097zk0 abstractC8097zk1, int i) {
        return o(i, abstractC8097zk0) == o(i, abstractC8097zk1);
    }

    public final <UT, UB> UB k(Object obj, int i, UB ub, N82<UT, UB> n82, Object obj2) {
        VB0.b bVarL;
        int i2 = this.a[i];
        Object objH = C4614j92.c.h(N(i) & 1048575, obj);
        if (objH == null || (bVarL = l(i)) == null) {
            return ub;
        }
        InterfaceC7835yW0 interfaceC7835yW0 = this.o;
        C7415wW0 c7415wW0G = interfaceC7835yW0.g(objH);
        C6364rW0.a<?, ?> aVarC = interfaceC7835yW0.c(m(i));
        Iterator it = c7415wW0G.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!bVarL.a()) {
                if (ub == null) {
                    ub = (UB) n82.f(obj2);
                }
                int iA = C6364rW0.a(aVarC, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = GE.f;
                GE.b bVar = new GE.b(iA, bArr);
                try {
                    C6364rW0.b(bVar, aVarC, entry.getKey(), entry.getValue());
                    if (bVar.i - bVar.j != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    n82.d(ub, i2, new AbstractC1565Mw.f(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final VB0.b l(int i) {
        return (VB0.b) this.b[((i / 3) * 2) + 1];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final InterfaceC7989zD1 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        InterfaceC7989zD1 interfaceC7989zD1 = (InterfaceC7989zD1) objArr[i2];
        if (interfaceC7989zD1 != null) {
            return interfaceC7989zD1;
        }
        InterfaceC7989zD1<T> interfaceC7989zD1A = C0674Bk1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC7989zD1A;
        return interfaceC7989zD1A;
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iN = N(i);
            long j2 = iN & 1048575;
            switch (M(iN)) {
                case 0:
                    if (Double.doubleToRawLongBits(C4614j92.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C4614j92.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C4614j92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C4614j92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C4614j92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C4614j92.c.c(j2, obj);
                case 8:
                    Object objH = C4614j92.c.h(j2, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof AbstractC1565Mw) {
                        return !AbstractC1565Mw.e.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C4614j92.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC1565Mw.e.equals(C4614j92.c.h(j2, obj));
                case 11:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C4614j92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C4614j92.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C4614j92.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C4614j92.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C4614j92.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean p(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return o(i, t);
        }
        return (i3 & i4) != 0;
    }

    public final boolean r(T t, int i, int i2) {
        return C4614j92.c.f((long) (this.a[i2 + 2] & 1048575), t) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void s(defpackage.N82 r19, defpackage.AbstractC1737Pa0 r20, java.lang.Object r21, defpackage.FE r22, defpackage.C1423La0 r23) {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QZ0.s(N82, Pa0, java.lang.Object, FE, La0):void");
    }

    public final void t(Object obj, int i, Object obj2, C1423La0 c1423La0, FE fe) throws C6724tC0.a {
        long jN = N(i) & 1048575;
        Object objH = C4614j92.c.h(jN, obj);
        InterfaceC7835yW0 interfaceC7835yW0 = this.o;
        if (objH == null) {
            objH = interfaceC7835yW0.f();
            C4614j92.o(obj, jN, objH);
        } else if (interfaceC7835yW0.h(objH)) {
            C7415wW0 c7415wW0F = interfaceC7835yW0.f();
            interfaceC7835yW0.a(c7415wW0F, objH);
            C4614j92.o(obj, jN, c7415wW0F);
            objH = c7415wW0F;
        }
        C7415wW0 c7415wW0G = interfaceC7835yW0.g(objH);
        C6364rW0.a<?, ?> aVarC = interfaceC7835yW0.c(obj2);
        fe.w(2);
        CE ce = fe.a;
        int iF = ce.f(ce.w());
        aVarC.getClass();
        Object objI = "";
        C1364Kg1 c1364Kg1 = aVarC.c;
        Object objI2 = c1364Kg1;
        while (true) {
            try {
                int iA = fe.a();
                if (iA == Integer.MAX_VALUE || ce.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = fe.i(aVarC.a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!fe.x()) {
                            throw new C6724tC0("Unable to parse map entry.");
                        }
                    } catch (C6724tC0.a unused) {
                        if (!fe.x()) {
                            throw new C6724tC0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = fe.i(aVarC.b, c1364Kg1.getClass(), c1423La0);
                }
            } catch (Throwable th) {
                ce.e(iF);
                throw th;
            }
        }
        c7415wW0G.put(objI, objI2);
        ce.e(iF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            InterfaceC7989zD1 interfaceC7989zD1N = n(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object objI = interfaceC7989zD1N.i();
                    interfaceC7989zD1N.a(objI, object);
                    unsafe.putObject(obj, jN, objI);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                I(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!q(object2)) {
                Object objI2 = interfaceC7989zD1N.i();
                interfaceC7989zD1N.a(objI2, object2);
                unsafe.putObject(obj, jN, objI2);
                object2 = objI2;
            }
            interfaceC7989zD1N.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(obj2, i2, i)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC7989zD1 interfaceC7989zD1N = n(i);
            if (!r(obj, i2, i)) {
                if (q(object)) {
                    Object objI = interfaceC7989zD1N.i();
                    interfaceC7989zD1N.a(objI, object);
                    unsafe.putObject(obj, jN, objI);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                J(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!q(object2)) {
                Object objI2 = interfaceC7989zD1N.i();
                interfaceC7989zD1N.a(objI2, object2);
                unsafe.putObject(obj, jN, objI2);
                object2 = objI2;
            }
            interfaceC7989zD1N.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(int i, Object obj) {
        InterfaceC7989zD1 interfaceC7989zD1N = n(i);
        long jN = N(i) & 1048575;
        if (!o(i, obj)) {
            return interfaceC7989zD1N.i();
        }
        Object object = q.getObject(obj, jN);
        if (q(object)) {
            return object;
        }
        Object objI = interfaceC7989zD1N.i();
        if (object != null) {
            interfaceC7989zD1N.a(objI, object);
        }
        return objI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(T t, int i, int i2) {
        InterfaceC7989zD1 interfaceC7989zD1N = n(i2);
        if (!r(t, i, i2)) {
            return interfaceC7989zD1N.i();
        }
        Object object = q.getObject(t, N(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objI = interfaceC7989zD1N.i();
        if (object != null) {
            interfaceC7989zD1N.a(objI, object);
        }
        return objI;
    }
}
