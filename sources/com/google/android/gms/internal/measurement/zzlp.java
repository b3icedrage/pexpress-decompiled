package com.google.android.gms.internal.measurement;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.C0663Bh;
import defpackage.C0741Ch;
import defpackage.C5896pG;
import defpackage.V31;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzlxVarZzb = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzlxVarZzb;
        return zzlxVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzlxVarZzE = zzE(i);
        long jZzB = zzB(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, jZzB);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzlxVarZzE = zzE(i2);
        if (!zzX(obj, i, i2)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzI(Class cls, String str) {
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

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzQ(Object obj, zzng zzngVar) {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if ((i5 & i) != 0) {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 28:
                    zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 29:
                    z = false;
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    z = false;
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 31:
                    z = false;
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    z = false;
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    z = false;
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 34:
                    z = false;
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i4)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmy.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object objZzf = zzmy.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzje) {
                    return !zzje.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzT(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar != zzmp.zzc()) {
            return zzmpVar;
        }
        zzmp zzmpVarZzf = zzmp.zzf();
        zzkfVar.zzc = zzmpVarZzf;
        return zzmpVarZzf;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0371  */
    public static zzlp zzm(zzlw zzlwVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
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
        Field fieldZzI;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldZzI2;
        int i24;
        Object obj2;
        Field fieldZzI3;
        int i25;
        char cCharAt10;
        int i26;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzlwVar.zzc() == 2;
        String strZzd = zzlwVar.zzd();
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
        Object[] objArrZze = zzlwVar.zze();
        Class<?> cls = zzlwVar.zza().getClass();
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
                        fieldZzI2 = (Field) obj;
                    } else {
                        fieldZzI2 = zzI(cls, (String) obj);
                        objArrZze[i23] = fieldZzI2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzI2);
                    i24 = i23 + 1;
                    obj2 = objArrZze[i24];
                    if (obj2 instanceof Field) {
                        fieldZzI3 = (Field) obj2;
                    } else {
                        fieldZzI3 = zzI(cls, (String) obj2);
                        objArrZze[i24] = fieldZzI3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
                    i19 = iObjectFieldOffset3;
                    i31 = i78;
                    i18 = 0;
                }
                i2 = i22;
                i23 = i76 + i76;
                obj = objArrZze[i23];
                if (obj instanceof Field) {
                    fieldZzI2 = (Field) obj;
                } else {
                    fieldZzI2 = zzI(cls, (String) obj);
                    objArrZze[i23] = fieldZzI2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzI2);
                i24 = i23 + 1;
                obj2 = objArrZze[i24];
                if (obj2 instanceof Field) {
                    fieldZzI3 = (Field) obj2;
                } else {
                    fieldZzI3 = zzI(cls, (String) obj2);
                    objArrZze[i24] = fieldZzI3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
                i19 = iObjectFieldOffset4;
                i31 = i78;
                i18 = 0;
            } else {
                int i81 = i2 + 1;
                Field fieldZzI4 = zzI(cls, (String) objArrZze[i2]);
                if (i71 == 9 || i71 == 17) {
                    int i82 = i61 / 3;
                    objArr[i82 + i82 + 1] = fieldZzI4.getType();
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
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
                            fieldZzI = (Field) obj3;
                        } else {
                            fieldZzI = zzI(cls, (String) obj3);
                            objArrZze[i92] = fieldZzI;
                        }
                        i17 = iCharAt13 % 32;
                        int i93 = i20;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
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
        return new zzlp(iArr3, objArr, iCharAt, iCharAt2, zzlwVar.zza(), z, false, iArr, iCharAt4, i58, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        int iZzu2;
        boolean z;
        int iZzd;
        int iZzA3;
        int iZzB2;
        int iZzA4;
        int iZzv2;
        int iZzu3;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iB = 0;
        int i5 = 0;
        while (i4 < this.zzc.length) {
            int iZzB3 = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzA5 = zzA(iZzB3);
            if (iZzA5 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            long j = iZzB3 & i2;
            switch (iZzA5) {
                case 0:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA = zzjm.zzA(i6 << 3);
                        iZzB = zzjm.zzB(j2);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA = zzjm.zzA(i6 << 3);
                        iZzB = zzjm.zzB(j3);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        int i9 = unsafe.getInt(obj, j);
                        iZzA2 = zzjm.zzA(i6 << 3);
                        iZzv = zzjm.zzv(i9);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 1, iB);
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzje)) {
                            iZzA2 = zzjm.zzA(i6 << 3);
                            iZzv = zzjm.zzy((String) object);
                            iZzu = iZzv + iZzA2;
                            iB += iZzu;
                        } else {
                            int iZzA6 = zzjm.zzA(i6 << 3);
                            int iZzd2 = ((zzje) object).zzd();
                            iB = C0741Ch.b(iZzd2, iZzd2, iZzA6, iB);
                        }
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iZzo = zzlz.zzo(i6, unsafe.getObject(obj, j), zzE(i4));
                        iB += iZzo;
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzje zzjeVar = (zzje) unsafe.getObject(obj, j);
                        int iZzA7 = zzjm.zzA(i6 << 3);
                        int iZzd3 = zzjeVar.zzd();
                        iB = C0741Ch.b(iZzd3, iZzd3, iZzA7, iB);
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(unsafe.getInt(obj, j), zzjm.zzA(i6 << 3), iB);
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        iZzA2 = zzjm.zzA(i6 << 3);
                        iZzv = zzjm.zzv(i10);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iB = C0663Bh.b((i11 >> 31) ^ (i11 + i11), zzjm.zzA(i6 << 3), iB);
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA = zzjm.zzA(i6 << 3);
                        iZzB = zzjm.zzB((j4 >> 63) ^ (j4 + j4));
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iZzu = zzjm.zzu(i6, (zzlm) unsafe.getObject(obj, j), zzE(i4));
                        iB += iZzu;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iZzo = zzlz.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case 19:
                    iZzo = zzlz.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case 20:
                    iZzo = zzlz.zzm(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    iZzo = zzlz.zzx(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case 22:
                    iZzo = zzlz.zzk(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iZzo = zzlz.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iZzo = zzlz.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case 25:
                    iZzo = zzlz.zza(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzo;
                    break;
                case 26:
                    iZzu2 = zzlz.zzu(i6, (List) unsafe.getObject(obj, j));
                    iB += iZzu2;
                    break;
                case 27:
                    iZzu2 = zzlz.zzp(i6, (List) unsafe.getObject(obj, j), zzE(i4));
                    iB += iZzu2;
                    break;
                case 28:
                    iZzu2 = zzlz.zzc(i6, (List) unsafe.getObject(obj, j));
                    iB += iZzu2;
                    break;
                case 29:
                    iZzu2 = zzlz.zzv(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzu2;
                    break;
                case 30:
                    z = false;
                    iZzd = zzlz.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzd;
                    break;
                case 31:
                    z = false;
                    iZzd = zzlz.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzd;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    z = false;
                    iZzd = zzlz.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzd;
                    break;
                case 33:
                    z = false;
                    iZzd = zzlz.zzq(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzd;
                    break;
                case 34:
                    z = false;
                    iZzd = zzlz.zzs(i6, (List) unsafe.getObject(obj, j), false);
                    iB += iZzd;
                    break;
                case 35:
                    int iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iB = C0741Ch.b(iZzi, zzjm.zzz(i6), iZzi, iB);
                    }
                    break;
                case 36:
                    int iZzg = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iB = C0741Ch.b(iZzg, zzjm.zzz(i6), iZzg, iB);
                    }
                    break;
                case 37:
                    int iZzn = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iB = C0741Ch.b(iZzn, zzjm.zzz(i6), iZzn, iB);
                    }
                    break;
                case 38:
                    int iZzy = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iB = C0741Ch.b(iZzy, zzjm.zzz(i6), iZzy, iB);
                    }
                    break;
                case 39:
                    int iZzl = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iB = C0741Ch.b(iZzl, zzjm.zzz(i6), iZzl, iB);
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    int iZzi2 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iB = C0741Ch.b(iZzi2, zzjm.zzz(i6), iZzi2, iB);
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    int iZzg2 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iB = C0741Ch.b(iZzg2, zzjm.zzz(i6), iZzg2, iB);
                    }
                    break;
                case 42:
                    int iZzb = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iB = C0741Ch.b(iZzb, zzjm.zzz(i6), iZzb, iB);
                    }
                    break;
                case 43:
                    int iZzw = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iB = C0741Ch.b(iZzw, zzjm.zzz(i6), iZzw, iB);
                    }
                    break;
                case 44:
                    int iZze = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iB = C0741Ch.b(iZze, zzjm.zzz(i6), iZze, iB);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iB = C0741Ch.b(iZzg3, zzjm.zzz(i6), iZzg3, iB);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iB = C0741Ch.b(iZzi3, zzjm.zzz(i6), iZzi3, iB);
                    }
                    break;
                case 47:
                    int iZzr = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iB = C0741Ch.b(iZzr, zzjm.zzz(i6), iZzr, iB);
                    }
                    break;
                case 48:
                    int iZzt = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iB = C0741Ch.b(iZzt, zzjm.zzz(i6), iZzt, iB);
                    }
                    break;
                case 49:
                    iZzu2 = zzlz.zzj(i6, (List) unsafe.getObject(obj, j), zzE(i4));
                    iB += iZzu2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzlh.zza(i6, unsafe.getObject(obj, j), zzF(i4));
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjm.zzA(i6 << 3);
                        iZzB2 = zzjm.zzB(jZzC);
                        iZzu3 = iZzB2 + iZzA3;
                        iB += iZzu3;
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjm.zzA(i6 << 3);
                        iZzB2 = zzjm.zzB(jZzC2);
                        iZzu3 = iZzB2 + iZzA3;
                        iB += iZzu3;
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i6 << 3);
                        iZzv2 = zzjm.zzv(iZzr2);
                        iZzu3 = iZzv2 + iZzA4;
                        iB += iZzu3;
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 1, iB);
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i4)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzje) {
                            int iZzA8 = zzjm.zzA(i6 << 3);
                            int iZzd4 = ((zzje) object2).zzd();
                            iB = C0741Ch.b(iZzd4, iZzd4, iZzA8, iB);
                        } else {
                            iZzA4 = zzjm.zzA(i6 << 3);
                            iZzv2 = zzjm.zzy((String) object2);
                            iZzu3 = iZzv2 + iZzA4;
                            iB += iZzu3;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i4)) {
                        iZzu2 = zzlz.zzo(i6, unsafe.getObject(obj, j), zzE(i4));
                        iB += iZzu2;
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzje zzjeVar2 = (zzje) unsafe.getObject(obj, j);
                        int iZzA9 = zzjm.zzA(i6 << 3);
                        int iZzd5 = zzjeVar2.zzd();
                        iB = C0741Ch.b(iZzd5, iZzd5, iZzA9, iB);
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(zzr(obj, j), zzjm.zzA(i6 << 3), iB);
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjm.zzA(i6 << 3);
                        iZzv2 = zzjm.zzv(iZzr3);
                        iZzu3 = iZzv2 + iZzA4;
                        iB += iZzu3;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 4, iB);
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzX(obj, i6, i4)) {
                        iB = C0663Bh.b(i6 << 3, 8, iB);
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i4)) {
                        int iZzr4 = zzr(obj, j);
                        iB = C0663Bh.b((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjm.zzA(i6 << 3), iB);
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i4)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA3 = zzjm.zzA(i6 << 3);
                        iZzB2 = zzjm.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu3 = iZzB2 + iZzA3;
                        iB += iZzu3;
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i4)) {
                        iZzu3 = zzjm.zzu(i6, (zzlm) unsafe.getObject(obj, j), zzE(i4));
                        iB += iZzu3;
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int iZza = iB + zzmoVar.zza(zzmoVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        Unsafe unsafe = zzb;
        int iB = 0;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB2 = zzB(i);
            int iZzA3 = zzA(iZzB2);
            int i2 = this.zzc[i];
            long j = iZzB2 & 1048575;
            if (iZzA3 >= zzjx.zzJ.zza() && iZzA3 <= zzjx.zzW.zza()) {
                int i3 = this.zzc[i + 2];
            }
            switch (iZzA3) {
                case 0:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 1:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case 2:
                    if (zzT(obj, i)) {
                        long jZzd = zzmy.zzd(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 3:
                    if (zzT(obj, i)) {
                        long jZzd2 = zzmy.zzd(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd2);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 4:
                    if (zzT(obj, i)) {
                        int iZzc = zzmy.zzc(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzv = zzjm.zzv(iZzc);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case 5:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 6:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case 7:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 1, iB);
                    }
                    break;
                case 8:
                    if (zzT(obj, i)) {
                        Object objZzf = zzmy.zzf(obj, j);
                        if (objZzf instanceof zzje) {
                            int iZzA4 = zzjm.zzA(i2 << 3);
                            int iZzd = ((zzje) objZzf).zzd();
                            iB = C0741Ch.b(iZzd, iZzd, iZzA4, iB);
                        } else {
                            iZzA2 = zzjm.zzA(i2 << 3);
                            iZzv = zzjm.zzy((String) objZzf);
                            iZzu = iZzv + iZzA2;
                            iB += iZzu;
                        }
                    }
                    break;
                case 9:
                    if (zzT(obj, i)) {
                        iZzo = zzlz.zzo(i2, zzmy.zzf(obj, j), zzE(i));
                        iB += iZzo;
                    }
                    break;
                case 10:
                    if (zzT(obj, i)) {
                        zzje zzjeVar = (zzje) zzmy.zzf(obj, j);
                        int iZzA5 = zzjm.zzA(i2 << 3);
                        int iZzd2 = zzjeVar.zzd();
                        iB = C0741Ch.b(iZzd2, iZzd2, iZzA5, iB);
                    }
                    break;
                case 11:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(zzmy.zzc(obj, j), zzjm.zzA(i2 << 3), iB);
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzT(obj, i)) {
                        int iZzc2 = zzmy.zzc(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzv = zzjm.zzv(iZzc2);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case 13:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case 14:
                    if (zzT(obj, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 15:
                    if (zzT(obj, i)) {
                        int iZzc3 = zzmy.zzc(obj, j);
                        iB = C0663Bh.b((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzjm.zzA(i2 << 3), iB);
                    }
                    break;
                case 16:
                    if (zzT(obj, i)) {
                        long jZzd3 = zzmy.zzd(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 17:
                    if (zzT(obj, i)) {
                        iZzu = zzjm.zzu(i2, (zzlm) zzmy.zzf(obj, j), zzE(i));
                        iB += iZzu;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iZzo = zzlz.zzh(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 19:
                    iZzo = zzlz.zzf(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 20:
                    iZzo = zzlz.zzm(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    iZzo = zzlz.zzx(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 22:
                    iZzo = zzlz.zzk(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iZzo = zzlz.zzh(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iZzo = zzlz.zzf(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 25:
                    iZzo = zzlz.zza(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 26:
                    iZzo = zzlz.zzu(i2, (List) zzmy.zzf(obj, j));
                    iB += iZzo;
                    break;
                case 27:
                    iZzo = zzlz.zzp(i2, (List) zzmy.zzf(obj, j), zzE(i));
                    iB += iZzo;
                    break;
                case 28:
                    iZzo = zzlz.zzc(i2, (List) zzmy.zzf(obj, j));
                    iB += iZzo;
                    break;
                case 29:
                    iZzo = zzlz.zzv(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 30:
                    iZzo = zzlz.zzd(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 31:
                    iZzo = zzlz.zzf(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    iZzo = zzlz.zzh(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 33:
                    iZzo = zzlz.zzq(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 34:
                    iZzo = zzlz.zzs(i2, (List) zzmy.zzf(obj, j), false);
                    iB += iZzo;
                    break;
                case 35:
                    int iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iB = C0741Ch.b(iZzi, zzjm.zzz(i2), iZzi, iB);
                    }
                    break;
                case 36:
                    int iZzg = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iB = C0741Ch.b(iZzg, zzjm.zzz(i2), iZzg, iB);
                    }
                    break;
                case 37:
                    int iZzn = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iB = C0741Ch.b(iZzn, zzjm.zzz(i2), iZzn, iB);
                    }
                    break;
                case 38:
                    int iZzy = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iB = C0741Ch.b(iZzy, zzjm.zzz(i2), iZzy, iB);
                    }
                    break;
                case 39:
                    int iZzl = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iB = C0741Ch.b(iZzl, zzjm.zzz(i2), iZzl, iB);
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    int iZzi2 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iB = C0741Ch.b(iZzi2, zzjm.zzz(i2), iZzi2, iB);
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    int iZzg2 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iB = C0741Ch.b(iZzg2, zzjm.zzz(i2), iZzg2, iB);
                    }
                    break;
                case 42:
                    int iZzb = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iB = C0741Ch.b(iZzb, zzjm.zzz(i2), iZzb, iB);
                    }
                    break;
                case 43:
                    int iZzw = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iB = C0741Ch.b(iZzw, zzjm.zzz(i2), iZzw, iB);
                    }
                    break;
                case 44:
                    int iZze = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iB = C0741Ch.b(iZze, zzjm.zzz(i2), iZze, iB);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iB = C0741Ch.b(iZzg3, zzjm.zzz(i2), iZzg3, iB);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iB = C0741Ch.b(iZzi3, zzjm.zzz(i2), iZzi3, iB);
                    }
                    break;
                case 47:
                    int iZzr = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iB = C0741Ch.b(iZzr, zzjm.zzz(i2), iZzr, iB);
                    }
                    break;
                case 48:
                    int iZzt = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iB = C0741Ch.b(iZzt, zzjm.zzz(i2), iZzt, iB);
                    }
                    break;
                case 49:
                    iZzo = zzlz.zzj(i2, (List) zzmy.zzf(obj, j), zzE(i));
                    iB += iZzo;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzlh.zza(i2, zzmy.zzf(obj, j), zzF(i));
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 52:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case 53:
                    if (zzX(obj, i2, i)) {
                        long jZzC = zzC(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzC);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 54:
                    if (zzX(obj, i2, i)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzC2);
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 55:
                    if (zzX(obj, i2, i)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzv = zzjm.zzv(iZzr2);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case 56:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 57:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case 58:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 1, iB);
                    }
                    break;
                case 59:
                    if (zzX(obj, i2, i)) {
                        Object objZzf2 = zzmy.zzf(obj, j);
                        if (objZzf2 instanceof zzje) {
                            int iZzA6 = zzjm.zzA(i2 << 3);
                            int iZzd3 = ((zzje) objZzf2).zzd();
                            iB = C0741Ch.b(iZzd3, iZzd3, iZzA6, iB);
                        } else {
                            iZzA2 = zzjm.zzA(i2 << 3);
                            iZzv = zzjm.zzy((String) objZzf2);
                            iZzu = iZzv + iZzA2;
                            iB += iZzu;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i2, i)) {
                        iZzo = zzlz.zzo(i2, zzmy.zzf(obj, j), zzE(i));
                        iB += iZzo;
                    }
                    break;
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzje zzjeVar2 = (zzje) zzmy.zzf(obj, j);
                        int iZzA7 = zzjm.zzA(i2 << 3);
                        int iZzd4 = zzjeVar2.zzd();
                        iB = C0741Ch.b(iZzd4, iZzd4, iZzA7, iB);
                    }
                    break;
                case 62:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(zzr(obj, j), zzjm.zzA(i2 << 3), iB);
                    }
                    break;
                case 63:
                    if (zzX(obj, i2, i)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzv = zzjm.zzv(iZzr3);
                        iZzu = iZzv + iZzA2;
                        iB += iZzu;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 4, iB);
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzX(obj, i2, i)) {
                        iB = C0663Bh.b(i2 << 3, 8, iB);
                    }
                    break;
                case 66:
                    if (zzX(obj, i2, i)) {
                        int iZzr4 = zzr(obj, j);
                        iB = C0663Bh.b((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjm.zzA(i2 << 3), iB);
                    }
                    break;
                case 67:
                    if (zzX(obj, i2, i)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu = iZzB + iZzA;
                        iB += iZzu;
                    }
                    break;
                case 68:
                    if (zzX(obj, i2, i)) {
                        iZzu = zzjm.zzu(i2, (zzlm) zzmy.zzf(obj, j), zzE(i));
                        iB += iZzu;
                    }
                    break;
            }
        }
        zzmo zzmoVar = this.zzn;
        return iB + zzmoVar.zza(zzmoVar.zzd(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzlgVarZzb = zzlg.zza().zzb();
            zzlh.zzb(zzlgVarZzb, object);
            unsafe.putObject(obj, j, zzlgVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws zzkp {
        int i9;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzis.zzj(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzis.zzj(bArr, i, zzirVar);
                int i10 = zzirVar.zza;
                if (i10 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zznd.zzf(bArr, iZzj2, iZzj2 + i10)) {
                        throw zzkp.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i10, zzkn.zzb));
                    iZzj2 += i10;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objZzH = zzH(obj, i4, i8);
                    int iZzo = zzis.zzo(objZzH, zzE(i8), bArr, i9, i2, zzirVar);
                    zzP(obj, i4, i8, objZzH);
                    return iZzo;
                }
                break;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iZza = zzis.zza(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, zzirVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return iZza;
                }
                break;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iZzj3 = zzis.zzj(bArr, i9, zzirVar);
                    int i11 = zzirVar.zza;
                    zzkj zzkjVarZzD = zzD(i8);
                    if (zzkjVarZzD != null && !zzkjVarZzD.zza(i11)) {
                        zzd(obj).zzj(i3, Long.valueOf(i11));
                        return iZzj3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj3;
                }
                break;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iZzj4 = zzis.zzj(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj4;
                }
                break;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iZzm3 = zzis.zzm(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object objZzH2 = zzH(obj, i4, i8);
                    int iZzn = zzis.zzn(objZzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    zzP(obj, i4, i8, objZzH2);
                    return iZzn;
                }
            default:
                return i;
        }
        return i9;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws zzkp {
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        zzir zzirVar2;
        int i8;
        int i9;
        Object obj2;
        zzir zzirVar3;
        byte[] bArr3;
        Unsafe unsafe2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzlp<T> zzlpVar = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i16 = i2;
        zzir zzirVar4 = zzirVar;
        zzJ(obj3);
        Unsafe unsafe3 = zzb;
        int i17 = -1;
        int iZza = i;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        while (iZza < i16) {
            int iZzk = iZza + 1;
            int i22 = bArr4[iZza];
            if (i22 < 0) {
                iZzk = zzis.zzk(i22, bArr4, iZzk, zzirVar4);
                i22 = zzirVar4.zza;
            }
            int i23 = i22 >>> 3;
            int i24 = i22 & 7;
            int iZzx = i23 > i18 ? zzlpVar.zzx(i23, i19 / 3) : zzlpVar.zzw(i23);
            if (iZzx == i17) {
                obj = obj3;
                unsafe = unsafe3;
                i3 = i22;
                i4 = iZzk;
                i5 = i17;
                i6 = i23;
                i7 = 0;
            } else {
                int[] iArr = zzlpVar.zzc;
                int i25 = iArr[iZzx + 1];
                int iZzA = zzA(i25);
                int i26 = i22;
                int i27 = iZzx;
                long j = i25 & 1048575;
                if (iZzA <= 17) {
                    int i28 = iArr[i27 + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 != i21) {
                        int i31 = 1048575;
                        if (i21 != 1048575) {
                            unsafe3.putInt(obj3, i21, i20);
                            i31 = 1048575;
                        }
                        if (i30 != i31) {
                            i20 = unsafe3.getInt(obj3, i30);
                        }
                        i21 = i30;
                    }
                    switch (iZzA) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i8 = iZzk;
                            i9 = i27;
                            if (i24 != 1) {
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                zzmy.zzo(obj3, j, Double.longBitsToDouble(zzis.zzp(bArr5, i8)));
                                iZza = i8 + 8;
                                i20 |= i29;
                                i16 = i2;
                                i18 = i23;
                                bArr4 = bArr5;
                                i19 = i9;
                                i17 = -1;
                                zzirVar4 = zzirVar;
                            }
                            break;
                        case 1:
                            zzir zzirVar5 = zzirVar4;
                            bArr2 = bArr4;
                            zzirVar2 = zzirVar5;
                            i8 = iZzk;
                            i9 = i27;
                            if (i24 != 5) {
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                zzmy.zzp(obj3, j, Float.intBitsToFloat(zzis.zzb(bArr2, i8)));
                                iZza = i8 + 4;
                                i20 |= i29;
                                byte[] bArr6 = bArr2;
                                zzirVar4 = zzirVar2;
                                bArr4 = bArr6;
                                i16 = i2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            zzir zzirVar6 = zzirVar4;
                            byte[] bArr7 = bArr4;
                            i8 = iZzk;
                            i9 = i27;
                            if (i24 != 0) {
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                int iZzm = zzis.zzm(bArr7, i8, zzirVar6);
                                Unsafe unsafe4 = unsafe3;
                                Object obj4 = obj3;
                                unsafe4.putLong(obj4, j, zzirVar6.zzb);
                                unsafe3 = unsafe4;
                                obj3 = obj4;
                                i20 |= i29;
                                zzirVar4 = zzirVar6;
                                bArr4 = bArr7;
                                iZza = iZzm;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                                i16 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            zzir zzirVar7 = zzirVar4;
                            byte[] bArr8 = bArr4;
                            i8 = iZzk;
                            i9 = i27;
                            if (i24 != 0) {
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                int iZzj = zzis.zzj(bArr8, i8, zzirVar7);
                                unsafe3.putInt(obj3, j, zzirVar7.zza);
                                i20 |= i29;
                                zzirVar4 = zzirVar7;
                                bArr4 = bArr8;
                                i16 = i2;
                                iZza = iZzj;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            Object obj5 = obj3;
                            zzir zzirVar8 = zzirVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i32 = iZzk;
                            i9 = i27;
                            if (i24 != 1) {
                                obj3 = obj5;
                                i8 = i32;
                                unsafe3 = unsafe5;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                zzirVar2 = zzirVar8;
                                unsafe5.putLong(obj5, j, zzis.zzp(bArr2, i32));
                                unsafe3 = unsafe5;
                                obj3 = obj5;
                                iZza = i32 + 8;
                                i20 |= i29;
                                byte[] bArr10 = bArr2;
                                zzirVar4 = zzirVar2;
                                bArr4 = bArr10;
                                i16 = i2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            byte[] bArr11 = bArr4;
                            obj2 = obj3;
                            zzirVar3 = zzirVar4;
                            bArr3 = bArr11;
                            unsafe2 = unsafe3;
                            i10 = iZzk;
                            i9 = i27;
                            if (i24 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe6;
                                obj3 = obj2;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                unsafe2.putInt(obj2, j, zzis.zzb(bArr3, i10));
                                iZza = i10 + 4;
                                i20 |= i29;
                                byte[] bArr12 = bArr3;
                                zzirVar4 = zzirVar3;
                                obj3 = obj2;
                                bArr4 = bArr12;
                                unsafe3 = unsafe2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                                i16 = i2;
                            }
                            break;
                        case 7:
                            byte[] bArr13 = bArr4;
                            obj2 = obj3;
                            zzir zzirVar9 = zzirVar4;
                            unsafe2 = unsafe3;
                            i10 = iZzk;
                            i9 = i27;
                            if (i24 != 0) {
                                Unsafe unsafe7 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe7;
                                obj3 = obj2;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                int iZzm2 = zzis.zzm(bArr13, i10, zzirVar9);
                                zzmy.zzm(obj2, j, zzirVar9.zzb != 0);
                                i20 |= i29;
                                zzirVar4 = zzirVar9;
                                obj3 = obj2;
                                bArr4 = bArr13;
                                iZza = iZzm2;
                                unsafe3 = unsafe2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                                i16 = i2;
                            }
                            break;
                        case 8:
                            byte[] bArr14 = bArr4;
                            obj2 = obj3;
                            zzirVar3 = zzirVar4;
                            bArr3 = bArr14;
                            unsafe2 = unsafe3;
                            i10 = iZzk;
                            i9 = i27;
                            if (i24 != 2) {
                                Unsafe unsafe8 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe8;
                                obj3 = obj2;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                iZza = (536870912 & i25) == 0 ? zzis.zzg(bArr3, i10, zzirVar3) : zzis.zzh(bArr3, i10, zzirVar3);
                                unsafe2.putObject(obj2, j, zzirVar3.zzc);
                                i20 |= i29;
                                byte[] bArr15 = bArr3;
                                zzirVar4 = zzirVar3;
                                obj3 = obj2;
                                bArr4 = bArr15;
                                unsafe3 = unsafe2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                                i16 = i2;
                            }
                            break;
                        case 9:
                            i9 = i27;
                            if (i24 != 2) {
                                obj3 = obj3;
                                i8 = iZzk;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                Object obj6 = obj3;
                                Object objZzG = zzlpVar.zzG(obj6, i9);
                                byte[] bArr16 = bArr4;
                                int i33 = i16;
                                unsafe2 = unsafe3;
                                int i34 = iZzk;
                                zzir zzirVar10 = zzirVar4;
                                int iZzo = zzis.zzo(objZzG, zzlpVar.zzE(i9), bArr16, i34, i33, zzirVar10);
                                zzlpVar.zzO(obj6, i9, objZzG);
                                i20 |= i29;
                                zzirVar4 = zzirVar10;
                                obj3 = obj6;
                                bArr4 = bArr16;
                                iZza = iZzo;
                                unsafe3 = unsafe2;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                                i16 = i2;
                            }
                            break;
                        case 10:
                            i9 = i27;
                            if (i24 != 2) {
                                i8 = iZzk;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                iZza = zzis.zza(bArr4, iZzk, zzirVar4);
                                unsafe3.putObject(obj3, j, zzirVar4.zzc);
                                i20 |= i29;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            i9 = i27;
                            if (i24 != 0) {
                                i8 = iZzk;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                iZza = zzis.zzj(bArr4, iZzk, zzirVar4);
                                unsafe3.putInt(obj3, j, zzirVar4.zza);
                                i20 |= i29;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case 15:
                            i9 = i27;
                            if (i24 != 0) {
                                i8 = iZzk;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                iZza = zzis.zzj(bArr4, iZzk, zzirVar4);
                                unsafe3.putInt(obj3, j, zzji.zzb(zzirVar4.zza));
                                i20 |= i29;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        case 16:
                            if (i24 != 0) {
                                i9 = i27;
                                i8 = iZzk;
                                i3 = i26 == true ? 1 : 0;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i23;
                                i7 = i9;
                                i5 = -1;
                                obj = obj3;
                            } else {
                                int iZzm3 = zzis.zzm(bArr4, iZzk, zzirVar4);
                                Unsafe unsafe9 = unsafe3;
                                Object obj7 = obj3;
                                i9 = i27;
                                unsafe9.putLong(obj7, j, zzji.zzc(zzirVar4.zzb));
                                unsafe3 = unsafe9;
                                obj3 = obj7;
                                i20 |= i29;
                                iZza = iZzm3;
                                i18 = i23;
                                i19 = i9;
                                i17 = -1;
                            }
                            break;
                        default:
                            i8 = iZzk;
                            i9 = i27;
                            i3 = i26 == true ? 1 : 0;
                            unsafe = unsafe3;
                            i4 = i8;
                            i6 = i23;
                            i7 = i9;
                            i5 = -1;
                            obj = obj3;
                            break;
                    }
                } else {
                    int i35 = iZzk;
                    byte[] bArr17 = bArr4;
                    if (iZzA != 27) {
                        i7 = i27;
                        i11 = i35;
                        Unsafe unsafe10 = unsafe3;
                        if (iZzA <= 49) {
                            unsafe = unsafe10;
                            i13 = i20;
                            i5 = -1;
                            i12 = i21;
                            int iZzv = zzlpVar.zzv(obj, bArr, i11, i2, i26 == true ? 1 : 0, i23, i24, i7, i25, iZzA, j, zzirVar);
                            i15 = i26 == true ? 1 : 0;
                            i14 = i23;
                            if (iZzv != i11) {
                                zzlpVar = this;
                                obj3 = obj;
                                i16 = i2;
                                zzirVar4 = zzirVar;
                                iZza = iZzv;
                                i18 = i14;
                                i21 = i12;
                                i17 = -1;
                                i19 = i7;
                                i20 = i13;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                i4 = iZzv;
                                i6 = i14;
                                i3 = i15;
                                i21 = i12;
                                i20 = i13;
                            }
                        } else {
                            unsafe = unsafe10;
                            i13 = i20;
                            i5 = -1;
                            i15 = i26 == true ? 1 : 0;
                            i12 = i21;
                            i14 = i23;
                            if (iZzA != 50) {
                                i6 = i14;
                                int iZzt = zzt(obj, bArr, i11, i2, i15 == true ? 1 : 0, i6, i24, i25, iZzA, j, i7, zzirVar);
                                obj = obj;
                                if (iZzt != i11) {
                                    zzlpVar = this;
                                    zzirVar4 = zzirVar;
                                    i18 = i6;
                                    iZza = iZzt;
                                    obj3 = obj;
                                    i21 = i12;
                                    i17 = -1;
                                    i19 = i7;
                                    i20 = i13;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i16 = i2;
                                } else {
                                    i3 = i15 == true ? 1 : 0;
                                    i4 = iZzt;
                                    i21 = i12;
                                    i20 = i13;
                                }
                            } else if (i24 == 2) {
                                int iZzs = zzs(obj, bArr, i11, i2, i7, j, zzirVar);
                                if (iZzs != i11) {
                                    zzlpVar = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i16 = i2;
                                    zzirVar4 = zzirVar;
                                    iZza = iZzs;
                                    i18 = i14;
                                    i21 = i12;
                                    i17 = -1;
                                    i19 = i7;
                                    i20 = i13;
                                    unsafe3 = unsafe;
                                } else {
                                    i4 = iZzs;
                                    i6 = i14;
                                    i3 = i15;
                                    i21 = i12;
                                    i20 = i13;
                                }
                            } else {
                                i4 = i11;
                                i6 = i14;
                                i3 = i15;
                                i21 = i12;
                                i20 = i13;
                            }
                        }
                    } else if (i24 == 2) {
                        zzkm zzkmVarZzd = (zzkm) unsafe3.getObject(obj3, j);
                        if (!zzkmVarZzd.zzc()) {
                            int size = zzkmVarZzd.size();
                            zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe3.putObject(obj3, j, zzkmVarZzd);
                        }
                        int iZze = zzis.zze(zzlpVar.zzE(i27), i26 == true ? 1 : 0, bArr17, i35, i2, zzkmVarZzd, zzirVar);
                        bArr4 = bArr;
                        zzirVar4 = zzirVar;
                        iZza = iZze;
                        unsafe3 = unsafe3;
                        i18 = i23;
                        i19 = i27;
                        i17 = -1;
                        obj3 = obj;
                        i16 = i2;
                    } else {
                        i7 = i27;
                        i11 = i35;
                        unsafe = unsafe3;
                        i12 = i21;
                        i13 = i20;
                        i14 = i23;
                        i5 = -1;
                        i15 = i26 == true ? 1 : 0;
                        i4 = i11;
                        i6 = i14;
                        i3 = i15;
                        i21 = i12;
                        i20 = i13;
                    }
                }
            }
            int iZzi = zzis.zzi(i3 == true ? 1 : 0, bArr, i4, i2, zzd(obj), zzirVar);
            bArr4 = bArr;
            zzirVar4 = zzirVar;
            i18 = i6;
            obj3 = obj;
            i17 = i5;
            i19 = i7;
            unsafe3 = unsafe;
            i16 = i2;
            iZza = iZzi;
            zzlpVar = this;
        }
        Unsafe unsafe11 = unsafe3;
        int i36 = i16;
        int i37 = i21;
        int i38 = i20;
        Object obj8 = obj3;
        if (i37 != 1048575) {
            unsafe11.putInt(obj8, i37, i38);
        }
        if (iZza == i36) {
            return iZza;
        }
        throw zzkp.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzir zzirVar) throws zzkp {
        int iZzl;
        Unsafe unsafe = zzb;
        zzkm zzkmVarZzd = (zzkm) unsafe.getObject(obj, j2);
        if (!zzkmVarZzd.zzc()) {
            int size = zzkmVarZzd.size();
            zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkmVarZzd);
        }
        zzkm zzkmVar = zzkmVarZzd;
        switch (i7) {
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 35:
                if (i5 == 2) {
                    zzjo zzjoVar = (zzjo) zzkmVar;
                    int iZzj = zzis.zzj(bArr, i, zzirVar);
                    int i8 = zzirVar.zza + iZzj;
                    while (iZzj < i8) {
                        zzjoVar.zze(Double.longBitsToDouble(zzis.zzp(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i8) {
                        return iZzj;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzjo zzjoVar2 = (zzjo) zzkmVar;
                    zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, i)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int iZzj2 = zzis.zzj(bArr, i9, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i9;
                        }
                        zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, iZzj2)));
                        i9 = iZzj2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjy zzjyVar = (zzjy) zzkmVar;
                    int iZzj3 = zzis.zzj(bArr, i, zzirVar);
                    int i10 = zzirVar.zza + iZzj3;
                    while (iZzj3 < i10) {
                        zzjyVar.zze(Float.intBitsToFloat(zzis.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i10) {
                        return iZzj3;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkmVar;
                    zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, i)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int iZzj4 = zzis.zzj(bArr, i11, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i11;
                        }
                        zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, iZzj4)));
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
                    zzlb zzlbVar = (zzlb) zzkmVar;
                    int iZzj5 = zzis.zzj(bArr, i, zzirVar);
                    int i12 = zzirVar.zza + iZzj5;
                    while (iZzj5 < i12) {
                        iZzj5 = zzis.zzm(bArr, iZzj5, zzirVar);
                        zzlbVar.zzg(zzirVar.zzb);
                    }
                    if (iZzj5 == i12) {
                        return iZzj5;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar2 = (zzlb) zzkmVar;
                    int iZzm = zzis.zzm(bArr, i, zzirVar);
                    zzlbVar2.zzg(zzirVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzis.zzj(bArr, iZzm, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzis.zzm(bArr, iZzj6, zzirVar);
                        zzlbVar2.zzg(zzirVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzis.zzf(bArr, i, zzkmVar, zzirVar);
                }
                if (i5 == 0) {
                    return zzis.zzl(i3, bArr, i, i2, zzkmVar, zzirVar);
                }
                return i;
            case ConnectionResult.API_DISABLED /* 23 */:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case 46:
                if (i5 == 2) {
                    zzlb zzlbVar3 = (zzlb) zzkmVar;
                    int iZzj7 = zzis.zzj(bArr, i, zzirVar);
                    int i13 = zzirVar.zza + iZzj7;
                    while (iZzj7 < i13) {
                        zzlbVar3.zzg(zzis.zzp(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i13) {
                        return iZzj7;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzlb zzlbVar4 = (zzlb) zzkmVar;
                    zzlbVar4.zzg(zzis.zzp(bArr, i));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int iZzj8 = zzis.zzj(bArr, i14, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i14;
                        }
                        zzlbVar4.zzg(zzis.zzp(bArr, iZzj8));
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
                    zzkg zzkgVar = (zzkg) zzkmVar;
                    int iZzj9 = zzis.zzj(bArr, i, zzirVar);
                    int i15 = zzirVar.zza + iZzj9;
                    while (iZzj9 < i15) {
                        zzkgVar.zzh(zzis.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i15) {
                        return iZzj9;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzkg zzkgVar2 = (zzkg) zzkmVar;
                    zzkgVar2.zzh(zzis.zzb(bArr, i));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int iZzj10 = zzis.zzj(bArr, i16, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i16;
                        }
                        zzkgVar2.zzh(zzis.zzb(bArr, iZzj10));
                        i16 = iZzj10 + 4;
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzit zzitVar = (zzit) zzkmVar;
                    int iZzj11 = zzis.zzj(bArr, i, zzirVar);
                    int i17 = zzirVar.zza + iZzj11;
                    while (iZzj11 < i17) {
                        iZzj11 = zzis.zzm(bArr, iZzj11, zzirVar);
                        zzitVar.zze(zzirVar.zzb != 0);
                    }
                    if (iZzj11 == i17) {
                        return iZzj11;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzit zzitVar2 = (zzit) zzkmVar;
                    int iZzm2 = zzis.zzm(bArr, i, zzirVar);
                    zzitVar2.zze(zzirVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj12 = zzis.zzj(bArr, iZzm2, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzis.zzm(bArr, iZzj12, zzirVar);
                        zzitVar2.zze(zzirVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzis.zzj(bArr, i, zzirVar);
                        int i18 = zzirVar.zza;
                        if (i18 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i18 == 0) {
                            zzkmVar.add("");
                        } else {
                            zzkmVar.add(new String(bArr, iZzj13, i18, zzkn.zzb));
                            iZzj13 += i18;
                        }
                        while (iZzj13 < i2) {
                            int iZzj14 = zzis.zzj(bArr, iZzj13, zzirVar);
                            if (i3 != zzirVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzis.zzj(bArr, iZzj14, zzirVar);
                            int i19 = zzirVar.zza;
                            if (i19 < 0) {
                                throw zzkp.zzd();
                            }
                            if (i19 == 0) {
                                zzkmVar.add("");
                            } else {
                                zzkmVar.add(new String(bArr, iZzj13, i19, zzkn.zzb));
                                iZzj13 += i19;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzis.zzj(bArr, i, zzirVar);
                    int i20 = zzirVar.zza;
                    if (i20 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i20 == 0) {
                        zzkmVar.add("");
                    } else {
                        int i21 = iZzj15 + i20;
                        if (!zznd.zzf(bArr, iZzj15, i21)) {
                            throw zzkp.zzc();
                        }
                        zzkmVar.add(new String(bArr, iZzj15, i20, zzkn.zzb));
                        iZzj15 = i21;
                    }
                    while (iZzj15 < i2) {
                        int iZzj16 = zzis.zzj(bArr, iZzj15, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzis.zzj(bArr, iZzj16, zzirVar);
                        int i22 = zzirVar.zza;
                        if (i22 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i22 == 0) {
                            zzkmVar.add("");
                        } else {
                            int i23 = iZzj15 + i22;
                            if (!zznd.zzf(bArr, iZzj15, i23)) {
                                throw zzkp.zzc();
                            }
                            zzkmVar.add(new String(bArr, iZzj15, i22, zzkn.zzb));
                            iZzj15 = i23;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzis.zze(zzE(i6), i3, bArr, i, i2, zzkmVar, zzirVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iZzj17 = zzis.zzj(bArr, i, zzirVar);
                    int i24 = zzirVar.zza;
                    if (i24 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i24 > bArr.length - iZzj17) {
                        throw zzkp.zzf();
                    }
                    if (i24 == 0) {
                        zzkmVar.add(zzje.zzb);
                    } else {
                        zzkmVar.add(zzje.zzl(bArr, iZzj17, i24));
                        iZzj17 += i24;
                    }
                    while (iZzj17 < i2) {
                        int iZzj18 = zzis.zzj(bArr, iZzj17, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzis.zzj(bArr, iZzj18, zzirVar);
                        int i25 = zzirVar.zza;
                        if (i25 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i25 > bArr.length - iZzj17) {
                            throw zzkp.zzf();
                        }
                        if (i25 == 0) {
                            zzkmVar.add(zzje.zzb);
                        } else {
                            zzkmVar.add(zzje.zzl(bArr, iZzj17, i25));
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
                        iZzl = zzis.zzl(i3, bArr, i, i2, zzkmVar, zzirVar);
                    }
                    return i;
                }
                iZzl = zzis.zzf(bArr, i, zzkmVar, zzirVar);
                zzlz.zzC(obj, i4, zzkmVar, zzD(i6), null, this.zzn);
                return iZzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkg zzkgVar3 = (zzkg) zzkmVar;
                    int iZzj19 = zzis.zzj(bArr, i, zzirVar);
                    int i26 = zzirVar.zza + iZzj19;
                    while (iZzj19 < i26) {
                        iZzj19 = zzis.zzj(bArr, iZzj19, zzirVar);
                        zzkgVar3.zzh(zzji.zzb(zzirVar.zza));
                    }
                    if (iZzj19 == i26) {
                        return iZzj19;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzkg zzkgVar4 = (zzkg) zzkmVar;
                    int iZzj20 = zzis.zzj(bArr, i, zzirVar);
                    zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    while (iZzj20 < i2) {
                        int iZzj21 = zzis.zzj(bArr, iZzj20, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzis.zzj(bArr, iZzj21, zzirVar);
                        zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlb zzlbVar5 = (zzlb) zzkmVar;
                    int iZzj22 = zzis.zzj(bArr, i, zzirVar);
                    int i27 = zzirVar.zza + iZzj22;
                    while (iZzj22 < i27) {
                        iZzj22 = zzis.zzm(bArr, iZzj22, zzirVar);
                        zzlbVar5.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    if (iZzj22 == i27) {
                        return iZzj22;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar6 = (zzlb) zzkmVar;
                    int iZzm3 = zzis.zzm(bArr, i, zzirVar);
                    zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj23 = zzis.zzj(bArr, iZzm3, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzis.zzm(bArr, iZzj23, zzirVar);
                        zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzlx zzlxVarZzE = zzE(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzis.zzc(zzlxVarZzE, bArr, i, i2, i28, zzirVar);
                    zzlx zzlxVar = zzlxVarZzE;
                    zzir zzirVar2 = zzirVar;
                    zzkmVar.add(zzirVar2.zzc);
                    while (iZzc < i2) {
                        int iZzj24 = zzis.zzj(bArr, iZzc, zzirVar2);
                        if (i3 != zzirVar2.zza) {
                            return iZzc;
                        }
                        zzlx zzlxVar2 = zzlxVar;
                        zzir zzirVar3 = zzirVar2;
                        iZzc = zzis.zzc(zzlxVar2, bArr, iZzj24, i2, i28, zzirVar3);
                        zzkmVar.add(zzirVar3.zzc);
                        zzlxVar = zzlxVar2;
                        zzirVar2 = zzirVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int i2;
        int iZzc2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzB = zzB(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(Double.doubleToLongBits(zzmy.zza(obj, j)));
                    i3 = iZzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iZzc = Float.floatToIntBits(zzmy.zzb(obj, j));
                    i3 = iZzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 5:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 7:
                    i = i3 * 53;
                    iZzc = zzkn.zza(zzmy.zzw(obj, j));
                    i3 = iZzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iZzc = ((String) zzmy.zzf(obj, j)).hashCode();
                    i3 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzmy.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 14:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iZzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc2;
                    break;
                case 16:
                    i = i3 * 53;
                    iZzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzmy.zzf(obj, j);
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
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    iZzc = zzmy.zzf(obj, j).hashCode();
                    i3 = iZzc + i;
                    break;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i3 = iZzc + i;
                    }
                    break;
                case 52:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 53:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 54:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 55:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 57:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zza(zzY(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 59:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = ((String) zzmy.zzf(obj, j)).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 60:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 61:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
                case 62:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 66:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc2 = zzr(obj, j);
                        i3 = i2 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzkn.zzc(zzC(obj, j));
                        i3 = iZzc + i;
                    }
                    break;
                case 68:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iZzc = zzmy.zzf(obj, j).hashCode();
                        i3 = iZzc + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzir r34) throws com.google.android.gms.internal.measurement.zzkp {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzB = zzB(i);
                long j = 1048575 & iZzB;
                int iZzA = zzA(iZzB);
                if (iZzA != 9) {
                    switch (iZzA) {
                        case 17:
                            if (zzT(obj, i)) {
                                zzE(i).zzf(zzb.getObject(obj, j));
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
                            this.zzm.zza(obj, j);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (zzT(obj, i)) {
                    zzE(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 2:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 3:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 4:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 5:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 6:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 8:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 9:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 11:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 13:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 14:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 15:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 16:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 17:
                    zzK(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 60:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 68:
                    zzL(obj, obj2, i);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws zzkp {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) {
        if (!this.zzi) {
            zzQ(obj, zzngVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj, i)) {
                        zzngVar.zzf(i2, zzmy.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzT(obj, i)) {
                        zzngVar.zzo(i2, zzmy.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzT(obj, i)) {
                        zzngVar.zzt(i2, zzmy.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzT(obj, i)) {
                        zzngVar.zzJ(i2, zzmy.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzT(obj, i)) {
                        zzngVar.zzr(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzT(obj, i)) {
                        zzngVar.zzm(i2, zzmy.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzT(obj, i)) {
                        zzngVar.zzk(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzT(obj, i)) {
                        zzngVar.zzb(i2, zzmy.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzT(obj, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    }
                    break;
                case 9:
                    if (zzT(obj, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 10:
                    if (zzT(obj, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzT(obj, i)) {
                        zzngVar.zzH(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (zzT(obj, i)) {
                        zzngVar.zzi(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzT(obj, i)) {
                        zzngVar.zzw(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzT(obj, i)) {
                        zzngVar.zzy(i2, zzmy.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzT(obj, i)) {
                        zzngVar.zzA(i2, zzmy.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzT(obj, i)) {
                        zzngVar.zzC(i2, zzmy.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzT(obj, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case 28:
                    zzlz.zzI(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case 29:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 31:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 34:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zzR(zzngVar, i2, zzmy.zzf(obj, iZzB & 1048575), i);
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzf(i2, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzo(i2, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzt(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzJ(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzr(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzm(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzk(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzb(i2, zzY(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzX(obj, i2, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzH(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzi(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzw(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzy(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzA(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzC(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
            }
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzS(obj, obj2, i) || Double.doubleToLongBits(zzmy.zza(obj, j)) != Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzS(obj, obj2, i) || Float.floatToIntBits(zzmy.zzb(obj, j)) != Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzS(obj, obj2, i) || zzmy.zzw(obj, j) != zzmy.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    zZzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    zZzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, jZzy) != zzmy.zzc(obj2, jZzy) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[LOOP:1: B:45:0x00a7->B:50:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzlx zzlxVarZzE;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i12;
            }
            if ((268435456 & iZzB) != 0 && !zzU(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzU(obj, i7, i, i2, i11) && !zzV(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmy.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlxVarZzE = zzE(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzlxVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzX(obj, i8, i7) && !zzV(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmy.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzlxVarZzE = zzE(i7);
                    while (i3 < list.size()) {
                        if (!zzlxVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzlg) zzmy.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
