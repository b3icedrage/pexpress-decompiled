package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import com.pexpress.tool.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Pd2 {
    @Nullable
    public static final Drawable a(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C6333rM.getDrawable(view.getContext(), i);
    }

    @NotNull
    public static final LifecycleCoroutineScopeImpl b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        FP0 fp0 = (FP0) JH1.j(JH1.n(FH1.e(view, Ce2.d), De2.d));
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = fp0 != null ? C7652xe.f(fp0) : null;
        if (lifecycleCoroutineScopeImplF != null) {
            return lifecycleCoroutineScopeImplF;
        }
        throw new IllegalStateException("LifecycleOwner responsible for managing this View is not present");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:83:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:0: B:9:0x0075->B:88:?, LOOP_END, SYNTHETIC] */
    public static final void c(@NotNull View view, @NotNull String text, int i, @Nullable String str, @Nullable C4935ki c4935ki, @Nullable View view2, int i2) {
        ViewGroup viewGroup;
        BaseTransientBottomBar.d dVar;
        Object parent;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        SpannedString spannedString = new SpannedString(text);
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(spannedString, "spannedString");
        boolean z = false;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.custom_snackbar, (ViewGroup) null, false);
        int i3 = R.id.snackbar_button;
        TextView textView = (TextView) C3476e.h(viewInflate, R.id.snackbar_button);
        if (textView != null) {
            i3 = R.id.snackbar_icon;
            ImageView snackbarIcon = (ImageView) C3476e.h(viewInflate, R.id.snackbar_icon);
            if (snackbarIcon != null) {
                i3 = R.id.snackbar_text;
                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.snackbar_text);
                if (textView2 != null) {
                    C7188vR c7188vR = new C7188vR((LinearLayout) viewInflate, textView, snackbarIcon, textView2);
                    Intrinsics.checkNotNullExpressionValue(snackbarIcon, "snackbarIcon");
                    C3435dm0.e(snackbarIcon, i, EnumC7035uh1.g);
                    textView2.setText(spannedString);
                    textView.setText(str);
                    textView.setOnClickListener(new ViewOnClickListenerC3853fm(c4935ki, 2));
                    Intrinsics.checkNotNullExpressionValue(c7188vR, "apply(...)");
                    int[] iArr = Snackbar.D;
                    ViewGroup viewGroup2 = null;
                    while (true) {
                        if (view instanceof CoordinatorLayout) {
                            viewGroup = (ViewGroup) view;
                            break;
                        }
                        if (!(view instanceof FrameLayout)) {
                            parent = view.getParent();
                            if (parent instanceof View) {
                                view = (View) parent;
                            } else {
                                view = null;
                            }
                            if (view == null) {
                                viewGroup = viewGroup2;
                                break;
                            }
                        } else {
                            if (view.getId() == 16908290) {
                                viewGroup = (ViewGroup) view;
                                break;
                            }
                            viewGroup2 = (ViewGroup) view;
                            parent = view.getParent();
                            if (parent instanceof View) {
                                view = (View) parent;
                            } else {
                                view = null;
                            }
                            if (view == null) {
                                viewGroup = viewGroup2;
                                break;
                            }
                        }
                    }
                    if (viewGroup == null) {
                        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                    }
                    Context context = viewGroup.getContext();
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Snackbar.D);
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                    typedArrayObtainStyledAttributes.recycle();
                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
                    Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                    ((SnackbarContentLayout) snackbar.i.getChildAt(0)).getMessageView().setText("");
                    snackbar.k = i2;
                    snackbar.i.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(context, R.color.altSurface)));
                    BaseTransientBottomBar.d dVar2 = snackbar.l;
                    if (dVar2 != null) {
                        dVar2.a();
                    }
                    if (view2 == null) {
                        dVar = null;
                    } else {
                        dVar = new BaseTransientBottomBar.d(snackbar, view2);
                        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                        if (view2.isAttachedToWindow()) {
                            view2.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
                        }
                        view2.addOnAttachStateChangeListener(dVar);
                    }
                    snackbar.l = dVar;
                    Intrinsics.checkNotNullExpressionValue(snackbar, "apply(...)");
                    BaseTransientBottomBar.f fVar = snackbar.i;
                    Intrinsics.c(fVar, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
                    Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) fVar;
                    snackbarLayout.setPadding(0, 0, 0, 0);
                    snackbarLayout.addView(c7188vR.d, 0);
                    snackbarLayout.setBackground(a(snackbarLayout, R.drawable.snackbar_background));
                    g gVarB = g.b();
                    int recommendedTimeoutMillis = snackbar.k;
                    if (recommendedTimeoutMillis == -2) {
                        recommendedTimeoutMillis = -2;
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        recommendedTimeoutMillis = snackbar.C.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
                    }
                    BaseTransientBottomBar.c cVar = snackbar.v;
                    synchronized (gVarB.a) {
                        try {
                            if (gVarB.c(cVar)) {
                                g.c cVar2 = gVarB.c;
                                cVar2.b = recommendedTimeoutMillis;
                                gVarB.b.removeCallbacksAndMessages(cVar2);
                                gVarB.f(gVarB.c);
                                return;
                            }
                            g.c cVar3 = gVarB.d;
                            if (cVar3 != null && cVar3.a.get() == cVar) {
                                z = true;
                            }
                            if (z) {
                                gVarB.d.b = recommendedTimeoutMillis;
                            } else {
                                gVarB.d = new g.c(recommendedTimeoutMillis, cVar);
                            }
                            g.c cVar4 = gVarB.c;
                            if (cVar4 == null || !gVarB.a(cVar4, 4)) {
                                gVarB.c = null;
                                g.c cVar5 = gVarB.d;
                                if (cVar5 != null) {
                                    gVarB.c = cVar5;
                                    gVarB.d = null;
                                    g.b bVar = cVar5.a.get();
                                    if (bVar != null) {
                                        bVar.b();
                                    } else {
                                        gVarB.c = null;
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
