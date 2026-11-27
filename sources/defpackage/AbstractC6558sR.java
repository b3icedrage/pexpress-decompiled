package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.pexpress.tool.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001c\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0006R\u001b\u0010\"\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0006¨\u0006#"}, d2 = {"LsR;", "LUP0;", "", "p0", "I", "getBetDownDataSetIndex", "()I", "setBetDownDataSetIndex", "(I)V", "betDownDataSetIndex", "q0", "getBetUpDataSetIndex", "setBetUpDataSetIndex", "betUpDataSetIndex", "Landroid/graphics/drawable/Drawable;", "r0", "LfO0;", "getBackgroundDefault", "()Landroid/graphics/drawable/Drawable;", "backgroundDefault", "s0", "getBackgroundBetUp", "backgroundBetUp", "t0", "getBackgroundBetDown", "backgroundBetDown", "u0", "getTextColorDefault", "textColorDefault", "v0", "getTextColorBetUp", "textColorBetUp", "w0", "getTextColorBetDown", "textColorBetDown", "FeatureGraphicApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractC6558sR extends UP0 {
    public static final /* synthetic */ int x0 = 0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public int betDownDataSetIndex;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public int betUpDataSetIndex;

    @NotNull
    public final KW1 r0;

    @NotNull
    public final KW1 s0;

    @NotNull
    public final KW1 t0;

    @NotNull
    public final KW1 u0;

    @NotNull
    public final KW1 v0;

    @NotNull
    public final KW1 w0;

    /* JADX INFO: renamed from: sR$a */
    public /* synthetic */ class a extends C2635a21 {
        @Override // defpackage.JJ0
        public final Object get() {
            return Integer.valueOf(((AbstractC6558sR) this.e).getBetDownDataSetIndex());
        }
    }

    /* JADX INFO: renamed from: sR$b */
    public /* synthetic */ class b extends C2635a21 {
        @Override // defpackage.JJ0
        public final Object get() {
            return Integer.valueOf(((AbstractC6558sR) this.e).getBetUpDataSetIndex());
        }
    }

    /* JADX INFO: renamed from: sR$c */
    public /* synthetic */ class c extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return ((AbstractC6558sR) this.e).getBackgroundDefault();
        }
    }

    /* JADX INFO: renamed from: sR$d */
    public /* synthetic */ class d extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return ((AbstractC6558sR) this.e).getBackgroundBetUp();
        }
    }

    /* JADX INFO: renamed from: sR$e */
    public /* synthetic */ class e extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return ((AbstractC6558sR) this.e).getBackgroundBetDown();
        }
    }

    /* JADX INFO: renamed from: sR$f */
    public /* synthetic */ class f extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return Integer.valueOf(((AbstractC6558sR) this.e).getTextColorDefault());
        }
    }

    /* JADX INFO: renamed from: sR$g */
    public /* synthetic */ class g extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return Integer.valueOf(((AbstractC6558sR) this.e).getTextColorBetUp());
        }
    }

    /* JADX INFO: renamed from: sR$h */
    public /* synthetic */ class h extends C1217Ij1 {
        @Override // defpackage.JJ0
        public final Object get() {
            return Integer.valueOf(((AbstractC6558sR) this.e).getTextColorBetDown());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6558sR(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBackgroundBetDown() {
        return (Drawable) this.t0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBackgroundBetUp() {
        return (Drawable) this.s0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBackgroundDefault() {
        return (Drawable) this.r0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextColorBetDown() {
        return ((Number) this.w0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextColorBetUp() {
        return ((Number) this.v0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextColorDefault() {
        return ((Number) this.u0.getValue()).intValue();
    }

    @Override // defpackage.AbstractC7347wA
    public final void b(@Nullable Canvas canvas) {
        C7482wo0[] mIndicesToHighlight;
        C3506e70 c3506e70I;
        if (this.G == null || !this.F || (mIndicesToHighlight = this.D) == null || mIndicesToHighlight.length <= 0 || mIndicesToHighlight[0] == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(mIndicesToHighlight, "mIndicesToHighlight");
        for (C7482wo0 c7482wo0 : mIndicesToHighlight) {
            InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) ((WP0) this.e).e(c7482wo0.f);
            if (interfaceC3876ft0 != null && (c3506e70I = ((WP0) this.e).i(c7482wo0)) != null) {
                float fP = interfaceC3876ft0.p(c3506e70I);
                float fT = interfaceC3876ft0.T();
                this.x.getClass();
                if (fP <= fT * 1.0f) {
                    float[] fArr = {c7482wo0.h, c7482wo0.i};
                    C4454ie2 c4454ie2 = this.w;
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    if (c4454ie2.h(f2) && c4454ie2.i(f3)) {
                        InterfaceC6446rt0 interfaceC6446rt0 = this.G;
                        if (interfaceC6446rt0 != null) {
                            interfaceC6446rt0.b(c3506e70I, c7482wo0);
                        }
                        InterfaceC6446rt0 interfaceC6446rt1 = this.G;
                        if (interfaceC6446rt1 != null) {
                            interfaceC6446rt1.a(canvas, fArr[0], fArr[1]);
                        }
                    }
                }
            }
        }
    }

    public final int getBetDownDataSetIndex() {
        return this.betDownDataSetIndex;
    }

    public final int getBetUpDataSetIndex() {
        return this.betUpDataSetIndex;
    }

    public final void s(@NotNull Function0<String> priceValueCallback, @NotNull Function0<? extends View> parentViewCallback) {
        Intrinsics.checkNotNullParameter(priceValueCallback, "priceValueCallback");
        Intrinsics.checkNotNullParameter(parentViewCallback, "parentViewCallback");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setMarker(new C6978uR(context, new a(this, AbstractC6558sR.class, "betDownDataSetIndex", "getBetDownDataSetIndex()I", 0), new b(this, AbstractC6558sR.class, "betUpDataSetIndex", "getBetUpDataSetIndex()I", 0), new c(this, AbstractC6558sR.class, "backgroundDefault", "getBackgroundDefault()Landroid/graphics/drawable/Drawable;", 0), new d(this, AbstractC6558sR.class, "backgroundBetUp", "getBackgroundBetUp()Landroid/graphics/drawable/Drawable;", 0), new e(this, AbstractC6558sR.class, "backgroundBetDown", "getBackgroundBetDown()Landroid/graphics/drawable/Drawable;", 0), new f(this, AbstractC6558sR.class, "textColorDefault", "getTextColorDefault()I", 0), new g(this, AbstractC6558sR.class, "textColorBetUp", "getTextColorBetUp()I", 0), new h(this, AbstractC6558sR.class, "textColorBetDown", "getTextColorBetDown()I", 0), priceValueCallback, parentViewCallback));
    }

    public final void setBetDownDataSetIndex(int i) {
        this.betDownDataSetIndex = i;
    }

    public final void setBetUpDataSetIndex(int i) {
        this.betUpDataSetIndex = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6558sR(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = false;
        this.e = null;
        this.g = true;
        this.h = true;
        this.i = 0.9f;
        this.j = new C6783tW(0);
        this.n = true;
        this.r = "No chart data available.";
        this.w = new C4454ie2();
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = false;
        this.E = 0.0f;
        this.F = true;
        this.H = new ArrayList<>();
        this.I = false;
        e();
        this.J = 100;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = false;
        this.V = false;
        this.W = false;
        this.a0 = 15.0f;
        this.b0 = false;
        this.j0 = new RectF();
        this.k0 = new Matrix();
        new Matrix();
        this.l0 = false;
        this.m0 = C3581eV0.b(0.0d, 0.0d);
        this.n0 = C3581eV0.b(0.0d, 0.0d);
        this.o0 = new float[2];
        this.betDownDataSetIndex = Integer.MIN_VALUE;
        this.betUpDataSetIndex = Integer.MIN_VALUE;
        int i2 = 4;
        this.r0 = XO0.b(new N4(this, i2));
        this.s0 = XO0.b(new O4(this, i2));
        this.t0 = XO0.b(new P4(this, 5));
        this.u0 = XO0.b(new R4(this, 5));
        int i3 = 2;
        this.v0 = XO0.b(new C4039gg(this, i3));
        this.w0 = XO0.b(new C0738Cg(this, i3));
        this.J = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        this.l0 = true;
        post(new RunnableC4535iq(this, 0));
        getDescription().a = false;
        setTouchEnabled(true);
        setDragEnabled(true);
        setDrawGridBackground(false);
        setPinchZoom(true);
        d(null);
        setDrawBorders(false);
        setScaleYEnabled(false);
        setDoubleTapToZoomEnabled(false);
        setData(new C6768tR());
        getLegend().a = false;
        getAxisLeft().a = false;
        getXAxis().B = Hl2.a.e;
        Kl2 axisRight = getAxisRight();
        axisRight.e = C0648Bc.c(this, R.color.textGrey);
        axisRight.E = Kl2.b.e;
        axisRight.f = new C2007Sm0();
    }
}
