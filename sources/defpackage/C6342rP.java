package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: rP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6342rP {
    public static final YK a;

    /* JADX INFO: renamed from: rP$a */
    public interface a<T> {
        T d(@NonNull JsonReader jsonReader);
    }

    static {
        DG0 dg0 = new DG0();
        C4067gn c4067gn = C4067gn.a;
        dg0.a(AbstractC5713oP.class, c4067gn);
        dg0.a(C2165Un.class, c4067gn);
        C5378mn c5378mn = C5378mn.a;
        dg0.a(AbstractC5713oP.e.class, c5378mn);
        dg0.a(C3022bo.class, c5378mn);
        C4745jn c4745jn = C4745jn.a;
        dg0.a(AbstractC5713oP.e.a.class, c4745jn);
        dg0.a(C3231co.class, c4745jn);
        C4955kn c4955kn = C4955kn.a;
        dg0.a(AbstractC5713oP.e.a.AbstractC0457a.class, c4955kn);
        dg0.a(C3650eo.class, c4955kn);
        C7898yn c7898yn = C7898yn.a;
        dg0.a(AbstractC5713oP.e.f.class, c7898yn);
        dg0.a(C6430ro.class, c7898yn);
        C7688xn c7688xn = C7688xn.a;
        dg0.a(AbstractC5713oP.e.AbstractC0465e.class, c7688xn);
        dg0.a(C6221qo.class, c7688xn);
        C5165ln c5165ln = C5165ln.a;
        dg0.a(AbstractC5713oP.e.c.class, c5165ln);
        dg0.a(C3860fo.class, c5165ln);
        C7267vn c7267vn = C7267vn.a;
        dg0.a(AbstractC5713oP.e.d.class, c7267vn);
        dg0.a(C4070go.class, c7267vn);
        C5588nn c5588nn = C5588nn.a;
        dg0.a(AbstractC5713oP.e.d.a.class, c5588nn);
        dg0.a(C4280ho.class, c5588nn);
        C6008pn c6008pn = C6008pn.a;
        dg0.a(AbstractC5713oP.e.d.a.b.class, c6008pn);
        dg0.a(C4489io.class, c6008pn);
        C6637sn c6637sn = C6637sn.a;
        dg0.a(AbstractC5713oP.e.d.a.b.AbstractC0461d.class, c6637sn);
        dg0.a(C5381mo.class, c6637sn);
        C6847tn c6847tn = C6847tn.a;
        dg0.a(AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a.class, c6847tn);
        dg0.a(C5591no.class, c6847tn);
        C6218qn c6218qn = C6218qn.a;
        dg0.a(AbstractC5713oP.e.d.a.b.AbstractC0460b.class, c6218qn);
        dg0.a(C4958ko.class, c6218qn);
        C3647en c3647en = C3647en.a;
        dg0.a(AbstractC5713oP.a.class, c3647en);
        dg0.a(C2325Wn.class, c3647en);
        C3438dn c3438dn = C3438dn.a;
        dg0.a(AbstractC5713oP.a.AbstractC0456a.class, c3438dn);
        dg0.a(C2429Xn.class, c3438dn);
        C6427rn c6427rn = C6427rn.a;
        dg0.a(AbstractC5713oP.e.d.a.b.c.class, c6427rn);
        dg0.a(C5168lo.class, c6427rn);
        C5798on c5798on = C5798on.a;
        dg0.a(AbstractC5713oP.e.d.a.b.AbstractC0459a.class, c5798on);
        dg0.a(C4748jo.class, c5798on);
        C3857fn c3857fn = C3857fn.a;
        dg0.a(AbstractC5713oP.c.class, c3857fn);
        dg0.a(C2507Yn.class, c3857fn);
        C7057un c7057un = C7057un.a;
        dg0.a(AbstractC5713oP.e.d.c.class, c7057un);
        dg0.a(C5801oo.class, c7057un);
        C7478wn c7478wn = C7478wn.a;
        dg0.a(AbstractC5713oP.e.d.AbstractC0464d.class, c7478wn);
        dg0.a(C6011po.class, c7478wn);
        C4277hn c4277hn = C4277hn.a;
        dg0.a(AbstractC5713oP.d.class, c4277hn);
        dg0.a(C2585Zn.class, c4277hn);
        C4486in c4486in = C4486in.a;
        dg0.a(AbstractC5713oP.d.a.class, c4486in);
        dg0.a(C2812ao.class, c4486in);
        dg0.d = true;
        a = new YK(dg0);
    }

    public static C5591no a(JsonReader jsonReader) throws IOException {
        C5591no.a aVar = new C5591no.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    aVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "pc":
                    aVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    aVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static C2507Yn b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new C2507Yn(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @NonNull
    public static <T> C1255Iw0<T> c(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.d(jsonReader));
        }
        jsonReader.endArray();
        return new C1255Iw0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:255:0x040e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192  */
    @NonNull
    public static C4070go d(@NonNull JsonReader jsonReader) throws IOException {
        int i = 1;
        C4070go.a aVar = new C4070go.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            C1255Iw0 c1255Iw0 = null;
            String str = null;
            switch (strNextName) {
                case "device":
                    C5801oo.a aVar2 = new C5801oo.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                aVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                aVar2.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                aVar2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                aVar2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                aVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                aVar2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.d = aVar2.a();
                    break;
                case "app":
                    jsonReader.beginObject();
                    C4489io c4489io = null;
                    Integer numValueOf = null;
                    C1255Iw0 c1255Iw1 = null;
                    Boolean boolValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                C1255Iw0 c1255Iw0C = null;
                                C4958ko c4958koE = null;
                                C2325Wn c2325WnA = null;
                                C5168lo c5168lo = null;
                                C1255Iw0 c1255Iw0C2 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "appExitInfo":
                                            C2325Wn.a aVar3 = new C2325Wn.a();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                switch (strNextName5) {
                                                    case "buildIdMappingForArch":
                                                        aVar3.i = c(jsonReader, new Z0());
                                                        break;
                                                    case "pid":
                                                        aVar3.a = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "pss":
                                                        aVar3.e = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "rss":
                                                        aVar3.f = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "timestamp":
                                                        aVar3.g = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "processName":
                                                        String strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null processName");
                                                        }
                                                        aVar3.b = strNextString;
                                                        break;
                                                        break;
                                                    case "reasonCode":
                                                        aVar3.c = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "traceFile":
                                                        aVar3.h = jsonReader.nextString();
                                                        break;
                                                    case "importance":
                                                        aVar3.d = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            c2325WnA = aVar3.a();
                                            break;
                                        case "threads":
                                            c1255Iw0C = c(jsonReader, new EK(i));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            String strNextString2 = null;
                                            String strNextString3 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        strNextString3 = jsonReader.nextString();
                                                        if (strNextString3 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String strC = strNextString2 == null ? " name" : "";
                                            if (strNextString3 == null) {
                                                strC = strC.concat(" code");
                                            }
                                            if (lValueOf == null) {
                                                strC = Z0.c(strC, " address");
                                            }
                                            if (!strC.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(strC));
                                            }
                                            c5168lo = new C5168lo(strNextString2, strNextString3, lValueOf.longValue());
                                            break;
                                            break;
                                        case "binaries":
                                            c1255Iw0C2 = c(jsonReader, new FK());
                                            break;
                                        case "exception":
                                            c4958koE = e(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = c5168lo == null ? " signal" : "";
                                if (c1255Iw0C2 == null) {
                                    strConcat = strConcat.concat(" binaries");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                c4489io = new C4489io(c1255Iw0C, c4958koE, c2325WnA, c5168lo, c1255Iw0C2);
                                break;
                                break;
                            case "internalKeys":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                c1255Iw0 = new C1255Iw0(arrayList);
                                break;
                            case "customAttributes":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                c1255Iw1 = new C1255Iw0(arrayList2);
                                break;
                            case "uiOrientation":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    String strConcat2 = c4489io == null ? " execution" : "";
                    if (numValueOf == null) {
                        strConcat2 = strConcat2.concat(" uiOrientation");
                    }
                    if (!strConcat2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                    }
                    aVar.c = new C4280ho(c4489io, c1255Iw1, c1255Iw0, boolValueOf, numValueOf.intValue());
                    break;
                    break;
                case "log":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName7 = jsonReader.nextName();
                        strNextName7.getClass();
                        if (strNextName7.equals("content")) {
                            String strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString4;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str2 = str == null ? " content" : "";
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                    aVar.e = new C6011po(str);
                    break;
                    break;
                case "type":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null type");
                    }
                    aVar.b = strNextString5;
                    break;
                    break;
                case "timestamp":
                    aVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @NonNull
    public static C4958ko e(@NonNull JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String str = null;
        String strNextString = null;
        C1255Iw0 c1255Iw0C = null;
        C4958ko c4958koE = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    c1255Iw0C = c(jsonReader, new C6133qP());
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    c4958koE = e(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strC = str == null ? " type" : "";
        if (c1255Iw0C == null) {
            strC = strC.concat(" frames");
        }
        if (numValueOf == null) {
            strC = Z0.c(strC, " overflowCount");
        }
        if (strC.isEmpty()) {
            return new C4958ko(str, strNextString, c1255Iw0C, c4958koE, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strC));
    }

    @NonNull
    public static C2165Un f(@NonNull JsonReader jsonReader) throws IOException {
        int i = 2;
        Charset charset = AbstractC5713oP.a;
        C2165Un.a aVar = new C2165Un.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    C1255Iw0 c1255Iw0C = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            c1255Iw0C = c(jsonReader, new C6495s7(i));
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = c1255Iw0C == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    aVar.h = new C2585Zn(c1255Iw0C, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    aVar.a = strNextString2;
                    break;
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    aVar.e = strNextString3;
                    break;
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    aVar.b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    aVar.d = strNextString5;
                    break;
                    break;
                case "platform":
                    aVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    aVar.f = strNextString6;
                    break;
                    break;
                case "session":
                    C3022bo.a aVar2 = new C3022bo.a();
                    aVar2.e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                aVar2.c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                aVar2.b = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC5713oP.a);
                                break;
                            case "endedAt":
                                aVar2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                C3860fo.a aVar3 = new C3860fo.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            aVar3.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            aVar3.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            aVar3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            aVar3.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            aVar3.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            aVar3.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            aVar3.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            aVar3.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            aVar3.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.i = aVar3.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                aVar2.j = new C1255Iw0<>(arrayList);
                                break;
                            case "os":
                                C6221qo.a aVar4 = new C6221qo.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            aVar4.c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            aVar4.d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            aVar4.b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            aVar4.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.h = aVar4.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                aVar2.f = new C3231co(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                aVar2.g = new C6430ro(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                aVar2.a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                aVar2.e = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                aVar2.k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.g = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @NonNull
    public static C2165Un g(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C2165Un c2165UnF = f(jsonReader);
                jsonReader.close();
                return c2165UnF;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
