package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import defpackage.ViewTreeObserverOnPreDrawListenerC7556x91;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static int a(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {
        public final Animation a;
        public final Animator b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
        }

        public a(Animator animator) {
            this.a = null;
            this.b = animator;
        }
    }

    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup d;
        public final View e;
        public boolean g;
        public boolean h;
        public boolean i;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.i = true;
            this.d = viewGroup;
            this.e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.i = true;
            if (this.g) {
                return !this.h;
            }
            if (!super.getTransformation(j, transformation)) {
                this.g = true;
                ViewTreeObserverOnPreDrawListenerC7556x91.a(this.d, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.g;
            ViewGroup viewGroup = this.d;
            if (z || !this.i) {
                viewGroup.endViewTransition(this.e);
                this.h = true;
            } else {
                this.i = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.i = true;
            if (this.g) {
                return !this.h;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.g = true;
                ViewTreeObserverOnPreDrawListenerC7556x91.a(this.d, this);
            }
            return true;
        }
    }
}
