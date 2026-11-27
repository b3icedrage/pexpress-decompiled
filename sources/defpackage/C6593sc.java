package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6593sc extends AbstractC3820fd2 implements InterfaceC1817Qb {
    public final c e;
    public final Context g;
    public b h;
    public ArrayList<InterfaceC1817Qb.a> i;
    public final a j;

    /* JADX INFO: renamed from: sc$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C6593sc.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C6593sc.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C6593sc.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: sc$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C6593sc c6593sc = C6593sc.this;
            ArrayList arrayList = new ArrayList(c6593sc.i);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC1817Qb.a) arrayList.get(i)).a(c6593sc);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C6593sc c6593sc = C6593sc.this;
            ArrayList arrayList = new ArrayList(c6593sc.i);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC1817Qb.a) arrayList.get(i)).b(c6593sc);
            }
        }
    }

    /* JADX INFO: renamed from: sc$c */
    public static class c extends Drawable.ConstantState {
        public C4030gd2 a;
        public AnimatorSet b;
        public ArrayList<Animator> c;
        public C8092zj<Animator, String> d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C6593sc(Context context) {
        this.h = null;
        this.i = null;
        this.j = new a();
        this.g = context;
        this.e = new c();
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void a() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        b bVar = this.h;
        if (bVar != null) {
            this.e.b.removeListener(bVar);
            this.h = null;
        }
        ArrayList<InterfaceC1817Qb.a> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // defpackage.AbstractC3820fd2, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a.a(drawable, theme);
        }
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void c(@NonNull InterfaceC1817Qb.a aVar) {
        Drawable drawable = this.d;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (aVar.a == null) {
                aVar.a = new C1739Pb(aVar);
            }
            animatedVectorDrawable.registerAnimationCallback(aVar.a);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        if (this.i.contains(aVar)) {
            return;
        }
        this.i.add(aVar);
        if (this.h == null) {
            this.h = new b();
        }
        this.e.b.addListener(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return A30.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.e;
        cVar.a.draw(canvas);
        if (cVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getAlpha() : this.e.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.d;
        return drawable != null ? A30.a.c(drawable) : this.e.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.d != null) {
            return new d(this.d.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.e.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.e.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getOpacity() : this.e.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar;
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.e;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayC = C4138h72.c(resources, theme, attributeSet, C7850yb.e);
                    int resourceId = typedArrayC.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4030gd2 c4030gd2 = new C4030gd2();
                        ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
                        c4030gd2.d = C7708xt1.a.a(resources, resourceId, theme);
                        new C4030gd2.h(c4030gd2.d.getConstantState());
                        c4030gd2.j = false;
                        c4030gd2.setCallback(this.j);
                        C4030gd2 c4030gd3 = cVar.a;
                        if (c4030gd3 != null) {
                            c4030gd3.setCallback(null);
                        }
                        cVar.a = c4030gd2;
                    }
                    typedArrayC.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C7850yb.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.g;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(cVar.a.e.b.o.getOrDefault(string, null));
                        if (cVar.c == null) {
                            cVar.c = new ArrayList<>();
                            cVar.d = new C8092zj<>();
                        }
                        cVar.c.add(animatorLoadAnimator);
                        cVar.d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.b == null) {
            cVar.b = new AnimatorSet();
        }
        cVar.b.playTogether(cVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.isAutoMirrored() : this.e.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.e.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.isStateful() : this.e.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.e.a.setBounds(rect);
        }
    }

    @Override // defpackage.AbstractC3820fd2, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setLevel(i) : this.e.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setState(iArr) : this.e.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.e.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.e.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a(drawable, i);
        } else {
            this.e.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a.h(drawable, colorStateList);
        } else {
            this.e.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            A30.a.i(drawable, mode);
        } else {
            this.e.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.e.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.e;
        if (cVar.b.isStarted()) {
            return;
        }
        cVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.e.b.end();
        }
    }

    /* JADX INFO: renamed from: sc$d */
    public static class d extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C6593sc c6593sc = new C6593sc();
            Drawable drawableNewDrawable = this.a.newDrawable();
            c6593sc.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(c6593sc.j);
            return c6593sc;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C6593sc c6593sc = new C6593sc();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            c6593sc.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(c6593sc.j);
            return c6593sc;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C6593sc c6593sc = new C6593sc();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            c6593sc.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(c6593sc.j);
            return c6593sc;
        }
    }

    public C6593sc() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
