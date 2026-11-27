package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Vi2 {
    public e a;

    public static final class a {
        public final LA0 a;
        public final LA0 b;

        public a(@NonNull LA0 la0, @NonNull LA0 la1) {
            this.a = la0;
            this.b = la1;
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }
    }

    public static abstract class b {
        public WindowInsets a;

        @NonNull
        public abstract C3006bj2 a(@NonNull C3006bj2 c3006bj2, @NonNull List<Vi2> list);
    }

    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final C1503Mb0 f = new C1503Mb0();
        public static final DecelerateInterpolator g = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {
            public final MA0 a;
            public C3006bj2 b;

            /* JADX INFO: renamed from: Vi2$c$a$a, reason: collision with other inner class name */
            public class C0164a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ Vi2 d;
                public final /* synthetic */ C3006bj2 e;
                public final /* synthetic */ C3006bj2 g;
                public final /* synthetic */ int h;
                public final /* synthetic */ View i;

                public C0164a(Vi2 vi2, C3006bj2 c3006bj2, C3006bj2 c3006bj3, int i, View view) {
                    this.d = vi2;
                    this.e = c3006bj2;
                    this.g = c3006bj3;
                    this.h = i;
                    this.i = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3006bj2.e cVar;
                    int i;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    Vi2 vi2 = this.d;
                    vi2.a.d(animatedFraction);
                    float fB = vi2.a.b();
                    PathInterpolator pathInterpolator = c.e;
                    int i2 = Build.VERSION.SDK_INT;
                    C3006bj2 c3006bj2 = this.e;
                    if (i2 >= 30) {
                        cVar = new C3006bj2.d(c3006bj2);
                    } else {
                        cVar = i2 >= 29 ? new C3006bj2.c(c3006bj2) : new C3006bj2.b(c3006bj2);
                    }
                    int i3 = 1;
                    while (i3 <= 256) {
                        int i4 = this.h & i3;
                        C3006bj2.k kVar = c3006bj2.a;
                        if (i4 == 0) {
                            cVar.c(i3, kVar.f(i3));
                            i = 1;
                        } else {
                            LA0 la0F = kVar.f(i3);
                            LA0 la0F2 = this.g.a.f(i3);
                            float f = 1.0f - fB;
                            i = 1;
                            cVar.c(i3, C3006bj2.e(la0F, (int) (((double) ((la0F.a - la0F2.a) * f)) + 0.5d), (int) (((double) ((la0F.b - la0F2.b) * f)) + 0.5d), (int) (((double) ((la0F.c - la0F2.c) * f)) + 0.5d), (int) (((double) ((la0F.d - la0F2.d) * f)) + 0.5d)));
                        }
                        i3 <<= i;
                        fB = fB;
                    }
                    c.g(this.i, cVar.b(), Collections.singletonList(vi2));
                }
            }

            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ Vi2 d;
                public final /* synthetic */ View e;

                public b(Vi2 vi2, View view) {
                    this.d = vi2;
                    this.e = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Vi2 vi2 = this.d;
                    vi2.a.d(1.0f);
                    c.e(vi2, this.e);
                }
            }

            /* JADX INFO: renamed from: Vi2$c$a$c, reason: collision with other inner class name */
            public class RunnableC0165c implements Runnable {
                public final /* synthetic */ View d;
                public final /* synthetic */ Vi2 e;
                public final /* synthetic */ a g;
                public final /* synthetic */ ValueAnimator h;

                public RunnableC0165c(View view, Vi2 vi2, a aVar, ValueAnimator valueAnimator) {
                    this.d = view;
                    this.e = vi2;
                    this.g = aVar;
                    this.h = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.d, this.e, this.g);
                    this.h.start();
                }
            }

            public a(@NonNull View view, @NonNull MA0 ma0) {
                C3006bj2 c3006bj2B;
                this.a = ma0;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                C3006bj2 c3006bj2A = Cd2.e.a(view);
                if (c3006bj2A != null) {
                    int i = Build.VERSION.SDK_INT;
                    c3006bj2B = (i >= 30 ? new C3006bj2.d(c3006bj2A) : i >= 29 ? new C3006bj2.c(c3006bj2A) : new C3006bj2.b(c3006bj2A)).b();
                } else {
                    c3006bj2B = null;
                }
                this.b = c3006bj2B;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C3006bj2.k kVar;
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.b = C3006bj2.g(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                C3006bj2 c3006bj2G = C3006bj2.g(view, windowInsets);
                if (this.b == null) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    this.b = Cd2.e.a(view);
                }
                if (this.b == null) {
                    this.b = c3006bj2G;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                C3006bj2 c3006bj2 = this.b;
                int i = 1;
                int i2 = 0;
                while (true) {
                    kVar = c3006bj2G.a;
                    if (i > 256) {
                        break;
                    }
                    if (!kVar.f(i).equals(c3006bj2.a.f(i))) {
                        i2 |= i;
                    }
                    i <<= 1;
                }
                if (i2 == 0) {
                    return c.i(view, windowInsets);
                }
                C3006bj2 c3006bj3 = this.b;
                if ((i2 & 8) != 0) {
                    interpolator = kVar.f(8).d > c3006bj3.a.f(8).d ? c.e : c.f;
                } else {
                    interpolator = c.g;
                }
                Vi2 vi2 = new Vi2(i2, interpolator, 160L);
                vi2.a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(vi2.a.a());
                LA0 la0F = kVar.f(i2);
                LA0 la0F2 = c3006bj3.a.f(i2);
                int iMin = Math.min(la0F.a, la0F2.a);
                int i3 = la0F.b;
                int i4 = la0F2.b;
                int iMin2 = Math.min(i3, i4);
                int i5 = la0F.c;
                int i6 = la0F2.c;
                int iMin3 = Math.min(i5, i6);
                int i7 = la0F.d;
                int i8 = i2;
                int i9 = la0F2.d;
                a aVar = new a(LA0.b(iMin, iMin2, iMin3, Math.min(i7, i9)), LA0.b(Math.max(la0F.a, la0F2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                c.f(view, vi2, windowInsets, false);
                duration.addUpdateListener(new C0164a(vi2, c3006bj2G, c3006bj3, i8, view));
                duration.addListener(new b(vi2, view));
                ViewTreeObserverOnPreDrawListenerC7556x91.a(view, new RunnableC0165c(view, vi2, aVar, duration));
                this.b = c3006bj2G;
                return c.i(view, windowInsets);
            }
        }

        public static void e(@NonNull Vi2 vi2, @NonNull View view) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                ((MA0) bVarJ).b.setTranslationY(0.0f);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(vi2, viewGroup.getChildAt(i));
                }
            }
        }

        public static void f(View view, Vi2 vi2, WindowInsets windowInsets, boolean z) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a = windowInsets;
                if (!z) {
                    MA0 ma0 = (MA0) bVarJ;
                    View view2 = ma0.b;
                    int[] iArr = ma0.e;
                    view2.getLocationOnScreen(iArr);
                    z = true;
                    ma0.c = iArr[1];
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), vi2, windowInsets, z);
                }
            }
        }

        public static void g(@NonNull View view, @NonNull C3006bj2 c3006bj2, @NonNull List<Vi2> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a(c3006bj2, list);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), c3006bj2, list);
                }
            }
        }

        public static void h(View view, Vi2 vi2, a aVar) {
            b bVarJ = j(view);
            if (bVarJ == null) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        h(viewGroup.getChildAt(i), vi2, aVar);
                    }
                    return;
                }
                return;
            }
            MA0 ma0 = (MA0) bVarJ;
            View view2 = ma0.b;
            int[] iArr = ma0.e;
            view2.getLocationOnScreen(iArr);
            int i2 = ma0.c - iArr[1];
            ma0.d = i2;
            view2.setTranslationY(i2);
        }

        @NonNull
        public static WindowInsets i(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    public static class d extends e {

        @NonNull
        public final WindowInsetsAnimation e;

        public static class a extends WindowInsetsAnimation$Callback {
            public final MA0 a;
            public List<Vi2> b;
            public ArrayList<Vi2> c;
            public final HashMap<WindowInsetsAnimation, Vi2> d;

            public a(@NonNull MA0 ma0) {
                super(0);
                this.d = new HashMap<>();
                this.a = ma0;
            }

            @NonNull
            public final Vi2 a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                Vi2 vi2 = this.d.get(windowInsetsAnimation);
                if (vi2 == null) {
                    vi2 = new Vi2(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        vi2.a = new d(windowInsetsAnimation);
                    }
                    this.d.put(windowInsetsAnimation, vi2);
                }
                return vi2;
            }

            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                MA0 ma0 = this.a;
                a(windowInsetsAnimation);
                ma0.b.setTranslationY(0.0f);
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                MA0 ma0 = this.a;
                a(windowInsetsAnimation);
                View view = ma0.b;
                int[] iArr = ma0.e;
                view.getLocationOnScreen(iArr);
                ma0.c = iArr[1];
            }

            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<Vi2> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<Vi2> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationB = Zi2.b(list.get(size));
                    Vi2 vi2A = a(windowInsetsAnimationB);
                    vi2A.a.d(windowInsetsAnimationB.getFraction());
                    this.c.add(vi2A);
                }
                MA0 ma0 = this.a;
                C3006bj2 c3006bj2G = C3006bj2.g(null, windowInsets);
                ma0.a(c3006bj2G, this.b);
                return c3006bj2G.f();
            }

            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                MA0 ma0 = this.a;
                a(windowInsetsAnimation);
                LA0 la0C = LA0.c(bounds.getLowerBound());
                LA0 la0C2 = LA0.c(bounds.getUpperBound());
                View view = ma0.b;
                int[] iArr = ma0.e;
                view.getLocationOnScreen(iArr);
                int i = ma0.c - iArr[1];
                ma0.d = i;
                view.setTranslationY(i);
                Yi2.b();
                return TI1.b(la0C.d(), la0C2.d());
            }
        }

        public d(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // Vi2.e
        public final long a() {
            return this.e.getDurationMillis();
        }

        @Override // Vi2.e
        public final float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override // Vi2.e
        public final int c() {
            return this.e.getTypeMask();
        }

        @Override // Vi2.e
        public final void d(float f) {
            this.e.setFraction(f);
        }
    }

    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public Vi2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(SI1.c(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }
}
