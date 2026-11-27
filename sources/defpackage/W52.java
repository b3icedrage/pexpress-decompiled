package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class W52 {
    public static final C2876b62 A;
    public static final u B;
    public static final Y52 a = new Y52(Class.class, new S52(new k()));
    public static final Y52 b = new Y52(BitSet.class, new S52(new v()));
    public static final x c;
    public static final Z52 d;
    public static final Z52 e;
    public static final Z52 f;
    public static final Z52 g;
    public static final Y52 h;
    public static final Y52 i;
    public static final Y52 j;
    public static final C2283b k;
    public static final Z52 l;
    public static final g m;
    public static final h n;
    public static final i o;
    public static final Y52 p;
    public static final Y52 q;
    public static final Y52 r;
    public static final Y52 s;
    public static final Y52 t;
    public static final C2876b62 u;
    public static final Y52 v;
    public static final Y52 w;
    public static final C2652a62 x;
    public static final Y52 y;
    public static final t z;

    public class A extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            try {
                return Integer.valueOf(c7790yH0.E0());
            } catch (NumberFormatException e) {
                throw new HH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                zh0.l();
            } else {
                zh0.u(number2.intValue());
            }
        }
    }

    public class B extends T52<AtomicInteger> {
        @Override // defpackage.T52
        public final AtomicInteger a(C7790yH0 c7790yH0) {
            try {
                return new AtomicInteger(c7790yH0.E0());
            } catch (NumberFormatException e) {
                throw new HH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, AtomicInteger atomicInteger) throws IOException {
            zh0.u(atomicInteger.get());
        }
    }

    public class C extends T52<AtomicBoolean> {
        @Override // defpackage.T52
        public final AtomicBoolean a(C7790yH0 c7790yH0) {
            return new AtomicBoolean(c7790yH0.u());
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, AtomicBoolean atomicBoolean) throws IOException {
            zh0.D(atomicBoolean.get());
        }
    }

    public static final class D<T extends Enum<T>> extends T52<T> {
        public final HashMap a = new HashMap();
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public D(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    InterfaceC2691aI1 interfaceC2691aI1 = (InterfaceC2691aI1) field.getAnnotation(InterfaceC2691aI1.class);
                    if (interfaceC2691aI1 != null) {
                        strName = interfaceC2691aI1.value();
                        for (String str : interfaceC2691aI1.alternate()) {
                            this.a.put(str, r4);
                        }
                    }
                    this.a.put(strName, r4);
                    this.b.put(string, r4);
                    this.c.put(r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.T52
        public final Object a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            Enum r0 = (Enum) this.a.get(strB);
            return r0 == null ? (Enum) this.b.get(strB) : r0;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            zh0.C(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    /* JADX INFO: renamed from: W52$a, reason: case insensitive filesystem */
    public class C2282a extends T52<AtomicIntegerArray> {
        @Override // defpackage.T52
        public final AtomicIntegerArray a(C7790yH0 c7790yH0) throws IOException {
            ArrayList arrayList = new ArrayList();
            c7790yH0.l1();
            while (c7790yH0.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(c7790yH0.E0()));
                } catch (NumberFormatException e) {
                    throw new HH0(e);
                }
            }
            c7790yH0.h1();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, AtomicIntegerArray atomicIntegerArray) throws IOException {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            zh0.l1();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                zh0.u(atomicIntegerArray2.get(i));
            }
            zh0.h1();
        }
    }

    /* JADX INFO: renamed from: W52$b, reason: case insensitive filesystem */
    public class C2283b extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            try {
                return Long.valueOf(c7790yH0.a1());
            } catch (NumberFormatException e) {
                throw new HH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                zh0.l();
            } else {
                zh0.u(number2.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: W52$c, reason: case insensitive filesystem */
    public class C2284c extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return Float.valueOf((float) c7790yH0.d0());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number numberValueOf = number;
            if (numberValueOf == null) {
                zh0.l();
                return;
            }
            if (!(numberValueOf instanceof Float)) {
                numberValueOf = Float.valueOf(numberValueOf.floatValue());
            }
            zh0.A(numberValueOf);
        }
    }

    /* JADX INFO: renamed from: W52$d, reason: case insensitive filesystem */
    public class C2285d extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return Double.valueOf(c7790yH0.d0());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                zh0.l();
            } else {
                zh0.t(number2.doubleValue());
            }
        }
    }

    public class e extends T52<Character> {
        @Override // defpackage.T52
        public final Character a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            if (strB.length() == 1) {
                return Character.valueOf(strB.charAt(0));
            }
            StringBuilder sbB = C6495s7.b("Expecting character, got: ", strB, "; at ");
            sbB.append(c7790yH0.p());
            throw new HH0(sbB.toString());
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Character ch) throws IOException {
            Character ch2 = ch;
            zh0.C(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class f extends T52<String> {
        @Override // defpackage.T52
        public final String a(C7790yH0 c7790yH0) throws IOException {
            JH0 jh0G = c7790yH0.G();
            if (jh0G != JH0.m) {
                return jh0G == JH0.l ? Boolean.toString(c7790yH0.u()) : c7790yH0.B();
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, String str) throws IOException {
            zh0.C(str);
        }
    }

    public class g extends T52<BigDecimal> {
        @Override // defpackage.T52
        public final BigDecimal a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            try {
                return new BigDecimal(strB);
            } catch (NumberFormatException e) {
                StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as BigDecimal; at path ");
                sbB.append(c7790yH0.p());
                throw new HH0(sbB.toString(), e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, BigDecimal bigDecimal) throws IOException {
            zh0.A(bigDecimal);
        }
    }

    public class h extends T52<BigInteger> {
        @Override // defpackage.T52
        public final BigInteger a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            try {
                return new BigInteger(strB);
            } catch (NumberFormatException e) {
                StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as BigInteger; at path ");
                sbB.append(c7790yH0.p());
                throw new HH0(sbB.toString(), e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, BigInteger bigInteger) throws IOException {
            zh0.A(bigInteger);
        }
    }

    public class i extends T52<C3351dO0> {
        @Override // defpackage.T52
        public final C3351dO0 a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return new C3351dO0(c7790yH0.B());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, C3351dO0 c3351dO0) throws IOException {
            zh0.A(c3351dO0);
        }
    }

    public class j extends T52<StringBuilder> {
        @Override // defpackage.T52
        public final StringBuilder a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return new StringBuilder(c7790yH0.B());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            zh0.C(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends T52<Class> {
        @Override // defpackage.T52
        public final Class a(C7790yH0 c7790yH0) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends T52<StringBuffer> {
        @Override // defpackage.T52
        public final StringBuffer a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return new StringBuffer(c7790yH0.B());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            zh0.C(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    public class m extends T52<URL> {
        @Override // defpackage.T52
        public final URL a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            if ("null".equals(strB)) {
                return null;
            }
            return new URL(strB);
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, URL url) throws IOException {
            URL url2 = url;
            zh0.C(url2 == null ? null : url2.toExternalForm());
        }
    }

    public class n extends T52<URI> {
        @Override // defpackage.T52
        public final URI a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            try {
                String strB = c7790yH0.B();
                if ("null".equals(strB)) {
                    return null;
                }
                return new URI(strB);
            } catch (URISyntaxException e) {
                throw new C2911bH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, URI uri) throws IOException {
            URI uri2 = uri;
            zh0.C(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    public class o extends T52<InetAddress> {
        @Override // defpackage.T52
        public final InetAddress a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return InetAddress.getByName(c7790yH0.B());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            zh0.C(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    public class p extends T52<UUID> {
        @Override // defpackage.T52
        public final UUID a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            String strB = c7790yH0.B();
            try {
                return UUID.fromString(strB);
            } catch (IllegalArgumentException e) {
                StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as UUID; at path ");
                sbB.append(c7790yH0.p());
                throw new HH0(sbB.toString(), e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            zh0.C(uuid2 == null ? null : uuid2.toString());
        }
    }

    public class q extends T52<Currency> {
        @Override // defpackage.T52
        public final Currency a(C7790yH0 c7790yH0) throws IOException {
            String strB = c7790yH0.B();
            try {
                return Currency.getInstance(strB);
            } catch (IllegalArgumentException e) {
                StringBuilder sbB = C6495s7.b("Failed parsing '", strB, "' as Currency; at path ");
                sbB.append(c7790yH0.p());
                throw new HH0(sbB.toString(), e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Currency currency) throws IOException {
            zh0.C(currency.getCurrencyCode());
        }
    }

    public class r extends T52<Calendar> {
        @Override // defpackage.T52
        public final Calendar a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            c7790yH0.X0();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c7790yH0.G() != JH0.h) {
                String strX0 = c7790yH0.x0();
                int iE0 = c7790yH0.E0();
                if ("year".equals(strX0)) {
                    i = iE0;
                } else if ("month".equals(strX0)) {
                    i2 = iE0;
                } else if ("dayOfMonth".equals(strX0)) {
                    i3 = iE0;
                } else if ("hourOfDay".equals(strX0)) {
                    i4 = iE0;
                } else if ("minute".equals(strX0)) {
                    i5 = iE0;
                } else if ("second".equals(strX0)) {
                    i6 = iE0;
                }
            }
            c7790yH0.B0();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Calendar calendar) throws IOException {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                zh0.l();
                return;
            }
            zh0.X0();
            zh0.g("year");
            zh0.u(calendar2.get(1));
            zh0.g("month");
            zh0.u(calendar2.get(2));
            zh0.g("dayOfMonth");
            zh0.u(calendar2.get(5));
            zh0.g("hourOfDay");
            zh0.u(calendar2.get(11));
            zh0.g("minute");
            zh0.u(calendar2.get(12));
            zh0.g("second");
            zh0.u(calendar2.get(13));
            zh0.B0();
        }
    }

    public class s extends T52<Locale> {
        @Override // defpackage.T52
        public final Locale a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c7790yH0.B(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Locale locale) throws IOException {
            Locale locale2 = locale;
            zh0.C(locale2 == null ? null : locale2.toString());
        }
    }

    public class t extends T52<JsonElement> {
        public static JsonElement c(C7790yH0 c7790yH0, JH0 jh0) throws IOException {
            int iOrdinal = jh0.ordinal();
            if (iOrdinal == 5) {
                return new JsonPrimitive(c7790yH0.B());
            }
            if (iOrdinal == 6) {
                return new JsonPrimitive(new C3351dO0(c7790yH0.B()));
            }
            if (iOrdinal == 7) {
                return new JsonPrimitive(Boolean.valueOf(c7790yH0.u()));
            }
            if (iOrdinal == 8) {
                c7790yH0.A();
                return JsonNull.d;
            }
            throw new IllegalStateException("Unexpected token: " + jh0);
        }

        public static void d(ZH0 zh0, JsonElement jsonElement) throws IOException {
            if (jsonElement == null || (jsonElement instanceof JsonNull)) {
                zh0.l();
                return;
            }
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitiveE = jsonElement.e();
                Serializable serializable = jsonPrimitiveE.d;
                if (serializable instanceof Number) {
                    zh0.A(jsonPrimitiveE.h());
                    return;
                } else if (serializable instanceof Boolean) {
                    zh0.D(jsonPrimitiveE.a());
                    return;
                } else {
                    zh0.C(jsonPrimitiveE.f());
                    return;
                }
            }
            if (jsonElement instanceof JsonArray) {
                zh0.l1();
                Iterator<JsonElement> it = jsonElement.c().d.iterator();
                while (it.hasNext()) {
                    d(zh0, it.next());
                }
                zh0.h1();
                return;
            }
            if (!(jsonElement instanceof JsonObject)) {
                throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
            }
            zh0.X0();
            Iterator it2 = ((C7817yQ0.b) jsonElement.d().d.entrySet()).iterator();
            while (((C7817yQ0.d) it2).hasNext()) {
                Map.Entry entryA = ((C7817yQ0.b.a) it2).a();
                zh0.g((String) entryA.getKey());
                d(zh0, (JsonElement) entryA.getValue());
            }
            zh0.B0();
        }

        @Override // defpackage.T52
        public final JsonElement a(C7790yH0 c7790yH0) throws IOException {
            JsonElement jsonArray;
            JsonElement jsonArray2;
            JsonElement jsonElement;
            JsonElement jsonElement2;
            if (c7790yH0 instanceof NH0) {
                NH0 nh0 = (NH0) c7790yH0;
                JH0 jh0G = nh0.G();
                if (jh0G != JH0.i && jh0G != JH0.e && jh0G != JH0.h && jh0G != JH0.n) {
                    JsonElement jsonElement3 = (JsonElement) nh0.R0();
                    nh0.I();
                    return jsonElement3;
                }
                throw new IllegalStateException("Unexpected " + jh0G + " when reading a JsonElement.");
            }
            JH0 jh0G2 = c7790yH0.G();
            int iOrdinal = jh0G2.ordinal();
            if (iOrdinal == 0) {
                c7790yH0.l1();
                jsonArray = new JsonArray();
            } else if (iOrdinal != 2) {
                jsonArray = null;
            } else {
                c7790yH0.X0();
                jsonArray = new JsonObject();
            }
            if (jsonArray == null) {
                return c(c7790yH0, jh0G2);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (c7790yH0.hasNext()) {
                    String strX0 = jsonArray instanceof JsonObject ? c7790yH0.x0() : null;
                    JH0 jh0G3 = c7790yH0.G();
                    int iOrdinal2 = jh0G3.ordinal();
                    if (iOrdinal2 == 0) {
                        c7790yH0.l1();
                        jsonArray2 = new JsonArray();
                    } else if (iOrdinal2 != 2) {
                        jsonArray2 = null;
                    } else {
                        c7790yH0.X0();
                        jsonArray2 = new JsonObject();
                    }
                    boolean z = jsonArray2 != null;
                    if (jsonArray2 == null) {
                        jsonArray2 = c(c7790yH0, jh0G3);
                    }
                    if (jsonArray instanceof JsonArray) {
                        JsonArray jsonArray3 = (JsonArray) jsonArray;
                        if (jsonArray2 == null) {
                            jsonArray3.getClass();
                            jsonElement2 = JsonNull.d;
                        } else {
                            jsonElement2 = jsonArray2;
                        }
                        jsonArray3.d.add(jsonElement2);
                    } else {
                        JsonObject jsonObject = (JsonObject) jsonArray;
                        if (jsonArray2 == null) {
                            jsonObject.getClass();
                            jsonElement = JsonNull.d;
                        } else {
                            jsonElement = jsonArray2;
                        }
                        jsonObject.d.put(strX0, jsonElement);
                    }
                    if (z) {
                        arrayDeque.addLast(jsonArray);
                        jsonArray = jsonArray2;
                    }
                } else {
                    if (jsonArray instanceof JsonArray) {
                        c7790yH0.h1();
                    } else {
                        c7790yH0.B0();
                    }
                    if (arrayDeque.isEmpty()) {
                        return jsonArray;
                    }
                    jsonArray = (JsonElement) arrayDeque.removeLast();
                }
            }
        }

        @Override // defpackage.T52
        public final /* bridge */ /* synthetic */ void b(ZH0 zh0, JsonElement jsonElement) throws IOException {
            d(zh0, jsonElement);
        }
    }

    public class u implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new D(rawType);
        }
    }

    public class v extends T52<BitSet> {
        @Override // defpackage.T52
        public final BitSet a(C7790yH0 c7790yH0) throws IOException {
            boolean zU;
            BitSet bitSet = new BitSet();
            c7790yH0.l1();
            JH0 jh0G = c7790yH0.G();
            int i = 0;
            while (jh0G != JH0.e) {
                int iOrdinal = jh0G.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    int iE0 = c7790yH0.E0();
                    if (iE0 == 0) {
                        zU = false;
                    } else {
                        if (iE0 != 1) {
                            StringBuilder sbC = C1332Jw.c(iE0, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbC.append(c7790yH0.p());
                            throw new HH0(sbC.toString());
                        }
                        zU = true;
                    }
                } else {
                    if (iOrdinal != 7) {
                        throw new HH0("Invalid bitset value type: " + jh0G + "; at path " + c7790yH0.k());
                    }
                    zU = c7790yH0.u();
                }
                if (zU) {
                    bitSet.set(i);
                }
                i++;
                jh0G = c7790yH0.G();
            }
            c7790yH0.h1();
            return bitSet;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            zh0.l1();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                zh0.u(bitSet2.get(i) ? 1L : 0L);
            }
            zh0.h1();
        }
    }

    public class w extends T52<Boolean> {
        @Override // defpackage.T52
        public final Boolean a(C7790yH0 c7790yH0) throws IOException {
            JH0 jh0G = c7790yH0.G();
            if (jh0G != JH0.m) {
                return jh0G == JH0.j ? Boolean.valueOf(Boolean.parseBoolean(c7790yH0.B())) : Boolean.valueOf(c7790yH0.u());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Boolean bool) throws IOException {
            zh0.v(bool);
        }
    }

    public class x extends T52<Boolean> {
        @Override // defpackage.T52
        public final Boolean a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() != JH0.m) {
                return Boolean.valueOf(c7790yH0.B());
            }
            c7790yH0.A();
            return null;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            zh0.C(bool2 == null ? "null" : bool2.toString());
        }
    }

    public class y extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            try {
                int iE0 = c7790yH0.E0();
                if (iE0 <= 255 && iE0 >= -128) {
                    return Byte.valueOf((byte) iE0);
                }
                StringBuilder sbC = C1332Jw.c(iE0, "Lossy conversion from ", " to byte; at path ");
                sbC.append(c7790yH0.p());
                throw new HH0(sbC.toString());
            } catch (NumberFormatException e) {
                throw new HH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                zh0.l();
            } else {
                zh0.u(number2.byteValue());
            }
        }
    }

    public class z extends T52<Number> {
        @Override // defpackage.T52
        public final Number a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            try {
                int iE0 = c7790yH0.E0();
                if (iE0 <= 65535 && iE0 >= -32768) {
                    return Short.valueOf((short) iE0);
                }
                StringBuilder sbC = C1332Jw.c(iE0, "Lossy conversion from ", " to short; at path ");
                sbC.append(c7790yH0.p());
                throw new HH0(sbC.toString());
            } catch (NumberFormatException e) {
                throw new HH0(e);
            }
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                zh0.l();
            } else {
                zh0.u(number2.shortValue());
            }
        }
    }

    static {
        w wVar = new w();
        c = new x();
        d = new Z52(Boolean.TYPE, Boolean.class, wVar);
        e = new Z52(Byte.TYPE, Byte.class, new y());
        f = new Z52(Short.TYPE, Short.class, new z());
        g = new Z52(Integer.TYPE, Integer.class, new A());
        h = new Y52(AtomicInteger.class, new S52(new B()));
        i = new Y52(AtomicBoolean.class, new S52(new C()));
        j = new Y52(AtomicIntegerArray.class, new S52(new C2282a()));
        k = new C2283b();
        new C2284c();
        new C2285d();
        l = new Z52(Character.TYPE, Character.class, new e());
        f fVar = new f();
        m = new g();
        n = new h();
        o = new i();
        p = new Y52(String.class, fVar);
        q = new Y52(StringBuilder.class, new j());
        r = new Y52(StringBuffer.class, new l());
        s = new Y52(URL.class, new m());
        t = new Y52(URI.class, new n());
        u = new C2876b62(InetAddress.class, new o());
        v = new Y52(UUID.class, new p());
        w = new Y52(Currency.class, new S52(new q()));
        x = new C2652a62(new r());
        y = new Y52(Locale.class, new s());
        t tVar = new t();
        z = tVar;
        A = new C2876b62(JsonElement.class, tVar);
        B = new u();
    }
}
