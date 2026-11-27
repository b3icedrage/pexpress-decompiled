package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.chip.Chip;
import defpackage.A30;
import defpackage.AbstractC0955Fa0;
import defpackage.C0564Aa;
import defpackage.C2083Tl1;
import defpackage.C2135Ud;
import defpackage.C2671aC;
import defpackage.C3872fs;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C6333rM;
import defpackage.C6683t11;
import defpackage.C7001uY1;
import defpackage.C7080uu1;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.Fe2;
import defpackage.G1;
import defpackage.IX0;
import defpackage.InterfaceC3014bl2;
import defpackage.InterfaceC5280mK1;
import defpackage.MX0;
import defpackage.OX0;
import defpackage.RJ1;
import defpackage.SX1;
import defpackage.WX1;
import defpackage.XX1;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C2135Ud implements com.google.android.material.chip.a.InterfaceC0309a, InterfaceC5280mK1, IX0<Chip> {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final a A;
    public com.google.android.material.chip.a i;
    public InsetDrawable j;
    public RippleDrawable k;
    public View.OnClickListener l;
    public CompoundButton.OnCheckedChangeListener m;
    public IX0.a<Chip> n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public CharSequence v;

    @NonNull
    public final b w;
    public boolean x;
    public final Rect y;
    public final RectF z;

    public class a extends G1 {
        public a() {
        }

        @Override // defpackage.G1
        public final void o(int i) {
        }

        @Override // defpackage.G1
        public final void p(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.i;
            chip.setText(aVar.G0 ? aVar.I : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends AbstractC0955Fa0 {
        public b(Chip chip) {
            super(chip);
        }

        @Override // defpackage.AbstractC0955Fa0
        public final void l(@NonNull ArrayList arrayList) {
            com.google.android.material.chip.a aVar;
            arrayList.add(0);
            Rect rect = Chip.B;
            Chip chip = Chip.this;
            if (!chip.d() || (aVar = chip.i) == null || !aVar.O || chip.l == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // defpackage.AbstractC0955Fa0
        public final void o(int i, @NonNull C5426n2 c5426n2) {
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
            if (i != 1) {
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(Chip.B);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfo.setContentDescription(chip.getContext().getString(com.pexpress.tool.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c5426n2.b(C5426n2.a.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.pexpress.tool.R.attr.chipStyle);
        this.y = new Rect();
        this.z = new RectF();
        this.A = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                b0.e("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                b0.e("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        int[] iArr = C2083Tl1.h;
        TypedArray typedArrayD = C7001uY1.d(aVar.i0, attributeSet, iArr, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.I0 = typedArrayD.hasValue(37);
        Context context3 = aVar.i0;
        ColorStateList colorStateListB = MX0.b(context3, typedArrayD, 24);
        if (aVar.B != colorStateListB) {
            aVar.B = colorStateListB;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListB2 = MX0.b(context3, typedArrayD, 11);
        if (aVar.C != colorStateListB2) {
            aVar.C = colorStateListB2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (aVar.D != dimension) {
            aVar.D = dimension;
            aVar.invalidateSelf();
            aVar.y();
        }
        if (typedArrayD.hasValue(12)) {
            aVar.E(typedArrayD.getDimension(12, 0.0f));
        }
        aVar.J(MX0.b(context3, typedArrayD, 22));
        aVar.K(typedArrayD.getDimension(23, 0.0f));
        aVar.T(MX0.b(context3, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(aVar.I, text);
        XX1 xx1 = aVar.o0;
        if (!zEquals) {
            aVar.I = text;
            xx1.d = true;
            aVar.invalidateSelf();
            aVar.y();
        }
        SX1 sx1 = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new SX1(context3, resourceId);
        sx1.k = typedArrayD.getDimension(1, sx1.k);
        xx1.b(sx1, context3);
        int i = typedArrayD.getInt(3, 0);
        if (i == 1) {
            aVar.F0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            aVar.F0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            aVar.F0 = TextUtils.TruncateAt.END;
        }
        aVar.I(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.I(typedArrayD.getBoolean(15, false));
        }
        aVar.F(MX0.d(context3, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            aVar.H(MX0.b(context3, typedArrayD, 17));
        }
        aVar.G(typedArrayD.getDimension(16, -1.0f));
        aVar.Q(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.Q(typedArrayD.getBoolean(26, false));
        }
        aVar.L(MX0.d(context3, typedArrayD, 25));
        aVar.P(MX0.b(context3, typedArrayD, 30));
        aVar.N(typedArrayD.getDimension(28, 0.0f));
        aVar.A(typedArrayD.getBoolean(6, false));
        aVar.D(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.D(typedArrayD.getBoolean(8, false));
        }
        aVar.B(MX0.d(context3, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            aVar.C(MX0.b(context3, typedArrayD, 9));
        }
        aVar.Y = C6683t11.a(context3, typedArrayD, 39);
        aVar.Z = C6683t11.a(context3, typedArrayD, 33);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (aVar.a0 != dimension2) {
            aVar.a0 = dimension2;
            aVar.invalidateSelf();
            aVar.y();
        }
        aVar.S(typedArrayD.getDimension(35, 0.0f));
        aVar.R(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (aVar.d0 != dimension3) {
            aVar.d0 = dimension3;
            aVar.invalidateSelf();
            aVar.y();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (aVar.e0 != dimension4) {
            aVar.e0 = dimension4;
            aVar.invalidateSelf();
            aVar.y();
        }
        aVar.O(typedArrayD.getDimension(29, 0.0f));
        aVar.M(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (aVar.h0 != dimension5) {
            aVar.h0 = dimension5;
            aVar.invalidateSelf();
            aVar.y();
        }
        aVar.H0 = typedArrayD.getDimensionPixelSize(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        typedArrayD.recycle();
        C7001uY1.a(context2, attributeSet, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action);
        C7001uY1.b(context2, attributeSet, iArr, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action);
        this.s = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.u = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(Fe2.b(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.k(Cd2.d.i(this));
        C7001uY1.a(context2, attributeSet, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action);
        C7001uY1.b(context2, attributeSet, iArr, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.pexpress.tool.R.attr.chipStyle, com.pexpress.tool.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.w = new b(this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new C2671aC(this));
        }
        setChecked(this.o);
        setText(aVar.I);
        setEllipsize(aVar.F0);
        h();
        if (!this.i.G0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.s) {
            setMinHeight(this.u);
        }
        this.t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ZB
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = this.a;
                IX0.a<Chip> aVar2 = chip.n;
                if (aVar2 != null) {
                    KB kb = ((JB) aVar2).a;
                    if (!z ? kb.e(chip, kb.e) : kb.a(chip)) {
                        kb.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.m;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.z;
        rectF.setEmpty();
        if (d() && this.l != null) {
            com.google.android.material.chip.a aVar = this.i;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.W()) {
                float f = aVar.h0 + aVar.g0 + aVar.S + aVar.f0 + aVar.e0;
                if (A30.b.a(aVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private SX1 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.o0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0309a
    public final void a() {
        c(this.u);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i) {
        this.u = i;
        if (!this.s) {
            InsetDrawable insetDrawable = this.j;
            if (insetDrawable == null) {
                int[] iArr = C7080uu1.a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.j = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = C7080uu1.a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.i.D));
        int iMax2 = Math.max(0, i - this.i.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.j;
            if (insetDrawable2 == null) {
                int[] iArr3 = C7080uu1.a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.j = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = C7080uu1.a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = C7080uu1.a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.j = new InsetDrawable((Drawable) this.i, i2, i3, i2, i3);
        int[] iArr6 = C7080uu1.a;
        f();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        Object objB = aVar.P;
        if (objB == null) {
            objB = null;
        } else if (objB instanceof InterfaceC3014bl2) {
            objB = ((InterfaceC3014bl2) objB).b();
        }
        return objB != null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i;
        if (!this.x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        b bVar = this.w;
        AccessibilityManager accessibilityManager = bVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = Chip.this;
                int i2 = (chip.d() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = bVar.m;
                if (i3 != i2) {
                    bVar.m = i2;
                    bVar.q(i2, UserVerificationMethods.USER_VERIFY_PATTERN);
                    bVar.q(i3, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                }
                if (i2 == Integer.MIN_VALUE) {
                    if (!super.dispatchHoverEvent(motionEvent)) {
                        return false;
                    }
                }
            } else if (action == 10 && (i = bVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    bVar.m = Integer.MIN_VALUE;
                    bVar.q(i, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    return true;
                }
            } else if (!super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.w;
        bVar.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && bVar.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = bVar.l;
                                if (i != Integer.MIN_VALUE) {
                                    chip = Chip.this;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.l;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.x) {
                                            chip.w.q(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = bVar.l;
                    if (i != Integer.MIN_VALUE) {
                        chip = Chip.this;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.l;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.x) {
                                chip.w.q(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = bVar.m(1, null);
            }
        }
        if (!zM || bVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.C2135Ud, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.i;
        boolean z = false;
        if (aVar != null && com.google.android.material.chip.a.x(aVar.P)) {
            com.google.android.material.chip.a aVar2 = this.i;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.r) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.C0, iArr)) {
                aVar2.C0 = iArr;
                if (aVar2.W()) {
                    z = aVar2.z(aVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        com.google.android.material.chip.a aVar;
        if (!d() || (aVar = this.i) == null || !aVar.O || this.l == null) {
            Cd2.l(this, null);
            this.x = false;
        } else {
            Cd2.l(this, this.w);
            this.x = true;
        }
    }

    public final void f() {
        this.k = new RippleDrawable(C7080uu1.c(this.i.H), getBackgroundDrawable(), null);
        this.i.getClass();
        RippleDrawable rippleDrawable = this.k;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.i) == null) {
            return;
        }
        int iU = (int) (aVar.u() + aVar.h0 + aVar.e0);
        com.google.android.material.chip.a aVar2 = this.i;
        int iT = (int) (aVar2.t() + aVar2.a0 + aVar2.d0);
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            iT += rect.left;
            iU += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setPaddingRelative(iT, paddingTop, iU, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v)) {
            return this.v;
        }
        com.google.android.material.chip.a aVar = this.i;
        if (!(aVar != null && aVar.U)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).l.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.j;
        return insetDrawable == null ? this.i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.i;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.h0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || (drawable = aVar.K) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC3014bl2 ? ((InterfaceC3014bl2) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.L;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || (drawable = aVar.P) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC3014bl2 ? ((InterfaceC3014bl2) drawable).b() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.F0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.x) {
            b bVar = this.w;
            if (bVar.l == 1 || bVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C6683t11 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.H;
        }
        return null;
    }

    @NonNull
    public RJ1 getShapeAppearanceModel() {
        return this.i.d.a;
    }

    public C6683t11 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            return aVar.d0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        SX1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.x(this, this.i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null && aVar.U) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.x) {
            b bVar = this.w;
            int i2 = bVar.l;
            if (i2 != Integer.MIN_VALUE) {
                bVar.j(i2);
            }
            if (z) {
                bVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.i;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.U);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.g) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = chipGroup.getChildAt(i2);
                if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                    if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(com.pexpress.tool.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(C5426n2.f.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t != i) {
            this.t = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.p) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.p) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.l;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.x) {
                        this.w.q(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k) {
            super.setBackground(drawable);
        } else {
            b0.e("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        b0.e("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.C2135Ud, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k) {
            super.setBackgroundDrawable(drawable);
        } else {
            b0.e("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.C2135Ud, android.view.View
    public void setBackgroundResource(int i) {
        b0.e("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        b0.e("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        b0.e("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.A(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.A(aVar.i0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null) {
            this.o = z;
        } else if (aVar.U) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.B(C7652xe.d(aVar.i0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.C(C6333rM.getColorStateList(aVar.i0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.D(aVar.i0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.C == colorStateList) {
            return;
        }
        aVar.C = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.C == (colorStateList = C6333rM.getColorStateList(aVar.i0, i))) {
            return;
        }
        aVar.C = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.E(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.i;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.E0 = new WeakReference<>(null);
            }
            this.i = aVar;
            aVar.G0 = false;
            aVar.E0 = new WeakReference<>(this);
            c(this.u);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.h0 == f) {
            return;
        }
        aVar.h0 = f;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float dimension = aVar.i0.getResources().getDimension(i);
            if (aVar.h0 != dimension) {
                aVar.h0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.F(C7652xe.d(aVar.i0, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.G(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.H(C6333rM.getColorStateList(aVar.i0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.I(aVar.i0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.D == f) {
            return;
        }
        aVar.D = f;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float dimension = aVar.i0.getResources().getDimension(i);
            if (aVar.D != dimension) {
                aVar.D = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.a0 == f) {
            return;
        }
        aVar.a0 = f;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float dimension = aVar.i0.getResources().getDimension(i);
            if (aVar.a0 != dimension) {
                aVar.a0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.J(C6333rM.getColorStateList(aVar.i0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.K(aVar.i0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.L(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.T == charSequence) {
            return;
        }
        String str = C3872fs.b;
        C3872fs c3872fs = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C3872fs.e : C3872fs.d;
        c3872fs.getClass();
        WX1.c cVar = WX1.a;
        aVar.T = c3872fs.c(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.M(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.L(C7652xe.d(aVar.i0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.N(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.O(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.P(C6333rM.getColorStateList(aVar.i0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.C2135Ud, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // defpackage.C2135Ud, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.F0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s = z;
        c(this.u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            b0.e("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C6683t11 c6683t11) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.Z = c6683t11;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.Z = C6683t11.b(aVar.i0, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.R(aVar.i0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.S(aVar.i0.getResources().getDimension(i));
        }
    }

    @Override // defpackage.IX0
    public void setInternalOnCheckedChangeListener(IX0.a<Chip> aVar) {
        this.n = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.i == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.H0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.l = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.T(colorStateList);
        }
        this.i.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.T(C6333rM.getColorStateList(aVar.i0, i));
            this.i.getClass();
            f();
        }
    }

    @Override // defpackage.InterfaceC5280mK1
    public void setShapeAppearanceModel(@NonNull RJ1 rj1) {
        this.i.setShapeAppearanceModel(rj1);
    }

    public void setShowMotionSpec(C6683t11 c6683t11) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.Y = c6683t11;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.Y = C6683t11.b(aVar.i0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.G0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.i;
        if (aVar2 == null || TextUtils.equals(aVar2.I, charSequence)) {
            return;
        }
        aVar2.I = charSequence;
        aVar2.o0.d = true;
        aVar2.invalidateSelf();
        aVar2.y();
    }

    public void setTextAppearance(SX1 sx1) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.o0.b(sx1, aVar.i0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.e0 == f) {
            return;
        }
        aVar.e0 = f;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float dimension = aVar.i0.getResources().getDimension(i);
            if (aVar.e0 != dimension) {
                aVar.e0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            XX1 xx1 = aVar.o0;
            SX1 sx1 = xx1.f;
            if (sx1 != null) {
                sx1.k = fApplyDimension;
                xx1.a.setTextSize(fApplyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar == null || aVar.d0 == f) {
            return;
        }
        aVar.d0 = f;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            float dimension = aVar.i0.getResources().getDimension(i);
            if (aVar.d0 != dimension) {
                aVar.d0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.Q(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            aVar.I(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            Context context2 = aVar.i0;
            aVar.o0.b(new SX1(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.i;
        if (aVar != null) {
            Context context = aVar.i0;
            aVar.o0.b(new SX1(context, i), context);
        }
        h();
    }
}
