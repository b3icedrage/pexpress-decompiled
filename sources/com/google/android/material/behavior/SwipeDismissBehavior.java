package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.Cd2;
import defpackage.EW1;
import defpackage.Gd2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public Gd2 a;
    public e b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public final float f = 0.5f;
    public float g = 0.0f;
    public float h = 0.5f;
    public final a i = new a();

    public class a extends Gd2.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // Gd2.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.e;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // Gd2.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // Gd2.c
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // Gd2.c
        public final void onViewCaptured(@NonNull View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.d = false;
            }
        }

        @Override // Gd2.c
        public final void onViewDragStateChanged(int i) {
            e eVar = SwipeDismissBehavior.this.b;
            if (eVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = eVar.a;
                if (i == 0) {
                    g.b().e(baseTransientBottomBar.v);
                } else if (i == 1 || i == 2) {
                    g.b().d(baseTransientBottomBar.v);
                }
            }
        }

        @Override // Gd2.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.g;
            float width2 = view.getWidth() * swipeDismissBehavior.h;
            float fAbs = Math.abs(i - this.a);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0052  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:0x005f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0061  */
        /* JADX WARN: Code duplicated, block: B:34:0x0066  */
        @Override // Gd2.c
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            int left;
            int i2;
            e eVar;
            this.b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z = true;
            if (f != 0.0f) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                boolean z2 = view.getLayoutDirection() == 1;
                int i3 = swipeDismissBehavior.e;
                if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                    i = this.a;
                    z = false;
                } else if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) < Math.round(view.getWidth() * swipeDismissBehavior.f)) {
                    i = this.a;
                    z = false;
                } else if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
            }
            if (swipeDismissBehavior.a.o(i, view.getTop())) {
                b bVar = new b(view, z);
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                view.postOnAnimation(bVar);
            } else {
                if (!z || (eVar = swipeDismissBehavior.b) == null) {
                    return;
                }
                eVar.a(view);
            }
        }

        @Override // Gd2.c
        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.s(view);
        }
    }

    public class b implements Runnable {
        public final View d;
        public final boolean e;

        public b(View view, boolean z) {
            this.d = view;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            Gd2 gd2 = swipeDismissBehavior.a;
            View view = this.d;
            if (gd2 != null && gd2.f()) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                view.postOnAnimation(this);
            } else {
                if (!this.e || (eVar = swipeDismissBehavior.b) == null) {
                    return;
                }
                eVar.a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean zP = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (zP) {
            if (this.a == null) {
                this.a = new Gd2(coordinatorLayout.getContext(), coordinatorLayout, this.i);
            }
            if (!this.d && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            Cd2.i(v, 1048576);
            Cd2.g(v, 0);
            if (s(v)) {
                Cd2.j(v, C5426n2.a.j, new EW1(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean s(@NonNull View view) {
        return true;
    }
}
