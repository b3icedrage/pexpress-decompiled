package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5552ne {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static C5552ne c;
    public C6447rt1 a;

    /* JADX INFO: renamed from: ne$a */
    public class a {
        public final int[] a = {2131230978, 2131230976, 2131230902};
        public final int[] b = {2131230926, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {2131230975, 2131230977, 2131230919, R.drawable.abc_text_cursor_material, 2131230972, 2131230973, 2131230974};
        public final int[] d = {2131230951, R.drawable.abc_cab_background_internal_bg, 2131230950};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(@NonNull Context context, int i) {
            int iC = C7211vY1.c(context, R.attr.colorControlHighlight);
            int iB = C7211vY1.b(context, R.attr.colorButtonNormal);
            int[] iArr = C7211vY1.b;
            int[] iArr2 = C7211vY1.d;
            int iB2 = C4162hF.b(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, C7211vY1.c, C7211vY1.f}, new int[]{iB, iB2, C4162hF.b(iC, i), i});
        }

        public static LayerDrawable c(@NonNull C6447rt1 c6447rt1, @NonNull Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableC = c6447rt1.c(context, R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = c6447rt1.c(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableC;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableC2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = R30.a;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C5552ne.b;
            }
            drawableMutate.setColorFilter(C5552ne.c(i, mode));
        }

        public final ColorStateList d(@NonNull Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return C6333rM.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230968) {
                return C6333rM.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, C7211vY1.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, C7211vY1.c(context, R.attr.colorAccent));
                }
                if (i == 2131230963 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return C6333rM.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(this.b, i)) {
                    return C7211vY1.d(context, R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return C6333rM.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return C6333rM.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return C6333rM.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = C7211vY1.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = C7211vY1.b;
                iArr2[0] = C7211vY1.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = C7211vY1.e;
                iArr2[1] = C7211vY1.c(context, R.attr.colorControlActivated);
                iArr[2] = C7211vY1.f;
                iArr2[2] = C7211vY1.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = C7211vY1.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = C7211vY1.e;
                iArr2[1] = C7211vY1.c(context, R.attr.colorControlActivated);
                iArr[2] = C7211vY1.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized C5552ne a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return C6447rt1.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            C5552ne c5552ne = new C5552ne();
            c = c5552ne;
            c5552ne.a = C6447rt1.b();
            C6447rt1 c6447rt1 = c.a;
            a aVar = new a();
            synchronized (c6447rt1) {
                c6447rt1.e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, UZ1 uz1, int[] iArr) {
        PorterDuff.Mode mode = C6447rt1.f;
        int[] state = drawable.getState();
        int[] iArr2 = R30.a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = uz1.d;
            if (!z && !uz1.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z ? uz1.a : null;
            PorterDuff.Mode mode2 = uz1.c ? uz1.b : C6447rt1.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = C6447rt1.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(@NonNull Context context, int i) {
        return this.a.c(context, i);
    }
}
