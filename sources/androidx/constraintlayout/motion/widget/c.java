package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import defpackage.AbstractC3339dK0;
import defpackage.Be2;
import defpackage.C2425Xl1;
import defpackage.C3079c50;
import defpackage.C4791k11;
import defpackage.C4856kK0;
import defpackage.C5214m11;
import defpackage.C6473s11;
import defpackage.C7173vM;
import defpackage.RunnableC4584j20;
import defpackage.ZT;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public int a;
    public int e;
    public final C4856kK0 f;
    public final androidx.constraintlayout.widget.c.a g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    public static class a {
        public final int a;
        public final int b;
        public final C5214m11 c;
        public final int d;
        public final d f;
        public final Interpolator g;
        public float i;
        public float j;
        public final boolean m;
        public final C7173vM e = new C7173vM();
        public boolean h = false;
        public final Rect l = new Rect();
        public long k = System.nanoTime();

        public a(d dVar, C5214m11 c5214m11, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.m = false;
            this.f = dVar;
            this.c = c5214m11;
            this.d = i2;
            if (dVar.e == null) {
                dVar.e = new ArrayList<>();
            }
            dVar.e.add(this);
            this.g = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.m = true;
            }
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        public final void a() {
            boolean z = this.h;
            d dVar = this.f;
            Interpolator interpolator = this.g;
            C5214m11 c5214m11 = this.c;
            int i = this.b;
            int i2 = this.a;
            if (!z) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.k;
                this.k = jNanoTime;
                float f = (((float) (j * 1.0E-6d)) * this.j) + this.i;
                this.i = f;
                if (f >= 1.0f) {
                    this.i = 1.0f;
                }
                boolean zD = c5214m11.d(interpolator == null ? this.i : interpolator.getInterpolation(this.i), jNanoTime, this.e, c5214m11.b);
                if (this.i >= 1.0f) {
                    if (i2 != -1) {
                        c5214m11.b.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        c5214m11.b.setTag(i, null);
                    }
                    if (!this.m) {
                        dVar.f.add(this);
                    }
                }
                if (this.i < 1.0f || zD) {
                    dVar.a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.k;
            this.k = jNanoTime2;
            float f2 = this.i - (((float) (j2 * 1.0E-6d)) * this.j);
            this.i = f2;
            if (f2 < 0.0f) {
                this.i = 0.0f;
            }
            float interpolation = this.i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zD2 = c5214m11.d(interpolation, jNanoTime2, this.e, c5214m11.b);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    c5214m11.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    c5214m11.b.setTag(i, null);
                }
                dVar.f.add(this);
            }
            if (this.i > 0.0f || zD2) {
                dVar.a.invalidate();
            }
        }

        public final void b() {
            this.h = true;
            int i = this.d;
            if (i != -1) {
                this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f.a.invalidate();
            this.k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public c(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        d(context, xmlResourceParser);
                    } else if (b == 1) {
                        this.f = new C4856kK0(context, xmlResourceParser);
                    } else if (b == 2) {
                        this.g = androidx.constraintlayout.widget.c.d(context, xmlResourceParser);
                    } else if (b == 3 || b == 4) {
                        androidx.constraintlayout.widget.a.d(context, xmlResourceParser, this.g.g);
                    } else {
                        b0.c("ViewTransition", ZT.a() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        b0.c("ViewTransition", sb.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(d dVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.c cVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        C4856kK0 c4856kK0 = this.f;
        if (i2 != 2) {
            androidx.constraintlayout.widget.c.a aVar = this.g;
            if (i2 == 1) {
                for (int i3 : motionLayout.getConstraintSetIds()) {
                    if (i3 != i) {
                        androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.w;
                        androidx.constraintlayout.widget.c cVarB = aVar2 == null ? null : aVar2.b(i3);
                        for (View view : viewArr) {
                            androidx.constraintlayout.widget.c.a aVarI = cVarB.i(view.getId());
                            if (aVar != null) {
                                androidx.constraintlayout.widget.c.a.C0227a c0227a = aVar.h;
                                if (c0227a != null) {
                                    c0227a.e(aVarI);
                                }
                                aVarI.g.putAll(aVar.g);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
            HashMap<Integer, androidx.constraintlayout.widget.c.a> map = cVar2.f;
            map.clear();
            for (Integer num : cVar.f.keySet()) {
                androidx.constraintlayout.widget.c.a aVar3 = cVar.f.get(num);
                if (aVar3 != null) {
                    map.put(num, aVar3.clone());
                }
            }
            for (View view2 : viewArr) {
                androidx.constraintlayout.widget.c.a aVarI2 = cVar2.i(view2.getId());
                if (aVar != null) {
                    androidx.constraintlayout.widget.c.a.C0227a c0227a2 = aVar.h;
                    if (c0227a2 != null) {
                        c0227a2.e(aVarI2);
                    }
                    aVarI2.g.putAll(aVar.g);
                }
            }
            motionLayout.I(i, cVar2);
            motionLayout.I(R.id.view_transition, cVar);
            motionLayout.C(R.id.view_transition);
            androidx.constraintlayout.motion.widget.a.b bVar = new androidx.constraintlayout.motion.widget.a.b(motionLayout.w, i);
            for (View view3 : viewArr) {
                int i4 = this.h;
                if (i4 != -1) {
                    bVar.h = Math.max(i4, 8);
                }
                bVar.p = this.d;
                int i5 = this.l;
                String str = this.m;
                int i6 = this.n;
                bVar.e = i5;
                bVar.f = str;
                bVar.g = i6;
                int id = view3.getId();
                if (c4856kK0 != null) {
                    ArrayList<AbstractC3339dK0> arrayList = c4856kK0.a.get(-1);
                    C4856kK0 c4856kK1 = new C4856kK0();
                    Iterator<AbstractC3339dK0> it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC3339dK0 abstractC3339dK0Clone = it.next().clone();
                        abstractC3339dK0Clone.b = id;
                        c4856kK1.b(abstractC3339dK0Clone);
                    }
                    bVar.k.add(c4856kK1);
                }
            }
            motionLayout.setTransition(bVar);
            RunnableC4584j20 runnableC4584j20 = new RunnableC4584j20(1, this, viewArr);
            motionLayout.r(1.0f);
            motionLayout.A0 = runnableC4584j20;
            return;
        }
        View view4 = viewArr[0];
        C5214m11 c5214m11 = new C5214m11(view4);
        C6473s11 c6473s11 = c5214m11.f;
        c6473s11.g = 0.0f;
        c6473s11.h = 0.0f;
        c5214m11.H = true;
        c6473s11.i(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        c5214m11.g.i(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        C4791k11 c4791k11 = c5214m11.h;
        c4791k11.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        c4791k11.g = view4.getVisibility();
        c4791k11.d = view4.getVisibility() != 0 ? 0.0f : view4.getAlpha();
        c4791k11.h = view4.getElevation();
        c4791k11.i = view4.getRotation();
        c4791k11.j = view4.getRotationX();
        c4791k11.k = view4.getRotationY();
        c4791k11.l = view4.getScaleX();
        c4791k11.m = view4.getScaleY();
        c4791k11.n = view4.getPivotX();
        c4791k11.o = view4.getPivotY();
        c4791k11.p = view4.getTranslationX();
        c4791k11.q = view4.getTranslationY();
        c4791k11.r = view4.getTranslationZ();
        C4791k11 c4791k12 = c5214m11.i;
        c4791k12.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        c4791k12.g = view4.getVisibility();
        c4791k12.d = view4.getVisibility() == 0 ? view4.getAlpha() : 0.0f;
        c4791k12.h = view4.getElevation();
        c4791k12.i = view4.getRotation();
        c4791k12.j = view4.getRotationX();
        c4791k12.k = view4.getRotationY();
        c4791k12.l = view4.getScaleX();
        c4791k12.m = view4.getScaleY();
        c4791k12.n = view4.getPivotX();
        c4791k12.o = view4.getPivotY();
        c4791k12.p = view4.getTranslationX();
        c4791k12.q = view4.getTranslationY();
        c4791k12.r = view4.getTranslationZ();
        ArrayList<AbstractC3339dK0> arrayList2 = c4856kK0.a.get(-1);
        if (arrayList2 != null) {
            c5214m11.w.addAll(arrayList2);
        }
        c5214m11.g(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i7 = this.h;
        int i8 = this.i;
        int i9 = this.b;
        Context context = motionLayout.getContext();
        int i10 = this.l;
        if (i10 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
        } else if (i10 == -1) {
            interpolatorLoadInterpolator = new Be2(C3079c50.c(this.m));
        } else if (i10 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i10 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i10 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i10 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else {
            if (i10 != 5) {
                if (i10 != 6) {
                    interpolator = null;
                } else {
                    interpolatorLoadInterpolator = new AnticipateInterpolator();
                }
                new a(dVar, c5214m11, i7, i8, i9, interpolator, this.p, this.q);
            }
            interpolatorLoadInterpolator = new OvershootInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new a(dVar, c5214m11, i7, i8, i9, interpolator, this.p, this.q);
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.K0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + ZT.c(this.o, this.a) + ")";
    }
}
