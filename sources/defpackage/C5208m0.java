package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.JwtParser;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5208m0 implements Zc2 {

    @NotNull
    public static final C5208m0 e = new C5208m0(4);
    public static final C5208m0 g = new C5208m0(5);

    @NotNull
    public static final GW1 h = new GW1("NULL");

    @NotNull
    public static final GW1 i = new GW1("UNINITIALIZED");

    @NotNull
    public static final GW1 j = new GW1("DONE");
    public final /* synthetic */ int d;

    public /* synthetic */ C5208m0(int i2) {
        this.d = i2;
    }

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static C1690Ok1 b(InterfaceC1531Mk1 interfaceC1531Mk1) {
        interfaceC1531Mk1.getClass();
        return new C1690Ok1(interfaceC1531Mk1);
    }

    public static final AbstractC4649jL0 c(ArrayList arrayList, List list, RK0 rk0) {
        AbstractC4649jL0 abstractC4649jL0J = X62.e(new C4872kP1(arrayList)).j((AbstractC4649jL0) CollectionsKt.F(list), EnumC3610ed2.OUT_VARIANCE);
        if (abstractC4649jL0J != null) {
            return abstractC4649jL0J;
        }
        AbstractC5706oM1 abstractC5706oM1M = rk0.m();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1M, "getDefaultBound(...)");
        return abstractC5706oM1M;
    }

    public static final byte e(char c) {
        if (c < '~') {
            return C6088qA.b[c];
        }
        return (byte) 0;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @NotNull
    public static final InterfaceC2396Xc g(@NotNull InterfaceC2396Xc first, @NotNull InterfaceC2396Xc second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new DH(first, second);
    }

    @NotNull
    public static JSONObject j(@NotNull C0612Aq event) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", event.a());
        C0957Fb.d(jSONObject, "user_id", event.a);
        C0957Fb.d(jSONObject, "device_id", event.b);
        C0957Fb.d(jSONObject, C1575Mz0.TIME, event.c);
        C0957Fb.d(jSONObject, "event_properties", w(ID0.c(event.O)));
        C0957Fb.d(jSONObject, "user_properties", w(ID0.c(event.P)));
        C0957Fb.d(jSONObject, "groups", w(ID0.c(event.Q)));
        C0957Fb.d(jSONObject, "group_properties", w(ID0.c(event.R)));
        C0957Fb.d(jSONObject, "app_version", event.i);
        C0957Fb.d(jSONObject, "platform", event.k);
        C0957Fb.d(jSONObject, "os_name", event.l);
        C0957Fb.d(jSONObject, "os_version", event.m);
        C0957Fb.d(jSONObject, "device_brand", event.n);
        C0957Fb.d(jSONObject, "device_manufacturer", event.o);
        C0957Fb.d(jSONObject, Payload.DEVICE_MODEL, event.p);
        C0957Fb.d(jSONObject, "carrier", event.q);
        C0957Fb.d(jSONObject, "country", event.r);
        C0957Fb.d(jSONObject, "region", event.s);
        C0957Fb.d(jSONObject, "city", event.t);
        C0957Fb.d(jSONObject, "dma", event.u);
        C0957Fb.d(jSONObject, "language", event.A);
        C0957Fb.d(jSONObject, "price", event.G);
        C0957Fb.d(jSONObject, "quantity", event.H);
        C0957Fb.d(jSONObject, "revenue", event.F);
        C0957Fb.d(jSONObject, "productId", event.I);
        C0957Fb.d(jSONObject, "revenueType", event.J);
        C0957Fb.d(jSONObject, "location_lat", event.g);
        C0957Fb.d(jSONObject, "location_lng", event.h);
        C0957Fb.d(jSONObject, "ip", event.C);
        C0957Fb.d(jSONObject, "version_name", event.j);
        C0957Fb.d(jSONObject, "idfa", event.v);
        C0957Fb.d(jSONObject, "idfv", event.w);
        C0957Fb.d(jSONObject, "adid", event.x);
        C0957Fb.d(jSONObject, "android_id", event.z);
        C0957Fb.d(jSONObject, "event_id", event.d);
        C0957Fb.d(jSONObject, "session_id", event.e);
        C0957Fb.d(jSONObject, "insert_id", event.f);
        C0957Fb.d(jSONObject, "library", event.B);
        C0957Fb.d(jSONObject, "partner_id", event.L);
        C0957Fb.d(jSONObject, "android_app_set_id", event.y);
        C1825Qd1 c1825Qd1 = event.D;
        DS0.a aVar = DS0.a.h;
        if (c1825Qd1 != null) {
            JSONObject jSONObject2 = new JSONObject();
            String str5 = c1825Qd1.a;
            if (str5 != null) {
                try {
                    if (str5.length() != 0) {
                        jSONObject2.put("branch", str5);
                    }
                    str2 = c1825Qd1.b;
                    if (str2 != null && str2.length() != 0) {
                        jSONObject2.put(Payload.SOURCE, str2);
                    }
                    str3 = c1825Qd1.c;
                    if (str3 != null && str3.length() != 0) {
                        jSONObject2.put("version", str3);
                    }
                    str4 = c1825Qd1.d;
                    if (str4 != null && str4.length() != 0) {
                        jSONObject2.put("versionId", str4);
                    }
                } catch (JSONException unused) {
                    Intrinsics.checkNotNullParameter("JSON Serialization of tacking plan object failed", "message");
                    C7378wK.b(aVar, "JSON Serialization of tacking plan object failed");
                }
            } else {
                str2 = c1825Qd1.b;
                if (str2 != null) {
                    jSONObject2.put(Payload.SOURCE, str2);
                }
                str3 = c1825Qd1.c;
                if (str3 != null) {
                    jSONObject2.put("version", str3);
                }
                str4 = c1825Qd1.d;
                if (str4 != null) {
                    jSONObject2.put("versionId", str4);
                }
            }
            jSONObject.put("plan", jSONObject2);
        }
        C2046Sz0 c2046Sz0 = event.E;
        if (c2046Sz0 != null) {
            JSONObject jSONObject3 = new JSONObject();
            String str6 = c2046Sz0.a;
            if (str6 != null) {
                try {
                    if (str6.length() != 0) {
                        jSONObject3.put("source_name", str6);
                    }
                    str = c2046Sz0.b;
                    if (str != null && str.length() != 0) {
                        jSONObject3.put("source_version", str);
                    }
                } catch (JSONException unused2) {
                    Intrinsics.checkNotNullParameter("JSON Serialization of ingestion metadata object failed", "message");
                    C7378wK.b(aVar, "JSON Serialization of ingestion metadata object failed");
                }
            } else {
                str = c2046Sz0.b;
                if (str != null) {
                    jSONObject3.put("source_version", str);
                }
            }
            jSONObject.put("ingestion_metadata", jSONObject3);
        }
        return jSONObject;
    }

    public static String l(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final void m(@NotNull LL ll, @NotNull JT0 from, @NotNull FC scopeOwner, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(ll, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (ll == LL.g) {
            return;
        }
        from.getClass();
    }

    public static final void n(@NotNull LL ll, @NotNull JT0 from, @NotNull InterfaceC2392Xa1 scopeOwner, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(ll, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String packageFqName = scopeOwner.c().b();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "asString(...)");
        String name2 = name.e();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(ll, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name2, "name");
        if (ll == LL.g) {
            return;
        }
        from.getClass();
    }

    @NotNull
    public static final AbstractC4649jL0 q(@NotNull H62 h62) {
        Intrinsics.checkNotNullParameter(h62, "<this>");
        InterfaceC4675jU interfaceC4675jUE = h62.e();
        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
        if (interfaceC4675jUE instanceof InterfaceC5257mD) {
            List<H62> listB = ((InterfaceC5257mD) interfaceC4675jUE).p().b();
            Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
            ArrayList arrayList = new ArrayList(XE.m(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                InterfaceC6494s62 interfaceC6494s62P = ((H62) it.next()).p();
                Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
                arrayList.add(interfaceC6494s62P);
            }
            List<AbstractC4649jL0> upperBounds = h62.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return c(arrayList, upperBounds, C4900kZ.e(h62));
        }
        if (!(interfaceC4675jUE instanceof InterfaceC2076Tj0)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<H62> listW = ((InterfaceC2076Tj0) interfaceC4675jUE).w();
        Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(XE.m(listW, 10));
        Iterator<T> it2 = listW.iterator();
        while (it2.hasNext()) {
            InterfaceC6494s62 interfaceC6494s62P2 = ((H62) it2.next()).p();
            Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P2, "getTypeConstructor(...)");
            arrayList2.add(interfaceC6494s62P2);
        }
        List<AbstractC4649jL0> upperBounds2 = h62.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        return c(arrayList2, upperBounds2, C4900kZ.e(h62));
    }

    @NotNull
    public static X62 r(@NotNull List list, @NotNull T62 t62, @NotNull InterfaceC4675jU interfaceC4675jU, @NotNull ArrayList arrayList) {
        if (t62 == null) {
            a(1);
            throw null;
        }
        if (interfaceC4675jU == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        X62 x62S = s(list, t62, interfaceC4675jU, arrayList, null);
        if (x62S != null) {
            return x62S;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    @Nullable
    public static X62 s(@NotNull List list, @NotNull T62 t62, @NotNull InterfaceC4675jU interfaceC4675jU, @NotNull ArrayList arrayList, @Nullable boolean[] zArr) {
        X62 x62;
        if (t62 == null) {
            a(6);
            throw null;
        }
        if (interfaceC4675jU == null) {
            a(7);
            throw null;
        }
        if (arrayList == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            H62 h62 = (H62) it.next();
            I62 i62X0 = I62.X0(interfaceC4675jU, h62.k(), h62.K(), h62.S(), h62.getName(), i2, h62.o0());
            map.put(h62.p(), new P62(i62X0.y()));
            map2.put(h62, i62X0);
            arrayList.add(i62X0);
            i2++;
        }
        AbstractC7124v62.a aVar = AbstractC7124v62.b;
        Intrinsics.checkNotNullParameter(map, "map");
        C6914u62 c6914u62B = AbstractC7124v62.a.b(aVar, map);
        X62 x62F = X62.f(t62, c6914u62B);
        X62 x62F2 = X62.f(new U62(t62), c6914u62B);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            H62 h63 = (H62) it2.next();
            I62 i62 = (I62) map2.get(h63);
            for (AbstractC4649jL0 abstractC4649jL0 : h63.getUpperBounds()) {
                InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
                if (interfaceC5044lDC instanceof H62) {
                    H62 typeParameter = (H62) interfaceC5044lDC;
                    Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                    if (C0564Aa.q(typeParameter, null, 6)) {
                        x62 = x62F;
                    } else {
                        x62 = x62F2;
                    }
                } else {
                    x62 = x62F2;
                }
                AbstractC4649jL0 abstractC4649jL0J = x62.j(abstractC4649jL0, EnumC3610ed2.OUT_VARIANCE);
                if (abstractC4649jL0J == null) {
                    return null;
                }
                if (abstractC4649jL0J != abstractC4649jL0 && zArr != null) {
                    zArr[0] = true;
                }
                if (i62.p) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + i62.Z0());
                }
                if (!C3686f.n(abstractC4649jL0J)) {
                    i62.o.add(abstractC4649jL0J);
                }
            }
            if (i62.p) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + i62.Z0());
            }
            i62.p = true;
        }
        return x62F;
    }

    public static void t(int i2, int i3, String str, Function0 block) {
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        MY1 my1 = new MY1(block);
        if (i2 > 0) {
            my1.setPriority(i2);
        }
        if (str != null) {
            my1.setName(str);
        }
        my1.start();
    }

    @NotNull
    public static final String u(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    @NotNull
    public static JSONArray v(@Nullable JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                String strSubstring = (String) obj;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONArray.put(i2, strSubstring);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i2, w((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                JSONArray jSONArray2 = (JSONArray) obj;
                v(jSONArray2);
                jSONArray.put(i2, jSONArray2);
            }
        }
        return jSONArray;
    }

    public static JSONObject w(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "obj.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.c(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (obj.getClass().equals(String.class)) {
                    String strSubstring = (String) obj;
                    if (strSubstring.length() > 1024) {
                        strSubstring = strSubstring.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    jSONObject.put(str, strSubstring);
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(str, w((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    v(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }

    @Override // defpackage.Zc2
    public Object d(AbstractC7580xH0 abstractC7580xH0, float f) {
        return Integer.valueOf(Math.round(VH0.d(abstractC7580xH0) * f));
    }

    public void h(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public void i(@NotNull File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + directory);
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                i(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }

    public boolean k(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    public void o(@NotNull File from, @NotNull File to) throws IOException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        h(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    @NotNull
    public C1190Ia1 p(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Logger logger = J81.a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            FileOutputStream fileOutputStreamA = j.a.a(file, new FileOutputStream(file, false), false);
            Intrinsics.checkNotNullParameter(fileOutputStreamA, "<this>");
            return new C1190Ia1(fileOutputStreamA, new LZ1());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = J81.a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            FileOutputStream fileOutputStreamA2 = j.a.a(file, new FileOutputStream(file, false), false);
            Intrinsics.checkNotNullParameter(fileOutputStreamA2, "<this>");
            return new C1190Ia1(fileOutputStreamA2, new LZ1());
        }
    }

    public String toString() {
        switch (this.d) {
            case 4:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }
}
