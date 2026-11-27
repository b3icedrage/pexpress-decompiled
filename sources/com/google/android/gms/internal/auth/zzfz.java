package com.google.android.gms.internal.auth;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.C5896pG;
import defpackage.V31;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbA = C5896pG.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i2 = this.zzc[i];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i2, i)) {
            Object objZzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i2, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j, objZzf2);
                zzE(obj, i2, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzhi.zzn(obj, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j2 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object objZzf = zzhi.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzG(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i2) {
        return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0371  */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        int i15;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Field fieldZzA;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldZzA2;
        int i24;
        Object obj2;
        Field fieldZzA3;
        int i25;
        char cCharAt10;
        int i26;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strZzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt5 = strZzd.charAt(i);
        if (iCharAt5 >= 55296) {
            int i32 = iCharAt5 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt5 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            iCharAt4 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt6 = strZzd.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                iCharAt6 = i35 | (cCharAt8 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int iCharAt7 = strZzd.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                iCharAt7 = i38 | (cCharAt7 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            iCharAt = strZzd.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            iCharAt2 = strZzd.charAt(i40);
            if (iCharAt2 >= 55296) {
                int i44 = iCharAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                iCharAt2 = i44 | (cCharAt5 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            iCharAt3 = strZzd.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                iCharAt3 = i47 | (cCharAt4 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strZzd.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strZzd.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i6 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i6;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i6;
            }
            int i55 = i52 + 1;
            iCharAt4 = strZzd.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i5 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i5;
                }
                iCharAt4 = i56 | (cCharAt << i57);
                i55 = i5;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = iCharAt6 + iCharAt6 + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i4 = iCharAt6;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i58 = i3 + iCharAt4;
        int i59 = i58;
        int i60 = iCharAt4;
        int i61 = 0;
        int i62 = 0;
        while (i31 < length) {
            int i63 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= c) {
                int i64 = iCharAt10 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i28 = i65 + 1;
                    cCharAt12 = strZzd.charAt(i65);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i64 |= (cCharAt12 & 8191) << i66;
                    i66 += 13;
                    i65 = i28;
                }
                iCharAt10 = i64 | (cCharAt12 << i66);
                i13 = i28;
            } else {
                i13 = i63;
            }
            int i67 = i13 + 1;
            int iCharAt11 = strZzd.charAt(i13);
            if (iCharAt11 >= c) {
                int i68 = iCharAt11 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    cCharAt11 = strZzd.charAt(i69);
                    i14 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt11 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                    length = i14;
                }
                iCharAt11 = i68 | (cCharAt11 << i70);
                i15 = i27;
            } else {
                i14 = length;
                i15 = i67;
            }
            int i71 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i62] = i61;
                i62++;
            }
            if (i71 >= 51) {
                int i72 = i15 + 1;
                int iCharAt12 = strZzd.charAt(i15);
                if (iCharAt12 >= 55296) {
                    int i73 = iCharAt12 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i25 = i74 + 1;
                        cCharAt10 = strZzd.charAt(i74);
                        i26 = i73;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i73 = i26 | ((cCharAt10 & 8191) << i75);
                        i75 += 13;
                        i74 = i25;
                    }
                    iCharAt12 = i26 | (cCharAt10 << i75);
                    i21 = i25;
                } else {
                    i21 = i72;
                }
                int i76 = iCharAt12;
                int i77 = i71 - 51;
                int i78 = i21;
                if (i77 == 9 || i77 == 17) {
                    int i79 = i61 / 3;
                    i22 = i2 + 1;
                    objArr[i79 + i79 + 1] = objArrZze[i2];
                } else {
                    if (i77 == 12 && !z) {
                        int i80 = i61 / 3;
                        i22 = i2 + 1;
                        objArr[i80 + i80 + 1] = objArrZze[i2];
                    }
                    i23 = i76 + i76;
                    obj = objArrZze[i23];
                    if (obj instanceof Field) {
                        fieldZzA2 = (Field) obj;
                    } else {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i23] = fieldZzA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    i24 = i23 + 1;
                    obj2 = objArrZze[i24];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = (Field) obj2;
                    } else {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i24] = fieldZzA3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    i19 = iObjectFieldOffset3;
                    i31 = i78;
                    i18 = 0;
                }
                i2 = i22;
                i23 = i76 + i76;
                obj = objArrZze[i23];
                if (obj instanceof Field) {
                    fieldZzA2 = (Field) obj;
                } else {
                    fieldZzA2 = zzA(cls, (String) obj);
                    objArrZze[i23] = fieldZzA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                i24 = i23 + 1;
                obj2 = objArrZze[i24];
                if (obj2 instanceof Field) {
                    fieldZzA3 = (Field) obj2;
                } else {
                    fieldZzA3 = zzA(cls, (String) obj2);
                    objArrZze[i24] = fieldZzA3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                i19 = iObjectFieldOffset4;
                i31 = i78;
                i18 = 0;
            } else {
                int i81 = i2 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i2]);
                if (i71 == 9 || i71 == 17) {
                    int i82 = i61 / 3;
                    objArr[i82 + i82 + 1] = fieldZzA4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        int i83 = i61 / 3;
                        i2 += 2;
                        objArr[i83 + i83 + 1] = objArrZze[i81];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            int i84 = i61 / 3;
                            i2 += 2;
                            objArr[i84 + i84 + 1] = objArrZze[i81];
                        }
                    } else if (i71 == 50) {
                        int i85 = i60 + 1;
                        iArr[i60] = i61;
                        int i86 = i61 / 3;
                        int i87 = i86 + i86;
                        int i88 = i2 + 2;
                        objArr[i87] = objArrZze[i81];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i87 + 1] = objArrZze[i88];
                            i2 += 3;
                        } else {
                            i2 = i88;
                        }
                        i60 = i85;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) == 4096 || i71 > 17) {
                        i16 = i15;
                        i17 = 0;
                    } else {
                        int i89 = i15 + 1;
                        int iCharAt13 = strZzd.charAt(i15);
                        if (iCharAt13 >= 55296) {
                            int i90 = iCharAt13 & 8191;
                            int i91 = 13;
                            while (true) {
                                i20 = i89 + 1;
                                cCharAt9 = strZzd.charAt(i89);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i90 |= (cCharAt9 & 8191) << i91;
                                i91 += 13;
                                i89 = i20;
                            }
                            iCharAt13 = i90 | (cCharAt9 << i91);
                        } else {
                            i20 = i89;
                        }
                        int i92 = (iCharAt13 / 32) + i4 + i4;
                        Object obj3 = objArrZze[i92];
                        if (obj3 instanceof Field) {
                            fieldZzA = (Field) obj3;
                        } else {
                            fieldZzA = zzA(cls, (String) obj3);
                            objArrZze[i92] = fieldZzA;
                        }
                        i17 = iCharAt13 % 32;
                        int i93 = i20;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                        i16 = i93;
                    }
                    if (i71 >= 18 && i71 <= 49) {
                        iArr[i59] = iObjectFieldOffset;
                        i59++;
                    }
                    i31 = i16;
                    i18 = i17;
                    i19 = iObjectFieldOffset;
                }
                i2 = i81;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i16 = i15;
                    i17 = 0;
                } else {
                    i16 = i15;
                    i17 = 0;
                }
                if (i71 >= 18) {
                    iArr[i59] = iObjectFieldOffset;
                    i59++;
                }
                i31 = i16;
                i18 = i17;
                i19 = iObjectFieldOffset;
            }
            int i94 = i61 + 1;
            iArr4[i61] = iCharAt10;
            int i95 = i61 + 2;
            String str = strZzd;
            iArr4[i94] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i71 << 20) | i19;
            i61 += 3;
            iArr4[i95] = (i18 << 20) | iObjectFieldOffset2;
            iArr3 = iArr4;
            length = i14;
            strZzd = str;
            c = 55296;
        }
        return new zzfz(iArr3, objArr, iCharAt, iCharAt2, zzggVar.zza(), z, false, iArr, iCharAt4, i58, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws zzfa {
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                int i9 = zzdsVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i9)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzez.zzb));
                    iZzj2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZzd = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return iZzd;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzdt.zza(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, zzdsVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                int i10 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i8);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i3, Long.valueOf(i10));
                    return iZzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i10));
                unsafe.putInt(obj, j2, i4);
                return iZzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 == 3) {
                    int iZzc = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i14 = -1;
        int iZzm = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iZzm < i13) {
            int iZzk = iZzm + 1;
            int i19 = bArr2[iZzm];
            if (i19 < 0) {
                iZzk = zzdt.zzk(i19, bArr2, iZzk, zzdsVar);
                i19 = zzdsVar.zza;
            }
            int i20 = iZzk;
            int i21 = i19 >>> 3;
            int i22 = i19 & 7;
            int iZzr = i21 > i15 ? this.zzr(i21, i16 / 3) : this.zzq(i21);
            if (iZzr == i14) {
                unsafe = unsafe2;
                i3 = i19;
                i4 = i14;
                i5 = i21;
                i6 = 0;
                obj = obj2;
            } else {
                int[] iArr = this.zzc;
                int i23 = iArr[iZzr + 1];
                int iZzu = zzu(i23);
                int i24 = i19;
                int i25 = iZzr;
                long j = i23 & 1048575;
                if (iZzu <= 17) {
                    int i26 = iArr[i25 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i18) {
                        int i29 = 1048575;
                        if (i18 != 1048575) {
                            unsafe2.putInt(obj2, i18, i17);
                            i29 = 1048575;
                        }
                        if (i28 != i29) {
                            i17 = unsafe2.getInt(obj2, i28);
                        }
                        i18 = i28;
                    }
                    switch (iZzu) {
                        case 0:
                            i12 = i25;
                            if (i22 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i20)));
                                iZzm = i20 + 8;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 1:
                            i12 = i25;
                            if (i22 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i20)));
                                iZzm = i20 + 4;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i20, zzdsVar);
                                Unsafe unsafe3 = unsafe2;
                                Object obj3 = obj2;
                                unsafe3.putLong(obj3, j, zzdsVar.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i17 |= i27;
                                iZzm = iZzm2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                                i13 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i20, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i17 |= i27;
                                i13 = i2;
                                iZzm = iZzj;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i12 = i25;
                            if (i22 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj4 = obj2;
                                unsafe4.putLong(obj4, j, zzdt.zzn(bArr2, i20));
                                unsafe2 = unsafe4;
                                obj2 = obj4;
                                iZzm = i20 + 8;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i12 = i25;
                            if (i22 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i20));
                                iZzm = i20 + 4;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i20, zzdsVar);
                                zzhi.zzk(obj2, j, zzdsVar.zzb != 0);
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i23) == 0 ? zzdt.zzg(bArr2, i20, zzdsVar) : zzdt.zzh(bArr2, i20, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzd(this.zzy(i12), bArr2, i20, i13, zzdsVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar.zzc));
                                }
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 10:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zza(bArr2, i20, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i20, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i20, zzdsVar);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar.zza));
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i22 != 0) {
                                i12 = i25;
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i20, zzdsVar);
                                Unsafe unsafe5 = unsafe2;
                                Object obj5 = obj2;
                                i12 = i25;
                                unsafe5.putLong(obj5, j, zzei.zzc(zzdsVar.zzb));
                                unsafe2 = unsafe5;
                                obj2 = obj5;
                                i17 |= i27;
                                iZzm = iZzm3;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        default:
                            i12 = i25;
                            obj = obj2;
                            unsafe = unsafe2;
                            i5 = i21;
                            i6 = i12;
                            i4 = -1;
                            i3 = i24 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i6 = i25;
                    if (iZzu != 27) {
                        i7 = i20;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i8 = i17;
                            unsafe = unsafe6;
                            i4 = -1;
                            i10 = i18;
                            int iZzp = this.zzp(obj, bArr, i7, i2, i24 == true ? 1 : 0, i21, i22, i6, i23, iZzu, j, zzdsVar);
                            i9 = i24 == true ? 1 : 0;
                            i11 = i21;
                            if (iZzp != i7) {
                                obj2 = obj;
                                iZzm = iZzp;
                                i16 = i6;
                                i15 = i11;
                                i18 = i10;
                                i14 = i4;
                                i17 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i13 = i2;
                            } else {
                                i20 = iZzp;
                                i5 = i11;
                                i3 = i9;
                            }
                        } else {
                            i8 = i17;
                            unsafe = unsafe6;
                            i4 = -1;
                            i9 = i24 == true ? 1 : 0;
                            i10 = i18;
                            i11 = i21;
                            if (iZzu == 50) {
                                if (i22 == 2) {
                                    int iZzm4 = zzm(obj, bArr, i7, i2, i6, j, zzdsVar);
                                    i6 = i6;
                                    if (iZzm4 != i7) {
                                        this = this;
                                        obj2 = obj;
                                        bArr2 = bArr;
                                        zzdsVar = zzdsVar;
                                        iZzm = iZzm4;
                                        i16 = i6;
                                        i15 = i11;
                                        i18 = i10;
                                        i14 = -1;
                                        i17 = i8;
                                        unsafe2 = unsafe;
                                        i13 = i2;
                                    } else {
                                        i20 = iZzm4;
                                    }
                                } else {
                                    i6 = i6;
                                    i20 = i7;
                                }
                                i5 = i11;
                                i3 = i9;
                            } else {
                                i5 = i11;
                                int iZzn = zzn(obj, bArr, i7, i2, i9 == true ? 1 : 0, i5, i22, i23, iZzu, j, i6, zzdsVar);
                                obj = obj;
                                i3 = i9 == true ? 1 : 0;
                                i6 = i6;
                                if (iZzn != i7) {
                                    i15 = i5;
                                    iZzm = iZzn;
                                    i16 = i6;
                                    obj2 = obj;
                                    i18 = i10;
                                    i14 = i4;
                                    i17 = i8;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i13 = i2;
                                } else {
                                    i20 = iZzn;
                                }
                            }
                        }
                    } else if (i22 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(this.zzy(i6), i24 == true ? 1 : 0, bArr2, i20, i2, zzeyVarZzd, zzdsVar);
                        bArr2 = bArr;
                        zzdsVar = zzdsVar;
                        iZzm = iZze;
                        i16 = i6;
                        unsafe2 = unsafe2;
                        i15 = i21;
                        i14 = -1;
                        obj2 = obj;
                        i13 = i2;
                    } else {
                        i7 = i20;
                        i10 = i18;
                        i8 = i17;
                        unsafe = unsafe2;
                        i11 = i21;
                        i4 = -1;
                        i9 = i24 == true ? 1 : 0;
                        i20 = i7;
                        i5 = i11;
                        i3 = i9;
                    }
                    i18 = i10;
                    i17 = i8;
                }
            }
            int iZzi = zzdt.zzi(i3 == true ? 1 : 0, bArr, i20, i2, zzc(obj), zzdsVar);
            bArr2 = bArr;
            zzdsVar = zzdsVar;
            i15 = i5;
            i16 = i6;
            obj2 = obj;
            i14 = i4;
            unsafe2 = unsafe;
            i13 = i2;
            iZzm = iZzi;
            this = this;
        }
        Object obj6 = obj2;
        Unsafe unsafe7 = unsafe2;
        int i30 = i13;
        int i31 = i18;
        int i32 = i17;
        if (i31 != 1048575) {
            unsafe7.putInt(obj6, i31, i32);
        }
        if (iZzm == i30) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzds zzdsVar) throws zzfa {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j2);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i7) {
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 35:
                if (i5 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    int i8 = zzdsVar.zza + iZzj;
                    while (iZzj < i8) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i8) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int iZzj2 = zzdt.zzj(bArr, i9, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return i9;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i9 = iZzj2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i10 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i10) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i10) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int iZzj4 = zzdt.zzj(bArr, i11, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return i11;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i11 = iZzj4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i, zzdsVar);
                    int i12 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i12) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i12) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                }
                if (i5 == 0) {
                    return zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i;
            case ConnectionResult.API_DISABLED /* 23 */:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i5 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i, zzdsVar);
                    int i13 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i13) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i13) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int iZzj8 = zzdt.zzj(bArr, i14, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return i14;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i14 = iZzj8 + 8;
                    }
                    return i14;
                }
                return i;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 31:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 45:
                if (i5 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i, zzdsVar);
                    int i15 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i15) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i15) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int iZzj10 = zzdt.zzj(bArr, i16, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return i16;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i16 = iZzj10 + 4;
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i, zzdsVar);
                    int i17 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i17) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i17) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i, zzdsVar);
                        int i18 = zzdsVar.zza;
                        if (i18 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i18 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i18, zzez.zzb));
                            iZzj13 += i18;
                        }
                        while (iZzj13 < i2) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i3 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i19 = zzdsVar.zza;
                            if (i19 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i19 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i19, zzez.zzb));
                                iZzj13 += i19;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i, zzdsVar);
                    int i20 = zzdsVar.zza;
                    if (i20 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i20 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i21 = iZzj15 + i20;
                        if (!zzhm.zzd(bArr, iZzj15, i21)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i20, zzez.zzb));
                        iZzj15 = i21;
                    }
                    while (iZzj15 < i2) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i22 = zzdsVar.zza;
                        if (i22 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i22 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i23 = iZzj15 + i22;
                            if (!zzhm.zzd(bArr, iZzj15, i23)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i22, zzez.zzb));
                            iZzj15 = i23;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzdt.zze(zzy(i6), i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i, zzdsVar);
                    int i24 = zzdsVar.zza;
                    if (i24 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i24 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i24 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i24));
                        iZzj17 += i24;
                    }
                    while (iZzj17 < i2) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i25 = zzdsVar.zza;
                        if (i25 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i25 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i25 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i25));
                            iZzj17 += i25;
                        }
                    }
                    return iZzj17;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzl = zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                    }
                    return i;
                }
                iZzl = zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i4, zzeyVar, zzx(i6), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i, zzdsVar);
                    int i26 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i26) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i26) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i2) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i, zzdsVar);
                    int i27 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i27) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i27) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzgh zzghVarZzy = zzy(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i2, i28, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i2) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i3 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i2, i28, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i2 = i / 3;
        return (zzex) this.zzd[i2 + i2 + 1];
    }

    private final zzgh zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgh zzghVar = (zzgh) this.zzd[i3];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int i2;
        int iZzc2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzv = zzv(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i3 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i3 = iZzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i3 = iZzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 5:
                    i = i3 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 7:
                    i = i3 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j));
                    i3 = iZzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i3 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 14:
                    i = i3 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 16:
                    i = i3 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case 51:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i3 = iZzc + i;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i3 = iZzc + i;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i3 = iZzc + i;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzl(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i3 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzb(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.auth.zzds r33) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i2]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j = 1048575 & iZzv;
            int i2 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i, i2, zzdsVar);
        } else {
            zzb(obj, bArr, i, i2, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        List list;
        zzgh zzghVarZzy;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.zzj) {
            int i7 = this.zzi[i5];
            int i8 = this.zzc[i7];
            int iZzv = zzv(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i6 = zzb.getInt(obj, i10);
                }
                i2 = i6;
                i = i10;
            } else {
                i = i4;
                i2 = i6;
            }
            Object obj2 = obj;
            if ((268435456 & iZzv) != 0 && !zzH(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj2, i7, i, i2, i11) && !zzI(obj2, iZzv, zzy(i7))) {
                    return false;
                }
            } else if (iZzu == 27) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghVarZzy = zzy(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzghVarZzy.zzi(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj2, i8, i7) && !zzI(obj2, iZzv, zzy(i7))) {
                    return false;
                }
            } else if (iZzu == 49) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    zzghVarZzy = zzy(i7);
                    while (i3 < list.size()) {
                        if (!zzghVarZzy.zzi(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj2, iZzv & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            obj = obj2;
            i4 = i;
            i6 = i2;
        }
        return true;
    }
}
