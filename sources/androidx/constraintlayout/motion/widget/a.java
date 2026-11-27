package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import defpackage.C2425Xl1;
import defpackage.C3079c50;
import defpackage.C4856kK0;
import defpackage.C5214m11;
import defpackage.C5807oq;
import defpackage.PP1;
import defpackage.ZT;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final MotionLayout a;
    public final PP1 b;
    public b c;
    public final ArrayList<b> d;
    public final b e;
    public final ArrayList<b> f;
    public final SparseArray<androidx.constraintlayout.widget.c> g;
    public final HashMap<String, Integer> h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public MotionLayout.f o;
    public boolean p;
    public final d q;
    public float r;
    public float s;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    public class InterpolatorC0223a implements Interpolator {
        public final /* synthetic */ C3079c50 a;

        public InterpolatorC0223a(C3079c50 c3079c50) {
            this.a = c3079c50;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    public a(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new SparseArray<>();
        this.h = new HashMap<>();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        this.q = new d(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        switch (xml.getName()) {
                            case "MotionScene":
                                l(context, xml);
                                break;
                            case "Transition":
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.c == null && !bVar.b) {
                                    this.c = bVar;
                                    androidx.constraintlayout.motion.widget.b bVar2 = bVar.l;
                                    if (bVar2 != null) {
                                        bVar2.c(this.p);
                                    }
                                }
                                if (bVar.b) {
                                    if (bVar.c == -1) {
                                        this.e = bVar;
                                    } else {
                                        this.f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnSwipe":
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.l = new androidx.constraintlayout.motion.widget.b(context, this.a, xml);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnClick":
                                if (bVar != null) {
                                    bVar.m.add(new b.ViewOnClickListenerC0224a(context, bVar, xml));
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "StateSet":
                                this.b = new PP1(context, xml);
                                break;
                            case "ConstraintSet":
                                i(context, xml);
                                break;
                            case "include":
                            case "Include":
                                k(context, xml);
                                break;
                            case "KeyFrameSet":
                                C4856kK0 c4856kK0 = new C4856kK0(context, xml);
                                if (bVar != null) {
                                    bVar.k.add(c4856kK0);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "ViewTransition":
                                c cVar = new c(context, xml);
                                d dVar = this.q;
                                dVar.b.add(cVar);
                                dVar.c = null;
                                int i2 = cVar.b;
                                if (i2 == 4) {
                                    d.a(cVar);
                                    break;
                                } else {
                                    if (i2 == 5) {
                                        d.a(cVar);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                this.g.put(R.id.motion_base, new androidx.constraintlayout.widget.c());
                this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        b bVar;
        if (this.o != null) {
            return false;
        }
        for (b bVar2 : this.d) {
            int i2 = bVar2.n;
            if (i2 != 0 && ((bVar = this.c) != bVar2 || (bVar.r & 2) == 0)) {
                int i3 = bVar2.d;
                MotionLayout.i iVar = MotionLayout.i.h;
                MotionLayout.i iVar2 = MotionLayout.i.g;
                MotionLayout.i iVar3 = MotionLayout.i.e;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 4) {
                        motionLayout.F();
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.t(true);
                    motionLayout.setState(iVar3);
                    motionLayout.setState(iVar2);
                    motionLayout.setState(iVar);
                    motionLayout.y();
                    return true;
                }
                if (i == bVar2.c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 3) {
                        motionLayout.G();
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.t(true);
                    motionLayout.setState(iVar3);
                    motionLayout.setState(iVar2);
                    motionLayout.setState(iVar);
                    motionLayout.y();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.c b(int i) {
        int iA;
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.g;
        PP1 pp1 = this.b;
        if (pp1 != null && (iA = pp1.a(i)) != -1) {
            i = iA;
        }
        if (sparseArray.get(i) != null) {
            return sparseArray.get(i);
        }
        b0.c("MotionScene", "Warning could not find ConstraintSet id/" + ZT.c(this.a.getContext(), i) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            b0.c("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final Interpolator d() {
        b bVar = this.c;
        int i = bVar.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new InterpolatorC0223a(C3079c50.c(bVar.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(C5214m11 c5214m11) {
        b bVar = this.c;
        if (bVar != null) {
            Iterator<C4856kK0> it = bVar.k.iterator();
            while (it.hasNext()) {
                it.next().a(c5214m11);
            }
        } else {
            b bVar2 = this.e;
            if (bVar2 != null) {
                Iterator<C4856kK0> it2 = bVar2.k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(c5214m11);
                }
            }
        }
    }

    public final float f() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.c;
        if (bVar2 == null || (bVar = bVar2.l) == null) {
            return 0.0f;
        }
        return bVar.t;
    }

    public final int g() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public final ArrayList h(int i) {
        int iA;
        PP1 pp1 = this.b;
        if (pp1 != null && (iA = pp1.a(i)) != -1) {
            i = iA;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.d) {
            if (bVar.d == i || bVar.c == i) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        cVar.c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                cVar.c = 4;
                                break;
                            case "left":
                                cVar.c = 2;
                                break;
                            case "none":
                                cVar.c = 0;
                                break;
                            case "right":
                                cVar.c = 1;
                                break;
                            case "x_right":
                                cVar.c = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(iC));
                    cVar.a = ZT.c(context, iC);
                    break;
            }
        }
        if (iC != -1) {
            int i2 = this.a.Q;
            cVar.k(context, xmlResourceParser);
            if (iC2 != -1) {
                this.i.put(iC, iC2);
            }
            this.g.put(iC, cVar);
        }
        return iC;
    }

    public final int j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.g;
        androidx.constraintlayout.widget.c cVar = sparseArray.get(i);
        cVar.b = cVar.a;
        int i2 = this.i.get(i);
        HashMap<Integer, androidx.constraintlayout.widget.c.a> map = cVar.f;
        if (i2 > 0) {
            m(i2, motionLayout);
            androidx.constraintlayout.widget.c cVar2 = sparseArray.get(i2);
            if (cVar2 == null) {
                b0.c("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + ZT.c(this.a.getContext(), i2));
                return;
            }
            cVar.b += "/" + cVar2.b;
            HashMap<Integer, androidx.constraintlayout.widget.c.a> map2 = cVar2.f;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.c.a aVar = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.c.a());
                }
                androidx.constraintlayout.widget.c.a aVar2 = map.get(num);
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.c.b bVar = aVar2.e;
                    if (!bVar.b) {
                        bVar.a(aVar.e);
                    }
                    androidx.constraintlayout.widget.c.d dVar = aVar2.c;
                    if (!dVar.a) {
                        androidx.constraintlayout.widget.c.d dVar2 = aVar.c;
                        dVar.a = dVar2.a;
                        dVar.b = dVar2.b;
                        dVar.d = dVar2.d;
                        dVar.e = dVar2.e;
                        dVar.c = dVar2.c;
                    }
                    androidx.constraintlayout.widget.c.e eVar = aVar2.f;
                    if (!eVar.a) {
                        eVar.a(aVar.f);
                    }
                    androidx.constraintlayout.widget.c.C0228c c0228c = aVar2.d;
                    if (!c0228c.a) {
                        c0228c.a(aVar.d);
                    }
                    for (String str : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(str)) {
                            aVar2.g.put(str, aVar.g.get(str));
                        }
                    }
                }
            }
        } else {
            cVar.b = C5807oq.b(new StringBuilder(), cVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                int id = childAt.getId();
                if (cVar.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new androidx.constraintlayout.widget.c.a());
                }
                androidx.constraintlayout.widget.c.a aVar4 = map.get(Integer.valueOf(id));
                if (aVar4 != null) {
                    androidx.constraintlayout.widget.c.b bVar2 = aVar4.e;
                    if (!bVar2.b) {
                        aVar4.c(id, aVar3);
                        if (childAt instanceof androidx.constraintlayout.widget.b) {
                            bVar2.j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar2.o0 = barrier.getAllowsGoneWidget();
                                bVar2.g0 = barrier.getType();
                                bVar2.h0 = barrier.getMargin();
                            }
                        }
                        bVar2.b = true;
                    }
                    androidx.constraintlayout.widget.c.d dVar3 = aVar4.c;
                    if (!dVar3.a) {
                        dVar3.b = childAt.getVisibility();
                        dVar3.d = childAt.getAlpha();
                        dVar3.a = true;
                    }
                    androidx.constraintlayout.widget.c.e eVar2 = aVar4.f;
                    if (!eVar2.a) {
                        eVar2.a = true;
                        eVar2.b = childAt.getRotation();
                        eVar2.c = childAt.getRotationX();
                        eVar2.d = childAt.getRotationY();
                        eVar2.e = childAt.getScaleX();
                        eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        eVar2.j = childAt.getTranslationX();
                        eVar2.k = childAt.getTranslationY();
                        eVar2.l = childAt.getTranslationZ();
                        if (eVar2.m) {
                            eVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.c.a aVar5 : map.values()) {
            if (aVar5.h != null) {
                if (aVar5.b != null) {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.c.a aVarI = cVar.i(it.next().intValue());
                        String str2 = aVarI.e.l0;
                        if (str2 != null && aVar5.b.matches(str2)) {
                            aVar5.h.e(aVarI);
                            aVarI.g.putAll((HashMap) aVar5.g.clone());
                        }
                    }
                } else {
                    aVar5.h.e(cVar.i(aVar5.a));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void n(int i, int i2) {
        int iA;
        int iA2;
        b bVar;
        ArrayList<b> arrayList;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        int i3;
        androidx.constraintlayout.motion.widget.b bVar4;
        PP1 pp1 = this.b;
        if (pp1 != null) {
            iA = pp1.a(i);
            if (iA == -1) {
                iA = i;
            }
            iA2 = this.b.a(i2);
            if (iA2 == -1) {
            }
            bVar = this.c;
            if (bVar == null && bVar.c == i2 && bVar.d == i) {
                return;
            }
            arrayList = this.d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.e;
                    for (b bVar5 : this.f) {
                        if (bVar5.c == i2) {
                            bVar2 = bVar5;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.d = iA;
                    bVar3.c = iA2;
                    if (iA != -1) {
                        arrayList.add(bVar3);
                    }
                    this.c = bVar3;
                    return;
                }
                next = it.next();
                i3 = next.c;
                if ((i3 != iA2 && next.d == iA) || (i3 == i2 && next.d == i)) {
                    break;
                }
            }
            this.c = next;
            bVar4 = next.l;
            if (bVar4 != null) {
                bVar4.c(this.p);
            }
        }
        iA = i;
        iA2 = i2;
        bVar = this.c;
        if (bVar == null) {
        }
        arrayList = this.d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.e;
                while (r4.hasNext()) {
                    if (bVar5.c == i2) {
                        bVar2 = bVar5;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.d = iA;
                bVar3.c = iA2;
                if (iA != -1) {
                    arrayList.add(bVar3);
                }
                this.c = bVar3;
                return;
            }
            next = it.next();
            i3 = next.c;
            if (i3 != iA2) {
            }
        }
        this.c = next;
        bVar4 = next.l;
        if (bVar4 != null) {
            bVar4.c(this.p);
        }
    }

    public final boolean o() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? false : true;
    }

    public static class b {
        public final int a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public final float i;
        public final a j;
        public final ArrayList<C4856kK0> k;
        public androidx.constraintlayout.motion.widget.b l;
        public final ArrayList<ViewOnClickListenerC0224a> m;
        public final int n;
        public boolean o;
        public int p;
        public final int q;
        public final int r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0224a implements View.OnClickListener {
            public final b d;
            public final int e;
            public final int g;

            public ViewOnClickListenerC0224a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.e = -1;
                this.g = 17;
                this.d = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.p);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    } else if (index == 0) {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void a(MotionLayout motionLayout, int i, b bVar) {
                int i2 = this.e;
                View viewFindViewById = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (viewFindViewById == null) {
                    b0.c("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.g;
                int i6 = i5 & 1;
                if (((i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4)) || ((i5 & 4096) != 0 && i == i4)) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i = this.e;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                b0.c("MotionScene", " (*)  could not find id " + i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.d;
                a aVar = bVar.j;
                MotionLayout motionLayout = aVar.a;
                if (motionLayout.F) {
                    if (bVar.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.H(bVar.c);
                            return;
                        }
                        b bVar2 = new b(bVar.j, bVar);
                        bVar2.d = currentState;
                        bVar2.c = bVar.c;
                        motionLayout.setTransition(bVar2);
                        motionLayout.F();
                        return;
                    }
                    b bVar3 = aVar.c;
                    int i = this.g;
                    boolean z = false;
                    boolean z2 = true;
                    boolean z3 = ((i & 1) == 0 && (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) ? false : true;
                    if ((i & 16) == 0 && (i & 4096) == 0) {
                        z2 = false;
                    }
                    if (z3 && z2) {
                        if (bVar3 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z2 = false;
                            z = z3;
                        }
                    } else {
                        z = z3;
                    }
                    if (bVar != bVar3) {
                        int i2 = bVar.c;
                        int i3 = bVar.d;
                        if (i3 != -1) {
                            int i4 = motionLayout.B;
                            if (i4 != i3 && i4 != i2) {
                                return;
                            }
                        } else if (motionLayout.B == i2) {
                            return;
                        }
                    }
                    if (z && (i & 1) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.F();
                        return;
                    }
                    if (z2 && (i & 16) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.G();
                    } else if (z && (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(1.0f);
                    } else {
                        if (!z2 || (i & 4096) == 0) {
                            return;
                        }
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = aVar;
            this.h = aVar.j;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public b(a aVar, int i) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = -1;
            this.j = aVar;
            this.d = R.id.view_transition;
            this.c = i;
            this.h = aVar.j;
            this.q = aVar.k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = aVar.j;
            this.q = aVar.k;
            this.j = aVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C2425Xl1.v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseArray<androidx.constraintlayout.widget.c> sparseArray = aVar.g;
                if (index == 2) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.j(context, this.c);
                        sparseArray.append(this.c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = aVar.j(context, this.c);
                    }
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.j(context, this.d);
                        sparseArray.append(this.d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = aVar.j(context, this.d);
                    }
                } else if (index == 6) {
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == 8) {
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 9) {
                    this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    this.p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
