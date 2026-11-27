package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import defpackage.C5426n2;
import defpackage.C6056q2;
import defpackage.R1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E extends R1 {
    public final RecyclerView d;
    public final a e;

    public static class a extends R1 {
        public final E d;
        public final WeakHashMap e = new WeakHashMap();

        public a(@NonNull E e) {
            this.d = e;
        }

        @Override // defpackage.R1
        public final boolean a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            R1 r1 = (R1) this.e.get(view);
            return r1 != null ? r1.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.R1
        public final C6056q2 b(@NonNull View view) {
            R1 r1 = (R1) this.e.get(view);
            return r1 != null ? r1.b(view) : super.b(view);
        }

        @Override // defpackage.R1
        public final void c(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            R1 r1 = (R1) this.e.get(view);
            if (r1 != null) {
                r1.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // defpackage.R1
        public final void d(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C5426n2 c5426n2) {
            E e = this.d;
            boolean zN = e.d.N();
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
            if (!zN) {
                RecyclerView recyclerView = e.d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, c5426n2);
                    R1 r1 = (R1) this.e.get(view);
                    if (r1 != null) {
                        r1.d(view, c5426n2);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // defpackage.R1
        public final void e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            R1 r1 = (R1) this.e.get(view);
            if (r1 != null) {
                r1.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // defpackage.R1
        public final boolean f(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            R1 r1 = (R1) this.e.get(viewGroup);
            return r1 != null ? r1.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.R1
        public final boolean g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            E e = this.d;
            if (!e.d.N()) {
                RecyclerView recyclerView = e.d;
                if (recyclerView.getLayoutManager() != null) {
                    R1 r1 = (R1) this.e.get(view);
                    if (r1 != null) {
                        if (r1.g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i, bundle)) {
                        return true;
                    }
                    RecyclerView.t tVar = recyclerView.getLayoutManager().b.g;
                    return false;
                }
            }
            return super.g(view, i, bundle);
        }

        @Override // defpackage.R1
        public final void h(@NonNull View view, int i) {
            R1 r1 = (R1) this.e.get(view);
            if (r1 != null) {
                r1.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // defpackage.R1
        public final void i(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            R1 r1 = (R1) this.e.get(view);
            if (r1 != null) {
                r1.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public E(@NonNull RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        if (aVar != null) {
            this.e = aVar;
        } else {
            this.e = new a(this);
        }
    }

    @Override // defpackage.R1
    public final void c(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().R(accessibilityEvent);
        }
    }

    @Override // defpackage.R1
    public final void d(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C5426n2 c5426n2) {
        this.a.onInitializeAccessibilityNodeInfo(view, c5426n2.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.S(recyclerView2.g, recyclerView2.m0, c5426n2);
    }

    @Override // defpackage.R1
    public final boolean g(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.f0(recyclerView2.g, recyclerView2.m0, i, bundle);
    }
}
