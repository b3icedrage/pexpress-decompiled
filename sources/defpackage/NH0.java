package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import io.jsonwebtoken.JwtParser;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class NH0 extends C7790yH0 {
    public static final a x = new a();
    public static final Object y = new Object();
    public Object[] t;
    public int u;
    public String[] v;
    public int[] w;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.C7790yH0
    public final void A() {
        K0(JH0.m);
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.C7790yH0
    public final String B() {
        JH0 jh0G = G();
        JH0 jh0 = JH0.j;
        if (jh0G != jh0 && jh0G != JH0.k) {
            throw new IllegalStateException("Expected " + jh0 + " but was " + jh0G + M0());
        }
        String strF = ((JsonPrimitive) S0()).f();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strF;
    }

    @Override // defpackage.C7790yH0
    public final void B0() {
        K0(JH0.h);
        this.v[this.u - 1] = null;
        S0();
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.C7790yH0
    public final int E0() {
        JH0 jh0G = G();
        JH0 jh0 = JH0.k;
        if (jh0G != jh0 && jh0G != JH0.j) {
            throw new IllegalStateException("Expected " + jh0 + " but was " + jh0G + M0());
        }
        int iB = ((JsonPrimitive) R0()).b();
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iB;
    }

    @Override // defpackage.C7790yH0
    public final JH0 G() {
        if (this.u == 0) {
            return JH0.n;
        }
        Object objR0 = R0();
        if (objR0 instanceof Iterator) {
            boolean z = this.t[this.u - 2] instanceof JsonObject;
            Iterator it = (Iterator) objR0;
            if (!it.hasNext()) {
                return z ? JH0.h : JH0.e;
            }
            if (z) {
                return JH0.i;
            }
            U0(it.next());
            return G();
        }
        if (objR0 instanceof JsonObject) {
            return JH0.g;
        }
        if (objR0 instanceof JsonArray) {
            return JH0.d;
        }
        if (objR0 instanceof JsonPrimitive) {
            Serializable serializable = ((JsonPrimitive) objR0).d;
            if (serializable instanceof String) {
                return JH0.j;
            }
            if (serializable instanceof Boolean) {
                return JH0.l;
            }
            if (serializable instanceof Number) {
                return JH0.k;
            }
            throw new AssertionError();
        }
        if (objR0 instanceof JsonNull) {
            return JH0.m;
        }
        if (objR0 == y) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C3584eW0("Custom JsonElement subclass " + objR0.getClass().getName() + " is not supported");
    }

    @Override // defpackage.C7790yH0
    public final void I() {
        int iOrdinal = G().ordinal();
        if (iOrdinal == 1) {
            h1();
            return;
        }
        if (iOrdinal != 9) {
            if (iOrdinal == 3) {
                B0();
                return;
            }
            if (iOrdinal == 4) {
                Q0(true);
                return;
            }
            S0();
            int i = this.u;
            if (i > 0) {
                int[] iArr = this.w;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    public final void K0(JH0 jh0) {
        if (G() == jh0) {
            return;
        }
        throw new IllegalStateException("Expected " + jh0 + " but was " + G() + M0());
    }

    public final String L0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.u;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.t;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.w[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.v[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String M0() {
        return " at path " + L0(false);
    }

    public final String Q0(boolean z) {
        K0(JH0.i);
        Map.Entry entry = (Map.Entry) ((Iterator) R0()).next();
        String str = (String) entry.getKey();
        this.v[this.u - 1] = z ? "<skipped>" : str;
        U0(entry.getValue());
        return str;
    }

    public final Object R0() {
        return this.t[this.u - 1];
    }

    public final Object S0() {
        Object[] objArr = this.t;
        int i = this.u - 1;
        this.u = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void U0(Object obj) {
        int i = this.u;
        Object[] objArr = this.t;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.t = Arrays.copyOf(objArr, i2);
            this.w = Arrays.copyOf(this.w, i2);
            this.v = (String[]) Arrays.copyOf(this.v, i2);
        }
        Object[] objArr2 = this.t;
        int i3 = this.u;
        this.u = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.C7790yH0
    public final void X0() {
        K0(JH0.g);
        U0(((C7817yQ0.b) ((JsonObject) R0()).d.entrySet()).iterator());
    }

    @Override // defpackage.C7790yH0
    public final long a1() {
        JH0 jh0G = G();
        JH0 jh0 = JH0.k;
        if (jh0G != jh0 && jh0G != JH0.j) {
            throw new IllegalStateException("Expected " + jh0 + " but was " + jh0G + M0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) R0();
        long jLongValue = jsonPrimitive.d instanceof Number ? jsonPrimitive.h().longValue() : Long.parseLong(jsonPrimitive.f());
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // defpackage.C7790yH0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t = new Object[]{y};
        this.u = 1;
    }

    @Override // defpackage.C7790yH0
    public final double d0() throws C3584eW0 {
        JH0 jh0G = G();
        JH0 jh0 = JH0.k;
        if (jh0G != jh0 && jh0G != JH0.j) {
            throw new IllegalStateException("Expected " + jh0 + " but was " + jh0G + M0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) R0();
        double dDoubleValue = jsonPrimitive.d instanceof Number ? jsonPrimitive.h().doubleValue() : Double.parseDouble(jsonPrimitive.f());
        if (!this.e && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new C3584eW0("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // defpackage.C7790yH0
    public final void h1() {
        K0(JH0.e);
        S0();
        S0();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.C7790yH0
    public final boolean hasNext() {
        JH0 jh0G = G();
        return (jh0G == JH0.h || jh0G == JH0.e || jh0G == JH0.n) ? false : true;
    }

    @Override // defpackage.C7790yH0
    public final String k() {
        return L0(false);
    }

    @Override // defpackage.C7790yH0
    public final void l1() {
        K0(JH0.d);
        U0(((JsonArray) R0()).d.iterator());
        this.w[this.u - 1] = 0;
    }

    @Override // defpackage.C7790yH0
    public final String p() {
        return L0(true);
    }

    @Override // defpackage.C7790yH0
    public final String toString() {
        return NH0.class.getSimpleName() + M0();
    }

    @Override // defpackage.C7790yH0
    public final boolean u() {
        K0(JH0.l);
        boolean zA = ((JsonPrimitive) S0()).a();
        int i = this.u;
        if (i > 0) {
            int[] iArr = this.w;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zA;
    }

    @Override // defpackage.C7790yH0
    public final String x0() {
        return Q0(false);
    }
}
