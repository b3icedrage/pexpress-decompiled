package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FW1 extends CompoundButton {
    public static final a V = new a(Float.class, "thumbPos");
    public static final int[] W = {R.attr.state_checked};
    public float A;
    public final VelocityTracker B;
    public final int C;
    public float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final TextPaint M;
    public final ColorStateList N;
    public StaticLayout O;
    public StaticLayout P;
    public final O9 Q;
    public ObjectAnimator R;

    @NonNull
    public C5972pe S;
    public c T;
    public final Rect U;
    public Drawable d;
    public ColorStateList e;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;
    public Drawable j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public boolean w;
    public int x;
    public final int y;
    public float z;

    public class a extends Property<FW1, Float> {
        @Override // android.util.Property
        public final Float get(FW1 fw1) {
            return Float.valueOf(fw1.D);
        }

        @Override // android.util.Property
        public final void set(FW1 fw1, Float f) {
            fw1.setThumbPosition(f.floatValue());
        }
    }

    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class c extends androidx.emoji2.text.c.d {
        public final WeakReference a;

        public c(FW1 fw1) {
            this.a = new WeakReference(fw1);
        }

        @Override // androidx.emoji2.text.c.d
        public final void a() {
            FW1 fw1 = (FW1) this.a.get();
            if (fw1 != null) {
                fw1.c();
            }
        }

        @Override // androidx.emoji2.text.c.d
        public final void b() {
            FW1 fw1 = (FW1) this.a.get();
            if (fw1 != null) {
                fw1.c();
            }
        }
    }

    public FW1(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    private C5972pe getEmojiTextViewHelper() {
        if (this.S == null) {
            this.S = new C5972pe(this);
        }
        return this.S;
    }

    private boolean getTargetCheckedState() {
        return this.D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((Je2.a(this) ? 1.0f - this.D : this.D) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.U;
        drawable.getPadding(rect);
        Drawable drawable2 = this.d;
        Rect rectB = drawable2 != null ? R30.b(drawable2) : R30.c;
        return ((((this.E - this.G) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.u = charSequence;
        C5972pe emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.a.e(this.Q);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.v = charSequence;
        this.P = null;
        if (this.w) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.s = charSequence;
        C5972pe emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.a.e(this.Q);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.t = charSequence;
        this.O = null;
        if (this.w) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.d = drawableMutate;
                if (this.h) {
                    A30.a.h(drawableMutate, this.e);
                }
                if (this.i) {
                    A30.a.i(this.d, this.g);
                }
                if (this.d.isStateful()) {
                    this.d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (this.m || this.n) {
                Drawable drawableMutate = drawable.mutate();
                this.j = drawableMutate;
                if (this.m) {
                    A30.a.h(drawableMutate, this.k);
                }
                if (this.n) {
                    A30.a.i(this.j, this.l);
                }
                if (this.j.isStateful()) {
                    this.j.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.s);
        setTextOffInternal(this.u);
        requestLayout();
    }

    public final void d() {
        if (this.T == null && this.S.b.a.b() && androidx.emoji2.text.c.j != null) {
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            int iB = cVarA.b();
            if (iB == 3 || iB == 0) {
                c cVar = new c(this);
                this.T = cVar;
                cVarA.f(cVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.d;
        Rect rectB = drawable != null ? R30.b(drawable) : R30.c;
        Drawable drawable2 = this.j;
        Rect rect = this.U;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.j.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.G + rect.right;
            this.d.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                A30.a.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a.e(drawable, f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            A30.a.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!Je2.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Je2.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4899kY1.e(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.w;
    }

    public boolean getSplitTrack() {
        return this.r;
    }

    public int getSwitchMinWidth() {
        return this.p;
    }

    public int getSwitchPadding() {
        return this.q;
    }

    public CharSequence getTextOff() {
        return this.u;
    }

    public CharSequence getTextOn() {
        return this.s;
    }

    public Drawable getThumbDrawable() {
        return this.d;
    }

    public final float getThumbPosition() {
        return this.D;
    }

    public int getThumbTextPadding() {
        return this.o;
    }

    public ColorStateList getThumbTintList() {
        return this.e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.g;
    }

    public Drawable getTrackDrawable() {
        return this.j;
    }

    public ColorStateList getTrackTintList() {
        return this.k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.R.end();
        this.R = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, W);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.j;
        Rect rect = this.U;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I;
        int i2 = this.K;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.d;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = R30.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.O : this.P;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.N;
            TextPaint textPaint = this.M;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.s : this.u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.d != null) {
            Drawable drawable = this.j;
            Rect rect = this.U;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = R30.b(this.d);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (Je2.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.E + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.E) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.F;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.F + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.F;
        }
        this.H = paddingLeft;
        this.I = paddingTop;
        this.K = height;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.w) {
            StaticLayout staticLayout = this.O;
            TextPaint textPaint = this.M;
            if (staticLayout == null) {
                CharSequence charSequence = this.t;
                this.O = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.P == null) {
                CharSequence charSequence2 = this.v;
                this.P = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.d;
        Rect rect = this.U;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.w) {
            iMax = (this.o * 2) + Math.max(this.O.getWidth(), this.P.getWidth());
        } else {
            iMax = 0;
        }
        this.G = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            Rect rectB = R30.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.L ? Math.max(this.p, (this.G * 2) + iMax2 + iMax3) : this.p;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.E = iMax4;
        this.F = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.B;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.y;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.x == 2) {
                    this.x = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.C) {
                            targetCheckedState = Je2.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.x = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.x;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.z) > f3 || Math.abs(y - this.A) > f3) {
                        this.x = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.z = x;
                        this.A = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.z;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (Je2.a(this)) {
                        f = -f;
                    }
                    float f5 = this.D;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.z = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.x == 2) {
                    this.x = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.C) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (Je2.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.x = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.d != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.d;
                Rect rect = this.U;
                drawable.getPadding(rect);
                int i3 = this.I - i;
                int i4 = (this.H + thumbOffset) - i;
                int i5 = this.G + i4 + rect.left + rect.right + i;
                int i6 = this.K + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.x = 1;
                    this.z = x3;
                    this.A = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.s;
                if (string == null) {
                    string = getResources().getString(com.pexpress.tool.R.string.abc_capital_on);
                }
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                new Ad2(com.pexpress.tool.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.u;
            if (string2 == null) {
                string2 = getResources().getString(com.pexpress.tool.R.string.abc_capital_off);
            }
            WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
            new Ad2(com.pexpress.tool.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string2);
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, V, zIsChecked ? 1.0f : 0.0f);
                this.R = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                b.a(this.R, true);
                this.R.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4899kY1.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.s);
        setTextOffInternal(this.u);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.L = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.w != z) {
            this.w = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.r = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.p = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.q = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.M;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.u;
        if (string == null) {
            string = getResources().getString(com.pexpress.tool.R.string.abc_capital_off);
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        new Ad2(com.pexpress.tool.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.s;
        if (string == null) {
            string = getResources().getString(com.pexpress.tool.R.string.abc_capital_on);
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        new Ad2(com.pexpress.tool.R.id.tag_state_description, CharSequence.class, 64, 30).c(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.D = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C7652xe.d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.o = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.e = colorStateList;
        this.h = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.g = mode;
        this.i = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C7652xe.d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        this.m = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        this.n = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d || drawable == this.j;
    }

    public FW1(@NonNull Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.pexpress.tool.R.attr.switchStyle);
        this.e = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.L = true;
        this.U = new Rect();
        C7211vY1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C3855fm1.w;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, com.pexpress.tool.R.attr.switchStyle);
        Cd2.k(this, context, iArr, attributeSet, wz1E.b, com.pexpress.tool.R.attr.switchStyle);
        Drawable drawableB = wz1E.b(2);
        this.d = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = wz1E.b(11);
        this.j = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        TypedArray typedArray = wz1E.b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.w = typedArray.getBoolean(3, true);
        this.o = typedArray.getDimensionPixelSize(8, 0);
        this.p = typedArray.getDimensionPixelSize(5, 0);
        this.q = typedArray.getDimensionPixelSize(6, 0);
        this.r = typedArray.getBoolean(4, false);
        ColorStateList colorStateListA = wz1E.a(9);
        if (colorStateListA != null) {
            this.e = colorStateListA;
            this.h = true;
        }
        PorterDuff.Mode modeC = R30.c(typedArray.getInt(10, -1), null);
        if (this.g != modeC) {
            this.g = modeC;
            this.i = true;
        }
        if (this.h || this.i) {
            a();
        }
        ColorStateList colorStateListA2 = wz1E.a(12);
        if (colorStateListA2 != null) {
            this.k = colorStateListA2;
            this.m = true;
        }
        PorterDuff.Mode modeC2 = R30.c(typedArray.getInt(13, -1), null);
        if (this.l != modeC2) {
            this.l = modeC2;
            this.n = true;
        }
        if (this.m || this.n) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, C3855fm1.x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = C6333rM.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.N = colorStateList;
            } else {
                this.N = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                O9 o9 = new O9();
                o9.a = context2.getResources().getConfiguration().locale;
                this.Q = o9;
            } else {
                this.Q = null;
            }
            setTextOnInternal(this.s);
            setTextOffInternal(this.u);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0810De(this).f(attributeSet, com.pexpress.tool.R.attr.switchStyle);
        wz1E.f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.pexpress.tool.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
