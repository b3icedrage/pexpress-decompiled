package io.sentry.util;

import defpackage.KG0;
import defpackage.N7;
import defpackage.NG1;
import defpackage.Q71;
import io.sentry.ILogger;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Q71 {
    public final ArrayDeque d;

    public o(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // defpackage.Q71
    public final String B() throws IOException {
        String str = (String) c();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // defpackage.Q71
    public final void B0() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final Date D0(@NotNull ILogger iLogger) {
        String str = (String) c();
        if (str == null) {
            return null;
        }
        try {
            try {
                return N7.j(str);
            } catch (Exception unused) {
                return N7.k(str);
            }
        } catch (Exception e) {
            iLogger.d(NG1.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // defpackage.Q71
    public final int E0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // defpackage.Q71
    @Nullable
    public final <T> T H(@NotNull ILogger iLogger, @NotNull KG0<T> kg0) {
        ArrayDeque arrayDeque = this.d;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        T t = (T) entry.getValue();
        if (iLogger != null) {
            return kg0.a(this, iLogger);
        }
        arrayDeque.removeLast();
        return t;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Boolean H0() {
        return (Boolean) c();
    }

    @Override // defpackage.Q71
    public final void I() {
    }

    @Override // defpackage.Q71
    @Nullable
    public final Integer K() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Integer.valueOf(((Number) objC).intValue());
        }
        return null;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Float O0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Float.valueOf(((Number) objC).floatValue());
        }
        return null;
    }

    @Override // defpackage.Q71
    public final void Q(@NotNull ILogger iLogger, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, c());
        } catch (Exception e) {
            iLogger.c(NG1.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final Long R() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Long.valueOf(((Number) objC).longValue());
        }
        return null;
    }

    @Override // defpackage.Q71
    @Nullable
    public final Object W0() {
        return c();
    }

    @Override // defpackage.Q71
    public final void X0() throws IOException {
        ArrayDeque arrayDeque = this.d;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final TimeZone a0(@NotNull ILogger iLogger) {
        String str = (String) c();
        if (str != null) {
            return DesugarTimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // defpackage.Q71
    public final long a1() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).longValue();
        }
        throw new IOException("Expected long");
    }

    @Nullable
    public final <T> T c() throws IOException {
        try {
            ArrayDeque arrayDeque = this.d;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            T t = (T) entry.getValue();
            arrayDeque.removeLast();
            return t;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.Q71
    public final float c0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.clear();
    }

    @Override // defpackage.Q71
    public final double d0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // defpackage.Q71
    @Nullable
    public final HashMap d1(@NotNull ILogger iLogger, @NotNull KG0 kg0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            X0();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(x0(), kg0.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.d(NG1.WARNING, "Failed to deserialize object in map.", e);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            B0();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final String e0() {
        return (String) c();
    }

    @Override // defpackage.Q71
    public final void g0(boolean z) {
    }

    @Override // defpackage.Q71
    public final void h1() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // defpackage.Q71
    public final boolean hasNext() {
        return !this.d.isEmpty();
    }

    @Override // defpackage.Q71
    public final void l1() throws IOException {
        ArrayDeque arrayDeque = this.d;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // defpackage.Q71
    @NotNull
    public final io.sentry.vendor.gson.stream.b peek() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.b.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.b.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.b.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // defpackage.Q71
    @Nullable
    public final ArrayList q0(@NotNull ILogger iLogger, @NotNull KG0 kg0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            throw new IOException("Expected null but was " + peek());
        }
        try {
            l1();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(kg0.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.d(NG1.WARNING, "Failed to deserialize object in list.", e);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            h1();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // defpackage.Q71
    @Nullable
    public final Double u0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Double.valueOf(((Number) objC).doubleValue());
        }
        return null;
    }

    @Override // defpackage.Q71
    @NotNull
    public final String x0() throws IOException {
        Map.Entry entry = (Map.Entry) this.d.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }
}
