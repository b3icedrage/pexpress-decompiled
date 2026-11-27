package defpackage;

import android.util.JsonReader;
import io.sentry.clientreport.c;
import io.sentry.clientreport.e;
import io.sentry.util.l;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EK implements C6342rP.a, A42, InterfaceC1608Nj0, l.a {
    public final /* synthetic */ int d;

    public /* synthetic */ EK(int i) {
        this.d = i;
    }

    public static int a(int i, int i2, int i3) {
        return HE.E(i) + i2 + i3;
    }

    public static C3342dL0 c(Object obj) {
        C1795Pt1.b(obj);
        return new C3342dL0();
    }

    public static String e(int i, String str) {
        return str + i;
    }

    @Override // defpackage.A42, defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 2:
                AbstractC5713oP abstractC5713oP = (AbstractC5713oP) obj;
                C3994gT.b.getClass();
                YK yk = C6342rP.a;
                yk.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    DG0 dg0 = (DG0) yk.d;
                    WH0 wh0 = new WH0(stringWriter, dg0.a, dg0.b, dg0.c, dg0.d);
                    wh0.g(abstractC5713oP);
                    wh0.i();
                    wh0.b.flush();
                    break;
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
            default:
                return Integer.valueOf(((C5241m80) obj).a);
        }
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        switch (this.d) {
            case 7:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (e eVar : e.values()) {
                    for (EnumC5932pS enumC5932pS : EnumC5932pS.values()) {
                        concurrentHashMap.put(new c(eVar.getReason(), enumC5932pS.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
            default:
                return C2432Xo.h();
        }
    }

    @Override // defpackage.C6342rP.a
    public Object d(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        C1255Iw0 c1255Iw0C = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    c1255Iw0C = C6342rP.c(jsonReader, new C6133qP());
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strC = strNextString == null ? " name" : "";
        if (numValueOf == null) {
            strC = strC.concat(" importance");
        }
        if (c1255Iw0C == null) {
            strC = Z0.c(strC, " frames");
        }
        if (strC.isEmpty()) {
            return new C5381mo(strNextString, numValueOf.intValue(), c1255Iw0C);
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }
}
