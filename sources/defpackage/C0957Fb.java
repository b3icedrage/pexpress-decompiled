package defpackage;

import android.webkit.WebView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0957Fb implements InterfaceC3376dW1.c {

    @NotNull
    public static final C4019gb d = new C4019gb();

    @NotNull
    public static final C2432Xo e = new C2432Xo();

    @NotNull
    public static final C5208m0 g = new C5208m0(1);

    @NotNull
    public static final int[] A(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        return iArr;
    }

    @NotNull
    public static final ArrayList B(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = f.i(0, jSONArray.length()).iterator();
        while (((DB0) it).g) {
            JSONObject jSONObject = jSONArray.getJSONObject(((CB0) it).b());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "this.getJSONObject(it)");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    @NotNull
    public static final C6508sA0 b(@NotNull RJ0 primitiveSerializer, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C6508sA0(name, new C6718tA0(primitiveSerializer));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(TY1 ty1, InterfaceC1060Gj0 interfaceC1060Gj0, Throwable th, LM lm) {
        C1048Gf0 c1048Gf0;
        if (lm instanceof C1048Gf0) {
            c1048Gf0 = (C1048Gf0) lm;
            int i = c1048Gf0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1048Gf0.g = i - Integer.MIN_VALUE;
            } else {
                c1048Gf0 = new C1048Gf0(lm);
            }
        } else {
            c1048Gf0 = new C1048Gf0(lm);
        }
        Object obj = c1048Gf0.e;
        MN mn = MN.d;
        int i2 = c1048Gf0.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                c1048Gf0.d = th;
                c1048Gf0.g = 1;
                if (interfaceC1060Gj0.k(ty1, th, c1048Gf0) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c1048Gf0.d;
                C1795Pt1.b(obj);
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                J90.a(th2, th);
            }
            throw th2;
        }
    }

    public static final void d(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            jSONObject.put(key, obj);
        }
    }

    public static final boolean e(long j) {
        return j > System.currentTimeMillis();
    }

    @Nullable
    public static final Object f(@NotNull Task task, @NotNull LM frame) throws Exception {
        if (!task.isComplete()) {
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            task.addOnCompleteListener(A10.d, new Nf2(c6251qy));
            Object objQ = c6251qy.q();
            if (objQ == MN.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objQ;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @NotNull
    public static final Set j(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "this.getJSONArray(fieldKey)");
            for (int i : A(jSONArray)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return CollectionsKt.h0(arrayList);
    }

    public static String k(long j) {
        Intrinsics.checkNotNullParameter("HH:mm:ss dd.MM.yy", "pattern");
        String str = new SimpleDateFormat("HH:mm:ss dd.MM.yy", new Locale("en")).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date(date))");
        return str;
    }

    @NotNull
    public static final InterfaceC2131Ub1 l(@NotNull InterfaceC2209Vb1 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        C2291Wb1 c2291Wb1 = new C2291Wb1();
        for (String str : parameters.names()) {
            List<String> listC = parameters.c(str);
            if (listC == null) {
                listC = C5653o60.d;
            }
            String strE = BE.e(str, 0, 0, 15);
            ArrayList arrayList = new ArrayList(XE.m(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(BE.e((String) it.next(), 0, 0, 11));
            }
            c2291Wb1.b(strE, arrayList);
        }
        Map<String, List<String>> values = c2291Wb1.a;
        Intrinsics.checkNotNullParameter(values, "values");
        return new C2395Xb1(values);
    }

    @NotNull
    public static final float[] m(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((CF) it.next()).c));
        }
        return CollectionsKt.c0(arrayList);
    }

    @NotNull
    public static final float[] n(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return m(list);
    }

    @NotNull
    public static final String o(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("error", "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        if (!jSONObject.has("error")) {
            return "";
        }
        String string = jSONObject.getString("error");
        Intrinsics.checkNotNullExpressionValue(string, "this.getString(key)");
        return string;
    }

    @Nullable
    public static final InterfaceC5044lD p(@NotNull InterfaceC4675jU interfaceC4675jU) {
        Intrinsics.checkNotNullParameter(interfaceC4675jU, "<this>");
        InterfaceC4675jU interfaceC4675jUE = interfaceC4675jU.e();
        if (interfaceC4675jUE == null || (interfaceC4675jU instanceof InterfaceC2392Xa1)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(interfaceC4675jUE, "<this>");
        if (!(interfaceC4675jUE.e() instanceof InterfaceC2392Xa1)) {
            return p(interfaceC4675jUE);
        }
        if (interfaceC4675jUE instanceof InterfaceC5044lD) {
            return (InterfaceC5044lD) interfaceC4675jUE;
        }
        return null;
    }

    public static void q(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('\t');
        }
    }

    public static final void r(@NotNull WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        WeakHashMap<WebView, String> weakHashMap = ZD1.a;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        WeakHashMap<WebView, String> weakHashMap2 = ZD1.a;
        synchronized (weakHashMap2) {
            weakHashMap2.put(webView, url);
            Unit unit = Unit.a;
        }
        webView.loadUrl(url);
    }

    public static final void s(@NotNull EY0 ey0, @NotNull Function1 handler) {
        Intrinsics.checkNotNullParameter(ey0, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ey0.f(new C2717aR0(ey0, handler));
    }

    @Nullable
    public static final JSONObject t(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.getJSONObject(key);
        }
        return null;
    }

    @Nullable
    public static final String u(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.getString(key);
        }
        return null;
    }

    @Nullable
    public static final FC v(@NotNull T01 t01, @NotNull C1758Ph0 fqName) {
        InterfaceC5044lD interfaceC5044lDF;
        QY0 qy0E0;
        S41 lookupLocation = S41.d;
        Intrinsics.checkNotNullParameter(t01, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (!fqName.d()) {
            C1758Ph0 c1758Ph0E = fqName.e();
            Intrinsics.checkNotNullExpressionValue(c1758Ph0E, "parent(...)");
            QY0 qy0V = t01.A0(c1758Ph0E).v();
            C5638o21 c5638o21F = fqName.f();
            Intrinsics.checkNotNullExpressionValue(c5638o21F, "shortName(...)");
            InterfaceC5044lD interfaceC5044lDF2 = ((AbstractC3062c1) qy0V).f(c5638o21F, lookupLocation);
            FC fc = interfaceC5044lDF2 instanceof FC ? (FC) interfaceC5044lDF2 : null;
            if (fc != null) {
                return fc;
            }
            C1758Ph0 c1758Ph0E2 = fqName.e();
            Intrinsics.checkNotNullExpressionValue(c1758Ph0E2, "parent(...)");
            FC fcV = v(t01, c1758Ph0E2);
            if (fcV == null || (qy0E0 = fcV.E0()) == null) {
                interfaceC5044lDF = null;
            } else {
                C5638o21 c5638o21F2 = fqName.f();
                Intrinsics.checkNotNullExpressionValue(c5638o21F2, "shortName(...)");
                interfaceC5044lDF = qy0E0.f(c5638o21F2, lookupLocation);
            }
            if (interfaceC5044lDF instanceof FC) {
                return (FC) interfaceC5044lDF;
            }
        }
        return null;
    }

    @NotNull
    public static final C7436wc1 w(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull InterfaceC6475s2 setter, @NotNull String name, boolean z) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        int iIntValue2 = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return x(z, setter, name, iIntValue2, iIntValue);
        }
        C7436wc1 c7436wc1X = x(z, setter, name, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            C5653o60 c5653o60 = C5653o60.d;
            iIntValue2++;
            c7436wc1X = new C7436wc1(c5653o60, WE.f(x(z, setter, name, iIntValue2, iIntValue2), UE.h(WE.f(new C7436wc1(VE.c(new C1747Pd1(" ")), c5653o60), c7436wc1X))));
        }
        if (iIntValue3 > iIntValue) {
            return UE.h(WE.f(new C7436wc1(VE.c(new C1747Pd1(d.k(iIntValue3 - iIntValue, " "))), C5653o60.d), c7436wc1X));
        }
        return iIntValue3 == iIntValue ? c7436wc1X : new C7436wc1(C5653o60.d, WE.f(x(z, setter, name, iIntValue3 + 1, iIntValue), c7436wc1X));
    }

    public static final C7436wc1 x(boolean z, InterfaceC6475s2 interfaceC6475s2, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        CQ0 cq0B = VE.b();
        if (z) {
            cq0B.add(new C1747Pd1("-"));
        }
        cq0B.add(new C7758y71(VE.c(new C7136v92(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), interfaceC6475s2, str, z))));
        return new C7436wc1(VE.a(cq0B), C5653o60.d);
    }

    @NotNull
    public static final C0612Aq y(@NotNull JSONObject jSONObject) throws JSONException {
        C1825Qd1 c1825Qd1;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        C0612Aq c0612Aq = new C0612Aq();
        String string = jSONObject.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string, "this.getString(\"event_type\")");
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        c0612Aq.N = string;
        c0612Aq.a = u(jSONObject, "user_id");
        c0612Aq.b = u(jSONObject, "device_id");
        C2046Sz0 c2046Sz0 = null;
        c0612Aq.c = jSONObject.has(C1575Mz0.TIME) ? Long.valueOf(jSONObject.getLong(C1575Mz0.TIME)) : null;
        JSONObject jSONObjectT = t(jSONObject, "event_properties");
        c0612Aq.O = jSONObjectT != null ? PW0.l(ID0.d(jSONObjectT)) : null;
        JSONObject jSONObjectT2 = t(jSONObject, "user_properties");
        c0612Aq.P = jSONObjectT2 != null ? PW0.l(ID0.d(jSONObjectT2)) : null;
        JSONObject jSONObjectT3 = t(jSONObject, "groups");
        c0612Aq.Q = jSONObjectT3 != null ? PW0.l(ID0.d(jSONObjectT3)) : null;
        JSONObject jSONObjectT4 = t(jSONObject, "group_properties");
        c0612Aq.R = jSONObjectT4 != null ? PW0.l(ID0.d(jSONObjectT4)) : null;
        c0612Aq.i = u(jSONObject, "app_version");
        c0612Aq.k = u(jSONObject, "platform");
        c0612Aq.l = u(jSONObject, "os_name");
        c0612Aq.m = u(jSONObject, "os_version");
        c0612Aq.n = u(jSONObject, "device_brand");
        c0612Aq.o = u(jSONObject, "device_manufacturer");
        c0612Aq.p = u(jSONObject, Payload.DEVICE_MODEL);
        c0612Aq.q = u(jSONObject, "carrier");
        c0612Aq.r = u(jSONObject, "country");
        c0612Aq.s = u(jSONObject, "region");
        c0612Aq.t = u(jSONObject, "city");
        c0612Aq.u = u(jSONObject, "dma");
        c0612Aq.A = u(jSONObject, "language");
        c0612Aq.G = jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null;
        c0612Aq.H = jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null;
        c0612Aq.F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        c0612Aq.I = u(jSONObject, "productId");
        c0612Aq.J = u(jSONObject, "revenueType");
        c0612Aq.g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        c0612Aq.h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        c0612Aq.C = u(jSONObject, "ip");
        c0612Aq.v = u(jSONObject, "idfa");
        c0612Aq.w = u(jSONObject, "idfv");
        c0612Aq.x = u(jSONObject, "adid");
        c0612Aq.z = u(jSONObject, "android_id");
        c0612Aq.y = jSONObject.optString("android_app_set_id", null);
        c0612Aq.d = jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null;
        c0612Aq.e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        c0612Aq.f = u(jSONObject, "insert_id");
        c0612Aq.B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        c0612Aq.L = u(jSONObject, "partner_id");
        if (jSONObject.has("plan")) {
            JSONObject jsonObject = jSONObject.getJSONObject("plan");
            Intrinsics.checkNotNullExpressionValue(jsonObject, "this.getJSONObject(\"plan\")");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            c1825Qd1 = new C1825Qd1(jsonObject.optString("branch", null), jsonObject.optString(Payload.SOURCE, null), jsonObject.optString("version", null), jsonObject.optString("versionId", null));
        } else {
            c1825Qd1 = null;
        }
        c0612Aq.D = c1825Qd1;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jsonObject2 = jSONObject.getJSONObject("ingestion_metadata");
            Intrinsics.checkNotNullExpressionValue(jsonObject2, "this.getJSONObject(\"ingestion_metadata\")");
            Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
            c2046Sz0 = new C2046Sz0(jsonObject2.optString("source_name", null), jsonObject2.optString("source_version", null));
        }
        c0612Aq.E = c2046Sz0;
        return c0612Aq;
    }

    @NotNull
    public static final ArrayList z(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = f.i(0, jSONArray.length()).iterator();
        while (((DB0) it).g) {
            JSONObject jSONObject = jSONArray.getJSONObject(((CB0) it).b());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "this.getJSONObject(it)");
            arrayList.add(y(jSONObject));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC3376dW1.c
    @NotNull
    public InterfaceC3376dW1 a(@NotNull InterfaceC3376dW1.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return io.sentry.android.sqlite.d.c(new C3423dj0(configuration.a, configuration.b, configuration.c, configuration.d, configuration.e));
    }

    public long g(int i) {
        return (long) Math.min(10000L, Math.pow(2.0d, i) * 1000);
    }
}
