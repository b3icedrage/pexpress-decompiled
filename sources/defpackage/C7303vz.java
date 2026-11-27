package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7303vz extends E42 {
    public static final String[] B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b C;
    public static final c D;
    public static final d E;
    public static final e F;
    public static final f G;

    /* JADX INFO: renamed from: vz$a */
    public static class a extends Property<Drawable, PointF> {
        public Rect a;

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* JADX INFO: renamed from: vz$b */
    public static class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.b = iRound;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                He2.a(iVar2.e, iVar2.a, iRound, iVar2.c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: vz$c */
    public static class c extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.d = iRound;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                He2.a(iVar2.e, iVar2.a, iVar2.b, iVar2.c, iRound);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: vz$d */
    public static class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            He2.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: vz$e */
    public static class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            He2.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: vz$f */
    public static class f extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            He2.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: vz$g */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: vz$h */
    public class h extends J42 {
        public boolean d = false;
        public final /* synthetic */ ViewGroup e;

        public h(ViewGroup viewGroup) {
            this.e = viewGroup;
        }

        @Override // defpackage.J42, E42.d
        public final void a() {
            Kd2.a(this.e, false);
        }

        @Override // E42.d
        public final void b(@NonNull E42 e42) {
            if (!this.d) {
                Kd2.a(this.e, false);
            }
            e42.z(this);
        }

        @Override // defpackage.J42, E42.d
        public final void c() {
            Kd2.a(this.e, false);
            this.d = true;
        }

        @Override // defpackage.J42, E42.d
        public final void e() {
            Kd2.a(this.e, true);
        }
    }

    /* JADX INFO: renamed from: vz$i */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;
    }

    static {
        new a(PointF.class, "boundsOrigin").a = new Rect();
        C = new b(PointF.class, "topLeft");
        D = new c(PointF.class, "bottomRight");
        E = new d(PointF.class, "bottomRight");
        F = new e(PointF.class, "topLeft");
        G = new f(PointF.class, "position");
    }

    public static void M(Q42 q42) {
        View view = q42.b;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = q42.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", q42.b.getParent());
    }

    @Override // defpackage.E42
    public final void e(@NonNull Q42 q42) {
        M(q42);
    }

    @Override // defpackage.E42
    public final void i(@NonNull Q42 q42) {
        M(q42);
    }

    @Override // defpackage.E42
    public final Animator m(@NonNull ViewGroup viewGroup, Q42 q42, Q42 q43) {
        int i2;
        C7303vz c7303vz;
        Animator animatorOfObject;
        if (q42 != null && q43 != null) {
            HashMap map = q42.a;
            HashMap map2 = q43.a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                    i2 = 0;
                } else {
                    i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                if (i2 > 0) {
                    View view = q43.b;
                    He2.a(view, i3, i5, i7, i9);
                    if (i2 != 2) {
                        c7303vz = this;
                        animatorOfObject = (i3 == i4 && i5 == i6) ? ObjectAnimator.ofObject(view, E, (TypeConverter) null, c7303vz.x.w(i7, i9, i8, i10)) : ObjectAnimator.ofObject(view, F, (TypeConverter) null, c7303vz.x.w(i3, i5, i4, i6));
                    } else if (i11 == i13 && i12 == i14) {
                        c7303vz = this;
                        animatorOfObject = ObjectAnimator.ofObject(view, G, (TypeConverter) null, c7303vz.x.w(i3, i5, i4, i6));
                    } else {
                        c7303vz = this;
                        i iVar = new i();
                        iVar.e = view;
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(iVar, C, (TypeConverter) null, c7303vz.x.w(i3, i5, i4, i6));
                        ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(iVar, D, (TypeConverter) null, c7303vz.x.w(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                        animatorSet.addListener(new g(iVar));
                        animatorOfObject = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        Kd2.a(viewGroup4, true);
                        c7303vz.a(new h(viewGroup4));
                    }
                    return animatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // defpackage.E42
    public final String[] t() {
        return B;
    }
}
