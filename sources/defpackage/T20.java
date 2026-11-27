package defpackage;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes3.dex */
public final class T20 {
    public int a = -1;
    public int b = -1;
    public final /* synthetic */ DotsIndicator c;

    public T20(DotsIndicator dotsIndicator) {
        this.c = dotsIndicator;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    public final void a(int i, float f) {
        float f2 = i + f;
        float size = this.c.d.size() - 1;
        if (f2 == size) {
            f2 = size - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > size || i2 == -1) {
            return;
        }
        float f3 = f2 % 1;
        DotsIndicator dotsIndicator = this.c;
        ImageView imageView = dotsIndicator.d.get(i2);
        Intrinsics.checkNotNullExpressionValue(imageView, "dots[selectedPosition]");
        ImageView imageView2 = imageView;
        float f4 = 1;
        AbstractC7907yq.g(imageView2, (int) BX.a(f4, f3, (dotsIndicator.m - f4) * dotsIndicator.getDotsSize(), dotsIndicator.getDotsSize()));
        ArrayList<ImageView> isInBounds = dotsIndicator.d;
        Intrinsics.checkNotNullParameter(isInBounds, "$this$isInBounds");
        int size2 = isInBounds.size();
        if (i3 >= 0 && size2 > i3) {
            ImageView imageView3 = isInBounds.get(i3);
            Intrinsics.checkNotNullExpressionValue(imageView3, "dots[nextPosition]");
            ImageView imageView4 = imageView3;
            AbstractC7907yq.g(imageView4, (int) (((dotsIndicator.m - f4) * dotsIndicator.getDotsSize() * f3) + dotsIndicator.getDotsSize()));
            Drawable background = imageView2.getBackground();
            if (background == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            }
            S20 s20 = (S20) background;
            Drawable background2 = imageView4.getBackground();
            if (background2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            }
            S20 s21 = (S20) background2;
            if (dotsIndicator.getSelectedDotColor() != dotsIndicator.getDotsColor()) {
                ArgbEvaluator argbEvaluator = dotsIndicator.q;
                Object objEvaluate = argbEvaluator.evaluate(f3, Integer.valueOf(dotsIndicator.getSelectedDotColor()), Integer.valueOf(dotsIndicator.getDotsColor()));
                if (objEvaluate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = argbEvaluator.evaluate(f3, Integer.valueOf(dotsIndicator.getDotsColor()), Integer.valueOf(dotsIndicator.getSelectedDotColor()));
                if (objEvaluate2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                s21.setColor(((Integer) objEvaluate2).intValue());
                if (dotsIndicator.n) {
                    AbstractC7907yq.a pager = dotsIndicator.getPager();
                    Intrinsics.checkNotNull(pager);
                    if (i2 <= pager.b()) {
                        s20.setColor(dotsIndicator.getSelectedDotColor());
                    } else {
                        s20.setColor(iIntValue);
                    }
                } else {
                    s20.setColor(iIntValue);
                }
            }
        }
        dotsIndicator.invalidate();
        int i4 = this.a;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator<Integer> it = f.i(i4, i2).iterator();
                while (((DB0) it).g) {
                    b(((CB0) it).b());
                }
            }
            int i5 = this.b;
            if (i3 < i5) {
                b(i5);
                Iterator<Integer> it2 = new IntRange(i2 + 2, this.b, 1).iterator();
                while (((DB0) it2).g) {
                    b(((CB0) it2).b());
                }
            }
        }
        this.a = i2;
        this.b = i3;
    }

    public final void b(int i) {
        DotsIndicator dotsIndicator = this.c;
        ImageView imageView = dotsIndicator.d.get(i);
        Intrinsics.checkNotNullExpressionValue(imageView, "dots[position]");
        AbstractC7907yq.g(imageView, (int) dotsIndicator.getDotsSize());
        dotsIndicator.c(i);
    }
}
