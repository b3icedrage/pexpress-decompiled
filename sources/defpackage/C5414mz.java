package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5414mz implements U42 {
    public final YK a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final InterfaceC3529eE e;
    public final InterfaceC3529eE f;
    public final int g;

    /* JADX INFO: renamed from: mz$a */
    public static final class a {
        public final URL a;
        public final C2009Sn b;
        public final String c;

        public a(URL url, C2009Sn c2009Sn, String str) {
            this.a = url;
            this.b = c2009Sn;
            this.c = str;
        }
    }

    /* JADX INFO: renamed from: mz$b */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public C5414mz(Context context, InterfaceC3529eE interfaceC3529eE, InterfaceC3529eE interfaceC3529eE2) {
        DG0 dg0 = new DG0();
        C2426Xm c2426Xm = C2426Xm.a;
        dg0.a(AbstractC4967kr.class, c2426Xm);
        dg0.a(C2009Sn.class, c2426Xm);
        C2795an c2795an = C2795an.a;
        dg0.a(AbstractC5933pS0.class, c2795an);
        dg0.a(C0684Bo.class, c2795an);
        C2504Ym c2504Ym = C2504Ym.a;
        dg0.a(SD.class, c2504Ym);
        dg0.a(C2087Tn.class, c2504Ym);
        C2322Wm c2322Wm = C2322Wm.a;
        dg0.a(AbstractC2546Za.class, c2322Wm);
        dg0.a(C1775Pn.class, c2322Wm);
        C2582Zm c2582Zm = C2582Zm.a;
        dg0.a(AbstractC4880kS0.class, c2582Zm);
        dg0.a(C0606Ao.class, c2582Zm);
        C3019bn c3019bn = C3019bn.a;
        dg0.a(AbstractC5432n31.class, c3019bn);
        dg0.a(C0840Do.class, c3019bn);
        dg0.d = true;
        this.a = new YK(dg0);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(C2612Zw.c);
        this.e = interfaceC3529eE2;
        this.f = interfaceC3529eE;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C5491nL.c("Invalid url: ", str), e);
        }
    }

    @Override // defpackage.U42
    public final C1931Rn a(C1853Qn c1853Qn) {
        String str;
        b bVarA;
        Integer numValueOf;
        String str2;
        C0606Ao.a aVar;
        AbstractC1077Gp.a aVar2 = AbstractC1077Gp.a.e;
        HashMap map = new HashMap();
        for (AbstractC6081q80 abstractC6081q80 : c1853Qn.a) {
            String strG = abstractC6081q80.g();
            if (map.containsKey(strG)) {
                ((List) map.get(strG)).add(abstractC6081q80);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC6081q80);
                map.put(strG, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC6081q80 abstractC6081q81 = (AbstractC6081q80) ((List) entry.getValue()).get(0);
            EnumC7682xl1 enumC7682xl1 = EnumC7682xl1.d;
            long jD = this.f.d();
            long jD2 = this.e.d();
            C2087Tn c2087Tn = new C2087Tn(new C1775Pn(Integer.valueOf(abstractC6081q81.f("sdk-version")), abstractC6081q81.a("model"), abstractC6081q81.a("hardware"), abstractC6081q81.a("device"), abstractC6081q81.a("product"), abstractC6081q81.a("os-uild"), abstractC6081q81.a("manufacturer"), abstractC6081q81.a("fingerprint"), abstractC6081q81.a("locale"), abstractC6081q81.a("country"), abstractC6081q81.a("mcc_mnc"), abstractC6081q81.a("application_build")));
            try {
                str2 = null;
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                AbstractC6081q80 abstractC6081q82 = (AbstractC6081q80) it2.next();
                B60 b60D = abstractC6081q82.d();
                H60 h60 = b60D.a;
                Iterator it3 = it;
                Iterator it4 = it2;
                boolean zEquals = h60.equals(new H60("proto"));
                byte[] bArr = b60D.b;
                if (zEquals) {
                    aVar = new C0606Ao.a();
                    aVar.d = bArr;
                } else {
                    if (h60.equals(new H60("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        C0606Ao.a aVar3 = new C0606Ao.a();
                        aVar3.e = str3;
                        aVar = aVar3;
                    } else {
                        String strC = OS0.c("CctTransportBackend");
                        if (Log.isLoggable(strC, 5)) {
                            b0.e(strC, "Received event of unsupported encoding " + h60 + ". Skipping...");
                        }
                    }
                    it2 = it4;
                    it = it3;
                }
                aVar.a = Long.valueOf(abstractC6081q82.e());
                aVar.c = Long.valueOf(abstractC6081q82.h());
                String str4 = abstractC6081q82.b().get("tz-offset");
                aVar.f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.g = new C0840Do(AbstractC5432n31.b.d.get(abstractC6081q82.f("net-type")), AbstractC5432n31.a.d.get(abstractC6081q82.f("mobile-subtype")));
                if (abstractC6081q82.c() != null) {
                    aVar.b = abstractC6081q82.c();
                }
                String strC2 = aVar.a == null ? " eventTimeMs" : "";
                if (aVar.c == null) {
                    strC2 = strC2.concat(" eventUptimeMs");
                }
                if (aVar.f == null) {
                    strC2 = Z0.c(strC2, " timezoneOffsetSeconds");
                }
                if (!strC2.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strC2));
                }
                arrayList3.add(new C0606Ao(aVar.a.longValue(), aVar.b, aVar.c.longValue(), aVar.d, aVar.e, aVar.f.longValue(), aVar.g));
                it2 = it4;
                it = it3;
            }
            arrayList2.add(new C0684Bo(jD, jD2, c2087Tn, numValueOf, str2, arrayList3));
            it = it;
        }
        C2009Sn c2009Sn = new C2009Sn(arrayList2);
        AbstractC1077Gp.a aVar4 = AbstractC1077Gp.a.g;
        byte[] bArr2 = c1853Qn.b;
        URL urlC = this.d;
        if (bArr2 != null) {
            try {
                C2612Zw c2612ZwA = C2612Zw.a(bArr2);
                str = c2612ZwA.b;
                if (str == null) {
                    str = null;
                }
                String str5 = c2612ZwA.a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new C1931Rn(aVar4, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar5 = new a(urlC, c2009Sn, str);
            C7890yl c7890yl = new C7890yl(this);
            int i = 5;
            do {
                bVarA = c7890yl.a(aVar5);
                URL url = bVarA.b;
                if (url != null) {
                    OS0.a("CctTransportBackend", "Following redirect to: %s", url);
                    aVar5 = new a(url, aVar5.b, aVar5.c);
                } else {
                    aVar5 = null;
                }
                if (aVar5 == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            int i2 = bVarA.a;
            if (i2 == 200) {
                return new C1931Rn(AbstractC1077Gp.a.d, bVarA.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? new C1931Rn(AbstractC1077Gp.a.h, -1L) : new C1931Rn(aVar4, -1L);
            }
            return new C1931Rn(aVar2, -1L);
        } catch (IOException e) {
            OS0.b("CctTransportBackend", "Could not make request to the backend", e);
            return new C1931Rn(aVar2, -1L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102  */
    @Override // defpackage.U42
    public final C7060uo b(C7060uo c7060uo) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        C7060uo.a aVarI = c7060uo.i();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = aVarI.f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        aVarI.a("model", Build.MODEL);
        aVarI.a("hardware", Build.HARDWARE);
        aVarI.a("device", Build.DEVICE);
        aVarI.a("product", Build.PRODUCT);
        aVarI.a("os-uild", Build.ID);
        aVarI.a("manufacturer", Build.MANUFACTURER);
        aVarI.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        HashMap map3 = aVarI.f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<AbstractC5432n31.b> sparseArray = AbstractC5432n31.b.d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = aVarI.f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<AbstractC5432n31.a> sparseArray2 = AbstractC5432n31.a.d;
                subtype = 100;
            } else if (AbstractC5432n31.a.d.get(subtype) == null) {
            }
            map = aVarI.f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            aVarI.a("country", Locale.getDefault().getCountry());
            aVarI.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            aVarI.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                OS0.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            aVarI.a("application_build", Integer.toString(i2));
            return aVarI.b();
        }
        SparseArray<AbstractC5432n31.a> sparseArray3 = AbstractC5432n31.a.d;
        subtype = 0;
        map = aVarI.f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        aVarI.a("country", Locale.getDefault().getCountry());
        aVarI.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        aVarI.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        aVarI.a("application_build", Integer.toString(i2));
        return aVarI.b();
    }
}
