package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: l72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5026l72 extends C5869p72 {
    public static final Class<?> a;
    public static final Constructor<?> b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            b0.d("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method;
        d = method2;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[LOOP:0: B:9:0x0015->B:36:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x006c A[SYNTHETIC] */
    @Override // defpackage.C5869p72
    public final Typeface a(Context context, C3624eh0.c cVar, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C3624eh0.d dVar : cVar.a) {
                int i2 = dVar.f;
                File fileD = C6079q72.d(context);
                if (fileD != null) {
                    try {
                        if (C6079q72.b(fileD, resources, i2)) {
                            try {
                                FileInputStream fileInputStreamA = f.a.a(fileD, new FileInputStream(fileD));
                                try {
                                    FileChannel channel = fileInputStreamA.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStreamA.close();
                                    fileD.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStreamA.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileD.delete();
                        }
                        if (map == null) {
                            if (!f(objNewInstance, map, dVar.e, dVar.b, dVar.c)) {
                            }
                        }
                    } catch (Throwable th3) {
                        fileD.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map == null) {
                    if (!f(objNewInstance, map, dVar.e, dVar.b, dVar.c)) {
                    }
                }
            }
            return g(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.C5869p72
    public final Typeface b(Context context, @NonNull C4044gh0[] c4044gh0Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C2703aM1 c2703aM1 = new C2703aM1();
            for (C4044gh0 c4044gh0 : c4044gh0Arr) {
                Uri uri = c4044gh0.a;
                ByteBuffer byteBufferE = (ByteBuffer) c2703aM1.getOrDefault(uri, null);
                if (byteBufferE == null) {
                    byteBufferE = C6079q72.e(context, uri);
                    c2703aM1.put(uri, byteBufferE);
                }
                if (byteBufferE != null) {
                    if (f(objNewInstance, byteBufferE, c4044gh0.b, c4044gh0.c, c4044gh0.d)) {
                    }
                }
            }
            Typeface typefaceG = g(objNewInstance);
            if (typefaceG != null) {
                return Typeface.create(typefaceG, i);
            }
        }
        return null;
    }
}
