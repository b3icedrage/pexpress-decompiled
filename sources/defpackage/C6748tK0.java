package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: tK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6748tK0 extends AbstractC3339dK0 {
    public float q;
    public String e = null;
    public int f = -1;
    public String g = null;
    public String h = null;
    public int i = -1;
    public int j = -1;
    public View k = null;
    public float l = 0.1f;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public float p = Float.NaN;
    public boolean r = false;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public RectF v = new RectF();
    public RectF w = new RectF();
    public HashMap<String, Method> x = new HashMap<>();

    /* JADX INFO: renamed from: tK0$a */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public C6748tK0() {
        this.d = new HashMap<>();
    }

    public static void i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.AbstractC3339dK0
    public final void a(HashMap<String, AbstractC6604se2> map) {
        throw null;
    }

    @Override // defpackage.AbstractC3339dK0
    /* JADX INFO: renamed from: b */
    public final AbstractC3339dK0 clone() {
        C6748tK0 c6748tK0 = new C6748tK0();
        super.c(this);
        c6748tK0.e = this.e;
        c6748tK0.f = this.f;
        c6748tK0.g = this.g;
        c6748tK0.h = this.h;
        c6748tK0.i = this.i;
        c6748tK0.j = this.j;
        c6748tK0.k = this.k;
        c6748tK0.l = this.l;
        c6748tK0.m = this.m;
        c6748tK0.n = this.n;
        c6748tK0.o = this.o;
        c6748tK0.p = this.p;
        c6748tK0.q = this.q;
        c6748tK0.r = this.r;
        c6748tK0.v = this.v;
        c6748tK0.w = this.w;
        c6748tK0.x = this.x;
        return c6748tK0;
    }

    @Override // defpackage.AbstractC3339dK0
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.j);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.g = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.h = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    b0.c("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 6:
                    this.i = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                    break;
                case 7:
                    if (MotionLayout.K0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    break;
                case 10:
                    this.r = typedArrayObtainStyledAttributes.getBoolean(index, this.r);
                    break;
                case 11:
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                    break;
                case 13:
                    this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                    break;
                case 14:
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    public final void g(View view, float f) {
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.j != -1) {
            if (this.k == null) {
                this.k = ((ViewGroup) view.getParent()).findViewById(this.j);
            }
            i(this.v, this.k, this.r);
            i(this.w, view, this.r);
            if (this.v.intersect(this.w)) {
                if (this.m) {
                    this.m = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.o) {
                    this.o = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.n = true;
            } else {
                if (this.m) {
                    z = false;
                } else {
                    this.m = true;
                    z = true;
                }
                if (this.n) {
                    this.n = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.o = true;
                boolean z7 = z3;
                z4 = false;
                z6 = z7;
            }
            z5 = z4;
        } else {
            if (this.m) {
                float f6 = this.p;
                if ((this.q - f6) * (f - f6) < 0.0f) {
                    this.m = false;
                    z = true;
                }
                if (this.n) {
                    f4 = this.p;
                    f5 = f - f4;
                    if ((this.q - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.n = false;
                        z2 = true;
                    }
                    if (this.o) {
                        f2 = this.p;
                        f3 = f - f2;
                        if ((this.q - f2) * f3 >= 0.0f && f3 > 0.0f) {
                            this.o = false;
                        }
                        z6 = z2;
                    } else if (Math.abs(f - this.p) > this.l) {
                        this.o = true;
                    }
                    z5 = false;
                    z6 = z2;
                } else if (Math.abs(f - this.p) > this.l) {
                    this.n = true;
                }
                z2 = false;
                if (this.o) {
                    f2 = this.p;
                    f3 = f - f2;
                    if ((this.q - f2) * f3 >= 0.0f) {
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.p) > this.l) {
                    this.o = true;
                }
                z5 = false;
                z6 = z2;
            } else if (Math.abs(f - this.p) > this.l) {
                this.m = true;
            }
            z = false;
            if (this.n) {
                f4 = this.p;
                f5 = f - f4;
                if ((this.q - f4) * f5 >= 0.0f) {
                }
                if (this.o) {
                    f2 = this.p;
                    f3 = f - f2;
                    if ((this.q - f2) * f3 >= 0.0f) {
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.p) > this.l) {
                    this.o = true;
                }
                z5 = false;
                z6 = z2;
            } else if (Math.abs(f - this.p) > this.l) {
                this.n = true;
            }
            z2 = false;
            if (this.o) {
                f2 = this.p;
                f3 = f - f2;
                if ((this.q - f2) * f3 >= 0.0f) {
                }
                z6 = z2;
            } else if (Math.abs(f - this.p) > this.l) {
                this.o = true;
            }
            z5 = false;
            z6 = z2;
        }
        this.q = f;
        if (z6 || z || z5) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.h hVar = motionLayout.P;
            CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList = motionLayout.j0;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.h> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
        }
        View viewFindViewById = this.f == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f);
        if (z6) {
            String str = this.g;
            if (str != null) {
                h(viewFindViewById, str);
            }
            if (this.s != -1) {
                ((MotionLayout) view.getParent()).J(this.s, viewFindViewById);
            }
        }
        if (z5) {
            String str2 = this.h;
            if (str2 != null) {
                h(viewFindViewById, str2);
            }
            if (this.t != -1) {
                ((MotionLayout) view.getParent()).J(this.t, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.e;
            if (str3 != null) {
                h(viewFindViewById, str3);
            }
            if (this.u != -1) {
                ((MotionLayout) view.getParent()).J(this.u, viewFindViewById);
            }
        }
    }

    public final void h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.x.containsKey(str)) {
                method = this.x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.x.put(str, null);
                    b0.c("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + ZT.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                b0.c("KeyTrigger", "Exception in call \"" + this.e + "\"on class " + view.getClass().getSimpleName() + " " + ZT.d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.d.get(str2);
                if (aVar != null) {
                    Class<?> cls = view.getClass();
                    boolean z2 = aVar.a;
                    String str3 = aVar.b;
                    String strC = !z2 ? C5491nL.c("set", str3) : str3;
                    try {
                        int iOrdinal = aVar.c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strC, cls2).invoke(view, Integer.valueOf(aVar.d));
                                break;
                            case 1:
                                cls.getMethod(strC, cls3).invoke(view, Float.valueOf(aVar.e));
                                break;
                            case 2:
                                cls.getMethod(strC, cls2).invoke(view, Integer.valueOf(aVar.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strC, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(aVar.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strC, CharSequence.class).invoke(view, aVar.f);
                                break;
                            case 5:
                                cls.getMethod(strC, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                                break;
                            case 6:
                                cls.getMethod(strC, cls3).invoke(view, Float.valueOf(aVar.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbB = C6495s7.b(" Custom Attribute \"", str3, "\" not found on ");
                        sbB.append(cls.getName());
                        b0.c("TransitionLayout", sbB.toString());
                        e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
                        b0.c("TransitionLayout", e2.getMessage());
                        b0.c("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        b0.c("TransitionLayout", cls.getName() + " must have a method " + strC);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbB2 = C6495s7.b(" Custom Attribute \"", str3, "\" not found on ");
                        sbB2.append(cls.getName());
                        b0.c("TransitionLayout", sbB2.toString());
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC3339dK0
    public final void d(HashSet<String> hashSet) {
    }
}
