package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import defpackage.C2425Xl1;
import defpackage.C5491nL;
import defpackage.C6495s7;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a = false;
    public String b;
    public EnumC0226a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static final class EnumC0226a {
        public static final EnumC0226a d;
        public static final EnumC0226a e;
        public static final EnumC0226a g;
        public static final EnumC0226a h;
        public static final EnumC0226a i;
        public static final EnumC0226a j;
        public static final EnumC0226a k;
        public static final EnumC0226a l;
        public static final /* synthetic */ EnumC0226a[] m;

        static {
            EnumC0226a enumC0226a = new EnumC0226a("INT_TYPE", 0);
            d = enumC0226a;
            EnumC0226a enumC0226a2 = new EnumC0226a("FLOAT_TYPE", 1);
            e = enumC0226a2;
            EnumC0226a enumC0226a3 = new EnumC0226a("COLOR_TYPE", 2);
            g = enumC0226a3;
            EnumC0226a enumC0226a4 = new EnumC0226a("COLOR_DRAWABLE_TYPE", 3);
            h = enumC0226a4;
            EnumC0226a enumC0226a5 = new EnumC0226a("STRING_TYPE", 4);
            i = enumC0226a5;
            EnumC0226a enumC0226a6 = new EnumC0226a("BOOLEAN_TYPE", 5);
            j = enumC0226a6;
            EnumC0226a enumC0226a7 = new EnumC0226a("DIMENSION_TYPE", 6);
            k = enumC0226a7;
            EnumC0226a enumC0226a8 = new EnumC0226a("REFERENCE_TYPE", 7);
            l = enumC0226a8;
            m = new EnumC0226a[]{enumC0226a, enumC0226a2, enumC0226a3, enumC0226a4, enumC0226a5, enumC0226a6, enumC0226a7, enumC0226a8};
        }

        public EnumC0226a() {
            throw null;
        }

        public static EnumC0226a valueOf(String str) {
            return (EnumC0226a) Enum.valueOf(EnumC0226a.class, str);
        }

        public static EnumC0226a[] values() {
            return (EnumC0226a[]) m.clone();
        }
    }

    public a(a aVar, Object obj) {
        this.b = aVar.b;
        this.c = aVar.c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC0226a enumC0226a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0226a enumC0226a2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0226a2 = EnumC0226a.j;
            } else {
                if (index == 3) {
                    enumC0226a = EnumC0226a.g;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC0226a = EnumC0226a.h;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    EnumC0226a enumC0226a3 = EnumC0226a.k;
                    if (index == 7) {
                        objValueOf2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        enumC0226a = EnumC0226a.e;
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        enumC0226a = EnumC0226a.d;
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        enumC0226a = EnumC0226a.i;
                        objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        enumC0226a = EnumC0226a.l;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        objValueOf = Integer.valueOf(resourceId);
                    }
                    enumC0226a2 = enumC0226a3;
                }
                Object obj = objValueOf;
                enumC0226a2 = enumC0226a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            a aVar = new a();
            aVar.b = string;
            aVar.c = enumC0226a2;
            aVar.a = z;
            aVar.f(objValueOf2);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String strC = !aVar.a ? C5491nL.c("set", str) : str;
            try {
                int iOrdinal = aVar.c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strC, cls3).invoke(view, Integer.valueOf(aVar.d));
                        break;
                    case 1:
                        cls.getMethod(strC, cls2).invoke(view, Float.valueOf(aVar.e));
                        break;
                    case 2:
                        cls.getMethod(strC, cls3).invoke(view, Integer.valueOf(aVar.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strC, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strC, CharSequence.class).invoke(view, aVar.f);
                        break;
                    case 5:
                        cls.getMethod(strC, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                        break;
                    case 6:
                        cls.getMethod(strC, cls2).invoke(view, Float.valueOf(aVar.e));
                        break;
                    case 7:
                        cls.getMethod(strC, cls3).invoke(view, Integer.valueOf(aVar.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbB = C6495s7.b(" Custom Attribute \"", str, "\" not found on ");
                sbB.append(cls.getName());
                b0.c("TransitionLayout", sbB.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                b0.c("TransitionLayout", e2.getMessage());
                b0.c("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                b0.c("TransitionLayout", cls.getName() + " must have a method " + strC);
            } catch (InvocationTargetException e3) {
                StringBuilder sbB2 = C6495s7.b(" Custom Attribute \"", str, "\" not found on ");
                sbB2.append(cls.getName());
                b0.c("TransitionLayout", sbB2.toString());
                e3.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
                return this.e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.g ? 1.0f : 0.0f;
            case 6:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i = this.h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
