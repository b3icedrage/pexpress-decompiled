package defpackage;

import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.a;
import io.sentry.vendor.gson.stream.b;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5900pH0 implements Q71 {

    @NotNull
    public final a d;

    public C5900pH0(Reader reader) {
        this.d = new a(reader);
    }

    @Override // defpackage.Q71
    public final String B() {
        return this.d.B();
    }

    @Override // defpackage.Q71
    public final void B0() {
        this.d.B0();
    }

    @Override // defpackage.Q71
    @Nullable
    public final Date D0(ILogger iLogger) throws IOException {
        a aVar = this.d;
        if (aVar.peek() == b.NULL) {
            aVar.t();
            return null;
        }
        String strB = aVar.B();
        if (strB == null) {
            return null;
        }
        try {
            try {
                return N7.j(strB);
            } catch (Exception e) {
                iLogger.d(NG1.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return N7.k(strB);
        }
    }

    @Override // defpackage.Q71
    public final int E0() {
        return this.d.E0();
    }

    @Override // defpackage.Q71
    @Nullable
    public final <T> T H(@NotNull ILogger iLogger, @NotNull KG0<T> kg0) throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return kg0.a(this, iLogger);
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Boolean H0() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return Boolean.valueOf(aVar.p());
        }
        aVar.t();
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // defpackage.Q71
    public final void I() throws IOException {
        a aVar;
        int i = 0;
        do {
            aVar = this.d;
            int iF = aVar.l;
            if (iF == 0) {
                iF = aVar.f();
            }
            if (iF == 3) {
                aVar.A(1);
            } else {
                if (iF == 1) {
                    aVar.A(3);
                } else if (iF == 4 || iF == 2) {
                    aVar.q--;
                    i--;
                } else if (iF == 14 || iF == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = aVar.h + i2;
                            if (i3 < aVar.i) {
                                char c = aVar.g[i3];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    aVar.c();
                                }
                                aVar.h += i2;
                            } else {
                                aVar.h = i3;
                                if (!aVar.g(1)) {
                                }
                            }
                        }
                    }
                } else if (iF == 8 || iF == 12) {
                    aVar.D('\'');
                } else if (iF == 9 || iF == 13) {
                    aVar.D('\"');
                } else if (iF == 16) {
                    aVar.h += aVar.n;
                }
                aVar.l = 0;
            }
            i++;
            aVar.l = 0;
        } while (i != 0);
        int[] iArr = aVar.s;
        int i4 = aVar.q - 1;
        iArr[i4] = iArr[i4] + 1;
        aVar.r[i4] = "null";
    }

    @Override // defpackage.Q71
    @Nullable
    public final Integer K() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return Integer.valueOf(aVar.E0());
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Float O0() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return Float.valueOf(c0());
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    public final void Q(ILogger iLogger, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, W0());
        } catch (Exception e) {
            iLogger.c(NG1.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final Long R() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return Long.valueOf(aVar.a1());
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Object W0() throws IOException {
        C5690oH0 c5690oH0 = new C5690oH0();
        c5690oH0.d(this);
        C5690oH0.c cVarA = c5690oH0.a();
        if (cVarA != null) {
            return cVarA.getValue();
        }
        return null;
    }

    @Override // defpackage.Q71
    public final void X0() {
        this.d.X0();
    }

    @Override // defpackage.Q71
    @Nullable
    public final TimeZone a0(ILogger iLogger) throws IOException {
        a aVar = this.d;
        if (aVar.peek() == b.NULL) {
            aVar.t();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(aVar.B());
        } catch (Exception e) {
            iLogger.d(NG1.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // defpackage.Q71
    public final long a1() {
        return this.d.a1();
    }

    @Override // defpackage.Q71
    public final float c0() {
        return (float) this.d.d0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.Q71
    public final double d0() {
        return this.d.d0();
    }

    @Override // defpackage.Q71
    @Nullable
    public final HashMap d1(@NotNull ILogger iLogger, @NotNull KG0 kg0) throws IOException {
        a aVar = this.d;
        if (aVar.peek() == b.NULL) {
            aVar.t();
            return null;
        }
        aVar.X0();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                try {
                    map.put(aVar.x0(), kg0.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.d(NG1.WARNING, "Failed to deserialize object in map.", e);
                }
                if (aVar.peek() != b.BEGIN_OBJECT && aVar.peek() != b.NAME) {
                    break;
                }
            }
        }
        aVar.B0();
        return map;
    }

    @Override // defpackage.Q71
    @Nullable
    public final String e0() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return aVar.B();
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    public final void g0(boolean z) {
        this.d.e = z;
    }

    @Override // defpackage.Q71
    public final void h1() {
        this.d.h1();
    }

    @Override // defpackage.Q71
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // defpackage.Q71
    public final void l1() {
        this.d.l1();
    }

    @Override // defpackage.Q71
    @NotNull
    public final b peek() {
        return this.d.peek();
    }

    @Override // defpackage.Q71
    @Nullable
    public final ArrayList q0(@NotNull ILogger iLogger, @NotNull KG0 kg0) throws IOException {
        a aVar = this.d;
        if (aVar.peek() == b.NULL) {
            aVar.t();
            return null;
        }
        aVar.l1();
        ArrayList arrayList = new ArrayList();
        if (aVar.hasNext()) {
            do {
                try {
                    arrayList.add(kg0.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.d(NG1.WARNING, "Failed to deserialize object in list.", e);
                }
            } while (aVar.peek() == b.BEGIN_OBJECT);
        }
        aVar.h1();
        return arrayList;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Double u0() throws IOException {
        a aVar = this.d;
        if (aVar.peek() != b.NULL) {
            return Double.valueOf(aVar.d0());
        }
        aVar.t();
        return null;
    }

    @Override // defpackage.Q71
    @NotNull
    public final String x0() {
        return this.d.x0();
    }
}
