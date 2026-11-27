package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import defpackage.C2321Wl1;
import defpackage.C3103cB1;
import defpackage.Cm2;
import defpackage.InterfaceC3473dz;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] j = {R.attr.colorBackground};
    public static final Cm2 k = new Cm2();
    public boolean d;
    public boolean e;
    public final Rect g;
    public final Rect h;
    public final a i;

    public class a implements InterfaceC3473dz {
        public Drawable a;

        public a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.h.set(i, i2, i3, i4);
            Rect rect = cardView.g;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.pexpress.tool.R.attr.cardViewStyle);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((C3103cB1) this.i.a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.g.left;
    }

    public int getContentPaddingRight() {
        return this.g.right;
    }

    public int getContentPaddingTop() {
        return this.g.top;
    }

    public float getMaxCardElevation() {
        return ((C3103cB1) this.i.a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.e;
    }

    public float getRadius() {
        return ((C3103cB1) this.i.a).a;
    }

    public boolean getUseCompatPadding() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C3103cB1 c3103cB1H = Cm2.h(this.i);
        if (colorStateList == null) {
            c3103cB1H.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c3103cB1H.h = colorStateList;
        c3103cB1H.b.setColor(colorStateList.getColorForState(c3103cB1H.getState(), c3103cB1H.h.getDefaultColor()));
        c3103cB1H.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        k.n(this.i, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setPreventCornerOverlap(boolean z) {
        if (z != this.e) {
            this.e = z;
            Cm2 cm2 = k;
            a aVar = this.i;
            cm2.n(aVar, ((C3103cB1) aVar.a).e);
        }
    }

    public void setRadius(float f) {
        C3103cB1 c3103cB1 = (C3103cB1) this.i.a;
        if (f == c3103cB1.a) {
            return;
        }
        c3103cB1.a = f;
        c3103cB1.b(null);
        c3103cB1.invalidateSelf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUseCompatPadding(boolean z) {
        if (this.d != z) {
            this.d = z;
            Cm2 cm2 = k;
            a aVar = this.i;
            cm2.n(aVar, ((C3103cB1) aVar.a).e);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.g = rect;
        this.h = new Rect();
        a aVar = new a();
        this.i = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2321Wl1.a, i, com.pexpress.tool.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(j);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.pexpress.tool.R.color.cardview_light_background) : getResources().getColor(com.pexpress.tool.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        Cm2 cm2 = k;
        C3103cB1 c3103cB1 = new C3103cB1(colorStateListValueOf, dimension);
        aVar.a = c3103cB1;
        setBackgroundDrawable(c3103cB1);
        setClipToOutline(true);
        setElevation(dimension2);
        cm2.n(aVar, dimension3);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C3103cB1 c3103cB1H = Cm2.h(this.i);
        if (colorStateListValueOf == null) {
            c3103cB1H.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c3103cB1H.h = colorStateListValueOf;
        c3103cB1H.b.setColor(colorStateListValueOf.getColorForState(c3103cB1H.getState(), c3103cB1H.h.getDefaultColor()));
        c3103cB1H.invalidateSelf();
    }
}
