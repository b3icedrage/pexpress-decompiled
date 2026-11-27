package defpackage;

import io.sentry.ILogger;
import io.sentry.util.k;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AH0 {
    public final int a;
    public final Serializable b;

    public AH0(int i) {
        this.b = new HashSet();
        this.a = i;
    }

    @NotNull
    public HashMap a(@NotNull Map map, @NotNull ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), b(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Nullable
    public Object b(@NotNull ILogger iLogger, @Nullable Object obj) {
        Object objC;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = k.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return k.b((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.b;
        if (hashSet.contains(obj)) {
            iLogger.a(NG1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.a) {
                hashSet.remove(obj);
                iLogger.a(NG1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    objC = new ArrayList();
                    int length2 = objArr.length;
                    while (i < length2) {
                        objC.add(b(iLogger, objArr[i]));
                        i++;
                    }
                } else if (obj instanceof Collection) {
                    objC = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objC.add(b(iLogger, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objC = a((Map) obj, iLogger);
                } else {
                    objC = c(iLogger, obj);
                    if (objC.isEmpty()) {
                        objC = obj.toString();
                    }
                }
                return objC;
            } catch (Exception e) {
                iLogger.d(NG1.INFO, "Not serializing object due to throwing sub-path.", e);
                return null;
            }
        } finally {
            hashSet.remove(obj);
        }
    }

    @NotNull
    public HashMap c(@NotNull ILogger iLogger, @NotNull Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, b(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.a(NG1.INFO, C1039Gc0.d("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public AH0(String str) {
        this.b = str;
        this.a = 0;
    }

    public AH0(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.b = null;
        this.a = 1;
    }
}
