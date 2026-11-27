package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ze2 extends E42 {
    public static final String[] C = {"android:visibility:visibility", "android:visibility:parent"};
    public int B = 3;

    public static class b {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public static void M(Q42 q42) {
        int visibility = q42.b.getVisibility();
        HashMap map = q42.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = q42.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static b N(Q42 q42, Q42 q43) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (q42 != null) {
            HashMap map = q42.a;
            if (map.containsKey("android:visibility:visibility")) {
                bVar.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                bVar.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                bVar.c = -1;
                bVar.e = null;
            }
        } else {
            bVar.c = -1;
            bVar.e = null;
        }
        if (q43 != null) {
            HashMap map2 = q43.a;
            if (map2.containsKey("android:visibility:visibility")) {
                bVar.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                bVar.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                bVar.d = -1;
                bVar.f = null;
            }
        } else {
            bVar.d = -1;
            bVar.f = null;
        }
        if (q42 != null && q43 != null) {
            int i = bVar.c;
            int i2 = bVar.d;
            if (i != i2 || bVar.e != bVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        bVar.b = false;
                        bVar.a = true;
                        return bVar;
                    }
                    if (i2 == 0) {
                        bVar.b = true;
                        bVar.a = true;
                        return bVar;
                    }
                } else {
                    if (bVar.f == null) {
                        bVar.b = false;
                        bVar.a = true;
                        return bVar;
                    }
                    if (bVar.e == null) {
                        bVar.b = true;
                        bVar.a = true;
                        return bVar;
                    }
                }
            }
        } else {
            if (q42 == null && bVar.d == 0) {
                bVar.b = true;
                bVar.a = true;
                return bVar;
            }
            if (q43 == null && bVar.c == 0) {
                bVar.b = false;
                bVar.a = true;
            }
        }
        return bVar;
    }

    @Override // defpackage.E42
    public final void e(@NonNull Q42 q42) {
        M(q42);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0211  */
    /* JADX WARN: Code duplicated, block: B:94:0x022e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0240  */
    /* JADX WARN: Code duplicated, block: B:99:0x0247  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (N(r(r3, false), v(r3, false)).a != false) goto L9;
     */
    @Override // defpackage.E42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(@androidx.annotation.NonNull android.view.ViewGroup r25, defpackage.Q42 r26, defpackage.Q42 r27) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ze2.m(android.view.ViewGroup, Q42, Q42):android.animation.Animator");
    }

    @Override // defpackage.E42
    public final String[] t() {
        return C;
    }

    @Override // defpackage.E42
    public final boolean w(Q42 q42, Q42 q43) {
        if (q42 == null && q43 == null) {
            return false;
        }
        if (q42 != null && q43 != null && q43.a.containsKey("android:visibility:visibility") != q42.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarN = N(q42, q43);
        if (bVarN.a) {
            return bVarN.c == 0 || bVarN.d == 0;
        }
        return false;
    }

    public static class a extends AnimatorListenerAdapter implements E42.d {
        public final View d;
        public final int e;
        public final ViewGroup g;
        public boolean i;
        public boolean j = false;
        public final boolean h = true;

        public a(View view, int i) {
            this.d = view;
            this.e = i;
            this.g = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // E42.d
        public final void a() {
            f(false);
        }

        @Override // E42.d
        public final void b(@NonNull E42 e42) {
            if (!this.j) {
                He2.a.q(this.d, this.e);
                ViewGroup viewGroup = this.g;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            e42.z(this);
        }

        @Override // E42.d
        public final void e() {
            f(true);
        }

        public final void f(boolean z) {
            ViewGroup viewGroup;
            if (!this.h || this.i == z || (viewGroup = this.g) == null) {
                return;
            }
            this.i = z;
            Kd2.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.j = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.j) {
                He2.a.q(this.d, this.e);
                ViewGroup viewGroup = this.g;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.j) {
                return;
            }
            He2.a.q(this.d, this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.j) {
                return;
            }
            He2.a.q(this.d, 0);
        }

        @Override // E42.d
        public final void c() {
        }

        @Override // E42.d
        public final void d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
