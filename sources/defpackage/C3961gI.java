package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3961gI implements InterfaceC3541eI {

    @NotNull
    public final Context a;

    @NotNull
    public final ZT1 b;

    @NotNull
    public final C5698oK c;

    @NotNull
    public final InterfaceC1446Li d;

    @NotNull
    public final I50 e;

    public C3961gI(@NotNull Context context, @NotNull ZT1 subIdProvider, @NotNull C5698oK connectionStatusProvider, @NotNull InterfaceC1446Li applicationVersionProvider, @NotNull I50 emailUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(connectionStatusProvider, "connectionStatusProvider");
        Intrinsics.checkNotNullParameter(applicationVersionProvider, "applicationVersionProvider");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        this.a = context;
        this.b = subIdProvider;
        this.c = connectionStatusProvider;
        this.d = applicationVersionProvider;
        this.e = emailUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0180 A[PHI: r14
      0x0180: PHI (r14v14 boolean) = (r14v5 boolean), (r14v5 boolean), (r14v15 boolean) binds: [B:56:0x018e, B:61:0x019e, B:52:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    @Override // defpackage.InterfaceC3541eI
    @Nullable
    public final Object a(@NotNull LM lm) {
        C3751fI c3751fI;
        String packageName;
        String strValueOf;
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        Network[] allNetworks;
        int length;
        ?? r12;
        boolean zBooleanValue2;
        NetworkCapabilities networkCapabilities;
        String networkOperatorName;
        String simCountryIso;
        String networkCountryIso;
        String strB;
        Object objA;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        String str3;
        String str4;
        boolean z5;
        String str5;
        String str6;
        String str7;
        Object obj;
        MN mn;
        C3961gI c3961gI;
        boolean z6;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z7;
        String str13;
        String str14;
        String str15;
        boolean z8;
        String str16;
        String str17;
        if (lm instanceof C3751fI) {
            c3751fI = (C3751fI) lm;
            int i = c3751fI.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3751fI.u = i - Integer.MIN_VALUE;
            } else {
                c3751fI = new C3751fI(this, lm);
            }
        } else {
            c3751fI = new C3751fI(this, lm);
        }
        Object objO = c3751fI.s;
        MN mn2 = MN.d;
        int i2 = c3751fI.u;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z9 = c3751fI.r;
                z3 = c3751fI.q;
                z4 = c3751fI.p;
                str4 = c3751fI.o;
                String str18 = c3751fI.n;
                String str19 = c3751fI.m;
                String str20 = c3751fI.l;
                String str21 = c3751fI.k;
                String str22 = c3751fI.j;
                String str23 = c3751fI.i;
                String str24 = c3751fI.h;
                String str25 = c3751fI.g;
                obj = objO;
                String str26 = c3751fI.e;
                C3961gI c3961gI2 = (C3961gI) c3751fI.d;
                C1795Pt1.b(obj);
                mn = mn2;
                z5 = z9;
                packageName = str26;
                networkCountryIso = str18;
                str7 = str19;
                str5 = str20;
                strValueOf = str21;
                str6 = str22;
                str3 = str23;
                c3961gI = c3961gI2;
                str = str25;
                str2 = str24;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = c3751fI.r;
                boolean z11 = c3751fI.q;
                boolean z12 = c3751fI.p;
                String str27 = c3751fI.o;
                String str28 = c3751fI.n;
                String str29 = c3751fI.m;
                String str30 = c3751fI.l;
                String str31 = c3751fI.k;
                String str32 = c3751fI.j;
                String str33 = c3751fI.i;
                String str34 = c3751fI.h;
                String str35 = c3751fI.g;
                String str36 = c3751fI.e;
                String str37 = (String) c3751fI.d;
                C1795Pt1.b(objO);
                z7 = z11;
                str9 = str36;
                str11 = str28;
                str16 = str33;
                str17 = str31;
                str10 = str27;
                str14 = str34;
                str15 = str30;
                z8 = z12;
                str13 = str35;
                networkCountryIso = str29;
                str12 = str32;
                z6 = z10;
                str8 = str37;
            }
            return new GF(str8, str9, str13, str14, str16, str12, z8, z7, z6, str17, str15, networkCountryIso, str11, str10, (String) objO);
        }
        C1795Pt1.b(objO);
        Context context = this.a;
        packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String strA = this.d.a();
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        Locale locale = OI.a(Resources.getSystem().getConfiguration()).get(0);
        String strValueOf2 = String.valueOf(locale != null ? locale.getCountry() : null);
        Locale locale2 = OI.a(Resources.getSystem().getConfiguration()).get(0);
        strValueOf = String.valueOf(locale2 != null ? locale2.getLanguage() : null);
        C5698oK c5698oK = this.c;
        c5698oK.getClass();
        boolean z13 = Build.VERSION.SDK_INT >= 26;
        ConnectivityManager connectivityManager = c5698oK.a;
        if (z13) {
            zBooleanValue = ((Boolean) c5698oK.f.getValue()).booleanValue();
        } else {
            Network[] allNetworks2 = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks2, "getAllNetworks(...)");
            int length2 = allNetworks2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    zBooleanValue = false;
                    break;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(allNetworks2[i3]);
                if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4)) {
                    zBooleanValue = true;
                    break;
                }
                i3++;
                length2 = length2;
            }
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str38 = Build.PRODUCT;
        boolean z14 = "sdk".equals(str38) || "google_sdk".equals(str38) || string == null;
        String str39 = Build.TAGS;
        if (z14 || str39 == null) {
            z = false;
        } else {
            z = false;
            if (StringsKt.C(str39, "test-keys", false)) {
                z2 = true;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                zBooleanValue2 = ((Boolean) c5698oK.g.getValue()).booleanValue();
            } else {
                allNetworks = connectivityManager.getAllNetworks();
                length = allNetworks.length;
                r12 = z;
                while (true) {
                    if (r12 >= length) {
                        zBooleanValue2 = false;
                        break;
                    }
                    networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[r12]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                        zBooleanValue2 = true;
                        break;
                    }
                    allNetworks = allNetworks;
                    r12++;
                }
            }
            networkOperatorName = b().getNetworkOperatorName();
            Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
            simCountryIso = b().getSimCountryIso();
            Intrinsics.checkNotNullExpressionValue(simCountryIso, "getSimCountryIso(...)");
            networkCountryIso = b().getNetworkCountryIso();
            Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
            ZT1 zt1 = this.b;
            strB = zt1.b();
            c3751fI.d = this;
            c3751fI.e = packageName;
            c3751fI.g = strA;
            c3751fI.h = MANUFACTURER;
            c3751fI.i = MODEL;
            c3751fI.j = strValueOf2;
            c3751fI.k = strValueOf;
            c3751fI.l = networkOperatorName;
            c3751fI.m = simCountryIso;
            c3751fI.n = networkCountryIso;
            c3751fI.o = strB;
            c3751fI.p = zBooleanValue;
            c3751fI.q = z2;
            c3751fI.r = zBooleanValue2;
            c3751fI.u = 1;
            objA = zt1.a(c3751fI);
            if (objA == mn2) {
                return mn2;
            }
            z3 = z2;
            str = strA;
            str2 = MANUFACTURER;
            z4 = zBooleanValue;
            str3 = MODEL;
            str4 = strB;
            z5 = zBooleanValue2;
            str5 = networkOperatorName;
            str6 = strValueOf2;
            str7 = simCountryIso;
            obj = objA;
            mn = mn2;
            c3961gI = this;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            z2 = true;
        } else {
            File file = new File("/system/xbin/su");
            if (z14 || !file.exists()) {
                z2 = z;
            } else {
                z2 = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            zBooleanValue2 = ((Boolean) c5698oK.g.getValue()).booleanValue();
        } else {
            allNetworks = connectivityManager.getAllNetworks();
            length = allNetworks.length;
            r12 = z;
            while (true) {
                if (r12 >= length) {
                    zBooleanValue2 = false;
                    break;
                }
                networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[r12]);
                if (networkCapabilities != null) {
                    zBooleanValue2 = true;
                    break;
                }
                allNetworks = allNetworks;
                r12++;
            }
        }
        networkOperatorName = b().getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
        simCountryIso = b().getSimCountryIso();
        Intrinsics.checkNotNullExpressionValue(simCountryIso, "getSimCountryIso(...)");
        networkCountryIso = b().getNetworkCountryIso();
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        ZT1 zt2 = this.b;
        strB = zt2.b();
        c3751fI.d = this;
        c3751fI.e = packageName;
        c3751fI.g = strA;
        c3751fI.h = MANUFACTURER;
        c3751fI.i = MODEL;
        c3751fI.j = strValueOf2;
        c3751fI.k = strValueOf;
        c3751fI.l = networkOperatorName;
        c3751fI.m = simCountryIso;
        c3751fI.n = networkCountryIso;
        c3751fI.o = strB;
        c3751fI.p = zBooleanValue;
        c3751fI.q = z2;
        c3751fI.r = zBooleanValue2;
        c3751fI.u = 1;
        objA = zt2.a(c3751fI);
        if (objA == mn2) {
            return mn2;
        }
        z3 = z2;
        str = strA;
        str2 = MANUFACTURER;
        z4 = zBooleanValue;
        str3 = MODEL;
        str4 = strB;
        z5 = zBooleanValue2;
        str5 = networkOperatorName;
        str6 = strValueOf2;
        str7 = simCountryIso;
        obj = objA;
        mn = mn2;
        c3961gI = this;
        String str40 = (String) obj;
        InterfaceC6396rf0<String> interfaceC6396rf0K = c3961gI.e.k();
        c3751fI.d = packageName;
        c3751fI.e = str;
        c3751fI.g = str2;
        c3751fI.h = str3;
        c3751fI.i = str6;
        c3751fI.j = strValueOf;
        c3751fI.k = str5;
        c3751fI.l = str7;
        c3751fI.m = networkCountryIso;
        c3751fI.n = str4;
        c3751fI.o = str40;
        c3751fI.p = z4;
        c3751fI.q = z3;
        c3751fI.r = z5;
        String str41 = str;
        c3751fI.u = 2;
        objO = C4466ii.o(interfaceC6396rf0K, c3751fI);
        MN mn3 = mn;
        if (objO == mn3) {
            return mn3;
        }
        String str42 = strValueOf;
        z6 = z5;
        str8 = packageName;
        str9 = str41;
        str10 = str40;
        str11 = str4;
        str12 = str42;
        String str43 = str5;
        z7 = z3;
        str13 = str2;
        str14 = str3;
        str15 = str7;
        z8 = z4;
        str16 = str6;
        str17 = str43;
        return new GF(str8, str9, str13, str14, str16, str12, z8, z7, z6, str17, str15, networkCountryIso, str11, str10, (String) objO);
    }

    public final TelephonyManager b() {
        Object systemService = C6333rM.getSystemService(this.a, TelephonyManager.class);
        if (systemService != null) {
            return (TelephonyManager) systemService;
        }
        throw new IllegalStateException("The class is not a supported system service.");
    }
}
