package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: rt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6447rt1 {
    public static C6447rt1 g;
    public WeakHashMap<Context, C5502nO1<ColorStateList>> a;
    public final WeakHashMap<Context, HT0<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    public TypedValue c;
    public boolean d;
    public C5552ne.a e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a(6);

    /* JADX INFO: renamed from: rt1$a */
    public static class a extends RU0<Integer, PorterDuffColorFilter> {
    }

    public static synchronized C6447rt1 b() {
        try {
            if (g == null) {
                g = new C6447rt1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        a aVar = h;
        aVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            aVar.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(@NonNull Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            HT0<WeakReference<Drawable.ConstantState>> ht0 = this.b.get(context);
            drawableNewDrawable = null;
            if (ht0 != null && (weakReference = (WeakReference) ht0.d(j, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    ht0.h(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableC = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230919)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = C5552ne.a.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = C5552ne.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = C5552ne.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 != null) {
                    HT0<WeakReference<Drawable.ConstantState>> ht1 = this.b.get(context);
                    if (ht1 == null) {
                        ht1 = new HT0<>();
                        this.b.put(context, ht1);
                    }
                    ht1.g(j, new WeakReference<>(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(@NonNull Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(@NonNull Context context, int i, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof C4030gd2) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = C6333rM.getDrawable(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                R30.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(@NonNull Context context, int i) {
        ColorStateList colorStateList;
        C5502nO1<ColorStateList> c5502nO1;
        WeakHashMap<Context, C5502nO1<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (c5502nO1 = weakHashMap.get(context)) == null) ? null : (ColorStateList) c5502nO1.d(i, null);
        if (colorStateList == null) {
            C5552ne.a aVar = this.e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i);
            }
            if (colorStateListD != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                C5502nO1<ColorStateList> c5502nO2 = this.a.get(context);
                if (c5502nO2 == null) {
                    c5502nO2 = new C5502nO1<>();
                    this.a.put(context, c5502nO2);
                }
                c5502nO2.a(i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final Drawable g(@NonNull Context context, int i, boolean z, @NonNull Drawable drawable) {
        boolean z2;
        int iRound;
        int i2 = R.attr.colorControlNormal;
        int i3 = R.attr.colorControlActivated;
        ColorStateList colorStateListF = f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            int[] iArr = R30.a;
            Drawable drawableMutate = drawable.mutate();
            A30.a.h(drawableMutate, colorStateListF);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                A30.a.i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = C7211vY1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C5552ne.b;
                C5552ne.a.e(drawableFindDrawableByLayerId, iC, mode2);
                C5552ne.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C7211vY1.c(context, R.attr.colorControlNormal), mode2);
                C5552ne.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), C7211vY1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = C7211vY1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C5552ne.b;
                C5552ne.a.e(drawableFindDrawableByLayerId2, iB, mode3);
                C5552ne.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C7211vY1.c(context, R.attr.colorControlActivated), mode3);
                C5552ne.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C7211vY1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C5552ne.a aVar = this.e;
        boolean z3 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = C5552ne.b;
            if (C5552ne.a.a(aVar.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (!C5552ne.a.a(aVar.c, i)) {
                    boolean zA = C5552ne.a.a(aVar.d, i);
                    i3 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230939) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            i2 = 0;
                            z2 = false;
                        }
                        iRound = -1;
                    }
                }
                i2 = i3;
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                int[] iArr2 = R30.a;
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(C5552ne.c(C7211vY1.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
