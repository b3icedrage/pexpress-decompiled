package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: m72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5239m72 extends C4816k72 {
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public C5239m72() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM;
        Method method2;
        Method method3;
        Method methodN;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM = m(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodN = n(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            b0.d("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            methodM = null;
            method2 = null;
            method3 = null;
            methodN = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = methodM;
        this.i = method2;
        this.j = method3;
        this.k = method;
        this.l = methodN;
    }

    public static Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // defpackage.C4816k72, defpackage.C5869p72
    public final Typeface a(Context context, C3624eh0.c cVar, Resources resources, int i) {
        Method method = this.h;
        if (method == null) {
            b0.e("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.a(context, cVar, resources, i);
        }
        Object objL = l();
        if (objL != null) {
            C3624eh0.d[] dVarArr = cVar.a;
            int length = dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C3624eh0.d dVar = dVarArr[i2];
                String str = dVar.a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.d);
                Context context2 = context;
                if (!i(context2, objL, str, dVar.e, dVar.b, dVar.c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    h(objL);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (k(objL)) {
                return j(objL);
            }
        }
        return null;
    }

    @Override // defpackage.C4816k72, defpackage.C5869p72
    public final Typeface b(Context context, @NonNull C4044gh0[] c4044gh0Arr, int i) {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (c4044gh0Arr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                b0.e("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (C4044gh0 c4044gh0 : c4044gh0Arr) {
                    if (c4044gh0.e == 0) {
                        Uri uri = c4044gh0.a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, C6079q72.e(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objL = l();
                if (objL != null) {
                    int length = c4044gh0Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < length) {
                        C4044gh0 c4044gh1 = c4044gh0Arr[i2];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c4044gh1.a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.i.invoke(objL, byteBuffer, Integer.valueOf(c4044gh1.b), null, Integer.valueOf(c4044gh1.c), Integer.valueOf(c4044gh1.d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                h(objL);
                                return null;
                            }
                            z = true;
                        }
                        i2++;
                        z = z;
                    }
                    if (!z) {
                        h(objL);
                        return null;
                    }
                    if (k(objL) && (typefaceJ = j(objL)) != null) {
                        return Typeface.create(typefaceJ, i);
                    }
                }
            } else {
                C4044gh0 c4044gh0E = e(i, c4044gh0Arr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c4044gh0E.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c4044gh0E.c).setItalic(c4044gh0E.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // defpackage.C5869p72
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Method method = this.h;
        if (method == null) {
            b0.e("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, resources, i, str, i2);
        }
        Object objL = l();
        if (objL != null) {
            if (!i(context, objL, str, 0, -1, -1, null)) {
                h(objL);
                return null;
            }
            if (k(objL)) {
                return j(objL);
            }
        }
        return null;
    }

    public final void h(Object obj) {
        try {
            this.k.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object l() {
        try {
            return this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method n(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
