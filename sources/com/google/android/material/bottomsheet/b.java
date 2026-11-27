package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pexpress.tool.R;
import defpackage.C3006bj2;
import defpackage.C4298hu;
import defpackage.C5345me2;
import defpackage.C5365mj2;
import defpackage.C5575nj2;
import defpackage.C5785oj2;
import defpackage.C6561sS;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.DialogC5342me;
import defpackage.NX0;
import defpackage.Si2;
import defpackage.ViewOnClickListenerC4088gu;
import defpackage.ViewOnTouchListenerC4546iu;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DialogC5342me {
    public BottomSheetBehavior<FrameLayout> j;
    public FrameLayout k;
    public CoordinatorLayout l;
    public FrameLayout m;
    public boolean n;
    public boolean o;
    public boolean p;
    public C0307b q;
    public boolean r;

    @NonNull
    public a s;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public static class C0307b extends BottomSheetBehavior.c {
        public final Boolean a;

        @NonNull
        public final C3006bj2 b;
        public Window c;
        public boolean d;

        public C0307b(View view, C3006bj2 c3006bj2) {
            ColorStateList colorStateListG;
            this.b = c3006bj2;
            NX0 nx0 = BottomSheetBehavior.w(view).i;
            if (nx0 != null) {
                colorStateListG = nx0.d.c;
            } else {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                colorStateListG = Cd2.d.g(view);
            }
            if (colorStateListG != null) {
                this.a = Boolean.valueOf(C8056za.l(colorStateListG.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.a = Boolean.valueOf(C8056za.l(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(@NonNull View view, int i) {
            d(view);
        }

        public final void d(View view) {
            C6561sS c5575nj2;
            C6561sS c5575nj3;
            int top = view.getTop();
            C3006bj2 c3006bj2 = this.b;
            if (top < c3006bj2.d()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                    window.getDecorView();
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        c5575nj3 = new C5785oj2(window);
                    } else {
                        c5575nj3 = i >= 26 ? new C5575nj2(window) : new C5365mj2(window);
                    }
                    c5575nj3.r(zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), c3006bj2.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    boolean z = this.d;
                    window2.getDecorView();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        c5575nj2 = new C5785oj2(window2);
                    } else {
                        c5575nj2 = i2 >= 26 ? new C5575nj2(window2) : new C5365mj2(window2);
                    }
                    c5575nj2.r(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            C6561sS c5575nj2;
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                window.getDecorView();
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    c5575nj2 = new C5785oj2(window);
                } else {
                    c5575nj2 = i >= 26 ? new C5575nj2(window) : new C5365mj2(window);
                }
                this.d = c5575nj2.j();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        f();
        super.cancel();
    }

    public final void e() {
        if (this.k == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.k = frameLayout;
            this.l = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.k.findViewById(R.id.design_bottom_sheet);
            this.m = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorW = BottomSheetBehavior.w(frameLayout2);
            this.j = bottomSheetBehaviorW;
            a aVar = this.s;
            ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehaviorW.W;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.j.A(this.n);
        }
    }

    @NonNull
    public final BottomSheetBehavior<FrameLayout> f() {
        if (this.j == null) {
            e();
        }
        return this.j;
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.k.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.r) {
            FrameLayout frameLayout = this.m;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.d.u(frameLayout, aVar);
        }
        this.m.removeAllViews();
        if (layoutParams == null) {
            this.m.addView(view);
        } else {
            this.m.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC4088gu(this));
        Cd2.l(this.m, new C4298hu(this));
        this.m.setOnTouchListener(new ViewOnTouchListenerC4546iu());
        return this.k;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.r && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.l;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            Si2.a(window, !z);
            C0307b c0307b = this.q;
            if (c0307b != null) {
                c0307b.e(window);
            }
        }
    }

    @Override // defpackage.DialogC5342me, defpackage.DialogC4636jH, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C0307b c0307b = this.q;
        if (c0307b != null) {
            c0307b.e(null);
        }
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.j;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.C(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.n != z) {
            this.n = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.j;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.n) {
            this.n = true;
        }
        this.o = z;
        this.p = true;
    }

    @Override // defpackage.DialogC5342me, defpackage.DialogC4636jH, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // defpackage.DialogC5342me, defpackage.DialogC4636jH, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // defpackage.DialogC5342me, defpackage.DialogC4636jH, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }

    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(@NonNull View view, int i) {
            if (i == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(@NonNull View view) {
        }
    }
}
