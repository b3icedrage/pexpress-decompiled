package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import j$.time.Clock;
import j$.time.Instant;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4979kv implements InterfaceC3881fv {

    @NotNull
    public final C4797k3 a;

    @NotNull
    public final C2405Xf b;

    @NotNull
    public final C7239vg c;

    @NotNull
    public final C6587sa1.a d;

    @NotNull
    public final C6587sa1.c e;

    @NotNull
    public final C6587sa1.b f;
    public long g;
    public long h;
    public final int i;
    public final int j;
    public final int k;

    public C4979kv(@NotNull C4797k3 context, @NotNull C2405Xf userId, @NotNull C7239vg productEmail, @NotNull C6587sa1.a getAdvertisingId, @NotNull C6587sa1.c getFirebaseId, @NotNull C6587sa1.b getAppSetId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(productEmail, "productEmail");
        Intrinsics.checkNotNullParameter(getAdvertisingId, "getAdvertisingId");
        Intrinsics.checkNotNullParameter(getFirebaseId, "getFirebaseId");
        Intrinsics.checkNotNullParameter(getAppSetId, "getAppSetId");
        Intrinsics.checkNotNullParameter("Pocket Matix", "appName");
        this.a = context;
        this.b = userId;
        this.c = productEmail;
        this.d = getAdvertisingId;
        this.e = getFirebaseId;
        this.f = getAppSetId;
        long jE = e();
        this.g = jE;
        this.h = jE;
        DisplayMetrics displayMetrics = ((ApplicationC0963Fd) context.e).getResources().getDisplayMetrics();
        this.i = displayMetrics.widthPixels;
        this.j = displayMetrics.heightPixels;
        this.k = displayMetrics.densityDpi;
    }

    public static long e() {
        VA0.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        new VA0(instant);
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    /* JADX WARN: Code duplicated, block: B:38:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0150  */
    /* JADX WARN: Code duplicated, block: B:44:0x0153  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156  */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.InterfaceC3881fv
    @Nullable
    public final Object a(@NotNull Map map, @NotNull LM lm) throws PackageManager.NameNotFoundException {
        C4769jv c4769jv;
        String string;
        String str;
        Map map2;
        C4979kv c4979kv;
        String str2;
        C4979kv c4979kv2;
        String str3;
        Map map3;
        String str4;
        Object systemService;
        TelephonyManager telephonyManager;
        String networkOperatorName;
        String country;
        PackageInfo packageInfo;
        String str5;
        long jE;
        long j;
        TelephonyManager telephonyManager2;
        String networkCountryIso;
        if (lm instanceof C4769jv) {
            c4769jv = (C4769jv) lm;
            int i = c4769jv.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4769jv.l = i - Integer.MIN_VALUE;
            } else {
                c4769jv = new C4769jv(this, lm);
            }
        } else {
            c4769jv = new C4769jv(this, lm);
        }
        Object obj = c4769jv.j;
        MN mn = MN.d;
        int i2 = c4769jv.l;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            VA0.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            string = new VA0(instant).toString();
            c4769jv.d = this;
            c4769jv.e = map;
            c4769jv.g = string2;
            c4769jv.h = string;
            c4769jv.l = 1;
            Object objF = f(c4769jv);
            if (objF != mn) {
                str = string2;
                obj = objF;
                map2 = map;
                c4979kv = this;
            }
            return mn;
        }
        if (i2 == 1) {
            string = c4769jv.h;
            str = c4769jv.g;
            map2 = c4769jv.e;
            c4979kv = c4769jv.d;
            C1795Pt1.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = c4769jv.i;
            String str7 = c4769jv.h;
            String str8 = c4769jv.g;
            Map map4 = c4769jv.e;
            c4979kv2 = c4769jv.d;
            C1795Pt1.b(obj);
            str2 = str6;
            str3 = str7;
            str4 = str8;
            map3 = map4;
        }
        C1800Pv0 c1800Pv0 = (C1800Pv0) obj;
        JsonNull jsonNull = JsonNull.INSTANCE;
        ApplicationC0963Fd applicationC0963Fd = (ApplicationC0963Fd) c4979kv2.a.e;
        String str9 = Build.MANUFACTURER;
        String str10 = Build.MODEL;
        systemService = applicationC0963Fd.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null) {
            networkOperatorName = telephonyManager.getNetworkOperatorName();
        } else {
            networkOperatorName = null;
        }
        String str11 = Build.VERSION.RELEASE;
        String strD = c4979kv2.d();
        VD1 vd1 = new VD1(c4979kv2.i, c4979kv2.j, c4979kv2.k);
        try {
            Object systemService2 = applicationC0963Fd.getSystemService("phone");
            Intrinsics.c(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            telephonyManager2 = (TelephonyManager) systemService2;
            if (telephonyManager2.getPhoneType() != 2 || (networkCountryIso = telephonyManager2.getNetworkCountryIso()) == null) {
                country = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                country = networkCountryIso.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(country, "toUpperCase(...)");
            }
        } catch (Exception unused) {
        }
        if (country == null) {
            country = Locale.getDefault().getCountry();
        }
        C4996l00 c4996l00 = new C4996l00(strD, networkOperatorName, vd1, new UR0(country));
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        ApplicationC0963Fd applicationC0963Fd2 = (ApplicationC0963Fd) c4979kv2.a.e;
        packageInfo = applicationC0963Fd2.getPackageManager().getPackageInfo(applicationC0963Fd2.getPackageName(), 0);
        if (packageInfo != null) {
            str5 = packageInfo.versionName;
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = "-1";
        }
        String str12 = str5;
        jE = e();
        j = jE - c4979kv2.h;
        b.a aVar = b.e;
        if (j > b.l(c.g(30, R40.MINUTES))) {
            c4979kv2.g = jE;
        }
        c4979kv2.h = jE;
        return new C4672jT(str4, "identify", str2, c1800Pv0, map3, jsonNull, c4996l00, language, "android", "Pocket Matix", str12, "1.1.16.compexpressevents", c4979kv2.g, str3);
        String str13 = (String) obj;
        c4769jv.d = c4979kv;
        c4769jv.e = map2;
        c4769jv.g = str;
        c4769jv.h = string;
        c4769jv.i = str13;
        c4769jv.l = 2;
        Object objC = c4979kv.c(c4769jv);
        if (objC != mn) {
            str2 = str13;
            obj = objC;
            c4979kv2 = c4979kv;
            str3 = string;
            map3 = map2;
            str4 = str;
            C1800Pv0 c1800Pv1 = (C1800Pv0) obj;
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            ApplicationC0963Fd applicationC0963Fd3 = (ApplicationC0963Fd) c4979kv2.a.e;
            String str14 = Build.MANUFACTURER;
            String str15 = Build.MODEL;
            systemService = applicationC0963Fd3.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            } else {
                telephonyManager = null;
            }
            if (telephonyManager != null) {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
            } else {
                networkOperatorName = null;
            }
            String str16 = Build.VERSION.RELEASE;
            String strD2 = c4979kv2.d();
            VD1 vd2 = new VD1(c4979kv2.i, c4979kv2.j, c4979kv2.k);
            Object systemService3 = applicationC0963Fd3.getSystemService("phone");
            Intrinsics.c(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            telephonyManager2 = (TelephonyManager) systemService3;
            if (telephonyManager2.getPhoneType() != 2) {
                country = null;
            } else {
                country = null;
            }
            if (country == null) {
                country = Locale.getDefault().getCountry();
            }
            C4996l00 c4996l01 = new C4996l00(strD2, networkOperatorName, vd2, new UR0(country));
            String language2 = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
            ApplicationC0963Fd applicationC0963Fd4 = (ApplicationC0963Fd) c4979kv2.a.e;
            packageInfo = applicationC0963Fd4.getPackageManager().getPackageInfo(applicationC0963Fd4.getPackageName(), 0);
            if (packageInfo != null) {
                str5 = packageInfo.versionName;
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = "-1";
            }
            String str17 = str5;
            jE = e();
            j = jE - c4979kv2.h;
            b.a aVar2 = b.e;
            if (j > b.l(c.g(30, R40.MINUTES))) {
                c4979kv2.g = jE;
            }
            c4979kv2.h = jE;
            return new C4672jT(str4, "identify", str2, c1800Pv1, map3, jsonNull2, c4996l01, language2, "android", "Pocket Matix", str17, "1.1.16.compexpressevents", c4979kv2.g, str3);
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.InterfaceC3881fv
    @Nullable
    public final Object b(@NotNull C2658a80 c2658a80, @NotNull Map map, @NotNull LM lm) throws PackageManager.NameNotFoundException {
        C4549iv c4549iv;
        C2658a80 c2658a81;
        Object objA;
        if (lm instanceof C4549iv) {
            c4549iv = (C4549iv) lm;
            int i = c4549iv.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4549iv.h = i - Integer.MIN_VALUE;
            } else {
                c4549iv = new C4549iv(this, lm);
            }
        } else {
            c4549iv = new C4549iv(this, lm);
        }
        Object obj = c4549iv.e;
        Object obj2 = MN.d;
        int i2 = c4549iv.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c2658a81 = c2658a80;
            c4549iv.d = c2658a81;
            c4549iv.h = 1;
            objA = a(map, c4549iv);
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2658a80 c2658a82 = c4549iv.d;
            C1795Pt1.b(obj);
            objA = obj;
            c2658a81 = c2658a82;
        }
        C4672jT c4672jT = (C4672jT) objA;
        String eventType = c2658a81.a;
        String eventId = c4672jT.a;
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        String trackerId = c4672jT.c;
        Intrinsics.checkNotNullParameter(trackerId, "trackerId");
        C1800Pv0 identity = c4672jT.d;
        Intrinsics.checkNotNullParameter(identity, "identity");
        Map<String, JsonElement> properties = c4672jT.e;
        Intrinsics.checkNotNullParameter(properties, "properties");
        JsonElement eventProperties = c2658a81.b;
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        C4996l00 deviceInfo = c4672jT.g;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        String language = c4672jT.h;
        Intrinsics.checkNotNullParameter(language, "language");
        String platform = c4672jT.i;
        Intrinsics.checkNotNullParameter(platform, "platform");
        String appName = c4672jT.j;
        Intrinsics.checkNotNullParameter(appName, "appName");
        String currentAppVersion = c4672jT.k;
        Intrinsics.checkNotNullParameter(currentAppVersion, "currentAppVersion");
        String currentLibraryVersion = c4672jT.l;
        Intrinsics.checkNotNullParameter(currentLibraryVersion, "currentLibraryVersion");
        String utcTime = c4672jT.n;
        Intrinsics.checkNotNullParameter(utcTime, "utcTime");
        return new C4672jT(eventId, eventType, trackerId, identity, properties, eventProperties, deviceInfo, language, platform, appName, currentAppVersion, currentLibraryVersion, c4672jT.m, utcTime);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LM lm) {
        C4091gv c4091gv;
        C4979kv c4979kv;
        String str;
        C4979kv c4979kv2;
        String str2;
        String str3;
        String str4;
        String str5;
        Object objF;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object objInvoke;
        String str11;
        String str12;
        String str13;
        if (lm instanceof C4091gv) {
            c4091gv = (C4091gv) lm;
            int i = c4091gv.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4091gv.m = i - Integer.MIN_VALUE;
            } else {
                c4091gv = new C4091gv(this, lm);
            }
        } else {
            c4091gv = new C4091gv(this, lm);
        }
        Object objInvoke2 = c4091gv.k;
        MN mn = MN.d;
        int i2 = c4091gv.m;
        if (i2 == 0) {
            C1795Pt1.b(objInvoke2);
            c4091gv.d = this;
            c4091gv.m = 1;
            objInvoke2 = this.d.invoke(c4091gv);
            if (objInvoke2 != mn) {
                c4979kv = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c4979kv = (C4979kv) c4091gv.d;
            C1795Pt1.b(objInvoke2);
        } else {
            if (i2 == 2) {
                str2 = c4091gv.g;
                str = c4091gv.e;
                C4979kv c4979kv3 = (C4979kv) c4091gv.d;
                C1795Pt1.b(objInvoke2);
                c4979kv2 = c4979kv3;
                str3 = (String) objInvoke2;
                str4 = (String) c4979kv2.b.invoke();
                str5 = (String) c4979kv2.c.invoke();
                c4091gv.d = c4979kv2;
                c4091gv.e = str;
                c4091gv.g = str2;
                c4091gv.h = str3;
                c4091gv.i = str4;
                c4091gv.j = str5;
                c4091gv.m = 3;
                objF = c4979kv2.f(c4091gv);
                if (objF != mn) {
                    str6 = str3;
                    objInvoke2 = objF;
                    str7 = str4;
                    str8 = str2;
                    str9 = str5;
                    str10 = (String) objInvoke2;
                    C6587sa1.c cVar = c4979kv2.e;
                    c4091gv.d = str;
                    c4091gv.e = str8;
                    c4091gv.g = str6;
                    c4091gv.h = str7;
                    c4091gv.i = str9;
                    c4091gv.j = str10;
                    c4091gv.m = 4;
                    objInvoke = cVar.invoke(c4091gv);
                    if (objInvoke != mn) {
                        str11 = str10;
                        objInvoke2 = objInvoke;
                        str12 = str6;
                        str13 = str;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                str9 = c4091gv.j;
                str7 = c4091gv.i;
                String str14 = c4091gv.h;
                String str15 = c4091gv.g;
                String str16 = c4091gv.e;
                c4979kv2 = (C4979kv) c4091gv.d;
                C1795Pt1.b(objInvoke2);
                str6 = str14;
                str = str16;
                str8 = str15;
                str10 = (String) objInvoke2;
                C6587sa1.c cVar2 = c4979kv2.e;
                c4091gv.d = str;
                c4091gv.e = str8;
                c4091gv.g = str6;
                c4091gv.h = str7;
                c4091gv.i = str9;
                c4091gv.j = str10;
                c4091gv.m = 4;
                objInvoke = cVar2.invoke(c4091gv);
                if (objInvoke != mn) {
                    str11 = str10;
                    objInvoke2 = objInvoke;
                    str12 = str6;
                    str13 = str;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str11 = c4091gv.j;
            str9 = c4091gv.i;
            String str17 = c4091gv.h;
            String str18 = c4091gv.g;
            String str19 = c4091gv.e;
            String str20 = (String) c4091gv.d;
            C1795Pt1.b(objInvoke2);
            str7 = str17;
            str12 = str18;
            str13 = str20;
            str8 = str19;
        }
        return new C1800Pv0(str11, (String) objInvoke2, str12, str7, str9, str13, str8);
        String str21 = (String) objInvoke2;
        String strD = c4979kv.d();
        c4091gv.d = c4979kv;
        c4091gv.e = str21;
        c4091gv.g = strD;
        c4091gv.m = 2;
        Object objInvoke3 = c4979kv.f.invoke(c4091gv);
        if (objInvoke3 != mn) {
            str = str21;
            objInvoke2 = objInvoke3;
            c4979kv2 = c4979kv;
            str2 = strD;
            str3 = (String) objInvoke2;
            str4 = (String) c4979kv2.b.invoke();
            str5 = (String) c4979kv2.c.invoke();
            c4091gv.d = c4979kv2;
            c4091gv.e = str;
            c4091gv.g = str2;
            c4091gv.h = str3;
            c4091gv.i = str4;
            c4091gv.j = str5;
            c4091gv.m = 3;
            objF = c4979kv2.f(c4091gv);
            if (objF != mn) {
                str6 = str3;
                objInvoke2 = objF;
                str7 = str4;
                str8 = str2;
                str9 = str5;
                str10 = (String) objInvoke2;
                C6587sa1.c cVar3 = c4979kv2.e;
                c4091gv.d = str;
                c4091gv.e = str8;
                c4091gv.g = str6;
                c4091gv.h = str7;
                c4091gv.i = str9;
                c4091gv.j = str10;
                c4091gv.m = 4;
                objInvoke = cVar3.invoke(c4091gv);
                if (objInvoke != mn) {
                    str11 = str10;
                    objInvoke2 = objInvoke;
                    str12 = str6;
                    str13 = str;
                    return new C1800Pv0(str11, (String) objInvoke2, str12, str7, str9, str13, str8);
                }
            }
        }
        return mn;
    }

    @SuppressLint({"HardwareIds"})
    public final String d() {
        String string = Settings.Secure.getString(((Context) this.a.invoke()).getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(LM lm) {
        C4301hv c4301hv;
        C4979kv c4979kv;
        C4979kv c4979kv2;
        String str;
        if (lm instanceof C4301hv) {
            c4301hv = (C4301hv) lm;
            int i = c4301hv.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4301hv.h = i - Integer.MIN_VALUE;
            } else {
                c4301hv = new C4301hv(this, lm);
            }
        } else {
            c4301hv = new C4301hv(this, lm);
        }
        Object objInvoke = c4301hv.e;
        MN mn = MN.d;
        int i2 = c4301hv.h;
        if (i2 == 0) {
            C1795Pt1.b(objInvoke);
            c4301hv.d = this;
            c4301hv.h = 1;
            objInvoke = this.d.invoke(c4301hv);
            if (objInvoke != mn) {
                c4979kv = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c4979kv = c4301hv.d;
            C1795Pt1.b(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4979kv2 = c4301hv.d;
            C1795Pt1.b(objInvoke);
        }
        str = (String) objInvoke;
        if (str == null) {
            return c4979kv2.d();
        }
        return str;
        String str2 = (String) objInvoke;
        if (str2 != null) {
            return str2;
        }
        C6587sa1.b bVar = c4979kv.f;
        c4301hv.d = c4979kv;
        c4301hv.h = 2;
        objInvoke = bVar.invoke(c4301hv);
        if (objInvoke != mn) {
            c4979kv2 = c4979kv;
            str = (String) objInvoke;
            if (str == null) {
                return c4979kv2.d();
            }
            return str;
        }
        return mn;
    }
}
