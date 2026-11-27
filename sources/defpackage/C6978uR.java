package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C6978uR extends XW0 {

    @NotNull
    public final AbstractC6558sR.a h;

    @NotNull
    public final AbstractC6558sR.b i;

    @NotNull
    public final AbstractC6558sR.c j;

    @NotNull
    public final AbstractC6558sR.d k;

    @NotNull
    public final AbstractC6558sR.e l;

    @NotNull
    public final AbstractC6558sR.f m;

    @NotNull
    public final AbstractC6558sR.g n;

    @NotNull
    public final AbstractC6558sR.h o;

    @NotNull
    public final Function0<String> p;

    @NotNull
    public final AbstractC1568Mx q;

    @NotNull
    public final DecimalFormat r;

    @Nullable
    public C7482wo0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6978uR(@NotNull Context context, @NotNull AbstractC6558sR.a indexDownBetDataSet, @NotNull AbstractC6558sR.b indexUpBetDataSet, @NotNull AbstractC6558sR.c backgroundDefault, @NotNull AbstractC6558sR.d backgroundBetUp, @NotNull AbstractC6558sR.e backgroundBetDown, @NotNull AbstractC6558sR.f textColorDefault, @NotNull AbstractC6558sR.g textColorBetUp, @NotNull AbstractC6558sR.h textColorBetDown, @NotNull Function0 priceValue, @NotNull Function0 requireView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indexDownBetDataSet, "indexDownBetDataSet");
        Intrinsics.checkNotNullParameter(indexUpBetDataSet, "indexUpBetDataSet");
        Intrinsics.checkNotNullParameter(backgroundDefault, "backgroundDefault");
        Intrinsics.checkNotNullParameter(backgroundBetUp, "backgroundBetUp");
        Intrinsics.checkNotNullParameter(backgroundBetDown, "backgroundBetDown");
        Intrinsics.checkNotNullParameter(textColorDefault, "textColorDefault");
        Intrinsics.checkNotNullParameter(textColorBetUp, "textColorBetUp");
        Intrinsics.checkNotNullParameter(textColorBetDown, "textColorBetDown");
        Intrinsics.checkNotNullParameter(priceValue, "priceValue");
        Intrinsics.checkNotNullParameter(requireView, "requireView");
        this.h = indexDownBetDataSet;
        this.i = indexUpBetDataSet;
        this.j = backgroundDefault;
        this.k = backgroundBetUp;
        this.l = backgroundBetDown;
        this.m = textColorDefault;
        this.n = textColorBetUp;
        this.o = textColorBetDown;
        this.p = priceValue;
        this.q = (AbstractC1568Mx) requireView;
        this.r = new DecimalFormat("0.000000");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [Mx, kotlin.jvm.functions.Function0] */
    @Override // defpackage.XW0, defpackage.InterfaceC6446rt0
    public final void a(@NotNull Canvas canvas, float f, float f2) {
        float height;
        float width;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        C7482wo0 c7482wo0 = this.s;
        if (c7482wo0 != null) {
            Intrinsics.checkNotNull(c7482wo0);
            if (c7482wo0.f != 3) {
                height = f2 - (getHeight() * 1.4f);
                width = f - (getWidth() / 2);
            } else {
                height = f2 - (getHeight() / 2);
                int width2 = ((View) this.q.invoke()).getWidth();
                width = (width2 - getWidth()) - (width2 / 100);
            }
        } else {
            height = f2 - (getHeight() / 2);
            int width3 = ((View) this.q.invoke()).getWidth();
            width = (width3 - getWidth()) - (width3 / 100);
        }
        canvas.translate(width, height);
        draw(canvas);
        canvas.translate(-width, -height);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:12:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:13:0x00c6  */
    @Override // defpackage.XW0, defpackage.InterfaceC6446rt0
    public final void b(@NotNull C3506e70 entry, @NotNull C7482wo0 highlight) {
        String str;
        String strO;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.s = highlight;
        Intrinsics.checkNotNull(highlight);
        int iIntValue = ((Number) this.h.get()).intValue();
        int i = highlight.f;
        Function0<String> function0 = this.p;
        if (i == iIntValue) {
            ((ConstraintLayout) findViewById(R.id.root)).setBackground((Drawable) this.l.get());
            TextView textView = (TextView) findViewById(R.id.value);
            textView.setText(function0.invoke());
            textView.setTextColor(((Number) this.o.get()).intValue());
        } else {
            C7482wo0 c7482wo0 = this.s;
            if (c7482wo0 != null) {
                Intrinsics.checkNotNull(c7482wo0);
                if (c7482wo0.f == ((Number) this.i.get()).intValue()) {
                    ((ConstraintLayout) findViewById(R.id.root)).setBackground((Drawable) this.k.get());
                    TextView textView2 = (TextView) findViewById(R.id.value);
                    textView2.setText(function0.invoke());
                    textView2.setTextColor(((Number) this.n.get()).intValue());
                } else {
                    ((ConstraintLayout) findViewById(R.id.root)).setBackground((Drawable) this.j.get());
                    str = this.r.format(Float.valueOf(entry.a()));
                    if (str != null) {
                        strO = QO.o(str);
                    } else {
                        strO = null;
                    }
                    TextView textView3 = (TextView) findViewById(R.id.value);
                    textView3.setText(String.valueOf(strO));
                    textView3.setTextColor(((Number) this.m.get()).intValue());
                }
            } else {
                ((ConstraintLayout) findViewById(R.id.root)).setBackground((Drawable) this.j.get());
                str = this.r.format(Float.valueOf(entry.a()));
                if (str != null) {
                    strO = QO.o(str);
                } else {
                    strO = null;
                }
                TextView textView4 = (TextView) findViewById(R.id.value);
                textView4.setText(String.valueOf(strO));
                textView4.setTextColor(((Number) this.m.get()).intValue());
            }
        }
        super.b(entry, null);
    }
}
