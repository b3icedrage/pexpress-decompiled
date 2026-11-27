package com.google.android.gms.internal.gtm;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.C5896pG;
import defpackage.FK;
import defpackage.V31;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzzj<T> implements zzzt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaau.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzzg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzyu zzm;
    private final zzaak zzn;
    private final zzxg zzo;
    private final zzzm zzp;
    private final zzzb zzq;

    private zzzj(int[] iArr, Object[] objArr, int i, int i2, zzzg zzzgVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzzm zzzmVar, zzyu zzyuVar, zzaak zzaakVar, zzxg zzxgVar, zzzb zzzbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzzgVar instanceof zzxv;
        boolean z2 = false;
        if (zzxgVar != null && zzxgVar.zzi(zzzgVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzzmVar;
        this.zzm = zzyuVar;
        this.zzn = zzaakVar;
        this.zzo = zzxgVar;
        this.zzg = zzzgVar;
        this.zzq = zzzbVar;
    }

    private final Object zzA(Object obj, int i) {
        zzzt zzztVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzztVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzztVarZzx.zze();
        if (object != null) {
            zzztVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzzt zzztVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzztVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzztVarZzx.zze();
        if (object != null) {
            zzztVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzzt zzztVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzztVarZzx.zze();
                    zzztVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzztVarZzx.zze();
                zzztVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzztVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzzt zzztVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzztVarZzx.zze();
                    zzztVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzztVarZzx.zze();
                zzztVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzztVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzzs zzzsVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzaau.zzs(obj, j, zzzsVar.zzu());
        } else if (this.zzi) {
            zzaau.zzs(obj, j, zzzsVar.zzt());
        } else {
            zzaau.zzs(obj, j, zzzsVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzaau.zzq(obj, j, (1 << (iZzr >>> 20)) | zzaau.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzaau.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzaau.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzaau.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaau.zzb(obj, j2)) != 0;
            case 2:
                return zzaau.zzd(obj, j2) != 0;
            case 3:
                return zzaau.zzd(obj, j2) != 0;
            case 4:
                return zzaau.zzc(obj, j2) != 0;
            case 5:
                return zzaau.zzd(obj, j2) != 0;
            case 6:
                return zzaau.zzc(obj, j2) != 0;
            case 7:
                return zzaau.zzw(obj, j2);
            case 8:
                Object objZzf = zzaau.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzud) {
                    return !zzud.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaau.zzf(obj, j2) != null;
            case 10:
                return !zzud.zzb.equals(zzaau.zzf(obj, j2));
            case 11:
                return zzaau.zzc(obj, j2) != 0;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return zzaau.zzc(obj, j2) != 0;
            case 13:
                return zzaau.zzc(obj, j2) != 0;
            case 14:
                return zzaau.zzd(obj, j2) != 0;
            case 15:
                return zzaau.zzc(obj, j2) != 0;
            case 16:
                return zzaau.zzd(obj, j2) != 0;
            case 17:
                return zzaau.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzzt zzztVar) {
        return zzztVar.zzk(zzaau.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzxv) {
            return ((zzxv) obj).zzaq();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzaau.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzaau.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzur zzurVar) {
        if (obj instanceof String) {
            zzurVar.zzG(i, (String) obj);
        } else {
            zzurVar.zzd(i, (zzud) obj);
        }
    }

    public static zzaal zzd(Object obj) {
        zzxv zzxvVar = (zzxv) obj;
        zzaal zzaalVar = zzxvVar.zzc;
        if (zzaalVar != zzaal.zzc()) {
            return zzaalVar;
        }
        zzaal zzaalVarZzf = zzaal.zzf();
        zzxvVar.zzc = zzaalVarZzf;
        return zzaalVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ae  */
    public static zzzj zzl(Class cls, zzzd zzzdVar, zzzm zzzmVar, zzyu zzyuVar, zzaak zzaakVar, zzxg zzxgVar, zzzb zzzbVar) {
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
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int iObjectFieldOffset3;
        Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzC2;
        int i27;
        Object obj2;
        Field fieldZzC3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzzdVar instanceof zzzr)) {
            throw null;
        }
        zzzr zzzrVar = (zzzr) zzzdVar;
        String strZzd = zzzrVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            i2 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = iCharAt7;
            i3 = iCharAt5;
            i4 = i60;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = iCharAt9;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzzrVar.zze();
        Class<?> cls2 = zzzrVar.zza().getClass();
        int i61 = i6 + i4;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = 0;
        int i64 = 0;
        int i65 = i6;
        int i66 = i61;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strZzd.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strZzd.charAt(i73);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i17 = i29;
            } else {
                i17 = i71;
            }
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt11 & 2048;
            zzzr zzzrVar2 = zzzrVar;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i80);
                    i24 = i28;
                } else {
                    i24 = i77;
                }
                int i81 = i24;
                int i82 = i75 - 51;
                if (i82 == 9 || i82 == 17) {
                    i25 = i2 + 1;
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = objArrZze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzzrVar2.zzc() == 1 || i76 != 0) {
                            i25 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = objArrZze[i2];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i26] = fieldZzC2;
                    }
                    int i85 = iCharAt10;
                    int i86 = i76;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    strZzd = strZzd;
                    i20 = i81;
                    i76 = i86;
                    i21 = 0;
                    i18 = i85;
                }
                i2 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i26] = fieldZzC2;
                }
                int i87 = iCharAt10;
                int i88 = i76;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                strZzd = strZzd;
                i20 = i81;
                i76 = i88;
                i21 = 0;
                i18 = i87;
            } else {
                i18 = iCharAt10;
                int i89 = i2 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i90 = i63 / 3;
                    objArr[i90 + i90 + 1] = fieldZzC4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i23 = i2 + 2;
                            i22 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i18 = i18;
                            if (zzzrVar2.zzc() == 1 || i76 != 0) {
                                i23 = i2 + 2;
                                int i91 = i63 / 3;
                                objArr[i91 + i91 + 1] = objArrZze[i89];
                                i19 = i23;
                            } else {
                                i19 = i89;
                                i76 = 0;
                            }
                        } else if (i75 == 50) {
                            i19 = i2 + 2;
                            int i92 = i65 + 1;
                            iArr[i65] = i63;
                            int i93 = i63 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArrZze[i89];
                            if (i76 != 0) {
                                objArr[i94 + 1] = objArrZze[i19];
                                i19 = i2 + 3;
                                i65 = i92;
                                i18 = i18;
                            } else {
                                i65 = i92;
                                i76 = 0;
                                i18 = i18;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i95 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i20 = i95 + 1;
                                    cCharAt9 = strZzd.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i20;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i20 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + i7 + i7;
                            Object obj3 = objArrZze[i98];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i98] = fieldZzC;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                        }
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i2 = i19;
                    } else {
                        i22 = 1;
                        i23 = i2 + 2;
                    }
                    int i99 = i63 / 3;
                    objArr[i99 + i99 + i22] = objArrZze[i89];
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    iCharAt11 = iCharAt11;
                    if ((iCharAt11 & 4096) != 0) {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    } else {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i2 = i19;
                }
                i19 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iCharAt11 = iCharAt11;
                if ((iCharAt11 & 4096) != 0) {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                } else {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset;
                i2 = i19;
            }
            int i100 = i63 + 1;
            iArr3[i63] = i18;
            int i101 = i63 + 2;
            iArr3[i100] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset3;
            i63 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i33 = i20;
            zzzrVar = zzzrVar2;
            strZzd = strZzd;
            length = length;
            c = 55296;
        }
        zzzr zzzrVar3 = zzzrVar;
        return new zzzj(iArr3, objArr, i3, i5, zzzrVar3.zza(), zzzrVar3.zzc(), false, iArr, i6, i61, zzzmVar, zzyuVar, zzaakVar, zzxgVar, zzzbVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaau.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaau.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzaau.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzaau.zzf(obj, j)).longValue();
    }

    private final zzxz zzw(int i) {
        int i2 = i / 3;
        return (zzxz) this.zzd[i2 + i2 + 1];
    }

    private final zzzt zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzzt zzztVar = (zzzt) objArr[i3];
        if (zzztVar != null) {
            return zzztVar;
        }
        zzzt zzztVarZzb = zzzp.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzztVarZzb;
        return zzztVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzaak zzaakVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzaau.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:206:0x051a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zza(Object obj) {
        int i;
        int iZzh;
        int iZzD;
        int size;
        int iZzl;
        int iZzD2;
        int iZzd;
        boolean z;
        int iZzb;
        int iZzD3;
        int iZzD4;
        int size2;
        int iZzk;
        int iZzD5;
        int size3;
        int iZzi;
        int iZzD6;
        int iZze;
        int iZzD7;
        int iZzD8;
        int iZzE;
        zzzj<T> zzzjVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iB = 0;
        while (i4 < zzzjVar.zzc.length) {
            int iZzu = zzzjVar.zzu(i4);
            int iZzt = zzt(iZzu);
            int[] iArr = zzzjVar.zzc;
            int i6 = iArr[i4];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & i2;
            if (iZzt <= 17) {
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj2, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzu & i2;
            if (iZzt >= zzxl.zzJ.zza()) {
                zzxl.zzW.zza();
            }
            long j = i9;
            switch (iZzt) {
                case 0:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, zzuq.zzE(unsafe.getLong(obj2, j)), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, zzuq.zzE(unsafe.getLong(obj2, j)), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, zzuq.zzz(unsafe.getInt(obj2, j)), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 1, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzud) {
                            int i11 = zzuq.zzf;
                            int iZzd2 = ((zzud) object).zzd();
                            iB = FK.b(i10, zzuq.zzD(iZzd2) + iZzd2, iB);
                        } else {
                            iB = FK.b(i10, zzuq.zzC((String) object), iB);
                        }
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iZzh = zzzv.zzh(i6, unsafe.getObject(obj2, j), zzzjVar.zzx(i4));
                        iB += iZzh;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        zzud zzudVar = (zzud) unsafe.getObject(obj2, j);
                        int i12 = zzuq.zzf;
                        int iZzd3 = zzudVar.zzd();
                        iB = FK.b(i6 << 3, zzuq.zzD(iZzd3) + iZzd3, iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, zzuq.zzD(unsafe.getInt(obj2, j)), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, zzuq.zzz(unsafe.getInt(obj2, j)), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    zzzjVar = this;
                    obj2 = obj;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        int i13 = unsafe.getInt(obj2, j);
                        iB = FK.b((i13 >> 31) ^ (i13 + i13), zzuq.zzD(i6 << 3), iB);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iB += zzuq.zzE((j2 >> 63) ^ (j2 + j2)) + zzuq.zzD(i6 << 3);
                    }
                    zzzjVar = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (zzzjVar.zzO(obj2, i4, i3, i5, i)) {
                        iB += zzuq.zzy(i6, (zzzg) unsafe.getObject(obj2, j), zzzjVar.zzx(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iZzh = zzzv.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzh;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    iZzh = zzzv.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzh;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i14 = zzzv.zza;
                    if (list.size() == 0) {
                        iZzD = 0;
                    } else {
                        iZzD = (zzuq.zzD(i6 << 3) * list.size()) + zzzv.zzg(list);
                    }
                    iB += iZzD;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i15 = zzzv.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzl = zzzv.zzl(list2);
                        iZzD2 = zzuq.zzD(i6 << 3);
                        iZzD = (iZzD2 * size) + iZzl;
                    }
                    iB += iZzD;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzzv.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzl = zzzv.zzf(list3);
                        iZzD2 = zzuq.zzD(i6 << 3);
                        iZzD = (iZzD2 * size) + iZzl;
                    }
                    iB += iZzD;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iZzd = zzzv.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzd;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z = false;
                    iZzb = zzzv.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzb;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzzv.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzD3 = 0;
                    } else {
                        iZzD3 = (zzuq.zzD(i6 << 3) + 1) * size4;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzzv.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzD3 = 0;
                    } else {
                        boolean z2 = list5 instanceof zzyo;
                        int iZzD9 = zzuq.zzD(i6 << 3) * size5;
                        if (z2) {
                            zzyo zzyoVar = (zzyo) list5;
                            for (int i19 = 0; i19 < size5; i19++) {
                                Object objZzf = zzyoVar.zzf(i19);
                                if (objZzf instanceof zzud) {
                                    int iZzd4 = ((zzud) objZzf).zzd();
                                    iZzD9 = FK.b(iZzd4, iZzd4, iZzD9);
                                } else {
                                    iZzD9 = zzuq.zzC((String) objZzf) + iZzD9;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object obj3 = list5.get(i20);
                                if (obj3 instanceof zzud) {
                                    int iZzd5 = ((zzud) obj3).zzd();
                                    iZzD9 = FK.b(iZzd5, iZzd5, iZzD9);
                                } else {
                                    iZzD9 = zzuq.zzC((String) obj3) + iZzD9;
                                }
                            }
                        }
                        iZzD3 = iZzD9;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzzt zzztVarZzx = zzzjVar.zzx(i4);
                    int i21 = zzzv.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzD3 = 0;
                    } else {
                        int iZzD10 = zzuq.zzD(i6 << 3) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj4 = list6.get(i22);
                            if (obj4 instanceof zzym) {
                                int iZza = ((zzym) obj4).zza();
                                iZzD10 = FK.b(iZza, iZza, iZzD10);
                            } else {
                                iZzD10 = zzuq.zzB((zzzg) obj4, zzztVarZzx) + iZzD10;
                            }
                        }
                        iZzD3 = iZzD10;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i23 = zzzv.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzD4 = zzuq.zzD(i6 << 3) * size7;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzd6 = ((zzud) list7.get(i24)).zzd();
                            iZzD4 = FK.b(iZzd6, iZzd6, iZzD4);
                        }
                    }
                    iB += iZzD4;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzzv.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzzv.zzk(list8);
                        iZzD5 = zzuq.zzD(i6 << 3);
                        iZzd = iZzk + (iZzD5 * size2);
                    }
                    iB += iZzd;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzzv.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzzv.zza(list9);
                        iZzD5 = zzuq.zzD(i6 << 3);
                        iZzd = iZzk + (iZzD5 * size2);
                    }
                    iB += iZzd;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    iZzd = zzzv.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzd;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    z = false;
                    iZzb = zzzv.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzb;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzzv.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        iZzD3 = 0;
                    } else {
                        iZzi = zzzv.zzi(list10);
                        iZzD6 = zzuq.zzD(i6 << 3);
                        iZzD3 = (iZzD6 * size3) + iZzi;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzzv.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        iZzD3 = 0;
                    } else {
                        iZzi = zzzv.zzj(list11);
                        iZzD6 = zzuq.zzD(i6 << 3);
                        iZzD3 = (iZzD6 * size3) + iZzi;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    iZze = zzzv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 36:
                    iZze = zzzv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 37:
                    iZze = zzzv.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    iZze = zzzv.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 39:
                    iZze = zzzv.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    iZze = zzzv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    iZze = zzzv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzzv.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    iZze = zzzv.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 44:
                    iZze = zzzv.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 45:
                    iZze = zzzv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    iZze = zzzv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    iZze = zzzv.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    iZze = zzzv.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzD7 = zzuq.zzD(iZze);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzE = iZzD8 + iZzD7;
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzzt zzztVarZzx2 = zzzjVar.zzx(i4);
                    int i30 = zzzv.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        iZzD3 = 0;
                    } else {
                        int iZzy = 0;
                        for (int i31 = 0; i31 < size8; i31++) {
                            iZzy += zzuq.zzy(i6, (zzzg) list13.get(i31), zzztVarZzx2);
                        }
                        iZzD3 = iZzy;
                    }
                    iB += iZzD3;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzza zzzaVar = (zzza) unsafe.getObject(obj2, j);
                    if (!zzzaVar.isEmpty()) {
                        Iterator it = zzzaVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, zzuq.zzE(zzv(obj2, j)), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, zzuq.zzE(zzv(obj2, j)), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, zzuq.zzz(zzp(obj2, j)), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 1, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        int i32 = i6 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzud) {
                            int i33 = zzuq.zzf;
                            int iZzd7 = ((zzud) object2).zzd();
                            iB = FK.b(i32, zzuq.zzD(iZzd7) + iZzd7, iB);
                        } else {
                            iB = FK.b(i32, zzuq.zzC((String) object2), iB);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iZzd = zzzv.zzh(i6, unsafe.getObject(obj2, j), zzzjVar.zzx(i4));
                        iB += iZzd;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        zzud zzudVar2 = (zzud) unsafe.getObject(obj2, j);
                        int i34 = zzuq.zzf;
                        int iZzd8 = zzudVar2.zzd();
                        iB = FK.b(i6 << 3, zzuq.zzD(iZzd8) + iZzd8, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, zzuq.zzD(zzp(obj2, j)), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, zzuq.zzz(zzp(obj2, j)), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 4, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB = FK.b(i6 << 3, 8, iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        int iZzp = zzp(obj2, j);
                        iB = FK.b((iZzp >> 31) ^ (iZzp + iZzp), zzuq.zzD(i6 << 3), iB);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        long jZzv = zzv(obj2, j);
                        iZze = zzuq.zzD(i6 << 3);
                        iZzE = zzuq.zzE((jZzv >> 63) ^ (jZzv + jZzv));
                        iB += iZzE + iZze;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (zzzjVar.zzR(obj2, i6, i4)) {
                        iB += zzuq.zzy(i6, (zzzg) unsafe.getObject(obj2, j), zzzjVar.zzx(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        int iZzb2 = 0;
        zzaak zzaakVar = zzzjVar.zzn;
        int iZza2 = iB + zzaakVar.zza(zzaakVar.zzd(obj2));
        if (!zzzjVar.zzh) {
            return iZza2;
        }
        zzxk zzxkVarZzb = zzzjVar.zzo.zzb(obj2);
        for (int i35 = 0; i35 < zzxkVarZzb.zza.zzb(); i35++) {
            Map.Entry entryZzg = zzxkVarZzb.zza.zzg(i35);
            iZzb2 += zzxk.zzb((zzxj) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzxkVarZzb.zza.zzc()) {
            iZzb2 += zzxk.zzb((zzxj) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzaau.zza(obj, j));
                    byte[] bArr = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzaau.zzb(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr2 = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr3 = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 4:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr4 = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 6:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzye.zza(zzaau.zzw(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzaau.zzf(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzaau.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 13:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr5 = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 15:
                    i = i4 * 53;
                    iZzc = zzaau.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr6 = zzye.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzaau.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
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
                    i2 = i4 * 53;
                    iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzye.zza(zzS(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzaau.zzf(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzye.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i4 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.gtm.zztp r35) throws com.google.android.gms.internal.gtm.zzyg {
        /*
            Method dump skipped, instruction units count: 3824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zztp):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final Object zze() {
        return ((zzxv) this.zzg).zzad();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzxv) {
                zzxv zzxvVar = (zzxv) obj;
                zzxvVar.zzao(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzxvVar.zzb = 0;
                zzxvVar.zzam();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
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
                                this.zzm.zzb(obj, j);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzza) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzaau.zzo(obj, j, zzaau.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzaau.zzp(obj, j, zzaau.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzaau.zzm(obj, j, zzaau.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    int i4 = zzzv.zza;
                    zzaau.zzs(obj, j, zzzb.zzb(zzaau.zzf(obj, j), zzaau.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzzv.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzzv.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x065d A[Catch: all -> 0x0685, TryCatch #1 {all -> 0x0685, blocks: (B:87:0x011a, B:195:0x0658, B:197:0x065d, B:198:0x0661, B:88:0x012c, B:89:0x0141, B:90:0x0156, B:91:0x016b, B:92:0x0180, B:94:0x018c, B:97:0x0193, B:98:0x0199, B:99:0x01a7, B:100:0x01bc, B:101:0x01cd, B:102:0x01e1, B:103:0x01eb, B:104:0x0200, B:105:0x0215, B:106:0x022a, B:107:0x023f, B:108:0x0254, B:109:0x0269, B:110:0x027e, B:111:0x0293, B:113:0x02a5, B:115:0x02ab, B:117:0x02c6, B:118:0x02ca, B:116:0x02bb, B:119:0x02cb, B:120:0x02df, B:121:0x02ef, B:122:0x02ff, B:123:0x030f, B:124:0x031f, B:134:0x0346, B:135:0x0354, B:136:0x0364, B:137:0x0374, B:138:0x0384, B:139:0x0394, B:140:0x03a4, B:141:0x03b4, B:142:0x03c4, B:143:0x03d4, B:144:0x03e4, B:145:0x03f4, B:146:0x0404, B:147:0x0414, B:152:0x0432, B:153:0x0440, B:154:0x0450, B:155:0x0464, B:157:0x046c, B:158:0x047e, B:159:0x0490, B:160:0x04a0, B:161:0x04b0, B:162:0x04c0, B:163:0x04d0, B:164:0x04e0, B:165:0x04f0, B:166:0x0500, B:167:0x0510, B:168:0x0524, B:169:0x0535, B:170:0x0546, B:171:0x0557, B:172:0x0568, B:174:0x0574, B:177:0x057b, B:179:0x0585, B:180:0x0590, B:181:0x05a1, B:182:0x05b2, B:183:0x05c6, B:184:0x05d0, B:185:0x05e1, B:186:0x05f2, B:187:0x0602, B:188:0x0612, B:189:0x0622, B:190:0x0632, B:191:0x0642), top: B:224:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:203:0x066d A[LOOP:3: B:201:0x0669->B:203:0x066d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x067f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0683  */
    /* JADX WARN: Code duplicated, block: B:216:0x0694 A[LOOP:2: B:214:0x0690->B:216:0x0694, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:327:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzh(Object obj, zzzs zzzsVar, zzxf zzxfVar) throws Throwable {
        Object obj2;
        Object objZzc;
        int i;
        Object obj3;
        zzaak zzaakVar;
        Object obj4;
        zzxg zzxgVar;
        zzxf zzxfVar2;
        Object obj5;
        int i2;
        Object obj6;
        Object objZzo;
        zzxf zzxfVar3 = zzxfVar;
        zzxfVar3.getClass();
        zzD(obj);
        zzaak zzaakVar2 = this.zzn;
        zzxg zzxgVar2 = this.zzo;
        Throwable th = null;
        Object objZze = null;
        zzxk zzxkVarZzc = null;
        while (true) {
            try {
                int iZzc = zzzsVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    zzxgVar = zzxgVar2;
                    zzxfVar2 = zzxfVar3;
                    objZzc = objZze;
                    zzaakVar = zzaakVar2;
                    obj4 = obj;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            try {
                                switch (zzt(iZzu)) {
                                    case 0:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzo(obj4, iZzu & 1048575, zzzsVar.zza());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 1:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzp(obj4, iZzu & 1048575, zzzsVar.zzb());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 2:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzr(obj4, iZzu & 1048575, zzzsVar.zzl());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 3:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzr(obj4, iZzu & 1048575, zzzsVar.zzo());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 4:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzq(obj4, iZzu & 1048575, zzzsVar.zzg());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 5:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzr(obj4, iZzu & 1048575, zzzsVar.zzk());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 6:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzq(obj4, iZzu & 1048575, zzzsVar.zzf());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 7:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzm(obj4, iZzu & 1048575, zzzsVar.zzP());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 8:
                                        zzaakVar2 = zzaakVar;
                                        zzG(obj4, iZzu, zzzsVar);
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 9:
                                        zzaakVar2 = zzaakVar;
                                        zzzg zzzgVar = (zzzg) zzA(obj4, iZzq);
                                        zzzsVar.zzw(zzzgVar, zzx(iZzq), zzxfVar2);
                                        zzJ(obj4, iZzq, zzzgVar);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 10:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, zzzsVar.zzp());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 11:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzq(obj4, iZzu & 1048575, zzzsVar.zzj());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                        zzaakVar2 = zzaakVar;
                                        int iZze = zzzsVar.zze();
                                        zzxz zzxzVarZzw = zzw(iZzq);
                                        if (zzxzVarZzw == null || zzxzVarZzw.zza(iZze)) {
                                            zzaau.zzq(obj4, iZzu & 1048575, iZze);
                                            zzH(obj4, iZzq);
                                            objZze = objZzc;
                                        } else {
                                            objZze = zzzv.zzp(obj4, iZzc, iZze, objZzc, zzaakVar2);
                                        }
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 13:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzq(obj4, iZzu & 1048575, zzzsVar.zzh());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 14:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzr(obj4, iZzu & 1048575, zzzsVar.zzm());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 15:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzq(obj4, iZzu & 1048575, zzzsVar.zzi());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 16:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzr(obj4, iZzu & 1048575, zzzsVar.zzn());
                                        zzH(obj4, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 17:
                                        zzaakVar2 = zzaakVar;
                                        zzzg zzzgVar2 = (zzzg) zzA(obj4, iZzq);
                                        zzzsVar.zzv(zzzgVar2, zzx(iZzq), zzxfVar2);
                                        zzJ(obj4, iZzq, zzzgVar2);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzz(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 19:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzD(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 20:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzG(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzO(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 22:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzF(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzC(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzB(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 25:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzx(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 26:
                                        zzaakVar2 = zzaakVar;
                                        if (zzM(iZzu)) {
                                            ((zzuk) zzzsVar).zzM(this.zzm.zza(obj4, iZzu & 1048575), true);
                                        } else {
                                            ((zzuk) zzzsVar).zzM(this.zzm.zza(obj4, iZzu & 1048575), false);
                                        }
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 27:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzH(this.zzm.zza(obj4, iZzu & 1048575), zzx(iZzq), zzxfVar2);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 28:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzy(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 29:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzN(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 30:
                                        List listZza = this.zzm.zza(obj4, iZzu & 1048575);
                                        zzzsVar.zzA(listZza);
                                        objZzo = zzzv.zzo(obj4, iZzc, listZza, zzw(iZzq), objZzc, zzaakVar);
                                        zzaakVar2 = zzaakVar;
                                        objZze = objZzo;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        break;
                                    case 31:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzI(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzJ(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 33:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzK(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 34:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzL(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 35:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzz(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 36:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzD(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 37:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzG(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 38:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzO(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 39:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzF(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case RequestError.NETWORK_FAILURE /* 40 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzC(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case RequestError.NO_DEV_KEY /* 41 */:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzB(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 42:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzx(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 43:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzN(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 44:
                                        obj5 = obj4;
                                        List listZza2 = this.zzm.zza(obj5, iZzu & 1048575);
                                        zzzsVar.zzA(listZza2);
                                        zzaakVar = zzaakVar;
                                        try {
                                            objZzo = zzzv.zzo(obj5, iZzc, listZza2, zzw(iZzq), objZzc, zzaakVar);
                                            zzaakVar2 = zzaakVar;
                                            objZze = objZzo;
                                            zzxfVar3 = zzxfVar2;
                                            zzxgVar2 = zzxgVar;
                                        } catch (zzyf unused) {
                                            objZzc = objZzc;
                                            zzaakVar2 = zzaakVar;
                                            zzaakVar2.zzq(zzzsVar);
                                            if (objZzc == null) {
                                                objZzc = zzaakVar2.zzc(obj5);
                                            }
                                            if (!zzaakVar2.zzp(objZzc, zzzsVar)) {
                                                i2 = this.zzk;
                                                while (i2 < this.zzl) {
                                                    Object obj7 = obj5;
                                                    zzy(obj7, this.zzj[i2], objZzc, zzaakVar2, obj);
                                                    i2++;
                                                    obj5 = obj7;
                                                }
                                                obj6 = obj5;
                                                if (objZzc != null) {
                                                    zzaakVar2.zzn(obj6, objZzc);
                                                    return;
                                                }
                                                return;
                                            }
                                            objZze = objZzc;
                                            zzxfVar3 = zzxfVar2;
                                            zzxgVar2 = zzxgVar;
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            objZzc = objZzc;
                                            zzaakVar2 = zzaakVar;
                                            obj2 = obj5;
                                            for (i = this.zzk; i < this.zzl; i++) {
                                                zzy(obj2, this.zzj[i], objZzc, zzaakVar2, obj);
                                            }
                                            obj3 = obj2;
                                            if (objZzc != null) {
                                                zzaakVar2.zzn(obj3, objZzc);
                                            }
                                            throw th;
                                        }
                                        break;
                                    case 45:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzI(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 46:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzJ(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 47:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzK(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 48:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzL(this.zzm.zza(obj4, iZzu & 1048575));
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 49:
                                        zzaakVar2 = zzaakVar;
                                        zzzsVar.zzE(this.zzm.zza(obj4, iZzu & 1048575), zzx(iZzq), zzxfVar2);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                        obj5 = obj4;
                                        zzaakVar2 = zzaakVar;
                                        Object objZzz = zzz(iZzq);
                                        long jZzu = zzu(iZzq) & 1048575;
                                        Object objZzf = zzaau.zzf(obj5, jZzu);
                                        if (objZzf == null) {
                                            objZzf = zzza.zza().zzb();
                                            zzaau.zzs(obj5, jZzu, objZzf);
                                        } else if (zzzb.zza(objZzf)) {
                                            Object objZzb = zzza.zza().zzb();
                                            zzzb.zzb(objZzb, objZzf);
                                            zzaau.zzs(obj5, jZzu, objZzb);
                                            objZzf = objZzb;
                                        }
                                        throw th;
                                    case 51:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Double.valueOf(zzzsVar.zza()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 52:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Float.valueOf(zzzsVar.zzb()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 53:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Long.valueOf(zzzsVar.zzl()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 54:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Long.valueOf(zzzsVar.zzo()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 55:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzzsVar.zzg()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 56:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Long.valueOf(zzzsVar.zzk()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 57:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzzsVar.zzf()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 58:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Boolean.valueOf(zzzsVar.zzP()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 59:
                                        zzaakVar2 = zzaakVar;
                                        zzG(obj4, iZzu, zzzsVar);
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 60:
                                        zzaakVar2 = zzaakVar;
                                        zzzg zzzgVar3 = (zzzg) zzB(obj4, iZzc, iZzq);
                                        zzzsVar.zzw(zzzgVar3, zzx(iZzq), zzxfVar2);
                                        zzK(obj4, iZzc, iZzq, zzzgVar3);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 61:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, zzzsVar.zzp());
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 62:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzzsVar.zzj()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 63:
                                        zzaakVar2 = zzaakVar;
                                        int iZze2 = zzzsVar.zze();
                                        zzxz zzxzVarZzw2 = zzw(iZzq);
                                        if (zzxzVarZzw2 != null && !zzxzVarZzw2.zza(iZze2)) {
                                            objZze = zzzv.zzp(obj4, iZzc, iZze2, objZzc, zzaakVar2);
                                            zzxfVar3 = zzxfVar2;
                                            zzxgVar2 = zzxgVar;
                                        }
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(iZze2));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzzsVar.zzh()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Long.valueOf(zzzsVar.zzm()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 66:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzzsVar.zzi()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 67:
                                        zzaakVar2 = zzaakVar;
                                        zzaau.zzs(obj4, iZzu & 1048575, Long.valueOf(zzzsVar.zzn()));
                                        zzI(obj4, iZzc, iZzq);
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    case 68:
                                        obj5 = obj4;
                                        zzaakVar2 = zzaakVar;
                                        try {
                                            try {
                                                zzzg zzzgVar4 = (zzzg) zzB(obj5, iZzc, iZzq);
                                                zzzsVar.zzv(zzzgVar4, zzx(iZzq), zzxfVar2);
                                                zzK(obj5, iZzc, iZzq, zzzgVar4);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj2 = obj5;
                                                while (i < this.zzl) {
                                                    zzy(obj2, this.zzj[i], objZzc, zzaakVar2, obj);
                                                }
                                                obj3 = obj2;
                                                if (objZzc != null) {
                                                    zzaakVar2.zzn(obj3, objZzc);
                                                }
                                                throw th;
                                            }
                                        } catch (zzyf unused2) {
                                            zzaakVar2.zzq(zzzsVar);
                                            if (objZzc == null) {
                                                objZzc = zzaakVar2.zzc(obj5);
                                            }
                                            if (!zzaakVar2.zzp(objZzc, zzzsVar)) {
                                                i2 = this.zzk;
                                                while (i2 < this.zzl) {
                                                    Object obj8 = obj5;
                                                    zzy(obj8, this.zzj[i2], objZzc, zzaakVar2, obj);
                                                    i2++;
                                                    obj5 = obj8;
                                                }
                                                obj6 = obj5;
                                                if (objZzc != null) {
                                                    zzaakVar2.zzn(obj6, objZzc);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        objZze = objZzc;
                                        zzxfVar3 = zzxfVar2;
                                        zzxgVar2 = zzxgVar;
                                        th = null;
                                        break;
                                    default:
                                        if (objZzc == null) {
                                            objZzc = zzaakVar.zzc(obj4);
                                        }
                                        try {
                                            if (!zzaakVar.zzp(objZzc, zzzsVar)) {
                                                int i3 = this.zzk;
                                                while (i3 < this.zzl) {
                                                    zzaak zzaakVar3 = zzaakVar;
                                                    Object obj9 = obj4;
                                                    zzy(obj9, this.zzj[i3], objZzc, zzaakVar3, obj);
                                                    i3++;
                                                    zzaakVar = zzaakVar3;
                                                    obj4 = obj9;
                                                }
                                                Object obj10 = obj4;
                                                zzaak zzaakVar4 = zzaakVar;
                                                if (objZzc != null) {
                                                    zzaakVar4.zzn(obj10, objZzc);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzaakVar2 = zzaakVar;
                                            zzxgVar2 = zzxgVar;
                                            objZze = objZzc;
                                            zzxfVar3 = zzxfVar2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj5 = obj4;
                                            zzaakVar2 = zzaakVar;
                                            obj2 = obj5;
                                            while (i < this.zzl) {
                                                zzy(obj2, this.zzj[i], objZzc, zzaakVar2, obj);
                                            }
                                            obj3 = obj2;
                                            if (objZzc != null) {
                                                zzaakVar2.zzn(obj3, objZzc);
                                            }
                                            throw th;
                                        }
                                        break;
                                }
                            } catch (zzyf unused3) {
                                obj5 = obj4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj5 = obj4;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        obj2 = obj4;
                        zzaakVar2 = zzaakVar;
                    }
                } else {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            Object obj11 = objZze;
                            zzy(obj, this.zzj[i4], obj11, zzaakVar2, obj);
                            objZze = obj11;
                        }
                        if (objZze != null) {
                            zzaakVar2.zzn(obj, objZze);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzd = !this.zzh ? th : zzxgVar2.zzd(zzxfVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzxkVarZzc == null) {
                                try {
                                    zzxkVarZzc = zzxgVar2.zzc(obj);
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj2 = obj;
                                    objZzc = objZze;
                                }
                            }
                            zzxk zzxkVar = zzxkVarZzc;
                            zzaak zzaakVar5 = zzaakVar2;
                            try {
                                objZze = zzxgVar2.zze(obj, zzzsVar, objZzd, zzxfVar3, zzxkVar, objZze, zzaakVar5);
                                zzxkVarZzc = zzxkVar;
                                zzaakVar2 = zzaakVar5;
                                zzxgVar = zzxgVar2;
                                zzxfVar2 = zzxfVar3;
                                zzxfVar3 = zzxfVar2;
                                zzxgVar2 = zzxgVar;
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj;
                                objZzc = objZze;
                                zzaakVar2 = zzaakVar5;
                            }
                        } else {
                            zzxgVar = zzxgVar2;
                            obj2 = obj;
                            zzxfVar2 = zzxfVar3;
                            objZzc = objZze;
                            try {
                                zzaakVar2.zzq(zzzsVar);
                                if (objZzc == null) {
                                    try {
                                        objZzc = zzaakVar2.zzc(obj2);
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                }
                                try {
                                    if (!zzaakVar2.zzp(objZzc, zzzsVar)) {
                                        int i5 = this.zzk;
                                        while (i5 < this.zzl) {
                                            zzy(obj2, this.zzj[i5], objZzc, zzaakVar2, obj);
                                            i5++;
                                            zzaakVar2 = zzaakVar2;
                                        }
                                        zzaak zzaakVar6 = zzaakVar2;
                                        if (objZzc != null) {
                                            zzaakVar6.zzn(obj2, objZzc);
                                            return;
                                        }
                                        return;
                                    }
                                    zzaakVar = zzaakVar2;
                                    zzaakVar2 = zzaakVar;
                                    zzxgVar2 = zzxgVar;
                                    objZze = objZzc;
                                    zzxfVar3 = zzxfVar2;
                                } catch (Throwable th10) {
                                    th = th10;
                                    zzaakVar = zzaakVar2;
                                    obj4 = obj2;
                                    obj2 = obj4;
                                    zzaakVar2 = zzaakVar;
                                    while (i < this.zzl) {
                                        zzy(obj2, this.zzj[i], objZzc, zzaakVar2, obj);
                                    }
                                    obj3 = obj2;
                                    if (objZzc != null) {
                                        zzaakVar2.zzn(obj3, objZzc);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                zzaakVar = zzaakVar2;
                                zzaakVar2 = zzaakVar;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        objZzc = objZze;
                        zzaakVar = zzaakVar2;
                        obj4 = obj;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
            }
            while (i < this.zzl) {
                zzy(obj2, this.zzj[i], objZzc, zzaakVar2, obj);
            }
            obj3 = obj2;
            if (objZzc != null) {
                zzaakVar2.zzn(obj3, objZzc);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zztp zztpVar) throws zzyg {
        zzc(obj, bArr, i, i2, 0, zztpVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzt;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzaau.zza(obj, j)) != Double.doubleToLongBits(zzaau.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzaau.zzb(obj, j)) != Float.floatToIntBits(zzaau.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzaau.zzd(obj, j) != zzaau.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzaau.zzd(obj, j) != zzaau.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzaau.zzd(obj, j) != zzaau.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzaau.zzw(obj, j) != zzaau.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzaau.zzd(obj, j) != zzaau.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzaau.zzc(obj, j) != zzaau.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzaau.zzd(obj, j) != zzaau.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
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
                    zZzt = zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zZzt = zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzaau.zzc(obj, jZzr) != zzaau.zzc(obj2, jZzr) || !zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzt) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzzt zzztVarZzx;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i7, i, i2, i11) && !zzP(obj2, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzaau.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzztVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzztVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i8, i7) && !zzP(obj2, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzaau.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzztVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzztVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzza) zzaau.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzo.zzb(obj).zzm();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzm(Object obj, zzur zzurVar) {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        zzzj<T> zzzjVar = this;
        if (zzzjVar.zzh) {
            zzxk zzxkVarZzb = zzzjVar.zzo.zzb(obj);
            if (zzxkVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzg = zzxkVarZzb.zzg();
                entry = (Map.Entry) itZzg.next();
                it = itZzg;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzzjVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < iArr.length) {
            int iZzu = zzzjVar.zzu(i5);
            int[] iArr2 = zzzjVar.zzc;
            int iZzt = zzt(iZzu);
            int i8 = iArr2[i5];
            if (iZzt <= 17) {
                int i9 = iArr2[i5 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i6) {
                    i = 1;
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                } else {
                    i = 1;
                }
                i2 = i6;
                i3 = i7;
                i4 = i << (i9 >>> 20);
            } else {
                i = 1;
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            while (entry != null && zzzjVar.zzo.zza(entry) <= i8) {
                zzzjVar.zzo.zzj(zzurVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzf(i8, zzaau.zza(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 1:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzo(i8, zzaau.zzb(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 2:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 3:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzK(i8, unsafe.getLong(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 4:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 5:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 6:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 7:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzb(i8, zzaau.zzw(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 8:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzT(i8, unsafe.getObject(obj, j), zzurVar);
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 9:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzv(i8, unsafe.getObject(obj, j), zzzjVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 10:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzd(i8, (zzud) unsafe.getObject(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 11:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzI(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 13:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzx(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 14:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzz(i8, unsafe.getLong(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 15:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzB(i8, unsafe.getInt(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 16:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzD(i8, unsafe.getLong(obj, j));
                    }
                    zzzjVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 17:
                    if (zzzjVar.zzO(obj, i5, i2, i3, i4)) {
                        zzurVar.zzq(i8, unsafe.getObject(obj, j), zzzjVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzzv.zzw(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 19:
                    zzzv.zzA(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 20:
                    zzzv.zzD(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzzv.zzL(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 22:
                    zzzv.zzC(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzzv.zzz(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    zzzv.zzy(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 25:
                    zzzv.zzu(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 26:
                    zzzv.zzJ(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 27:
                    zzzv.zzE(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, zzzjVar.zzx(i5));
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 28:
                    zzzv.zzv(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 29:
                    zzzv.zzK(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 30:
                    zzzv.zzx(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 31:
                    zzzv.zzF(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    zzzv.zzG(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 33:
                    zzzv.zzH(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 34:
                    zzzv.zzI(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 35:
                    zzzv.zzw(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 36:
                    zzzv.zzA(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 37:
                    zzzv.zzD(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 38:
                    zzzv.zzL(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 39:
                    zzzv.zzC(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    zzzv.zzz(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    zzzv.zzy(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 42:
                    zzzv.zzu(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 43:
                    zzzv.zzK(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 44:
                    zzzv.zzx(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 45:
                    zzzv.zzF(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 46:
                    zzzv.zzG(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 47:
                    zzzv.zzH(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 48:
                    zzzv.zzI(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 49:
                    zzzv.zzB(zzzjVar.zzc[i5], (List) unsafe.getObject(obj, j), zzurVar, zzzjVar.zzx(i5));
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 51:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzf(i8, zzn(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 52:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzo(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 53:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzt(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 54:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzK(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 55:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzr(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 56:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzm(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 57:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzk(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 58:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzb(i8, zzS(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 59:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzT(i8, unsafe.getObject(obj, j), zzurVar);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 60:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzv(i8, unsafe.getObject(obj, j), zzzjVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 61:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzd(i8, (zzud) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 62:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzI(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 63:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzi(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzx(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzz(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 66:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzB(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 67:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzD(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 68:
                    if (zzzjVar.zzR(obj, i8, i5)) {
                        zzurVar.zzq(i8, unsafe.getObject(obj, j), zzzjVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                default:
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzzjVar.zzo.zzj(zzurVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        zzaak zzaakVar = zzzjVar.zzn;
        zzaakVar.zzs(zzaakVar.zzd(obj), zzurVar);
    }
}
